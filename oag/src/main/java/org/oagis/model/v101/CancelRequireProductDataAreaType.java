//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:09:18 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelRequireProductDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelRequireProductDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cancel" type="{http://www.openapplications.org/oagis/10}ProcessType"/>
 *         &lt;element name="RequireProduct" type="{http://www.openapplications.org/oagis/10}RequireProductType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelRequireProductDataAreaType", propOrder = {
    "cancel",
    "requireProduct"
})
public class CancelRequireProductDataAreaType {

    @XmlElement(name = "Cancel", required = true)
    protected ProcessType cancel;
    @XmlElement(name = "RequireProduct", required = true)
    protected List<RequireProductType> requireProduct;

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessType }
     *     
     */
    public ProcessType getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType }
     *     
     */
    public void setCancel(ProcessType value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the requireProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requireProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequireProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequireProductType }
     * 
     * 
     */
    public List<RequireProductType> getRequireProduct() {
        if (requireProduct == null) {
            requireProduct = new ArrayList<RequireProductType>();
        }
        return this.requireProduct;
    }

}