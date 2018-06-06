package com.m2i.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.m2i.entity.Devise;

@Stateless//EJB session sans etat
//@TransactionManagement(TransactionManagementType.CONTAINER) //par defaut sur EJB
//NB: via @TransactionM... toutes les méthodes appelées sur cette classe
//auront un try/catch avec entityMananager.getTransaction().begin()
//                     et entityMananager.getTransaction().commit() ou .rollback()
public class DaoDeviseJpa implements IDaoDevise {
	
	@PersistenceContext(unitName="myPersistenceUnitName") //(avec Spring ou EJB3)
	//NB: @PersistenceContext est ici plus adpaté que @Inject
	//car ça tient compte de META-INF/persistence.xml (ou équivalent)
	private EntityManager entityManager;
	
    

	@Override
	public Devise findDeviseByCode(String code) {
		return entityManager.find(Devise.class, code /*id/pk*/);
	}

	@Override
	public List<Devise> findAllDevise() {
		return entityManager.createQuery("SELECT d FROM Devise d",Devise.class)
				.getResultList();
	}

	@Override
	public void insertDevise(Devise d) {
			entityManager.persist(d); //insert into ...
	}

	@Override
	public void updateDevise(Devise d) {
		entityManager.merge(d); //update ...
	}

	@Override
	public void deleteDevise(String code) {
		Devise d = entityManager.find(Devise.class, code);
		entityManager.remove(d);//delete SQL
	}

}
