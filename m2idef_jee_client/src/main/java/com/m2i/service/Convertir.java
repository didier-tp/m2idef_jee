
package com.m2i.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour convertir complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="convertir">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="codeDeviseSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeDeviseCible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convertir", propOrder = {
    "montant",
    "codeDeviseSource",
    "codeDeviseCible"
})
public class Convertir {

    protected double montant;
    protected String codeDeviseSource;
    protected String codeDeviseCible;

    /**
     * Obtient la valeur de la propriété montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

    /**
     * Obtient la valeur de la propriété codeDeviseSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDeviseSource() {
        return codeDeviseSource;
    }

    /**
     * Définit la valeur de la propriété codeDeviseSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDeviseSource(String value) {
        this.codeDeviseSource = value;
    }

    /**
     * Obtient la valeur de la propriété codeDeviseCible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDeviseCible() {
        return codeDeviseCible;
    }

    /**
     * Définit la valeur de la propriété codeDeviseCible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDeviseCible(String value) {
        this.codeDeviseCible = value;
    }

}
