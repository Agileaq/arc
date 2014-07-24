
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for folderDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="folderDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoApproveEffective" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="autoApproveEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="autoApproveRoleList" type="{http://interfaces.sems.sbs.it.hp.com/}roleDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baseEntIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://interfaces.sems.sbs.it.hp.com/}customerDTO" minOccurs="0"/>
 *         &lt;element name="entitledUsers" type="{http://interfaces.sems.sbs.it.hp.com/}entitledUserDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="foldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderAutoApproveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="folderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="folderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "folderDTO", propOrder = {
    "autoApproveEffective",
    "autoApproveEnd",
    "autoApproveRoleList",
    "baseEntIds",
    "customer",
    "entitledUsers",
    "foldName",
    "folderAutoApproveIndicator",
    "folderDescription",
    "folderId",
    "folderName"
})
public class FolderDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autoApproveEffective;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autoApproveEnd;
    @XmlElement(nillable = true)
    protected List<RoleDTO> autoApproveRoleList;
    @XmlElement(nillable = true)
    protected List<Long> baseEntIds;
    protected CustomerDTO customer;
    @XmlElement(nillable = true)
    protected List<EntitledUserDTO> entitledUsers;
    protected String foldName;
    protected Boolean folderAutoApproveIndicator;
    protected String folderDescription;
    protected Long folderId;
    protected String folderName;

    /**
     * Gets the value of the autoApproveEffective property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutoApproveEffective() {
        return autoApproveEffective;
    }

    /**
     * Sets the value of the autoApproveEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutoApproveEffective(XMLGregorianCalendar value) {
        this.autoApproveEffective = value;
    }

    /**
     * Gets the value of the autoApproveEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutoApproveEnd() {
        return autoApproveEnd;
    }

    /**
     * Sets the value of the autoApproveEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutoApproveEnd(XMLGregorianCalendar value) {
        this.autoApproveEnd = value;
    }

    /**
     * Gets the value of the autoApproveRoleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoApproveRoleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoApproveRoleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleDTO }
     * 
     * 
     */
    public List<RoleDTO> getAutoApproveRoleList() {
        if (autoApproveRoleList == null) {
            autoApproveRoleList = new ArrayList<RoleDTO>();
        }
        return this.autoApproveRoleList;
    }

    /**
     * Gets the value of the baseEntIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseEntIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseEntIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getBaseEntIds() {
        if (baseEntIds == null) {
            baseEntIds = new ArrayList<Long>();
        }
        return this.baseEntIds;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDTO }
     *     
     */
    public CustomerDTO getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDTO }
     *     
     */
    public void setCustomer(CustomerDTO value) {
        this.customer = value;
    }

    /**
     * Gets the value of the entitledUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitledUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitledUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitledUserDTO }
     * 
     * 
     */
    public List<EntitledUserDTO> getEntitledUsers() {
        if (entitledUsers == null) {
            entitledUsers = new ArrayList<EntitledUserDTO>();
        }
        return this.entitledUsers;
    }

    /**
     * Gets the value of the foldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoldName() {
        return foldName;
    }

    /**
     * Sets the value of the foldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoldName(String value) {
        this.foldName = value;
    }

    /**
     * Gets the value of the folderAutoApproveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFolderAutoApproveIndicator() {
        return folderAutoApproveIndicator;
    }

    /**
     * Sets the value of the folderAutoApproveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFolderAutoApproveIndicator(Boolean value) {
        this.folderAutoApproveIndicator = value;
    }

    /**
     * Gets the value of the folderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderDescription() {
        return folderDescription;
    }

    /**
     * Sets the value of the folderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderDescription(String value) {
        this.folderDescription = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFolderId(Long value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the folderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Sets the value of the folderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

}
