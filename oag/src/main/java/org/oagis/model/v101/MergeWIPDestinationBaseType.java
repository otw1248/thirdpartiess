//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:57 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MergeWIPDestinationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MergeWIPDestinationBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" minOccurs="0"/>
 *         &lt;element name="ItemQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductionOrderReference" type="{http://www.openapplications.org/oagis/10}ProductionOrderReferenceType" minOccurs="0"/>
 *         &lt;element name="OperationReference" type="{http://www.openapplications.org/oagis/10}OperationReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeWIPDestinationBaseType", propOrder = {
    "itemInstance",
    "itemQuantity",
    "quantity",
    "productionOrderReference",
    "operationReference"
})
@XmlSeeAlso({
    MergeWIPDestinationType.class
})
public class MergeWIPDestinationBaseType
    extends IdentificationType
{

    @XmlElement(name = "ItemInstance")
    protected ItemInstanceType itemInstance;
    @XmlElement(name = "ItemQuantity")
    protected QuantityType itemQuantity;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;
    @XmlElement(name = "ProductionOrderReference")
    protected ProductionOrderReferenceType productionOrderReference;
    @XmlElement(name = "OperationReference")
    protected OperationReferenceType operationReference;

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

    /**
     * Gets the value of the itemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setItemQuantity(QuantityType value) {
        this.itemQuantity = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenQuantityType }
     * 
     * 
     */
    public List<OpenQuantityType> getQuantity() {
        if (quantity == null) {
            quantity = new ArrayList<OpenQuantityType>();
        }
        return this.quantity;
    }

    /**
     * Gets the value of the productionOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionOrderReferenceType }
     *     
     */
    public ProductionOrderReferenceType getProductionOrderReference() {
        return productionOrderReference;
    }

    /**
     * Sets the value of the productionOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionOrderReferenceType }
     *     
     */
    public void setProductionOrderReference(ProductionOrderReferenceType value) {
        this.productionOrderReference = value;
    }

    /**
     * Gets the value of the operationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OperationReferenceType }
     *     
     */
    public OperationReferenceType getOperationReference() {
        return operationReference;
    }

    /**
     * Sets the value of the operationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationReferenceType }
     *     
     */
    public void setOperationReference(OperationReferenceType value) {
        this.operationReference = value;
    }

}
