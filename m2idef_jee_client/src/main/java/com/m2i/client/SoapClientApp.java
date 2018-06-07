package com.m2i.client;

import com.m2i.service.IServiceDevise;
import com.m2i.service.ServiceDeviseBeanService;

public class SoapClientApp {

	public static void main(String[] args) {
		// appel d'un WS SOAP en s'appyuant sur le proxy
		// généré par wsimport:
		
		IServiceDevise serviceProxy = 
				(new ServiceDeviseBeanService()).getServiceDeviseBeanPort();

		System.out.println("auteur="+serviceProxy.getAuteur());
		System.out.println("15 euros="+serviceProxy.euroToFranc(15.0)+" francs");
		
	}

}
