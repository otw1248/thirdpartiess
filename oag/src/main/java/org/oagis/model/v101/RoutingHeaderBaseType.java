//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:45 PM CST 
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
 * <p>Java class for RoutingHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}HeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="BOMReference" type="{http://www.openapplications.org/oagis/10}BOMReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="ManufacturingItem" type="{http://www.openapplications.org/oagis/10}ManufacturingItemType" minOccurs="0"/>
 *         &lt;element name="ManufacturingItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" minOccurs="0"/>
 *         &lt;element name="SiteLocation" type="{http://www.openapplications.org/oagis/10}LocationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Distribution" type="{http://www.openapplications.org/oagis/10}DistributionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge" type="{http://www.openapplications.org/oagis/10}ChargeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperationGroup" type="{http://www.openapplications.org/oagis/10}OperationGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RouteOperation" type="{http://www.openapplications.org/oagis/10}RouteOperationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InQueueLocation" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="OutQueueLocation" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="ProjectReference" type="{http://www.openapplications.org/oagis/10}ProjectReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingHeaderBaseType", propOrder = {
    "bomReference",
    "effectiveTimePeriod",
    "manufacturingItem",
    "manufacturingItemInstance",
    "siteLocation",
    "distribution",
    "charge",
    "operationGroup",
    "routeOperation",
    "inQueueLocation",
    "outQueueLocation",
    "projectReference"
})
@XmlSeeAlso({
    RoutingHeaderType.class
})
public class RoutingHeaderBaseType
    extends HeaderBaseType
{

    @XmlElement(name = "BOMReference")
    protected List<BOMReferenceType> bomReference;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "ManufacturingItem")
    protected ManufacturingItemType manufacturingItem;
    @XmlElement(name = "ManufacturingItemInstance")
    protected ItemInstanceType manufacturingItemInstance;
    @XmlElement(name = "SiteLocation")
    protected List<LocationType> siteLocation;
    @XmlElement(name = "Distribution")
    protected List<DistributionType> distribution;
    @XmlElement(name = "Charge")
    protected List<ChargeType> charge;
    @XmlElement(name = "OperationGroup")
    protected List<OperationGroupType> operationGroup;
    @XmlElement(name = "RouteOperation")
    protected List<RouteOperationType> routeOperation;
    @XmlElement(name = "InQueueLocation")
    protected LocationType inQueueLocation;
    @XmlElement(name = "OutQueueLocation")
    protected LocationType outQueueLocation;
    @XmlElement(name = "ProjectReference")
    protected ProjectReferenceType projectReference;

    /**
     * Gets the value of the bomReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMReferenceType }
     * 
     * 
     */
    public List<BOMReferenceType> getBOMReference() {
        if (bomReference == null) {
            bomReference = new ArrayList<BOMReferenceType>();
        }
        return this.bomReference;
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
     * Gets the value of the manufacturingItem property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingItemType }
     *     
     */
    public ManufacturingItemType getManufacturingItem() {
        return manufacturingItem;
    }

    /**
     * Sets the value of the manufacturingItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingItemType }
     *     
     */
    public void setManufacturingItem(ManufacturingItemType value) {
        this.manufacturingItem = value;
    }

    /**
     * Gets the value of the manufacturingItemInstance property.
     * 
     * @return
     *     possible object is
     *     {@link ItemInstanceType }
     *     
     */
    public ItemInstanceType getManufacturingItemInstance() {
        return manufacturingItemInstance;
    }

    /**
     * Sets the value of the manufacturingItemInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemInstanceType }
     *     
     */
    public void setManufacturingItemInstance(ItemInstanceType value) {
        this.manufacturingItemInstance = value;
    }

    /**
     * Gets the value of the siteLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getSiteLocation() {
        if (siteLocation == null) {
            siteLocation = new ArrayList<LocationType>();
        }
        return this.siteLocation;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionType }
     * 
     * 
     */
    public List<DistributionType> getDistribution() {
        if (distribution == null) {
            distribution = new ArrayList<DistributionType>();
        }
        return this.distribution;
    }

    /**
     * Gets the value of the charge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the charge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargeType }
     * 
     * 
     */
    public List<ChargeType> getCharge() {
        if (charge == null) {
            charge = new ArrayList<ChargeType>();
        }
        return this.charge;
    }

    /**
     * Gets the value of the operationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationGroupType }
     * 
     * 
     */
    public List<OperationGroupType> getOperationGroup() {
        if (operationGroup == null) {
            operationGroup = new ArrayList<OperationGroupType>();
        }
        return this.operationGroup;
    }

    /**
     * Gets the value of the routeOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteOperationType }
     * 
     * 
     */
    public List<RouteOperationType> getRouteOperation() {
        if (routeOperation == null) {
            routeOperation = new ArrayList<RouteOperationType>();
        }
        return this.routeOperation;
    }

    /**
     * Gets the value of the inQueueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getInQueueLocation() {
        return inQueueLocation;
    }

    /**
     * Sets the value of the inQueueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setInQueueLocation(LocationType value) {
        this.inQueueLocation = value;
    }

    /**
     * Gets the value of the outQueueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getOutQueueLocation() {
        return outQueueLocation;
    }

    /**
     * Sets the value of the outQueueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setOutQueueLocation(LocationType value) {
        this.outQueueLocation = value;
    }

    /**
     * Gets the value of the projectReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectReferenceType }
     *     
     */
    public ProjectReferenceType getProjectReference() {
        return projectReference;
    }

    /**
     * Sets the value of the projectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectReferenceType }
     *     
     */
    public void setProjectReference(ProjectReferenceType value) {
        this.projectReference = value;
    }

}
