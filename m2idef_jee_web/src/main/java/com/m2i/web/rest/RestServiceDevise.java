package com.m2i.web.rest;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.m2i.entity.Devise;
import com.m2i.service.IServiceDevise;

@Path("devise")
@Produces("application/json")
@Named //equivalent CDI de @Component de Spring
//beans.xml doit être present dans WEB-INF pour que CDI fonctionne bien
@ApplicationScoped
public class RestServiceDevise {
	
	@Inject //@Inject est l'équivalent CDI de @Autowired de Spring //ou @EJB
	private IServiceDevise ejbServiceDevise;
	
	@PostConstruct
	public void verifInject(){
		System.out.println("dans RestServiceDevise , ejbServiceDevise="
	           +ejbServiceDevise + " sur instance " + this);
	}
	
	@GET
	@Path("/{code}")
	//URL = http://localhost:8080/m2idef_jee_web/services/rest/devise/EUR
	//   ou http://localhost:8080/m2idef_jee_web/services/rest/devise/USD
	public Devise getDeviseByCode(@PathParam("code")String code){
		//V1 (sans lien avec EJB3):
		/*	Devise d = new Devise();	d.setCodeDevise(code);
		d.setMonnaie(code=="EUR"?"euro":"dollar");
		d.setChange(1.0);	return d;*/
		List<Devise> listeDev = ejbServiceDevise.rechercherListeDevise();
		Devise d =null;
		for(Devise dev : listeDev){
			if(code.equals(dev.getCodeDevise())){
				d=dev; break;
			}
		}
		return d;
	}

}
