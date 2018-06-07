
package com.m2i.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour devise complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="devise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="change" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codeDevise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listePays" type="{http://service.m2i.com/}pays" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="monnaie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "devise", propOrder = {
    "change",
    "codeDevise",
    "listePays",
    "monnaie"
})
public class Devise {

    protected Double change;
    protected String codeDevise;
    @XmlElement(nillable = true)
    protected List<Pays> listePays;
    protected String monnaie;

    /**
     * Obtient la valeur de la propriété change.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getChange() {
        return change;
    }

    /**
     * Définit la valeur de la propriété change.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setChange(Double value) {
        this.change = value;
    }

    /**
     * Obtient la valeur de la propriété codeDevise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDevise() {
        return codeDevise;
    }

    /**
     * Définit la valeur de la propriété codeDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDevise(String value) {
        this.codeDevise = value;
    }

    /**
     * Gets the value of the listePays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listePays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListePays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pays }
     * 
     * 
     */
    public List<Pays> getListePays() {
        if (listePays == null) {
            listePays = new ArrayList<Pays>();
        }
        return this.listePays;
    }

    /**
     * Obtient la valeur de la propriété monnaie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonnaie() {
        return monnaie;
    }

    /**
     * Définit la valeur de la propriété monnaie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonnaie(String value) {
        this.monnaie = value;
    }

}
