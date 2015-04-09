//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:42 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This identifies an instance of component in the context of parent.
 * 
 * <p>Java class for ComponentInstanceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentInstanceBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ParentItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" minOccurs="0"/>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentInstanceBaseType", propOrder = {
    "parentItemInstance",
    "itemInstance"
})
@XmlSeeAlso({
    ComponentInstanceType.class
})
public class ComponentInstanceBaseType
    extends IdentificationType
{

    @XmlElement(name = "ParentItemInstance")
    protected ItemInstanceType parentItemInstance;
    @XmlElement(name = "ItemInstance")
    protected ItemInstanceType itemInstance;

    /**
     * Gets the value of the parentItemInstance property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInstanceType }
     *     
     */
    public ItemInstanceType getParentItemInstance() {
        return parentItemInstance;
    }

    /**
     * Sets the value of the parentItemInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInstanceType }
     *     
     */
    public void setParentItemInstance(ItemInstanceType value) {
        this.parentItemInstance = value;
    }

    /**
     * Gets the value of the itemInstance property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInstanceType }
     *     
     */
    public ItemInstanceType getItemInstance() {
        return itemInstance;
    }

    /**
     * Sets the value of the itemInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInstanceType }
     *     
     */
    public void setItemInstance(ItemInstanceType value) {
        this.itemInstance = value;
    }

}