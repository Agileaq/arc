
package com.hp.it.sbs.sems.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrganizationsByHPPIDSp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getOrganizationsByHPPIDSp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hpPassportID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrganizationsByHPPIDSp", propOrder = {
    "hpPassportID"
})
public class GetOrganizationsByHPPIDSp {

    protected String hpPassportID;

    /**
     * Gets the value of the hpPassportID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpPassportID() {
        return hpPassportID;
    }

    /**
     * Sets the value of the hpPassportID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpPassportID(String value) {
        this.hpPassportID = value;
    }

}
