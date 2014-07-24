
package com.hp.it.sbs.sems.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEntitlementsByCompanySp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntitlementsByCompanySp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitlementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitlementSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibInfoRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntitlementsByCompanySp", propOrder = {
    "organizationID",
    "entitlementStatus",
    "entitlementType",
    "entitlementSubType",
    "ibInfoRequired"
})
public class GetEntitlementsByCompanySp {

    protected String organizationID;
    protected String entitlementStatus;
    protected String entitlementType;
    protected String entitlementSubType;
    protected Boolean ibInfoRequired;

    /**
     * Gets the value of the organizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the value of the organizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationID(String value) {
        this.organizationID = value;
    }

    /**
     * Gets the value of the entitlementStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementStatus() {
        return entitlementStatus;
    }

    /**
     * Sets the value of the entitlementStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementStatus(String value) {
        this.entitlementStatus = value;
    }

    /**
     * Gets the value of the entitlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementType() {
        return entitlementType;
    }

    /**
     * Sets the value of the entitlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementType(String value) {
        this.entitlementType = value;
    }

    /**
     * Gets the value of the entitlementSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementSubType() {
        return entitlementSubType;
    }

    /**
     * Sets the value of the entitlementSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementSubType(String value) {
        this.entitlementSubType = value;
    }

    /**
     * Gets the value of the ibInfoRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIbInfoRequired() {
        return ibInfoRequired;
    }

    /**
     * Sets the value of the ibInfoRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIbInfoRequired(Boolean value) {
        this.ibInfoRequired = value;
    }

}
