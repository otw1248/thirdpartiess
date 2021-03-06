//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:57:41 PM CST 
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
 * <p>Java class for BOMHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOMHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}StatusHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="AlternateBOMReference" type="{http://www.openapplications.org/oagis/10}BOMReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentBOMReference" type="{http://www.openapplications.org/oagis/10}BOMReferenceType" minOccurs="0"/>
 *         &lt;element name="ChildBOMReference" type="{http://www.openapplications.org/oagis/10}BOMReferenceBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RouteReference" type="{http://www.openapplications.org/oagis/10}RouteReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.openapplications.org/oagis/10}OpenNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UsageDescription" type="{http://www.openapplications.org/oagis/10}DescriptionType" minOccurs="0"/>
 *         &lt;element name="Effectivity" type="{http://www.openapplications.org/oagis/10}EffectivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.openapplications.org/oagis/10}LocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrackingIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="BatchSizeQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ManufacturingParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOMHeaderBaseType", propOrder = {
    "alternateBOMReference",
    "parentBOMReference",
    "childBOMReference",
    "routeReference",
    "name",
    "usageDescription",
    "effectivity",
    "effectiveTimePeriod",
    "location",
    "trackingIndicator",
    "batchSizeQuantity",
    "party",
    "manufacturingParty"
})
@XmlSeeAlso({
    BOMHeaderType.class
})
public class BOMHeaderBaseType
    extends StatusHeaderBaseType
{

    @XmlElement(name = "AlternateBOMReference")
    protected List<BOMReferenceType> alternateBOMReference;
    @XmlElement(name = "ParentBOMReference")
    protected BOMReferenceType parentBOMReference;
    @XmlElement(name = "ChildBOMReference")
    protected List<BOMReferenceBaseType> childBOMReference;
    @XmlElement(name = "RouteReference")
    protected List<RouteReferenceType> routeReference;
    @XmlElement(name = "Name")
    protected List<OpenNameType> name;
    @XmlElement(name = "UsageDescription")
    protected DescriptionType usageDescription;
    @XmlElement(name = "Effectivity")
    protected List<EffectivityType> effectivity;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "Location")
    protected List<LocationType> location;
    @XmlElement(name = "TrackingIndicator")
    protected Boolean trackingIndicator;
    @XmlElement(name = "BatchSizeQuantity")
    protected QuantityType batchSizeQuantity;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "ManufacturingParty")
    protected PartyType manufacturingParty;

    /**
     * Gets the value of the alternateBOMReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateBOMReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateBOMReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMReferenceType }
     * 
     * 
     */
    public List<BOMReferenceType> getAlternateBOMReference() {
        if (alternateBOMReference == null) {
            alternateBOMReference = new ArrayList<BOMReferenceType>();
        }
        return this.alternateBOMReference;
    }

    /**
     * Gets the value of the parentBOMReference property.
     * 
     * @return
     *     possible object is
     *     {@link BOMReferenceType }
     *     
     */
    public BOMReferenceType getParentBOMReference() {
        return parentBOMReference;
    }

    /**
     * Sets the value of the parentBOMReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOMReferenceType }
     *     
     */
    public void setParentBOMReference(BOMReferenceType value) {
        this.parentBOMReference = value;
    }

    /**
     * Gets the value of the childBOMReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childBOMReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildBOMReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMReferenceBaseType }
     * 
     * 
     */
    public List<BOMReferenceBaseType> getChildBOMReference() {
        if (childBOMReference == null) {
            childBOMReference = new ArrayList<BOMReferenceBaseType>();
        }
        return this.childBOMReference;
    }

    /**
     * Gets the value of the routeReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteReferenceType }
     * 
     * 
     */
    public List<RouteReferenceType> getRouteReference() {
        if (routeReference == null) {
            routeReference = new ArrayList<RouteReferenceType>();
        }
        return this.routeReference;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenNameType }
     * 
     * 
     */
    public List<OpenNameType> getName() {
        if (name == null) {
            name = new ArrayList<OpenNameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the usageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getUsageDescription() {
        return usageDescription;
    }

    /**
     * Sets the value of the usageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setUsageDescription(DescriptionType value) {
        this.usageDescription = value;
    }

    /**
     * Gets the value of the effectivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EffectivityType }
     * 
     * 
     */
    public List<EffectivityType> getEffectivity() {
        if (effectivity == null) {
            effectivity = new ArrayList<EffectivityType>();
        }
        return this.effectivity;
    }

    /**
     * Gets the value of the effectiveTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }

    /**
     * Sets the value of the effectiveTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEffectiveTimePeriod(TimePeriodType value) {
        this.effectiveTimePeriod = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType>();
        }
        return this.location;
    }

    /**
     * Gets the value of the trackingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackingIndicator() {
        return trackingIndicator;
    }

    /**
     * Sets the value of the trackingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackingIndicator(Boolean value) {
        this.trackingIndicator = value;
    }

    /**
     * Gets the value of the batchSizeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getBatchSizeQuantity() {
        return batchSizeQuantity;
    }

    /**
     * Sets the value of the batchSizeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setBatchSizeQuantity(QuantityType value) {
        this.batchSizeQuantity = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getParty() {
        if (party == null) {
            party = new ArrayList<PartyType>();
        }
        return this.party;
    }

    /**
     * Gets the value of the manufacturingParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getManufacturingParty() {
        return manufacturingParty;
    }

    /**
     * Sets the value of the manufacturingParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setManufacturingParty(PartyType value) {
        this.manufacturingParty = value;
    }

}
