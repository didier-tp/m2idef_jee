package com.m2i.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.m2i.entity.Devise;

@Path("devise")
@Produces("application/json")
public class RestServiceDevise {
	
	@GET
	@Path("/{code}")
	//URL = http://localhost:8080/m2idef_jee_web/services/rest/devise/EUR
	//   ou http://localhost:8080/m2idef_jee_web/services/rest/devise/USD
	public Devise getDeviseByCode(@PathParam("code")String code){
		//V1 (sans lien avec EJB3):
		Devise d = new Devise();
		d.setCodeDevise(code);
		d.setMonnaie(code=="EUR"?"euro":"dollar");
		d.setChange(1.0);
		return d;
	}

}
