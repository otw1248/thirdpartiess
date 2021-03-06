//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:46:19 PM CST 
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
 * The JournalEntryID is the  ID in the source sub-ledger that generated the transaction
 * 
 * The IncrementIndicator identifies if the amounts in the ledger budget lines are intended to increment or replace any existing amounts
 * 
 * <p>Java class for BudgetLedgerHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetLedgerHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}HeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="JournalEntryID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="IncrementIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" minOccurs="0"/>
 *         &lt;element name="LedgerID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="GLEntityID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="SourceDocumentReference" type="{http://www.openapplications.org/oagis/10}DocumentReferenceType" minOccurs="0"/>
 *         &lt;element name="TransactionAnalysisCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.openapplications.org/oagis/10}UserType" minOccurs="0"/>
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
@XmlType(name = "BudgetLedgerHeaderBaseType", propOrder = {
    "journalEntryID",
    "incrementIndicator",
    "ledgerID",
    "glEntityID",
    "sourceDocumentReference",
    "transactionAnalysisCode",
    "user",
    "party"
})
@XmlSeeAlso({
    BudgetLedgerHeaderType.class
})
public class BudgetLedgerHeaderBaseType
    extends HeaderBaseType
{

    @XmlElement(name = "JournalEntryID")
    protected IDType journalEntryID;
    @XmlElement(name = "IncrementIndicator")
    protected Boolean incrementIndicator;
    @XmlElement(name = "LedgerID")
    protected IDType ledgerID;
    @XmlElement(name = "GLEntityID")
    protected IDType glEntityID;
    @XmlElement(name = "SourceDocumentReference")
    protected DocumentReferenceType sourceDocumentReference;
    @XmlElement(name = "TransactionAnalysisCode")
    protected CodeType transactionAnalysisCode;
    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "Party")
    protected List<PartyType> party;

    /**
     * Gets the value of the journalEntryID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getJournalEntryID() {
        return journalEntryID;
    }

    /**
     * Sets the value of the journalEntryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setJournalEntryID(IDType value) {
        this.journalEntryID = value;
    }

    /**
     * Gets the value of the incrementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementIndicator() {
        return incrementIndicator;
    }

    /**
     * Sets the value of the incrementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncrementIndicator(Boolean value) {
        this.incrementIndicator = value;
    }

    /**
     * Gets the value of the ledgerID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getLedgerID() {
        return ledgerID;
    }

    /**
     * Sets the value of the ledgerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setLedgerID(IDType value) {
        this.ledgerID = value;
    }

    /**
     * Gets the value of the glEntityID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getGLEntityID() {
        return glEntityID;
    }

    /**
     * Sets the value of the glEntityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setGLEntityID(IDType value) {
        this.glEntityID = value;
    }

    /**
     * Gets the value of the sourceDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceType }
     *     
     */
    public DocumentReferenceType getSourceDocumentReference() {
        return sourceDocumentReference;
    }

    /**
     * Sets the value of the sourceDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceType }
     *     
     */
    public void setSourceDocumentReference(DocumentReferenceType value) {
        this.sourceDocumentReference = value;
    }

    /**
     * Gets the value of the transactionAnalysisCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getTransactionAnalysisCode() {
        return transactionAnalysisCode;
    }

    /**
     * Sets the value of the transactionAnalysisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setTransactionAnalysisCode(CodeType value) {
        this.transactionAnalysisCode = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
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
