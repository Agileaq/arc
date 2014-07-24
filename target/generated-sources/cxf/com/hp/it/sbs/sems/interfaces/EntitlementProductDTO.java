
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entitlementProductDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entitlementProductDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entitlementID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="entitlementProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigurableProducts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ConfigurableProduct" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementProductDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Characteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Characteristic" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementProductCharacteristicDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="licenseStructure" type="{http://interfaces.sems.sbs.it.hp.com/}softwareLicenseStructureDTO" minOccurs="0"/>
 *         &lt;element name="meter" type="{http://interfaces.sems.sbs.it.hp.com/}meterDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entitlementProductDTO", propOrder = {
    "productID",
    "productName",
    "entitlementID",
    "entitlementProductType",
    "configurableProducts",
    "characteristics",
    "licenseStructure",
    "meter"
})
public class EntitlementProductDTO {

    protected String productID;
    protected String productName;
    protected Long entitlementID;
    protected String entitlementProductType;
    @XmlElement(name = "ConfigurableProducts")
    protected EntitlementProductDTO.ConfigurableProducts configurableProducts;
    @XmlElement(name = "Characteristics")
    protected EntitlementProductDTO.Characteristics characteristics;
    protected SoftwareLicenseStructureDTO licenseStructure;
    protected MeterDTO meter;

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

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
     * Gets the value of the entitlementProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntitlementProductType() {
        return entitlementProductType;
    }

    /**
     * Sets the value of the entitlementProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntitlementProductType(String value) {
        this.entitlementProductType = value;
    }

    /**
     * Gets the value of the configurableProducts property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementProductDTO.ConfigurableProducts }
     *     
     */
    public EntitlementProductDTO.ConfigurableProducts getConfigurableProducts() {
        return configurableProducts;
    }

    /**
     * Sets the value of the configurableProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementProductDTO.ConfigurableProducts }
     *     
     */
    public void setConfigurableProducts(EntitlementProductDTO.ConfigurableProducts value) {
        this.configurableProducts = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementProductDTO.Characteristics }
     *     
     */
    public EntitlementProductDTO.Characteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementProductDTO.Characteristics }
     *     
     */
    public void setCharacteristics(EntitlementProductDTO.Characteristics value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the licenseStructure property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareLicenseStructureDTO }
     *     
     */
    public SoftwareLicenseStructureDTO getLicenseStructure() {
        return licenseStructure;
    }

    /**
     * Sets the value of the licenseStructure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareLicenseStructureDTO }
     *     
     */
    public void setLicenseStructure(SoftwareLicenseStructureDTO value) {
        this.licenseStructure = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Characteristic" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementProductCharacteristicDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "characteristic"
    })
    public static class Characteristics {

        @XmlElement(name = "Characteristic")
        protected List<EntitlementProductCharacteristicDTO> characteristic;

        /**
         * Gets the value of the characteristic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementProductCharacteristicDTO }
         * 
         * 
         */
        public List<EntitlementProductCharacteristicDTO> getCharacteristic() {
            if (characteristic == null) {
                characteristic = new ArrayList<EntitlementProductCharacteristicDTO>();
            }
            return this.characteristic;
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
     *         &lt;element name="ConfigurableProduct" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementProductDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "configurableProduct"
    })
    public static class ConfigurableProducts {

        @XmlElement(name = "ConfigurableProduct")
        protected List<EntitlementProductDTO> configurableProduct;

        /**
         * Gets the value of the configurableProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the configurableProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConfigurableProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementProductDTO }
         * 
         * 
         */
        public List<EntitlementProductDTO> getConfigurableProduct() {
            if (configurableProduct == null) {
                configurableProduct = new ArrayList<EntitlementProductDTO>();
            }
            return this.configurableProduct;
        }

    }

}
