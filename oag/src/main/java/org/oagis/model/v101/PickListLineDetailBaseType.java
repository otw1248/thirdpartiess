//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:03 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PickListLineDetailBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickListLineDetailBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}LineBaseType">
 *       &lt;sequence>
 *         &lt;element name="ShippingTrackingID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LoadingLocation" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="ShipToLocation" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="ShippingMaterialID" type="{http://www.openapplications.org/oagis/10}IDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipmentDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LoadingDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ShippingWeightAndVolumeGroup" minOccurs="0"/>
 *         &lt;element name="ItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.openapplications.org/oagis/10}OpenQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickListLineDetailBaseType", propOrder = {
    "shippingTrackingID",
    "loadingLocation",
    "shipToLocation",
    "shippingMaterialID",
    "shipmentDateTime",
    "loadingDateTime",
    "dunnageWeightMeasure",
    "tareWeightMeasure",
    "netWeightMeasure",
    "grossWeightMeasure",
    "netVolumeMeasure",
    "totalVolumeMeasure",
    "itemInstance",
    "quantity"
})
@XmlSeeAlso({
    PickListLineDetailType.class
})
public class PickListLineDetailBaseType
    extends LineBaseType
{

    @XmlElement(name = "ShippingTrackingID")
    protected List<IDType> shippingTrackingID;
    @XmlElement(name = "LoadingLocation")
    protected LocationType loadingLocation;
    @XmlElement(name = "ShipToLocation")
    protected LocationType shipToLocation;
    @XmlElement(name = "ShippingMaterialID")
    protected List<IDType> shippingMaterialID;
    @XmlElement(name = "ShipmentDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String shipmentDateTime;
    @XmlElement(name = "LoadingDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String loadingDateTime;
    @XmlElement(name = "DunnageWeightMeasure")
    protected MeasureType dunnageWeightMeasure;
    @XmlElement(name = "TareWeightMeasure")
    protected MeasureType tareWeightMeasure;
    @XmlElement(name = "NetWeightMeasure")
    protected MeasureType netWeightMeasure;
    @XmlElement(name = "GrossWeightMeasure")
    protected MeasureType grossWeightMeasure;
    @XmlElement(name = "NetVolumeMeasure")
    protected MeasureType netVolumeMeasure;
    @XmlElement(name = "TotalVolumeMeasure")
    protected MeasureType totalVolumeMeasure;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;
    @XmlElement(name = "Quantity")
    protected List<OpenQuantityType> quantity;

    /**
     * Gets the value of the shippingTrackingID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingTrackingID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingTrackingID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getShippingTrackingID() {
        if (shippingTrackingID == null) {
            shippingTrackingID = new ArrayList<IDType>();
        }
        return this.shippingTrackingID;
    }

    /**
     * Gets the value of the loadingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLoadingLocation() {
        return loadingLocation;
    }

    /**
     * Sets the value of the loadingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLoadingLocation(LocationType value) {
        this.loadingLocation = value;
    }

    /**
     * Gets the value of the shipToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getShipToLocation() {
        return shipToLocation;
    }

    /**
     * Sets the value of the shipToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setShipToLocation(LocationType value) {
        this.shipToLocation = value;
    }

    /**
     * Gets the value of the shippingMaterialID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingMaterialID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingMaterialID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IDType }
     * 
     * 
     */
    public List<IDType> getShippingMaterialID() {
        if (shippingMaterialID == null) {
            shippingMaterialID = new ArrayList<IDType>();
        }
        return this.shippingMaterialID;
    }

    /**
     * Gets the value of the shipmentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentDateTime() {
        return shipmentDateTime;
    }

    /**
     * Sets the value of the shipmentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentDateTime(String value) {
        this.shipmentDateTime = value;
    }

    /**
     * Gets the value of the loadingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadingDateTime() {
        return loadingDateTime;
    }

    /**
     * Sets the value of the loadingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadingDateTime(String value) {
        this.loadingDateTime = value;
    }

    /**
     * Gets the value of the dunnageWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDunnageWeightMeasure() {
        return dunnageWeightMeasure;
    }

    /**
     * Sets the value of the dunnageWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDunnageWeightMeasure(MeasureType value) {
        this.dunnageWeightMeasure = value;
    }

    /**
     * Gets the value of the tareWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTareWeightMeasure() {
        return tareWeightMeasure;
    }

    /**
     * Sets the value of the tareWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTareWeightMeasure(MeasureType value) {
        this.tareWeightMeasure = value;
    }

    /**
     * Gets the value of the netWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetWeightMeasure() {
        return netWeightMeasure;
    }

    /**
     * Sets the value of the netWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetWeightMeasure(MeasureType value) {
        this.netWeightMeasure = value;
    }

    /**
     * Gets the value of the grossWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getGrossWeightMeasure() {
        return grossWeightMeasure;
    }

    /**
     * Sets the value of the grossWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setGrossWeightMeasure(MeasureType value) {
        this.grossWeightMeasure = value;
    }

    /**
     * Gets the value of the netVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getNetVolumeMeasure() {
        return netVolumeMeasure;
    }

    /**
     * Sets the value of the netVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setNetVolumeMeasure(MeasureType value) {
        this.netVolumeMeasure = value;
    }

    /**
     * Gets the value of the totalVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTotalVolumeMeasure() {
        return totalVolumeMeasure;
    }

    /**
     * Sets the value of the totalVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTotalVolumeMeasure(MeasureType value) {
        this.totalVolumeMeasure = value;
    }

    /**
     * Gets the value of the itemInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceType }
     * 
     * 
     */
    public List<ItemInstanceType> getItemInstance() {
        if (itemInstance == null) {
            itemInstance = new ArrayList<ItemInstanceType>();
        }
        return this.itemInstance;
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

}