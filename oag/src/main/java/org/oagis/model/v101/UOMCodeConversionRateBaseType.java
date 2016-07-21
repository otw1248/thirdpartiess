//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:38 PM CST 
//


package org.oagis.model.v101;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The UOM here represents the alternate UOM. The the Multiplier determines the conversion between the parent UOM and the UOM specified here in the alternate UOM.
 * 
 * <p>Java class for UOMCodeConversionRateBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UOMCodeConversionRateBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="FromUOMPackage" type="{http://www.openapplications.org/oagis/10}UOMPackageType" minOccurs="0"/>
 *         &lt;element name="RateNumber" type="{http://www.openapplications.org/oagis/10}NumberType" minOccurs="0"/>
 *         &lt;element name="ToUOMPackage" type="{http://www.openapplications.org/oagis/10}UOMPackageType" minOccurs="0"/>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}FreeFormTextGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UOMCodeConversionRateBaseType", propOrder = {
    "fromUOMPackage",
    "rateNumber",
    "toUOMPackage",
    "description",
    "note"
})
@XmlSeeAlso({
    UOMCodeConversionRateType.class
})
public class UOMCodeConversionRateBaseType
    extends IdentificationType
{

    @XmlElement(name = "FromUOMPackage")
    protected UOMPackageType fromUOMPackage;
    @XmlElement(name = "RateNumber")
    protected BigDecimal rateNumber;
    @XmlElement(name = "ToUOMPackage")
    protected UOMPackageType toUOMPackage;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Note")
    protected List<NoteType> note;

    /**
     * Gets the value of the fromUOMPackage property.
     * 
     * @return
     *     possible object is
     *     {@link UOMPackageType }
     *     
     */
    public UOMPackageType getFromUOMPackage() {
        return fromUOMPackage;
    }

    /**
     * Sets the value of the fromUOMPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMPackageType }
     *     
     */
    public void setFromUOMPackage(UOMPackageType value) {
        this.fromUOMPackage = value;
    }

    /**
     * Gets the value of the rateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRateNumber() {
        return rateNumber;
    }

    /**
     * Sets the value of the rateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRateNumber(BigDecimal value) {
        this.rateNumber = value;
    }

    /**
     * Gets the value of the toUOMPackage property.
     * 
     * @return
     *     possible object is
     *     {@link UOMPackageType }
     *     
     */
    public UOMPackageType getToUOMPackage() {
        return toUOMPackage;
    }

    /**
     * Sets the value of the toUOMPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link UOMPackageType }
     *     
     */
    public void setToUOMPackage(UOMPackageType value) {
        this.toUOMPackage = value;
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

}