//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:00:53 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Final Agent Instructions Type for detailing special directions to the last agent
 * 
 * <p>Java class for FinalAgentInstructionBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinalAgentInstructionBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="Proprietary" type="{http://www.openapplications.org/oagis/10}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinalAgentInstructionBaseType", propOrder = {
    "proprietary"
})
@XmlSeeAlso({
    FinalAgentInstructionType.class
})
public class FinalAgentInstructionBaseType
    extends IdentificationType
{

    @XmlElement(name = "Proprietary")
    protected TextType proprietary;

    /**
     * Gets the value of the proprietary property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getProprietary() {
        return proprietary;
    }

    /**
     * Sets the value of the proprietary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setProprietary(TextType value) {
        this.proprietary = value;
    }

}
