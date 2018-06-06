
package com.m2i.test;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.m2i.service.IServiceDevise;


public class TestServiceDeviseViaOpenEjb extends MyAbstractOpenEjbTest{ 

    @Inject
	private IServiceDevise service = null; // service metier a tester
	

	  @Before
	     public void initService(){
	       if(service==null){
	         try{
	           String openEjbJndiName="ServiceDeviseBean" + "Local";
	           //String openEjbJndiName="ServiceDeviseBean" + "Remote";
	           service= (IServiceDevise )                
	                context.lookup(openEjbJndiName);
			}catch(Exception ex){ex.printStackTrace();}
		}
	      }
	        

	@Test
   public void test_euroToFranc() {
     try{
        System.out.println("test_euroToFranc");
        double sommeFrancs = service.euroToFranc(15);
        System.out.println("15 euros =  " + sommeFrancs + " francs");
        Assert.assertTrue(sommeFrancs > 98 && sommeFrancs < 99);
        }catch(Exception /*ServiceException*/ ex){
      	    System.err.println(ex.getMessage());
      	    Assert.fail(ex.getMessage());
      	}
   }
	
      
}
