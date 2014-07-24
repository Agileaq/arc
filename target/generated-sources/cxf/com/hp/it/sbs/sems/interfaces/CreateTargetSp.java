
package com.hp.it.sbs.sems.interfaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createTargetSp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createTargetSp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetDTO" type="{http://interfaces.sems.sbs.it.hp.com/}targetDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createTargetSp", propOrder = {
    "targetDTO"
})
public class CreateTargetSp {

    protected TargetDTO targetDTO;

    /**
     * Gets the value of the targetDTO property.
     * 
     * @return
     *     possible object is
     *     {@link TargetDTO }
     *     
     */
    public TargetDTO getTargetDTO() {
        return targetDTO;
    }

    /**
     * Sets the value of the targetDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetDTO }
     *     
     */
    public void setTargetDTO(TargetDTO value) {
        this.targetDTO = value;
    }

}
