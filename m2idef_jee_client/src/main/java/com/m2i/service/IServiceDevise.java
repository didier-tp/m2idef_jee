
package com.m2i.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.m2i.entity.Devise;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IServiceDevise", targetNamespace = "http://service.m2i.com/")
@XmlSeeAlso({
    com.m2i.entity.ObjectFactory.class,
    com.m2i.service.ObjectFactory.class
})
public interface IServiceDevise {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euroToFranc", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.EuroToFranc")
    @ResponseWrapper(localName = "euroToFrancResponse", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.EuroToFrancResponse")
    public double euroToFranc(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @return
     *     returns java.util.List<com.m2i.entity.Devise>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "rechercherListeDevise", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.RechercherListeDevise")
    @ResponseWrapper(localName = "rechercherListeDeviseResponse", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.RechercherListeDeviseResponse")
    public List<Devise> rechercherListeDevise();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAuteur", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.GetAuteur")
    @ResponseWrapper(localName = "getAuteurResponse", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.GetAuteurResponse")
    public String getAuteur();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "francToEuro", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.FrancToEuro")
    @ResponseWrapper(localName = "francToEuroResponse", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.FrancToEuroResponse")
    public double francToEuro(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param codeDeviseCible
     * @param codeDeviseSource
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertir", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.Convertir")
    @ResponseWrapper(localName = "convertirResponse", targetNamespace = "http://service.m2i.com/", className = "com.m2i.service.ConvertirResponse")
    public double convertir(
        @WebParam(name = "montant", targetNamespace = "")
        double montant,
        @WebParam(name = "codeDeviseSource", targetNamespace = "")
        String codeDeviseSource,
        @WebParam(name = "codeDeviseCible", targetNamespace = "")
        String codeDeviseCible);

}
