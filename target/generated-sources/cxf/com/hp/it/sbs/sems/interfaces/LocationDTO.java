
package com.hp.it.sbs.sems.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for locationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="locationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fmtAddrLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fmtAddrLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fmtAddrLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fmtAddrLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fmtAddrLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geographicArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteBusinessName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteBusinessName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteBusinessName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteBusinessName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "locationDTO", propOrder = {
    "city",
    "countryCode",
    "fmtAddrLine1",
    "fmtAddrLine2",
    "fmtAddrLine3",
    "fmtAddrLine4",
    "fmtAddrLine5",
    "geographicArea",
    "identifier",
    "postalCode",
    "siteBusinessName1",
    "siteBusinessName2",
    "siteBusinessName3",
    "siteBusinessName4",
    "streetAddress1",
    "streetAddress2",
    "streetAddress3"
})
public class LocationDTO {

    protected String city;
    protected String countryCode;
    protected String fmtAddrLine1;
    protected String fmtAddrLine2;
    protected String fmtAddrLine3;
    protected String fmtAddrLine4;
    protected String fmtAddrLine5;
    protected String geographicArea;
    protected String identifier;
    protected String postalCode;
    protected String siteBusinessName1;
    protected String siteBusinessName2;
    protected String siteBusinessName3;
    protected String siteBusinessName4;
    protected String streetAddress1;
    protected String streetAddress2;
    protected String streetAddress3;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the fmtAddrLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmtAddrLine1() {
        return fmtAddrLine1;
    }

    /**
     * Sets the value of the fmtAddrLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmtAddrLine1(String value) {
        this.fmtAddrLine1 = value;
    }

    /**
     * Gets the value of the fmtAddrLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmtAddrLine2() {
        return fmtAddrLine2;
    }

    /**
     * Sets the value of the fmtAddrLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmtAddrLine2(String value) {
        this.fmtAddrLine2 = value;
    }

    /**
     * Gets the value of the fmtAddrLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmtAddrLine3() {
        return fmtAddrLine3;
    }

    /**
     * Sets the value of the fmtAddrLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmtAddrLine3(String value) {
        this.fmtAddrLine3 = value;
    }

    /**
     * Gets the value of the fmtAddrLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmtAddrLine4() {
        return fmtAddrLine4;
    }

    /**
     * Sets the value of the fmtAddrLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmtAddrLine4(String value) {
        this.fmtAddrLine4 = value;
    }

    /**
     * Gets the value of the fmtAddrLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFmtAddrLine5() {
        return fmtAddrLine5;
    }

    /**
     * Sets the value of the fmtAddrLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFmtAddrLine5(String value) {
        this.fmtAddrLine5 = value;
    }

    /**
     * Gets the value of the geographicArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicArea() {
        return geographicArea;
    }

    /**
     * Sets the value of the geographicArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicArea(String value) {
        this.geographicArea = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the siteBusinessName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteBusinessName1() {
        return siteBusinessName1;
    }

    /**
     * Sets the value of the siteBusinessName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteBusinessName1(String value) {
        this.siteBusinessName1 = value;
    }

    /**
     * Gets the value of the siteBusinessName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteBusinessName2() {
        return siteBusinessName2;
    }

    /**
     * Sets the value of the siteBusinessName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteBusinessName2(String value) {
        this.siteBusinessName2 = value;
    }

    /**
     * Gets the value of the siteBusinessName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteBusinessName3() {
        return siteBusinessName3;
    }

    /**
     * Sets the value of the siteBusinessName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteBusinessName3(String value) {
        this.siteBusinessName3 = value;
    }

    /**
     * Gets the value of the siteBusinessName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteBusinessName4() {
        return siteBusinessName4;
    }

    /**
     * Sets the value of the siteBusinessName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteBusinessName4(String value) {
        this.siteBusinessName4 = value;
    }

    /**
     * Gets the value of the streetAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * Sets the value of the streetAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress1(String value) {
        this.streetAddress1 = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
    }

    /**
     * Gets the value of the streetAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress3() {
        return streetAddress3;
    }

    /**
     * Sets the value of the streetAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress3(String value) {
        this.streetAddress3 = value;
    }

}
