package com.prince.demo.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Project extends GenericModel{

    private String code;
    private String name;
    private String description;
    private List<Stakeholder> stakeholders = new ArrayList<>();

    public Project(String name){
        this.name = name;
    }


}