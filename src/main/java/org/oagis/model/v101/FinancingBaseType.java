//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:50 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Financing Base Type for detailing generic details of an offer to fund or underwrite something
 * 
 * <p>Java class for FinancingBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="PaymentAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="BalanceAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="FinalAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="ResidualAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://www.openapplications.org/oagis/10}PaymentTermType" minOccurs="0"/>
 *         &lt;element name="MaturityDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="FinancialParty" type="{http://www.openapplications.org/oagis/10}FinancialPartyType" minOccurs="0"/>
 *         &lt;element name="DownPaymentAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.openapplications.org/oagis/10}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentAuthorization" type="{http://www.openapplications.org/oagis/10}PaymentAuthorizationType" minOccurs="0"/>
 *         &lt;element name="CreditRatingCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingBaseType", propOrder = {
    "paymentAmount",
    "balanceAmount",
    "finalAmount",
    "residualAmount",
    "paymentTerm",
    "maturityDateTime",
    "financialParty",
    "downPaymentAmount",
    "totalAmount",
    "paymentAuthorization",
    "creditRatingCode"
})
@XmlSeeAlso({
    FinancingType.class
})
public class FinancingBaseType
    extends IdentificationType
{

    @XmlElement(name = "PaymentAmount")
    protected AmountType paymentAmount;
    @XmlElement(name = "BalanceAmount")
    protected AmountType balanceAmount;
    @XmlElement(name = "FinalAmount")
    protected AmountType finalAmount;
    @XmlElement(name = "ResidualAmount")
    protected AmountType residualAmount;
    @XmlElement(name = "PaymentTerm")
    protected PaymentTermType paymentTerm;
    @XmlElement(name = "MaturityDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String maturityDateTime;
    @XmlElement(name = "FinancialParty")
    protected FinancialPartyType financialParty;
    @XmlElement(name = "DownPaymentAmount")
    protected AmountType downPaymentAmount;
    @XmlElement(name = "TotalAmount")
    protected AmountType totalAmount;
    @XmlElement(name = "PaymentAuthorization")
    protected PaymentAuthorizationType paymentAuthorization;
    @XmlElement(name = "CreditRatingCode")
    protected CodeType creditRatingCode;

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPaymentAmount(AmountType value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the balanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalanceAmount() {
        return balanceAmount;
    }

    /**
     * Sets the value of the balanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalanceAmount(AmountType value) {
        this.balanceAmount = value;
    }

    /**
     * Gets the value of the finalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFinalAmount() {
        return finalAmount;
    }

    /**
     * Sets the value of the finalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFinalAmount(AmountType value) {
        this.finalAmount = value;
    }

    /**
     * Gets the value of the residualAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getResidualAmount() {
        return residualAmount;
    }

    /**
     * Sets the value of the residualAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setResidualAmount(AmountType value) {
        this.residualAmount = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTermType }
     *     
     */
    public PaymentTermType getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTermType }
     *     
     */
    public void setPaymentTerm(PaymentTermType value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the maturityDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaturityDateTime() {
        return maturityDateTime;
    }

    /**
     * Sets the value of the maturityDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturityDateTime(String value) {
        this.maturityDateTime = value;
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
     * Gets the value of the downPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDownPaymentAmount() {
        return downPaymentAmount;
    }

    /**
     * Sets the value of the downPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDownPaymentAmount(AmountType value) {
        this.downPaymentAmount = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalAmount(AmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the paymentAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAuthorizationType }
     *     
     */
    public PaymentAuthorizationType getPaymentAuthorization() {
        return paymentAuthorization;
    }

    /**
     * Sets the value of the paymentAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAuthorizationType }
     *     
     */
    public void setPaymentAuthorization(PaymentAuthorizationType value) {
        this.paymentAuthorization = value;
    }

    /**
     * Gets the value of the creditRatingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getCreditRatingCode() {
        return creditRatingCode;
    }

    /**
     * Sets the value of the creditRatingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setCreditRatingCode(CodeType value) {
        this.creditRatingCode = value;
    }

}