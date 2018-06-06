package com.m2i.web.jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.m2i.service.IServiceDevise;

/*
 * ManagedBean = classe java pour framework JSF
 */

@ManagedBean
@RequestScoped
public class DeviseMBean {
	
	@EJB
	private IServiceDevise serviceDevise;

	private Double montant;//à saisir
	private String codeMonnaieSource;
	private String codeMonnaieCible;
	
	private Double resultat; //à afficher
	
	public String convertir(){
		resultat = serviceDevise.convertir(montant, codeMonnaieSource, codeMonnaieCible);
		return null; //rester sur meme page .jsp (ou .xhtml)
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getCodeMonnaieSource() {
		return codeMonnaieSource;
	}

	public void setCodeMonnaieSource(String codeMonnaieSource) {
		this.codeMonnaieSource = codeMonnaieSource;
	}

	public String getCodeMonnaieCible() {
		return codeMonnaieCible;
	}

	public void setCodeMonnaieCible(String codeMonnaieCible) {
		this.codeMonnaieCible = codeMonnaieCible;
	}

	public Double getResultat() {
		return resultat;
	}

	public void setResultat(Double resultat) {
		this.resultat = resultat;
	}
	
	
	
}
