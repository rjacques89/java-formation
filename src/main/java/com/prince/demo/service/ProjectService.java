package com.prince.demo.service;

import java.util.Collection;

import com.prince.demo.domain.Project;
import com.prince.demo.dto.StakeholderDto;

public interface ProjectService {

    void add (Project project);
    Project edit (Project project, long id);
    Project read (long id);
    Collection<Project> readAll ();
    Project addStakeHolder (StakeholderDto stakeholder, long projectId);
    void remove (long id);
    
}
