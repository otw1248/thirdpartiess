//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:00:45 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * HR-XML 3.0
 * 
 * <p>Java class for ViolationPointBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViolationPointBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ValidTimePeriod" type="{http://www.openapplications.org/oagis/10}TimePeriodType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViolationPointBaseType", propOrder = {
    "validTimePeriod"
})
@XmlSeeAlso({
    ViolationPointType.class
})
public class ViolationPointBaseType
    extends IdentificationType
{

    @XmlElement(name = "ValidTimePeriod")
    protected TimePeriodType validTimePeriod;

    /**
     * Gets the value of the validTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getValidTimePeriod() {
        return validTimePeriod;
    }

    /**
     * Sets the value of the validTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setValidTimePeriod(TimePeriodType value) {
        this.validTimePeriod = value;
    }

}