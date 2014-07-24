
package com.hp.it.sbs.sems.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for targetDescriptionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="targetDescriptionDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetMachineID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetDescriptionID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="despTypeDescriptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "targetDescriptionDTO", propOrder = {
    "targetMachineID",
    "targetDescriptionID",
    "status",
    "despName",
    "despValue",
    "despType",
    "despTypeDescriptName"
})
public class TargetDescriptionDTO {

    protected Long targetMachineID;
    protected Long targetDescriptionID;
    protected String status;
    protected String despName;
    protected String despValue;
    protected String despType;
    protected String despTypeDescriptName;

    /**
     * Gets the value of the targetMachineID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetMachineID() {
        return targetMachineID;
    }

    /**
     * Sets the value of the targetMachineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetMachineID(Long value) {
        this.targetMachineID = value;
    }

    /**
     * Gets the value of the targetDescriptionID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetDescriptionID() {
        return targetDescriptionID;
    }

    /**
     * Sets the value of the targetDescriptionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetDescriptionID(Long value) {
        this.targetDescriptionID = value;
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
     * Gets the value of the despName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespName() {
        return despName;
    }

    /**
     * Sets the value of the despName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespName(String value) {
        this.despName = value;
    }

    /**
     * Gets the value of the despValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespValue() {
        return despValue;
    }

    /**
     * Sets the value of the despValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespValue(String value) {
        this.despValue = value;
    }

    /**
     * Gets the value of the despType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespType() {
        return despType;
    }

    /**
     * Sets the value of the despType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespType(String value) {
        this.despType = value;
    }

    /**
     * Gets the value of the despTypeDescriptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespTypeDescriptName() {
        return despTypeDescriptName;
    }

    /**
     * Sets the value of the despTypeDescriptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespTypeDescriptName(String value) {
        this.despTypeDescriptName = value;
    }

}
