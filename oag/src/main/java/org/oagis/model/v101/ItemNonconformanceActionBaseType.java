//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:42 PM CST 
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
 * <p>Java class for ItemNonconformanceActionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNonconformanceActionBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.openapplications.org/oagis/10}OpenCodeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ReferencesGroup"/>
 *         &lt;element name="EffectiveTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/>
 *         &lt;element name="OriginatorParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OwnerParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssignedToContact" type="{http://www.openapplications.org/oagis/10}ContactType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RejectedItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScrappedItemInstance" type="{http://www.openapplications.org/oagis/10}ItemInstanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomerParty" type="{http://www.openapplications.org/oagis/10}CustomerPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SupplierParty" type="{http://www.openapplications.org/oagis/10}SupplierPartyType" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNonconformanceActionBaseType", propOrder = {
    "code",
    "description",
    "note",
    "documentReference",
    "attachment",
    "effectiveTimePeriod",
    "status",
    "originatorParty",
    "ownerParty",
    "assignedToContact",
    "rejectedItemInstance",
    "scrappedItemInstance",
    "customerParty",
    "supplierParty",
    "party"
})
@XmlSeeAlso({
    ItemNonconformanceActionType.class
})
public class ItemNonconformanceActionBaseType
    extends IdentificationType
{

    @XmlElement(name = "Code")
    protected OpenCodeType code;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    @XmlElement(name = "EffectiveTimePeriod")
    protected TimePeriodType effectiveTimePeriod;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "OriginatorParty")
    protected List<PartyType> originatorParty;
    @XmlElement(name = "OwnerParty")
    protected List<PartyType> ownerParty;
    @XmlElement(name = "AssignedToContact")
    protected List<ContactType> assignedToContact;
    @XmlElement(name = "RejectedItemInstance")
    protected List<ItemInstanceType> rejectedItemInstance;
    @XmlElement(name = "ScrappedItemInstance")
    protected List<ItemInstanceType> scrappedItemInstance;
    @XmlElement(name = "CustomerParty")
    protected List<CustomerPartyType> customerParty;
    @XmlElement(name = "SupplierParty")
    protected SupplierPartyType supplierParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link OpenCodeType }
     *     
     */
    public OpenCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenCodeType }
     *     
     */
    public void setCode(OpenCodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the originatorParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originatorParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginatorParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getOriginatorParty() {
        if (originatorParty == null) {
            originatorParty = new ArrayList<PartyType>();
        }
        return this.originatorParty;
    }

    /**
     * Gets the value of the ownerParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnerParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getOwnerParty() {
        if (ownerParty == null) {
            ownerParty = new ArrayList<PartyType>();
        }
        return this.ownerParty;
    }

    /**
     * Gets the value of the assignedToContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignedToContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignedToContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactType }
     * 
     * 
     */
    public List<ContactType> getAssignedToContact() {
        if (assignedToContact == null) {
            assignedToContact = new ArrayList<ContactType>();
        }
        return this.assignedToContact;
    }

    /**
     * Gets the value of the rejectedItemInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rejectedItemInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRejectedItemInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceType }
     * 
     * 
     */
    public List<ItemInstanceType> getRejectedItemInstance() {
        if (rejectedItemInstance == null) {
            rejectedItemInstance = new ArrayList<ItemInstanceType>();
        }
        return this.rejectedItemInstance;
    }

    /**
     * Gets the value of the scrappedItemInstance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scrappedItemInstance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScrappedItemInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceType }
     * 
     * 
     */
    public List<ItemInstanceType> getScrappedItemInstance() {
        if (scrappedItemInstance == null) {
            scrappedItemInstance = new ArrayList<ItemInstanceType>();
        }
        return this.scrappedItemInstance;
    }

    /**
     * Gets the value of the customerParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPartyType }
     * 
     * 
     */
    public List<CustomerPartyType> getCustomerParty() {
        if (customerParty == null) {
            customerParty = new ArrayList<CustomerPartyType>();
        }
        return this.customerParty;
    }

    /**
     * Gets the value of the supplierParty property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartyType }
     *     
     */
    public SupplierPartyType getSupplierParty() {
        return supplierParty;
    }

    /**
     * Sets the value of the supplierParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartyType }
     *     
     */
    public void setSupplierParty(SupplierPartyType value) {
        this.supplierParty = value;
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

}