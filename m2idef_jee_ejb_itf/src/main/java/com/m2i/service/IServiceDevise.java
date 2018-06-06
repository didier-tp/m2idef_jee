package com.m2i.service;

import java.util.List;

import javax.ejb.Local;

import com.m2i.entity.Devise;
@Local //ici ou sur la classe
public interface IServiceDevise {
     public double euroToFranc(double montant);
     public double francToEuro(double montant);
     
     public double convertir(double montant, String codeDeviseSource , 
    		                  String codeDeviseCible);
     
     public List<Devise> rechercherListeDevise();
     //...
}
