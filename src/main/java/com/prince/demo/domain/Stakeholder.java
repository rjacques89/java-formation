package com.prince.demo.domain;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Stakeholder extends GenericModel{

    private String firstname;
    private String lastname;
    private String position;

}