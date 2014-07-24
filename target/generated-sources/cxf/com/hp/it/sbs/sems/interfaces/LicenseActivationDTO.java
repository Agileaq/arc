
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for licenseActivationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="licenseActivationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivatedEntitlementList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ActivatedEntitlement" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="activationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activationSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TargetDescIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TargetDescID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseActivationDTO", propOrder = {
    "activationID",
    "status",
    "activatedDate",
    "activatedEntitlementList",
    "activationReason",
    "activationSystemReference",
    "targetID",
    "targetDescIDs"
})
public class LicenseActivationDTO {

    protected String activationID;
    protected String status;
    protected String activatedDate;
    @XmlElement(name = "ActivatedEntitlementList")
    protected LicenseActivationDTO.ActivatedEntitlementList activatedEntitlementList;
    protected String activationReason;
    protected String activationSystemReference;
    protected Long targetID;
    @XmlElement(name = "TargetDescIDs")
    protected LicenseActivationDTO.TargetDescIDs targetDescIDs;

    /**
     * Gets the value of the activationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationID() {
        return activationID;
    }

    /**
     * Sets the value of the activationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationID(String value) {
        this.activationID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the activatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivatedDate() {
        return activatedDate;
    }

    /**
     * Sets the value of the activatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivatedDate(String value) {
        this.activatedDate = value;
    }

    /**
     * Gets the value of the activatedEntitlementList property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseActivationDTO.ActivatedEntitlementList }
     *     
     */
    public LicenseActivationDTO.ActivatedEntitlementList getActivatedEntitlementList() {
        return activatedEntitlementList;
    }

    /**
     * Sets the value of the activatedEntitlementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseActivationDTO.ActivatedEntitlementList }
     *     
     */
    public void setActivatedEntitlementList(LicenseActivationDTO.ActivatedEntitlementList value) {
        this.activatedEntitlementList = value;
    }

    /**
     * Gets the value of the activationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationReason() {
        return activationReason;
    }

    /**
     * Sets the value of the activationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationReason(String value) {
        this.activationReason = value;
    }

    /**
     * Gets the value of the activationSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationSystemReference() {
        return activationSystemReference;
    }

    /**
     * Sets the value of the activationSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationSystemReference(String value) {
        this.activationSystemReference = value;
    }

    /**
     * Gets the value of the targetID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetID() {
        return targetID;
    }

    /**
     * Sets the value of the targetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetID(Long value) {
        this.targetID = value;
    }

    /**
     * Gets the value of the targetDescIDs property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseActivationDTO.TargetDescIDs }
     *     
     */
    public LicenseActivationDTO.TargetDescIDs getTargetDescIDs() {
        return targetDescIDs;
    }

    /**
     * Sets the value of the targetDescIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseActivationDTO.TargetDescIDs }
     *     
     */
    public void setTargetDescIDs(LicenseActivationDTO.TargetDescIDs value) {
        this.targetDescIDs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ActivatedEntitlement" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementDTO" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "activatedEntitlement"
    })
    public static class ActivatedEntitlementList {

        @XmlElement(name = "ActivatedEntitlement")
        protected List<EntitlementDTO> activatedEntitlement;

        /**
         * Gets the value of the activatedEntitlement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activatedEntitlement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivatedEntitlement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementDTO }
         * 
         * 
         */
        public List<EntitlementDTO> getActivatedEntitlement() {
            if (activatedEntitlement == null) {
                activatedEntitlement = new ArrayList<EntitlementDTO>();
            }
            return this.activatedEntitlement;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TargetDescID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "targetDescID"
    })
    public static class TargetDescIDs {

        @XmlElement(name = "TargetDescID", type = Long.class)
        protected List<Long> targetDescID;

        /**
         * Gets the value of the targetDescID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetDescID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTargetDescID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getTargetDescID() {
            if (targetDescID == null) {
                targetDescID = new ArrayList<Long>();
            }
            return this.targetDescID;
        }

    }

}
