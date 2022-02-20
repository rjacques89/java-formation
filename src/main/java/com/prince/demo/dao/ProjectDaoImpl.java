package com.prince.demo.dao;

import java.util.Collection;

import com.prince.demo.domain.Project;

public class ProjectDaoImpl implements ProjectDao{

    private final JdbcConnect connect = new JdbcConnect();

    @Override
    public void create(Project project) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Project update(Project project, long id) {
        // TODO Auto-generated method stub
        return null;
    }
    

    @Override
    public void delete(long id) {
        connect.getConnection();
        
    }

    @Override
    public Project read(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Project> readAll() {
        // TODO Auto-generated method stub
        return null;
    }

  
}
