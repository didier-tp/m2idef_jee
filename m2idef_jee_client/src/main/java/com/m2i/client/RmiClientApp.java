package com.m2i.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.m2i.service.IServiceDeviseRemote;

public class RmiClientApp {

	public static void main(String[] args) throws Exception {
        Properties props = new Properties(); //de java.util
        //Context et InitialContext de javax.naming (JNDI)
		props.put(Context.INITIAL_CONTEXT_FACTORY, 
				   "org.jboss.naming.remote.client.InitialContextFactory");
		props.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		// remote://localhost:4447 for Jboss7.1 , http-remoting://localhost:8080
		// for wildfly 8,9
		props.put(Context.SECURITY_PRINCIPAL, "guest"); // username : "admin" ,
														// "guest" , "..."
		props.put(Context.SECURITY_CREDENTIALS, "guest007"); // password :
																// "pwd",
																// "guest007"
		// avec utilisateur ajouté via la commande JBOSS_7_HOME/bin/add-user
		// et roles associés admin,guest,.... sur partie "ApplicationRealm" .
		props.put("jboss.naming.client.ejb.context", true); // indispensable
															// pour accès
															// @Remote
		Context jndiContext = new InitialContext(props);
		String jndiName = "m2idef_jee_ear/m2idef_jee_ejb_impl/ServiceDeviseBean" 
		                  + "!com.m2i.service.IServiceDeviseRemote";
		// sans "ejb:" et sans // pour version de jndiName sans
		// jboss-ejb-client.properties et sans
		// props.setProperty(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
		
		IServiceDeviseRemote ejbServiceDevise = (IServiceDeviseRemote) 
				                        jndiContext.lookup(jndiName);
		System.out.println("30 euros= " +ejbServiceDevise.euroToFranc(30)+ " francs");

	}
}
