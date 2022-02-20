package com.prince.demo.dao;

import java.util.Collection;

import com.prince.demo.domain.Stakeholder;

public interface StakeholderDao {

    //Pour ajouter un stakeholder a la base de donnée
    public void create(Stakeholder stakeholder);

    //Pour modifier un stakeholder a la base de donnée
    public Stakeholder update(Stakeholder sakeholder, long id);

    //Pour supprimer un stakeholder dans la base de donnée par son id
    public void delete(long id);

    //Pour trouver un stakeholder dans la base de donnée par son id
    public Stakeholder read(long id);

    //Pour trouver tous les stakeholders dans la base de donnée
    public Collection<Stakeholder> readAll();
    
}
