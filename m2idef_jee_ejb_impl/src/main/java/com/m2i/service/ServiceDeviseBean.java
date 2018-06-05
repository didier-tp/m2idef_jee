package com.m2i.service;

import javax.ejb.Stateless;

//@Local déjà précisé sur l'interface
@Stateless //EJB Session sans état (plus proche equivalent de @Service de Spring)
public class ServiceDeviseBean implements IServiceDevise {

	@Override
	public double euroToFranc(double montant) {
		return montant * 6.55957;
	}

	@Override
	public double francToEuro(double montant) {
		return montant / 6.55957;
	}

}
