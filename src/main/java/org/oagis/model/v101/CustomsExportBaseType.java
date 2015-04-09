//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:23 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Customs Export Type for detailing a thing 
 * 
 * <p>Java class for CustomsExportBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsExportBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="CountryCode" type="{http://www.openapplications.org/oagis/10}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="EntryNumberID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsExportBaseType", propOrder = {
    "countryCode",
    "entryNumberID"
})
@XmlSeeAlso({
    CustomsExportType.class
})
public class CustomsExportBaseType
    extends IdentificationType
{

    @XmlElement(name = "CountryCode")
    protected CountryCodeType countryCode;
    @XmlElement(name = "EntryNumberID")
    protected IDType entryNumberID;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the entryNumberID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getEntryNumberID() {
        return entryNumberID;
    }

    /**
     * Sets the value of the entryNumberID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setEntryNumberID(IDType value) {
        this.entryNumberID = value;
    }

}