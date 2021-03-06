//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:04:28 PM CST 
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
 * <p>Java class for SplitWIPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitWIPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SplitWIPHeader" type="{http://www.openapplications.org/oagis/10}WIPEventHeaderType" minOccurs="0"/>
 *         &lt;element name="SplitWIPSource" type="{http://www.openapplications.org/oagis/10}SplitWIPSourceType" minOccurs="0"/>
 *         &lt;element name="SplitWIPDestination" type="{http://www.openapplications.org/oagis/10}SplitWIPDestinationType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SplitWIPType", propOrder = {
    "splitWIPHeader",
    "splitWIPSource",
    "splitWIPDestination"
})
public class SplitWIPType {

    @XmlElement(name = "SplitWIPHeader")
    protected WIPEventHeaderType splitWIPHeader;
    @XmlElement(name = "SplitWIPSource")
    protected SplitWIPSourceType splitWIPSource;
    @XmlElement(name = "SplitWIPDestination")
    protected List<SplitWIPDestinationType> splitWIPDestination;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the splitWIPHeader property.
     * 
     * @return
     *     possible object is
     *     {@link WIPEventHeaderType }
     *     
     */
    public WIPEventHeaderType getSplitWIPHeader() {
        return splitWIPHeader;
    }

    /**
     * Sets the value of the splitWIPHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link WIPEventHeaderType }
     *     
     */
    public void setSplitWIPHeader(WIPEventHeaderType value) {
        this.splitWIPHeader = value;
    }

    /**
     * Gets the value of the splitWIPSource property.
     * 
     * @return
     *     possible object is
     *     {@link SplitWIPSourceType }
     *     
     */
    public SplitWIPSourceType getSplitWIPSource() {
        return splitWIPSource;
    }

    /**
     * Sets the value of the splitWIPSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitWIPSourceType }
     *     
     */
    public void setSplitWIPSource(SplitWIPSourceType value) {
        this.splitWIPSource = value;
    }

    /**
     * Gets the value of the splitWIPDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitWIPDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitWIPDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitWIPDestinationType }
     * 
     * 
     */
    public List<SplitWIPDestinationType> getSplitWIPDestination() {
        if (splitWIPDestination == null) {
            splitWIPDestination = new ArrayList<SplitWIPDestinationType>();
        }
        return this.splitWIPDestination;
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
