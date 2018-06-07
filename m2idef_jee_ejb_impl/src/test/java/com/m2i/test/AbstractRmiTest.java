package com.m2i.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.BeforeClass;

import com.m2i.service.IServiceDeviseRemote;

public class AbstractRmiTest {
	
	protected static Properties props ;
	protected static Context jndiContext;
	
	@BeforeClass
	public static void initProperties()  {
        // pour accès
																	// @Remote
		
		try {
			props = new Properties(); //de java.util
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
			jndiContext = new InitialContext(props);
		} catch (NamingException e) {
			e.printStackTrace();
		}
		

	}
}
