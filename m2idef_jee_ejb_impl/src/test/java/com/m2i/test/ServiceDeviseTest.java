package com.m2i.test;

import javax.naming.NamingException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.wildfly.common.Assert;

import com.m2i.service.IServiceDeviseRemote;

public class ServiceDeviseTest extends AbstractRmiTest {

	
	private static IServiceDeviseRemote ejbServiceDevise; //à tester
	
	@BeforeClass
	public static void initEjb(){
		try {
			String jndiName = "m2idef_jee_ear/m2idef_jee_ejb_impl/ServiceDeviseBean" 
			        + "!com.m2i.service.IServiceDeviseRemote";

			ejbServiceDevise = (IServiceDeviseRemote) 
			                        jndiContext.lookup(jndiName);
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testEuroToFranc(){
		double sommeConvertie = ejbServiceDevise.euroToFranc(30);
		System.out.println("30 euros= " +ejbServiceDevise.euroToFranc(30)+ " francs");
		Assert.assertTrue(sommeConvertie> 196);
		Assert.assertTrue(sommeConvertie< 197);
	}
	
}
