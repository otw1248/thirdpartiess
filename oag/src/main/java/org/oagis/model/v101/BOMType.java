//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:57:41 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for BOMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BOMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BOMHeader" type="{http://www.openapplications.org/oagis/10}BOMHeaderType" minOccurs="0"/>
 *         &lt;element name="BOMItemData" type="{http://www.openapplications.org/oagis/10}BOMItemDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BOMOption" type="{http://www.openapplications.org/oagis/10}BOMOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BOMOptionClass" type="{http://www.openapplications.org/oagis/10}BOMOptionClassType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="typeCode" type="{http://www.openapplications.org/oagis/10}CodeType_1E7368" />
 *       &lt;attribute name="actionCode" type="{http://www.openapplications.org/oagis/10}ActionCodeContentType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BOMType", propOrder = {
    "bomHeader",
    "bomItemData",
    "bomOption",
    "bomOptionClass"
})
public class BOMType {

    @XmlElement(name = "BOMHeader")
    protected BOMHeaderType bomHeader;
    @XmlElement(name = "BOMItemData")
    protected List<BOMItemDataType> bomItemData;
    @XmlElement(name = "BOMOption")
    protected List<BOMOptionType> bomOption;
    @XmlElement(name = "BOMOptionClass")
    protected List<BOMOptionClassType> bomOptionClass;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the bomHeader property.
     * 
     * @return
     *     possible object is
     *     {@link BOMHeaderType }
     *     
     */
    public BOMHeaderType getBOMHeader() {
        return bomHeader;
    }

    /**
     * Sets the value of the bomHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link BOMHeaderType }
     *     
     */
    public void setBOMHeader(BOMHeaderType value) {
        this.bomHeader = value;
    }

    /**
     * Gets the value of the bomItemData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomItemData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMItemData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMItemDataType }
     * 
     * 
     */
    public List<BOMItemDataType> getBOMItemData() {
        if (bomItemData == null) {
            bomItemData = new ArrayList<BOMItemDataType>();
        }
        return this.bomItemData;
    }

    /**
     * Gets the value of the bomOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMOptionType }
     * 
     * 
     */
    public List<BOMOptionType> getBOMOption() {
        if (bomOption == null) {
            bomOption = new ArrayList<BOMOptionType>();
        }
        return this.bomOption;
    }

    /**
     * Gets the value of the bomOptionClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bomOptionClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBOMOptionClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BOMOptionClassType }
     * 
     * 
     */
    public List<BOMOptionClassType> getBOMOptionClass() {
        if (bomOptionClass == null) {
            bomOptionClass = new ArrayList<BOMOptionClassType>();
        }
        return this.bomOptionClass;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
