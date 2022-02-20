package com.prince.demo.service;

import java.util.Collection;

import com.prince.demo.dao.ProjectDao;
import com.prince.demo.dao.ProjectDaoImpl;
import com.prince.demo.domain.Project;
import com.prince.demo.dto.StakeholderDto;

public class ProjectServiceImpl implements ProjectService {

    private final ProjectDao dao = new ProjectDaoImpl();

    @Override
    public void add(Project project) {
        dao.create(project);
    }

    @Override
    public Project edit(Project project, long id) {
        return dao.update(project, id);
    }

    @Override
    public Project read(long id) {
        return dao.read(id);
    }

    @Override
    public Collection<Project> readAll() {
        return dao.readAll();
    }

    @Override
    public Project addStakeHolder(StakeholderDto stakeholder, long projectId) {
        
        Project retrieveProject = dao.read(projectId);
        if (retrieveProject != null) {
            retrieveProject.getStakeholders().add(stakeholder);
            dao.update(retrieveProject, projectId);
            return retrieveProject;
        }
        throw new RuntimeException("Entity Not Found");
    }

    @Override
    public void remove(long id) {
        dao.delete(id);

    }

}
