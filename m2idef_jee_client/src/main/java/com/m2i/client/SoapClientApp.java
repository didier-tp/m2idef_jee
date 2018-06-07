package com.m2i.client;

import java.net.URL;

import com.m2i.service.IServiceDevise;
import com.m2i.service.ServiceDeviseBeanService;

public class SoapClientApp {

	public static void main(String[] args) throws Exception {
		// appel d'un WS SOAP en s'appuyant sur le proxy
		// généré par wsimport:
		
		//Rappel: Jboss accepte des requetes provenant d'autres machines que localhost
		//        si option -b 0.0.0.0 (à la place de -b localhost )
		// dans ../ Open / open launch Configuration / ...
		
		String strWsdlUrl = 
				"http://localhost:8080/m2idef_jee_ejb_impl/ServiceDeviseBean?WSDL";
				//"http://172.28.11.5:8080/m2idef_jee_ejb_impl/ServiceDeviseBean?WSDL";
		        //"http://172.28.10.172:8080/m2idef_jee_ejb_impl/ServiceDeviseBean?WSDL";
		URL urlWsdl = new URL(strWsdlUrl);
		
		IServiceDevise serviceProxy = 
				(new ServiceDeviseBeanService(urlWsdl)).getServiceDeviseBeanPort();

		System.out.println("auteur="+serviceProxy.getAuteur());
		System.out.println("15 euros="+serviceProxy.euroToFranc(15.0)+" francs");
	}

}
