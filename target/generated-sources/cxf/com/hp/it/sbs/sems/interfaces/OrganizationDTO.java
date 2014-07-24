
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rPLPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="embargoedCountryPassed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntitlementFolders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EntitlementFolder" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementFolderDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TargetMachines" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TargetMachine" type="{http://interfaces.sems.sbs.it.hp.com/}targetDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "organizationDTO", propOrder = {
    "organizationId",
    "source",
    "organizationName",
    "rplPassed",
    "embargoedCountryPassed",
    "entitlementFolders",
    "targetMachines"
})
public class OrganizationDTO {

    protected String organizationId;
    protected String source;
    protected String organizationName;
    @XmlElement(name = "rPLPassed")
    protected Boolean rplPassed;
    protected Boolean embargoedCountryPassed;
    @XmlElement(name = "EntitlementFolders")
    protected OrganizationDTO.EntitlementFolders entitlementFolders;
    @XmlElement(name = "TargetMachines")
    protected OrganizationDTO.TargetMachines targetMachines;

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the rplPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRPLPassed() {
        return rplPassed;
    }

    /**
     * Sets the value of the rplPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRPLPassed(Boolean value) {
        this.rplPassed = value;
    }

    /**
     * Gets the value of the embargoedCountryPassed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmbargoedCountryPassed() {
        return embargoedCountryPassed;
    }

    /**
     * Sets the value of the embargoedCountryPassed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbargoedCountryPassed(Boolean value) {
        this.embargoedCountryPassed = value;
    }

    /**
     * Gets the value of the entitlementFolders property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDTO.EntitlementFolders }
     *     
     */
    public OrganizationDTO.EntitlementFolders getEntitlementFolders() {
        return entitlementFolders;
    }

    /**
     * Sets the value of the entitlementFolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDTO.EntitlementFolders }
     *     
     */
    public void setEntitlementFolders(OrganizationDTO.EntitlementFolders value) {
        this.entitlementFolders = value;
    }

    /**
     * Gets the value of the targetMachines property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDTO.TargetMachines }
     *     
     */
    public OrganizationDTO.TargetMachines getTargetMachines() {
        return targetMachines;
    }

    /**
     * Sets the value of the targetMachines property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDTO.TargetMachines }
     *     
     */
    public void setTargetMachines(OrganizationDTO.TargetMachines value) {
        this.targetMachines = value;
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
     *         &lt;element name="EntitlementFolder" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementFolderDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "entitlementFolder"
    })
    public static class EntitlementFolders {

        @XmlElement(name = "EntitlementFolder")
        protected List<EntitlementFolderDTO> entitlementFolder;

        /**
         * Gets the value of the entitlementFolder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entitlementFolder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntitlementFolder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementFolderDTO }
         * 
         * 
         */
        public List<EntitlementFolderDTO> getEntitlementFolder() {
            if (entitlementFolder == null) {
                entitlementFolder = new ArrayList<EntitlementFolderDTO>();
            }
            return this.entitlementFolder;
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
     *         &lt;element name="TargetMachine" type="{http://interfaces.sems.sbs.it.hp.com/}targetDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "targetMachine"
    })
    public static class TargetMachines {

        @XmlElement(name = "TargetMachine")
        protected List<TargetDTO> targetMachine;

        /**
         * Gets the value of the targetMachine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the targetMachine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTargetMachine().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TargetDTO }
         * 
         * 
         */
        public List<TargetDTO> getTargetMachine() {
            if (targetMachine == null) {
                targetMachine = new ArrayList<TargetDTO>();
            }
            return this.targetMachine;
        }

    }

}
