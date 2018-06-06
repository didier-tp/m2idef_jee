package com.m2i.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import com.m2i.dao.IDaoDevise;
import com.m2i.entity.Devise;

//@Local déjà précisé sur l'interface
@Stateless //EJB Session sans état (plus proche equivalent de @Service de Spring)
@WebService(endpointInterface="com.m2i.service.IServiceDevise")
public class ServiceDeviseBean implements IServiceDevise {

	@EJB //injection de dépendance (comme @Autowired de Spring)
	private IDaoDevise daoDevise;
	
	@Override
	public String getAuteur() {
		return "didier";
	}
	
	@Override
	public double euroToFranc(double montant) {
		return montant * 6.55957;
	}

	@Override
	public double francToEuro(double montant) {
		return montant / 6.55957;
	}

	@Override
	public double convertir(double montant, String codeDeviseSource,
			      String codeDeviseCible) {
		double res=0;
		try {
			Devise deviseSource = daoDevise.findDeviseByCode(codeDeviseSource);
			Devise deviseCible = daoDevise.findDeviseByCode(codeDeviseCible);
			res= montant * deviseSource.getChange() / deviseCible.getChange();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Devise> rechercherListeDevise() {
		return daoDevise.findAllDevise();
	}

	

}
