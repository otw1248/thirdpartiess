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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderHeaderBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderHeaderBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}ProcurementHeaderBaseType">
 *       &lt;sequence>
 *         &lt;element name="SpecialPriceAuthorizationCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="EarliestShipDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="RequestedShipDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PromisedShipDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PromisedDeliveryDateTime" type="{http://www.openapplications.org/oagis/10}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PaymentMethodCode" type="{http://www.openapplications.org/oagis/10}PaymentMethodCodeType" minOccurs="0"/>
 *         &lt;element name="Payment" type="{http://www.openapplications.org/oagis/10}PaymentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShippingInstructions" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderHeaderBaseType", propOrder = {
    "specialPriceAuthorizationCode",
    "earliestShipDateTime",
    "requestedShipDateTime",
    "promisedShipDateTime",
    "promisedDeliveryDateTime",
    "paymentMethodCode",
    "payment",
    "shippingInstructions"
})
@XmlSeeAlso({
    SalesOrderHeaderBaseType.class
})
public class OrderHeaderBaseType
    extends ProcurementHeaderBaseType
{

    @XmlElement(name = "SpecialPriceAuthorizationCode")
    protected CodeType specialPriceAuthorizationCode;
    @XmlElement(name = "EarliestShipDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String earliestShipDateTime;
    @XmlElement(name = "RequestedShipDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String requestedShipDateTime;
    @XmlElement(name = "PromisedShipDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String promisedShipDateTime;
    @XmlElement(name = "PromisedDeliveryDateTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String promisedDeliveryDateTime;
    @XmlElement(name = "PaymentMethodCode")
    protected PaymentMethodCodeType paymentMethodCode;
    @XmlElement(name = "Payment")
    protected List<PaymentType> payment;
    @XmlElement(name = "ShippingInstructions")
    protected TextType shippingInstructions;

    /**
     * Gets the value of the specialPriceAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getSpecialPriceAuthorizationCode() {
        return specialPriceAuthorizationCode;
    }

    /**
     * Sets the value of the specialPriceAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setSpecialPriceAuthorizationCode(CodeType value) {
        this.specialPriceAuthorizationCode = value;
    }

    /**
     * Gets the value of the earliestShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestShipDateTime() {
        return earliestShipDateTime;
    }

    /**
     * Sets the value of the earliestShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestShipDateTime(String value) {
        this.earliestShipDateTime = value;
    }

    /**
     * Gets the value of the requestedShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedShipDateTime() {
        return requestedShipDateTime;
    }

    /**
     * Sets the value of the requestedShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedShipDateTime(String value) {
        this.requestedShipDateTime = value;
    }

    /**
     * Gets the value of the promisedShipDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromisedShipDateTime() {
        return promisedShipDateTime;
    }

    /**
     * Sets the value of the promisedShipDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromisedShipDateTime(String value) {
        this.promisedShipDateTime = value;
    }

    /**
     * Gets the value of the promisedDeliveryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromisedDeliveryDateTime() {
        return promisedDeliveryDateTime;
    }

    /**
     * Sets the value of the promisedDeliveryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromisedDeliveryDateTime(String value) {
        this.promisedDeliveryDateTime = value;
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
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     * 
     * 
     */
    public List<PaymentType> getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentType>();
        }
        return this.payment;
    }

    /**
     * Gets the value of the shippingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getShippingInstructions() {
        return shippingInstructions;
    }

    /**
     * Sets the value of the shippingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setShippingInstructions(TextType value) {
        this.shippingInstructions = value;
    }

}
