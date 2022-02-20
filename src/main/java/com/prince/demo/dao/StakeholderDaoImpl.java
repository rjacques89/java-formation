package com.prince.demo.dao;

import java.util.Collection;

import com.prince.demo.domain.Stakeholder;

public class StakeholderDaoImpl implements StakeholderDao{

    private final JdbcConnect connect = new JdbcConnect();

    @Override
    public void create(Stakeholder stakeholder) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Stakeholder update(Stakeholder stakeholder, long id) {
        // TODO Auto-generated method stub
        return null;
    }
    

    @Override
    public void delete(long id) {
        connect.getConnection();
        
    }

    @Override
    public Stakeholder read(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<Stakeholder> readAll() {
        // TODO Auto-generated method stub
        return null;
    }

  
}
