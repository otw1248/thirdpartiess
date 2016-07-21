//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:50:01 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayableHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayableHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}LedgerEntryHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="VoucherReference" type="{http://www.openapplications.org/oagis/10}VoucherReferenceType" minOccurs="0"/>
 *         &lt;element name="RemitToParty" type="{http://www.openapplications.org/oagis/10}RemitToPartyType" minOccurs="0"/>
 *         &lt;element name="PayeeParty" type="{http://www.openapplications.org/oagis/10}PartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayableHeaderBaseType", propOrder = {
    "voucherReference",
    "remitToParty",
    "payeeParty"
})
@XmlSeeAlso({
    PayableHeaderType.class
})
public class PayableHeaderBaseType
    extends LedgerEntryHeaderBaseType
{

    @XmlElement(name = "VoucherReference")
    protected VoucherReferenceType voucherReference;
    @XmlElement(name = "RemitToParty")
    protected RemitToPartyType remitToParty;
    @XmlElement(name = "PayeeParty")
    protected PartyType payeeParty;

    /**
     * Gets the value of the voucherReference property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherReferenceType }
     *     
     */
    public VoucherReferenceType getVoucherReference() {
        return voucherReference;
    }

    /**
     * Sets the value of the voucherReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherReferenceType }
     *     
     */
    public void setVoucherReference(VoucherReferenceType value) {
        this.voucherReference = value;
    }

    /**
     * Gets the value of the remitToParty property.
     * 
     * @return
     *     possible object is
     *     {@link RemitToPartyType }
     *     
     */
    public RemitToPartyType getRemitToParty() {
        return remitToParty;
    }

    /**
     * Sets the value of the remitToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemitToPartyType }
     *     
     */
    public void setRemitToParty(RemitToPartyType value) {
        this.remitToParty = value;
    }

    /**
     * Gets the value of the payeeParty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getPayeeParty() {
        return payeeParty;
    }

    /**
     * Sets the value of the payeeParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setPayeeParty(PartyType value) {
        this.payeeParty = value;
    }

}