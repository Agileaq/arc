
package com.hp.it.sbs.sems.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meterDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meterDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activatedQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="availableQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="characteristicID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitledTotal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="supportTotal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitOfmeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unlimited" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="uomName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meterDTO", propOrder = {
    "activatedQuantity",
    "availableQuantity",
    "characteristicID",
    "entitledTotal",
    "supportTotal",
    "unitOfmeasure",
    "unlimited",
    "uomName"
})
public class MeterDTO {

    protected Long activatedQuantity;
    protected Long availableQuantity;
    protected String characteristicID;
    protected Long entitledTotal;
    protected Long supportTotal;
    protected String unitOfmeasure;
    protected Boolean unlimited;
    protected String uomName;

    /**
     * Gets the value of the activatedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActivatedQuantity() {
        return activatedQuantity;
    }

    /**
     * Sets the value of the activatedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActivatedQuantity(Long value) {
        this.activatedQuantity = value;
    }

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableQuantity(Long value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the characteristicID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicID() {
        return characteristicID;
    }

    /**
     * Sets the value of the characteristicID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicID(String value) {
        this.characteristicID = value;
    }

    /**
     * Gets the value of the entitledTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntitledTotal() {
        return entitledTotal;
    }

    /**
     * Sets the value of the entitledTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntitledTotal(Long value) {
        this.entitledTotal = value;
    }

    /**
     * Gets the value of the supportTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSupportTotal() {
        return supportTotal;
    }

    /**
     * Sets the value of the supportTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSupportTotal(Long value) {
        this.supportTotal = value;
    }

    /**
     * Gets the value of the unitOfmeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfmeasure() {
        return unitOfmeasure;
    }

    /**
     * Sets the value of the unitOfmeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfmeasure(String value) {
        this.unitOfmeasure = value;
    }

    /**
     * Gets the value of the unlimited property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimited() {
        return unlimited;
    }

    /**
     * Sets the value of the unlimited property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimited(Boolean value) {
        this.unlimited = value;
    }

    /**
     * Gets the value of the uomName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUomName() {
        return uomName;
    }

    /**
     * Sets the value of the uomName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUomName(String value) {
        this.uomName = value;
    }

}
