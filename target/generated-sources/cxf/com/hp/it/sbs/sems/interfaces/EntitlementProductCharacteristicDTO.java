
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entitlementProductCharacteristicDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entitlementProductCharacteristicDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="characteristicMDCPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characteristicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characteristicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characteristicValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="meter" type="{http://interfaces.sems.sbs.it.hp.com/}meterDTO" minOccurs="0"/>
 *         &lt;element name="ChildEntitlementProductCharacteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChildEntitlementProductCharacteristic" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementProductCharacteristicDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "entitlementProductCharacteristicDTO", propOrder = {
    "characteristicMDCPID",
    "characteristicName",
    "characteristicType",
    "characteristicValue",
    "meter",
    "childEntitlementProductCharacteristics"
})
public class EntitlementProductCharacteristicDTO {

    protected String characteristicMDCPID;
    protected String characteristicName;
    protected String characteristicType;
    protected String characteristicValue;
    protected MeterDTO meter;
    @XmlElement(name = "ChildEntitlementProductCharacteristics")
    protected EntitlementProductCharacteristicDTO.ChildEntitlementProductCharacteristics childEntitlementProductCharacteristics;

    /**
     * Gets the value of the characteristicMDCPID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicMDCPID() {
        return characteristicMDCPID;
    }

    /**
     * Sets the value of the characteristicMDCPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicMDCPID(String value) {
        this.characteristicMDCPID = value;
    }

    /**
     * Gets the value of the characteristicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicName() {
        return characteristicName;
    }

    /**
     * Sets the value of the characteristicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicName(String value) {
        this.characteristicName = value;
    }

    /**
     * Gets the value of the characteristicType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicType() {
        return characteristicType;
    }

    /**
     * Sets the value of the characteristicType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicType(String value) {
        this.characteristicType = value;
    }

    /**
     * Gets the value of the characteristicValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicValue() {
        return characteristicValue;
    }

    /**
     * Sets the value of the characteristicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicValue(String value) {
        this.characteristicValue = value;
    }

    /**
     * Gets the value of the meter property.
     * 
     * @return
     *     possible object is
     *     {@link MeterDTO }
     *     
     */
    public MeterDTO getMeter() {
        return meter;
    }

    /**
     * Sets the value of the meter property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeterDTO }
     *     
     */
    public void setMeter(MeterDTO value) {
        this.meter = value;
    }

    /**
     * Gets the value of the childEntitlementProductCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementProductCharacteristicDTO.ChildEntitlementProductCharacteristics }
     *     
     */
    public EntitlementProductCharacteristicDTO.ChildEntitlementProductCharacteristics getChildEntitlementProductCharacteristics() {
        return childEntitlementProductCharacteristics;
    }

    /**
     * Sets the value of the childEntitlementProductCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementProductCharacteristicDTO.ChildEntitlementProductCharacteristics }
     *     
     */
    public void setChildEntitlementProductCharacteristics(EntitlementProductCharacteristicDTO.ChildEntitlementProductCharacteristics value) {
        this.childEntitlementProductCharacteristics = value;
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
     *         &lt;element name="ChildEntitlementProductCharacteristic" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementProductCharacteristicDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "childEntitlementProductCharacteristic"
    })
    public static class ChildEntitlementProductCharacteristics {

        @XmlElement(name = "ChildEntitlementProductCharacteristic")
        protected List<EntitlementProductCharacteristicDTO> childEntitlementProductCharacteristic;

        /**
         * Gets the value of the childEntitlementProductCharacteristic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the childEntitlementProductCharacteristic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getChildEntitlementProductCharacteristic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementProductCharacteristicDTO }
         * 
         * 
         */
        public List<EntitlementProductCharacteristicDTO> getChildEntitlementProductCharacteristic() {
            if (childEntitlementProductCharacteristic == null) {
                childEntitlementProductCharacteristic = new ArrayList<EntitlementProductCharacteristicDTO>();
            }
            return this.childEntitlementProductCharacteristic;
        }

    }

}
