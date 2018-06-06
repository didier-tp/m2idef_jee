package com.m2i.dao;

import java.util.List;

import javax.ejb.Local;

import com.m2i.entity.Devise;

/*
 * interface d'un DAO = Data Access Object
 * avec methodes CRUD
 * et throws RuntimeException implicites
 * sachant que JPAException hérite de RuntimeException
 */

@Local //pas besoin @Remote sur DAO
public interface IDaoDevise {
    public Devise findDeviseByCode(String code);
    public List<Devise> findAllDevise();
    public void insertDevise(Devise d);
    public void updateDevise(Devise d);
    public void deleteDevise(String code);
}
