//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:55 PM CST 
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
 * <p>Java class for SalesOrderHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}OrderHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="BackOrderIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="SalesOrganizationIDs" type="{http://www.openapplications.org/oagis/10}NamedIDsType" minOccurs="0"/>
 *         &lt;element name="DistributionCenterCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="OrderCommission" type="{http://www.openapplications.org/oagis/10}OrderCommissionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaseOrderReference" type="{http://www.openapplications.org/oagis/10}OrderReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderHeaderBaseType", propOrder = {
    "backOrderIndicator",
    "salesOrganizationIDs",
    "distributionCenterCode",
    "orderCommission",
    "purchaseOrderReference"
})
@XmlSeeAlso({
    SalesOrderHeaderType.class
})
public class SalesOrderHeaderBaseType
    extends OrderHeaderBaseType
{

    @XmlElement(name = "BackOrderIndicator")
    protected Boolean backOrderIndicator;
    @XmlElement(name = "SalesOrganizationIDs")
    protected NamedIDsType salesOrganizationIDs;
    @XmlElement(name = "DistributionCenterCode")
    protected CodeType distributionCenterCode;
    @XmlElement(name = "OrderCommission")
    protected List<OrderCommissionType> orderCommission;
    @XmlElement(name = "PurchaseOrderReference")
    protected List<OrderReferenceType> purchaseOrderReference;

    /**
     * Gets the value of the backOrderIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackOrderIndicator() {
        return backOrderIndicator;
    }

    /**
     * Sets the value of the backOrderIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackOrderIndicator(Boolean value) {
        this.backOrderIndicator = value;
    }

    /**
     * Gets the value of the salesOrganizationIDs property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDsType }
     *     
     */
    public NamedIDsType getSalesOrganizationIDs() {
        return salesOrganizationIDs;
    }

    /**
     * Sets the value of the salesOrganizationIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDsType }
     *     
     */
    public void setSalesOrganizationIDs(NamedIDsType value) {
        this.salesOrganizationIDs = value;
    }

    /**
     * Gets the value of the distributionCenterCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getDistributionCenterCode() {
        return distributionCenterCode;
    }

    /**
     * Sets the value of the distributionCenterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setDistributionCenterCode(CodeType value) {
        this.distributionCenterCode = value;
    }

    /**
     * Gets the value of the orderCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderCommissionType }
     * 
     * 
     */
    public List<OrderCommissionType> getOrderCommission() {
        if (orderCommission == null) {
            orderCommission = new ArrayList<OrderCommissionType>();
        }
        return this.orderCommission;
    }

    /**
     * Gets the value of the purchaseOrderReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReferenceType }
     * 
     * 
     */
    public List<OrderReferenceType> getPurchaseOrderReference() {
        if (purchaseOrderReference == null) {
            purchaseOrderReference = new ArrayList<OrderReferenceType>();
        }
        return this.purchaseOrderReference;
    }

}
