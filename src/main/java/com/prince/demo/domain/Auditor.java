package com.prince.demo.domain;

import java.util.Date;

import com.prince.demo.domain.enums.ProjectStatus;

import lombok.*;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Auditor extends GenericModel{

    private ProjectStatus event = ProjectStatus.PENDING;
    private String actor;
    private Date created;

}