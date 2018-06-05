package com.m2i.service;

import javax.ejb.Local;
@Local //ici ou sur la classe
public interface IServiceDevise {
     public double euroToFranc(double montant);
     public double francToEuro(double montant);
}
