
package com.hp.it.sbs.sems.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for processEntitlementSp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="processEntitlementSp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iDocNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderContractXMLidoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processEntitlementSp", propOrder = {
    "iDocNumber",
    "transactionID",
    "orderContractXMLidoc"
})
public class ProcessEntitlementSp {

    protected String iDocNumber;
    protected String transactionID;
    protected String orderContractXMLidoc;

    /**
     * Gets the value of the iDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDocNumber() {
        return iDocNumber;
    }

    /**
     * Sets the value of the iDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDocNumber(String value) {
        this.iDocNumber = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the orderContractXMLidoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderContractXMLidoc() {
        return orderContractXMLidoc;
    }

    /**
     * Sets the value of the orderContractXMLidoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderContractXMLidoc(String value) {
        this.orderContractXMLidoc = value;
    }

}
