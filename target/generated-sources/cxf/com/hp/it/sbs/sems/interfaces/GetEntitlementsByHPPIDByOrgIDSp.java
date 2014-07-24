
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEntitlementsByHPPIDByOrgIDSp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntitlementsByHPPIDByOrgIDSp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hpPassportID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitlementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitlementSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibInfoRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saidList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntitlementsByHPPIDByOrgIDSp", propOrder = {
    "hpPassportID",
    "orgId",
    "entitlementStatus",
    "entitlementType",
    "entitlementSubType",
    "ibInfoRequired",
    "saidList"
})
public class GetEntitlementsByHPPIDByOrgIDSp {

    protected String hpPassportID;
    protected String orgId;
    protected String entitlementStatus;
    protected String entitlementType;
    protected String entitlementSubType;
    protected Boolean ibInfoRequired;
    protected List<String> saidList;

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

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgId(String value) {
        this.orgId = value;
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

    /**
     * Gets the value of the saidList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saidList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaidList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSaidList() {
        if (saidList == null) {
            saidList = new ArrayList<String>();
        }
        return this.saidList;
    }

}
