package com.m2i.service;

import java.util.List;

import javax.ejb.Local;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.m2i.entity.Devise;

//NB: les annotations @WebService , @WebParam servent à 
//    paramétrer les WebServices SOAP (XML) plus anciens que les WS REST/JSON 

@Local // compatible @EJB , @Inject //ici ou sur la classe
@WebService	//acces possible à distance via SOAP
public interface IServiceDevise {
     public double euroToFranc(@WebParam(name="montant") double montant);
     public double francToEuro(@WebParam(name="montant") double montant);
     
     public double convertir(@WebParam(name="montant") double montant, 
    		           @WebParam(name="codeDeviseSource") String codeDeviseSource , 
    		           @WebParam(name="codeDeviseCible")  String codeDeviseCible);
     
     public List<Devise> rechercherListeDevise();
     public String getAuteur(); 
}
