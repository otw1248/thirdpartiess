//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:55 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityToleranceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityToleranceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnderQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType"/>
 *         &lt;element name="OverQuantity" type="{http://www.openapplications.org/oagis/10}QuantityType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityToleranceType", propOrder = {
    "underQuantity",
    "overQuantity"
})
public class QuantityToleranceType {

    @XmlElement(name = "UnderQuantity", required = true)
    protected QuantityType underQuantity;
    @XmlElement(name = "OverQuantity", required = true)
    protected QuantityType overQuantity;

    /**
     * Gets the value of the underQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getUnderQuantity() {
        return underQuantity;
    }

    /**
     * Sets the value of the underQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setUnderQuantity(QuantityType value) {
        this.underQuantity = value;
    }

    /**
     * Gets the value of the overQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getOverQuantity() {
        return overQuantity;
    }

    /**
     * Sets the value of the overQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setOverQuantity(QuantityType value) {
        this.overQuantity = value;
    }

}