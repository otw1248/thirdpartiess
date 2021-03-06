//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:14 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingLabelBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingLabelBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="FormatCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.openapplications.org/oagis/10}OpenTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingLabelBaseType", propOrder = {
    "formatCode",
    "text"
})
@XmlSeeAlso({
    ShippingLabelType.class
})
public class ShippingLabelBaseType
    extends IdentificationType
{

    @XmlElement(name = "FormatCode")
    protected CodeType formatCode;
    @XmlElement(name = "Text")
    protected OpenTextType text;

    /**
     * Gets the value of the formatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFormatCode() {
        return formatCode;
    }

    /**
     * Sets the value of the formatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFormatCode(CodeType value) {
        this.formatCode = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link OpenTextType }
     *     
     */
    public OpenTextType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenTextType }
     *     
     */
    public void setText(OpenTextType value) {
        this.text = value;
    }

}
