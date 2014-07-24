
package com.hp.it.sbs.sems.interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entitlementFolderDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entitlementFolderDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="folderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderRole" type="{http://interfaces.sems.sbs.it.hp.com/}roleDTO" minOccurs="0"/>
 *         &lt;element name="Users" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="User" type="{http://interfaces.sems.sbs.it.hp.com/}userDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Notifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Notifier" type="{http://interfaces.sems.sbs.it.hp.com/}userDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EntitlementList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Entitlement" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "entitlementFolderDTO", propOrder = {
    "folderId",
    "folderName",
    "folderRole",
    "users",
    "notifiers",
    "entitlementList"
})
public class EntitlementFolderDTO {

    protected Long folderId;
    protected String folderName;
    protected RoleDTO folderRole;
    @XmlElement(name = "Users")
    protected EntitlementFolderDTO.Users users;
    @XmlElement(name = "Notifiers")
    protected EntitlementFolderDTO.Notifiers notifiers;
    @XmlElement(name = "EntitlementList")
    protected EntitlementFolderDTO.EntitlementList entitlementList;

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

    /**
     * Gets the value of the folderRole property.
     * 
     * @return
     *     possible object is
     *     {@link RoleDTO }
     *     
     */
    public RoleDTO getFolderRole() {
        return folderRole;
    }

    /**
     * Sets the value of the folderRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleDTO }
     *     
     */
    public void setFolderRole(RoleDTO value) {
        this.folderRole = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementFolderDTO.Users }
     *     
     */
    public EntitlementFolderDTO.Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementFolderDTO.Users }
     *     
     */
    public void setUsers(EntitlementFolderDTO.Users value) {
        this.users = value;
    }

    /**
     * Gets the value of the notifiers property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementFolderDTO.Notifiers }
     *     
     */
    public EntitlementFolderDTO.Notifiers getNotifiers() {
        return notifiers;
    }

    /**
     * Sets the value of the notifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementFolderDTO.Notifiers }
     *     
     */
    public void setNotifiers(EntitlementFolderDTO.Notifiers value) {
        this.notifiers = value;
    }

    /**
     * Gets the value of the entitlementList property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementFolderDTO.EntitlementList }
     *     
     */
    public EntitlementFolderDTO.EntitlementList getEntitlementList() {
        return entitlementList;
    }

    /**
     * Sets the value of the entitlementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementFolderDTO.EntitlementList }
     *     
     */
    public void setEntitlementList(EntitlementFolderDTO.EntitlementList value) {
        this.entitlementList = value;
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
     *         &lt;element name="Entitlement" type="{http://interfaces.sems.sbs.it.hp.com/}entitlementDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "entitlement"
    })
    public static class EntitlementList {

        @XmlElement(name = "Entitlement")
        protected List<EntitlementDTO> entitlement;

        /**
         * Gets the value of the entitlement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entitlement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntitlement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EntitlementDTO }
         * 
         * 
         */
        public List<EntitlementDTO> getEntitlement() {
            if (entitlement == null) {
                entitlement = new ArrayList<EntitlementDTO>();
            }
            return this.entitlement;
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
     *         &lt;element name="Notifier" type="{http://interfaces.sems.sbs.it.hp.com/}userDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "notifier"
    })
    public static class Notifiers {

        @XmlElement(name = "Notifier")
        protected List<UserDTO> notifier;

        /**
         * Gets the value of the notifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserDTO }
         * 
         * 
         */
        public List<UserDTO> getNotifier() {
            if (notifier == null) {
                notifier = new ArrayList<UserDTO>();
            }
            return this.notifier;
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
     *         &lt;element name="User" type="{http://interfaces.sems.sbs.it.hp.com/}userDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "user"
    })
    public static class Users {

        @XmlElement(name = "User")
        protected List<UserDTO> user;

        /**
         * Gets the value of the user property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the user property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserDTO }
         * 
         * 
         */
        public List<UserDTO> getUser() {
            if (user == null) {
                user = new ArrayList<UserDTO>();
            }
            return this.user;
        }

    }

}
