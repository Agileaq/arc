
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entitlementDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entitlementDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entitlementID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ChildEntitlements" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChildEntitlement" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="entitlementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="References" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Reference" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementReferenceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="entitlementProduct" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementProductDTO" minOccurs="0"/>
 *         &lt;element name="siteDTO" type="{http://interfaces.sems.sbs.it.hp.com/}siteDTO" minOccurs="0"/>
 *         &lt;element name="entitlementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectiveTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TargetID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="eligibleForUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eligibleForMigrate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eligibleForUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="majorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Activation" type="{http://interfaces.sems.sbs.it.hp.com/}licenseActivationDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "entitlementDTO", propOrder = {
    "entitlementID",
    "childEntitlements",
    "entitlementType",
    "references",
    "entitlementProduct",
    "siteDTO",
    "entitlementStatus",
    "effectiveTimestamp",
    "expirationTimestamp",
    "timezone",
    "targetIDs",
    "eligibleForUpgrade",
    "eligibleForMigrate",
    "eligibleForUpdate",
    "majorVersion",
    "minorVersion",
    "activations"
})
public class EntitlementDTO {

    protected Long entitlementID;
    @XmlElement(name = "ChildEntitlements")
    protected EntitlementDTO.ChildEntitlements childEntitlements;
    protected String entitlementType;
    @XmlElement(name = "References")
    protected EntitlementDTO.References references;
    protected EntitlementProductDTO entitlementProduct;
    protected SiteDTO siteDTO;
    protected String entitlementStatus;
    protected String effectiveTimestamp;
    protected String expirationTimestamp;
    protected String timezone;
    @XmlElement(name = "TargetIDs")
    protected EntitlementDTO.TargetIDs targetIDs;
    protected Boolean eligibleForUpgrade;
    protected Boolean eligibleForMigrate;
    protected Boolean eligibleForUpdate;
    protected String majorVersion;
    protected String minorVersion;
    @XmlElement(name = "Activations")
    protected EntitlementDTO.Activations activations;

    /**
     * Gets the value of the entitlementID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntitlementID() {
        return entitlementID;
    }

    /**
     * Sets the value of the entitlementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntitlementID(Long value) {
        this.entitlementID = value;
    }

    /**
     * Gets the value of the childEntitlements property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementDTO.ChildEntitlements }
     *     
     */
    public EntitlementDTO.ChildEntitlements getChildEntitlements() {
        return childEntitlements;
    }

    /**
     * Sets the value of the childEntitlements property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementDTO.ChildEntitlements }
     *     
     */
    public void setChildEntitlements(EntitlementDTO.ChildEntitlements value) {
        this.childEntitlements = value;
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
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementDTO.References }
     *     
     */
    public EntitlementDTO.References getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementDTO.References }
     *     
     */
    public void setReferences(EntitlementDTO.References value) {
        this.references = value;
    }

    /**
     * Gets the value of the entitlementProduct property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementProductDTO }
     *     
     */
    public EntitlementProductDTO getEntitlementProduct() {
        return entitlementProduct;
    }

    /**
     * Sets the value of the entitlementProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementProductDTO }
     *     
     */
    public void setEntitlementProduct(EntitlementProductDTO value) {
        this.entitlementProduct = value;
    }

    /**
     * Gets the value of the siteDTO property.
     * 
     * @return
     *     possible object is
     *     {@link SiteDTO }
     *     
     */
    public SiteDTO getSiteDTO() {
        return siteDTO;
    }

    /**
     * Sets the value of the siteDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteDTO }
     *     
     */
    public void setSiteDTO(SiteDTO value) {
        this.siteDTO = value;
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
     * Gets the value of the effectiveTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveTimestamp() {
        return effectiveTimestamp;
    }

    /**
     * Sets the value of the effectiveTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveTimestamp(String value) {
        this.effectiveTimestamp = value;
    }

    /**
     * Gets the value of the expirationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationTimestamp() {
        return expirationTimestamp;
    }

    /**
     * Sets the value of the expirationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationTimestamp(String value) {
        this.expirationTimestamp = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the targetIDs property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementDTO.TargetIDs }
     *     
     */
    public EntitlementDTO.TargetIDs getTargetIDs() {
        return targetIDs;
    }

    /**
     * Sets the value of the targetIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementDTO.TargetIDs }
     *     
     */
    public void setTargetIDs(EntitlementDTO.TargetIDs value) {
        this.targetIDs = value;
    }

    /**
     * Gets the value of the eligibleForUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForUpgrade() {
        return eligibleForUpgrade;
    }

    /**
     * Sets the value of the eligibleForUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForUpgrade(Boolean value) {
        this.eligibleForUpgrade = value;
    }

    /**
     * Gets the value of the eligibleForMigrate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForMigrate() {
        return eligibleForMigrate;
    }

    /**
     * Sets the value of the eligibleForMigrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForMigrate(Boolean value) {
        this.eligibleForMigrate = value;
    }

    /**
     * Gets the value of the eligibleForUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForUpdate() {
        return eligibleForUpdate;
    }

    /**
     * Sets the value of the eligibleForUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForUpdate(Boolean value) {
        this.eligibleForUpdate = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorVersion(String value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinorVersion(String value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the activations property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementDTO.Activations }
     *     
     */
    public EntitlementDTO.Activations getActivations() {
        return activations;
    }

    /**
     * Sets the value of the activations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementDTO.Activations }
     *     
     */
    public void setActivations(EntitlementDTO.Activations value) {
        this.activations = value;
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
     *         &lt;element name="Activation" type="{http://interfaces.sems.sbs.it.hp.com/}licenseActivationDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "activation"
    })
    public static class Activations {

        @XmlElement(name = "Activation")
        protected List<LicenseActivationDTO> activation;

        /**
         * Gets the value of the activation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LicenseActivationDTO }
         * 
         * 
         */
        public List<LicenseActivationDTO> getActivation() {
            if (activation == null) {
                activation = new ArrayList<LicenseActivationDTO>();
            }
            return this.activation;
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
     *         &lt;element name="ChildEntitlement" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "childEntitlement"
    })
    public static class ChildEntitlements {

        @XmlElement(name = "ChildEntitlement")
        protected List<EntitlementDTO> childEntitlement;

        /**
         * Gets the value of the childEntitlement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childEntitlement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildEntitlement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementDTO }
         * 
         * 
         */
        public List<EntitlementDTO> getChildEntitlement() {
            if (childEntitlement == null) {
                childEntitlement = new ArrayList<EntitlementDTO>();
            }
            return this.childEntitlement;
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
     *         &lt;element name="Reference" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementReferenceDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "reference"
    })
    public static class References {

        @XmlElement(name = "Reference")
        protected List<EntitlementReferenceDTO> reference;

        /**
         * Gets the value of the reference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementReferenceDTO }
         * 
         * 
         */
        public List<EntitlementReferenceDTO> getReference() {
            if (reference == null) {
                reference = new ArrayList<EntitlementReferenceDTO>();
            }
            return this.reference;
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
     *         &lt;element name="TargetID" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
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
        "targetID"
    })
    public static class TargetIDs {

        @XmlElement(name = "TargetID", type = Long.class)
        protected List<Long> targetID;

        /**
         * Gets the value of the targetID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTargetID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getTargetID() {
            if (targetID == null) {
                targetID = new ArrayList<Long>();
            }
            return this.targetID;
        }

    }

}
