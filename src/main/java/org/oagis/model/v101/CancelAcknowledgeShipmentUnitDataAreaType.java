//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:03:25 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelAcknowledgeShipmentUnitDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelAcknowledgeShipmentUnitDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CancelAcknowledge" type="{http://www.openapplications.org/oagis/10}AcknowledgeType"/>
 *         &lt;element name="ShipmentUnit" type="{http://www.openapplications.org/oagis/10}ShipmentUnitType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelAcknowledgeShipmentUnitDataAreaType", propOrder = {
    "cancelAcknowledge",
    "shipmentUnit"
})
public class CancelAcknowledgeShipmentUnitDataAreaType {

    @XmlElement(name = "CancelAcknowledge", required = true)
    protected AcknowledgeType cancelAcknowledge;
    @XmlElement(name = "ShipmentUnit", required = true)
    protected List<ShipmentUnitType> shipmentUnit;

    /**
     * Gets the value of the cancelAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeType }
     *     
     */
    public AcknowledgeType getCancelAcknowledge() {
        return cancelAcknowledge;
    }

    /**
     * Sets the value of the cancelAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeType }
     *     
     */
    public void setCancelAcknowledge(AcknowledgeType value) {
        this.cancelAcknowledge = value;
    }

    /**
     * Gets the value of the shipmentUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentUnitType }
     * 
     * 
     */
    public List<ShipmentUnitType> getShipmentUnit() {
        if (shipmentUnit == null) {
            shipmentUnit = new ArrayList<ShipmentUnitType>();
        }
        return this.shipmentUnit;
    }

}