//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:26:17 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetItemNonconformanceDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemNonconformanceDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Get" type="{http://www.openapplications.org/oagis/10}GetType"/>
 *         &lt;element name="ItemNonconformance" type="{http://www.openapplications.org/oagis/10}ItemNonconformanceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemNonconformanceDataAreaType", propOrder = {
    "get",
    "itemNonconformance"
})
public class GetItemNonconformanceDataAreaType {

    @XmlElement(name = "Get", required = true)
    protected GetType get;
    @XmlElement(name = "ItemNonconformance", required = true)
    protected List<ItemNonconformanceType> itemNonconformance;

    /**
     * Gets the value of the get property.
     * 
     * @return
     *     possible object is
     *     {@link GetType }
     *     
     */
    public GetType getGet() {
        return get;
    }

    /**
     * Sets the value of the get property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetType }
     *     
     */
    public void setGet(GetType value) {
        this.get = value;
    }

    /**
     * Gets the value of the itemNonconformance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemNonconformance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemNonconformance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemNonconformanceType }
     * 
     * 
     */
    public List<ItemNonconformanceType> getItemNonconformance() {
        if (itemNonconformance == null) {
            itemNonconformance = new ArrayList<ItemNonconformanceType>();
        }
        return this.itemNonconformance;
    }

}