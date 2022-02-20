package com.prince.demo.dao;

import java.util.Collection;

import com.prince.demo.domain.Project;

public interface ProjectDao {

    //Pour ajouter un projet a la base de donnée
    public void create(Project project);

    //Pour modifier un projet a la base de donnée
    public Project update(Project project, long id);

    //Pour supprimer un projet dans la base de donnée par son id
    public void delete(long id);

    //Pour trouver un projet dans la base de donnée par son id
    public Project read(long id);

    //Pour trouver tous les projets dans la base de donnée
    public Collection<Project> readAll();
    
}
