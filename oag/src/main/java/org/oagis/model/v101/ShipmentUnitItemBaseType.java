//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:14 PM CST 
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
 * Shipment Unit Item Type for detailing a container or aggregator used to move or store items
 * 
 * <p>Java class for ShipmentUnitItemBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentUnitItemBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ShipItemBaseType">
 *       &lt;sequence>
 *         &lt;element name="UnitSalePriceAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="ExtendedSalePriceAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreightItemGroup"/>
 *         &lt;element name="ShippingLabel" type="{http://www.openapplications.org/oagis/10}ShippingLabelType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentUnitItemBaseType", propOrder = {
    "unitSalePriceAmount",
    "extendedSalePriceAmount",
    "freightItemID",
    "freightClassificationCode",
    "shippingLabel"
})
@XmlSeeAlso({
    ShipmentUnitItemType.class
})
public class ShipmentUnitItemBaseType
    extends ShipItemBaseType
{

    @XmlElement(name = "UnitSalePriceAmount")
    protected AmountType unitSalePriceAmount;
    @XmlElement(name = "ExtendedSalePriceAmount")
    protected AmountType extendedSalePriceAmount;
    @XmlElement(name = "FreightItemID")
    protected IDType freightItemID;
    @XmlElement(name = "FreightClassificationCode")
    protected CodeType freightClassificationCode;
    @XmlElement(name = "ShippingLabel")
    protected List<ShippingLabelType> shippingLabel;

    /**
     * Gets the value of the unitSalePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getUnitSalePriceAmount() {
        return unitSalePriceAmount;
    }

    /**
     * Sets the value of the unitSalePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setUnitSalePriceAmount(AmountType value) {
        this.unitSalePriceAmount = value;
    }

    /**
     * Gets the value of the extendedSalePriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExtendedSalePriceAmount() {
        return extendedSalePriceAmount;
    }

    /**
     * Sets the value of the extendedSalePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExtendedSalePriceAmount(AmountType value) {
        this.extendedSalePriceAmount = value;
    }

    /**
     * Gets the value of the freightItemID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getFreightItemID() {
        return freightItemID;
    }

    /**
     * Sets the value of the freightItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setFreightItemID(IDType value) {
        this.freightItemID = value;
    }

    /**
     * Gets the value of the freightClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFreightClassificationCode() {
        return freightClassificationCode;
    }

    /**
     * Sets the value of the freightClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFreightClassificationCode(CodeType value) {
        this.freightClassificationCode = value;
    }

    /**
     * Gets the value of the shippingLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingLabelType }
     * 
     * 
     */
    public List<ShippingLabelType> getShippingLabel() {
        if (shippingLabel == null) {
            shippingLabel = new ArrayList<ShippingLabelType>();
        }
        return this.shippingLabel;
    }

}