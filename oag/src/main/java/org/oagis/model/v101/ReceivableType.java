//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:51:06 PM CST 
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
 * <p>Java class for ReceivableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceivableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReceivableHeader" type="{http://www.openapplications.org/oagis/10}ReceivableHeaderType" minOccurs="0"/>
 *         &lt;element name="ReceivableLine" type="{http://www.openapplications.org/oagis/10}ReceivableLineType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ReceivableType", propOrder = {
    "receivableHeader",
    "receivableLine"
})
public class ReceivableType {

    @XmlElement(name = "ReceivableHeader")
    protected ReceivableHeaderType receivableHeader;
    @XmlElement(name = "ReceivableLine")
    protected List<ReceivableLineType> receivableLine;
    @XmlAttribute(name = "typeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String typeCode;
    @XmlAttribute(name = "actionCode")
    protected String actionCode;

    /**
     * Gets the value of the receivableHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivableHeaderType }
     *     
     */
    public ReceivableHeaderType getReceivableHeader() {
        return receivableHeader;
    }

    /**
     * Sets the value of the receivableHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivableHeaderType }
     *     
     */
    public void setReceivableHeader(ReceivableHeaderType value) {
        this.receivableHeader = value;
    }

    /**
     * Gets the value of the receivableLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivableLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivableLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReceivableLineType }
     * 
     * 
     */
    public List<ReceivableLineType> getReceivableLine() {
        if (receivableLine == null) {
            receivableLine = new ArrayList<ReceivableLineType>();
        }
        return this.receivableLine;
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
