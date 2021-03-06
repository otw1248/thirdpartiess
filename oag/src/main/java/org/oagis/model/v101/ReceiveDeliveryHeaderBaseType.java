//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:47 PM CST 
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
 * Provides general information about the ReceiveDelivery document that is used to receive a specific quantity of material goods
 * 
 * The EffectiveDateTime is the date/time the received material is posted to other business systems as being available for use.
 * 
 * <p>Java class for ReceiveDeliveryHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceiveDeliveryHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ShipHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="ReceivingServiceChargeAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="EffectiveDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="ReceivedDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BillOfLadingID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="Container" type="{http://www.openapplications.org/oagis/10}ContainerType" minOccurs="0"/>
 *         &lt;element name="ReceivedByParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="ContainerQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType" minOccurs="0"/>
 *         &lt;element name="TrackingID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="DeliverToParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *         &lt;element name="ReceivingLocation" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="ASNReference" type="{http://www.openapplications.org/oagis/10}DocumentReferenceType" minOccurs="0"/>
 *         &lt;element name="ReceiptDiscrepancy" type="{http://www.openapplications.org/oagis/10}ReceiveDeliveryDiscrepancyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiveDeliveryHeaderBaseType", propOrder = {
    "receivingServiceChargeAmount",
    "effectiveDateTime",
    "receivedDateTime",
    "billOfLadingID",
    "container",
    "receivedByParty",
    "containerQuantity",
    "trackingID",
    "deliverToParty",
    "receivingLocation",
    "asnReference",
    "receiptDiscrepancy"
})
@XmlSeeAlso({
    ReceiveDeliveryHeaderType.class
})
public class ReceiveDeliveryHeaderBaseType
    extends ShipHeaderBaseType
{

    @XmlElement(name = "ReceivingServiceChargeAmount")
    protected AmountType receivingServiceChargeAmount;
    @XmlElement(name = "EffectiveDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String effectiveDateTime;
    @XmlElement(name = "ReceivedDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String receivedDateTime;
    @XmlElement(name = "BillOfLadingID")
    protected IDType billOfLadingID;
    @XmlElement(name = "Container")
    protected ContainerType container;
    @XmlElement(name = "ReceivedByParty")
    protected PartyType receivedByParty;
    @XmlElement(name = "ContainerQuantity")
    protected QuantityType containerQuantity;
    @XmlElement(name = "TrackingID")
    protected IDType trackingID;
    @XmlElement(name = "DeliverToParty")
    protected PartyType deliverToParty;
    @XmlElement(name = "ReceivingLocation")
    protected LocationType receivingLocation;
    @XmlElement(name = "ASNReference")
    protected DocumentReferenceType asnReference;
    @XmlElement(name = "ReceiptDiscrepancy")
    protected List<ReceiveDeliveryDiscrepancyType> receiptDiscrepancy;

    /**
     * Gets the value of the receivingServiceChargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getReceivingServiceChargeAmount() {
        return receivingServiceChargeAmount;
    }

    /**
     * Sets the value of the receivingServiceChargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setReceivingServiceChargeAmount(AmountType value) {
        this.receivingServiceChargeAmount = value;
    }

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDateTime(String value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the receivedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedDateTime() {
        return receivedDateTime;
    }

    /**
     * Sets the value of the receivedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedDateTime(String value) {
        this.receivedDateTime = value;
    }

    /**
     * Gets the value of the billOfLadingID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getBillOfLadingID() {
        return billOfLadingID;
    }

    /**
     * Sets the value of the billOfLadingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setBillOfLadingID(IDType value) {
        this.billOfLadingID = value;
    }

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType }
     *     
     */
    public ContainerType getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType }
     *     
     */
    public void setContainer(ContainerType value) {
        this.container = value;
    }

    /**
     * Gets the value of the receivedByParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getReceivedByParty() {
        return receivedByParty;
    }

    /**
     * Sets the value of the receivedByParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setReceivedByParty(PartyType value) {
        this.receivedByParty = value;
    }

    /**
     * Gets the value of the containerQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getContainerQuantity() {
        return containerQuantity;
    }

    /**
     * Sets the value of the containerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setContainerQuantity(QuantityType value) {
        this.containerQuantity = value;
    }

    /**
     * Gets the value of the trackingID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getTrackingID() {
        return trackingID;
    }

    /**
     * Sets the value of the trackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setTrackingID(IDType value) {
        this.trackingID = value;
    }

    /**
     * Gets the value of the deliverToParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getDeliverToParty() {
        return deliverToParty;
    }

    /**
     * Sets the value of the deliverToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setDeliverToParty(PartyType value) {
        this.deliverToParty = value;
    }

    /**
     * Gets the value of the receivingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getReceivingLocation() {
        return receivingLocation;
    }

    /**
     * Sets the value of the receivingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setReceivingLocation(LocationType value) {
        this.receivingLocation = value;
    }

    /**
     * Gets the value of the asnReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getASNReference() {
        return asnReference;
    }

    /**
     * Sets the value of the asnReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setASNReference(DocumentReferenceType value) {
        this.asnReference = value;
    }

    /**
     * Gets the value of the receiptDiscrepancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiptDiscrepancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiptDiscrepancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceiveDeliveryDiscrepancyType }
     * 
     * 
     */
    public List<ReceiveDeliveryDiscrepancyType> getReceiptDiscrepancy() {
        if (receiptDiscrepancy == null) {
            receiptDiscrepancy = new ArrayList<ReceiveDeliveryDiscrepancyType>();
        }
        return this.receiptDiscrepancy;
    }

}
