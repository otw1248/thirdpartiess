//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:32 PM CST 
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
 * <p>Java class for PartyMasterBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyMasterBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}PartyBaseType">
 *       &lt;sequence>
 *         &lt;element name="AccountIDs" type="{http://www.openapplications.org/oagis/10}NamedIDsType" minOccurs="0"/>
 *         &lt;element name="PaymentTermID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="PaymentMethodCode" type="{http://www.openapplications.org/oagis/10}PaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="TaxExemptCodes" type="{http://www.openapplications.org/oagis/10}CodesType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *         &lt;element name="FinancialParty" type="{http://www.openapplications.org/oagis/10}FinancialPartyType" minOccurs="0"/>
 *         &lt;element name="CreationDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="LastModificationDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.openapplications.org/oagis/10}StatusType" minOccurs="0"/>
 *         &lt;element name="ParentParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildParty" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Party" type="{http://www.openapplications.org/oagis/10}PartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartnerRoleCodes" type="{http://www.openapplications.org/oagis/10}CodesType" minOccurs="0"/>
 *         &lt;element name="FinancialAccount" type="{http://www.openapplications.org/oagis/10}FinancialAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ReferencesGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyMasterBaseType", propOrder = {
    "accountIDs",
    "paymentTermID",
    "paymentMethodCode",
    "taxExemptCodes",
    "description",
    "note",
    "financialParty",
    "creationDateTime",
    "lastModificationDateTime",
    "status",
    "parentParty",
    "childParty",
    "party",
    "partnerRoleCodes",
    "financialAccount",
    "documentReference",
    "attachment"
})
@XmlSeeAlso({
    SuppliererPartyMasterBaseType.class
})
public class PartyMasterBaseType
    extends PartyBaseType
{

    @XmlElement(name = "AccountIDs")
    protected NamedIDsType accountIDs;
    @XmlElement(name = "PaymentTermID")
    protected IDType paymentTermID;
    @XmlElement(name = "PaymentMethodCode")
    protected PaymentMethodCodeType paymentMethodCode;
    @XmlElement(name = "TaxExemptCodes")
    protected CodesType taxExemptCodes;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "FinancialParty")
    protected FinancialPartyType financialParty;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String creationDateTime;
    @XmlElement(name = "LastModificationDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String lastModificationDateTime;
    @XmlElement(name = "Status")
    protected StatusType status;
    @XmlElement(name = "ParentParty")
    protected List<PartyType> parentParty;
    @XmlElement(name = "ChildParty")
    protected List<PartyType> childParty;
    @XmlElement(name = "Party")
    protected List<PartyType> party;
    @XmlElement(name = "PartnerRoleCodes")
    protected CodesType partnerRoleCodes;
    @XmlElement(name = "FinancialAccount")
    protected List<FinancialAccountType> financialAccount;
    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;

    /**
     * Gets the value of the accountIDs property.
     * 
     * @return
     *     possible object is
     *     {@link NamedIDsType }
     *     
     */
    public NamedIDsType getAccountIDs() {
        return accountIDs;
    }

    /**
     * Sets the value of the accountIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedIDsType }
     *     
     */
    public void setAccountIDs(NamedIDsType value) {
        this.accountIDs = value;
    }

    /**
     * Gets the value of the paymentTermID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getPaymentTermID() {
        return paymentTermID;
    }

    /**
     * Sets the value of the paymentTermID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setPaymentTermID(IDType value) {
        this.paymentTermID = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public PaymentMethodCodeType getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodCodeType }
     *     
     */
    public void setPaymentMethodCode(PaymentMethodCodeType value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the taxExemptCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CodesType }
     *     
     */
    public CodesType getTaxExemptCodes() {
        return taxExemptCodes;
    }

    /**
     * Sets the value of the taxExemptCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesType }
     *     
     */
    public void setTaxExemptCodes(CodesType value) {
        this.taxExemptCodes = value;
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
     * Gets the value of the financialParty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialPartyType }
     *     
     */
    public FinancialPartyType getFinancialParty() {
        return financialParty;
    }

    /**
     * Sets the value of the financialParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialPartyType }
     *     
     */
    public void setFinancialParty(FinancialPartyType value) {
        this.financialParty = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(String value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the lastModificationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModificationDateTime() {
        return lastModificationDateTime;
    }

    /**
     * Sets the value of the lastModificationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModificationDateTime(String value) {
        this.lastModificationDateTime = value;
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
     * Gets the value of the parentParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getParentParty() {
        if (parentParty == null) {
            parentParty = new ArrayList<PartyType>();
        }
        return this.parentParty;
    }

    /**
     * Gets the value of the childParty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childParty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     * 
     * 
     */
    public List<PartyType> getChildParty() {
        if (childParty == null) {
            childParty = new ArrayList<PartyType>();
        }
        return this.childParty;
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
     * Gets the value of the partnerRoleCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CodesType }
     *     
     */
    public CodesType getPartnerRoleCodes() {
        return partnerRoleCodes;
    }

    /**
     * Sets the value of the partnerRoleCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesType }
     *     
     */
    public void setPartnerRoleCodes(CodesType value) {
        this.partnerRoleCodes = value;
    }

    /**
     * Gets the value of the financialAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialAccountType }
     * 
     * 
     */
    public List<FinancialAccountType> getFinancialAccount() {
        if (financialAccount == null) {
            financialAccount = new ArrayList<FinancialAccountType>();
        }
        return this.financialAccount;
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

}
