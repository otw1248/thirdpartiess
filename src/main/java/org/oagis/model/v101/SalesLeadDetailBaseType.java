//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:03:50 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesLeadDetailBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesLeadDetailBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}CRMLineBaseType">
 *       &lt;sequence>
 *         &lt;element name="PreventIndicator" type="{http://www.openapplications.org/oagis/10}IndicatorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Financing" type="{http://www.openapplications.org/oagis/10}FinancingType" minOccurs="0"/>
 *         &lt;element name="Appointment" type="{http://www.openapplications.org/oagis/10}AppointmentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesActivity" type="{http://www.openapplications.org/oagis/10}SalesActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesLeadDetailBaseType", propOrder = {
    "preventIndicator",
    "financing",
    "appointment",
    "salesActivity"
})
@XmlSeeAlso({
    SalesLeadDetailType.class
})
public class SalesLeadDetailBaseType
    extends CRMLineBaseType
{

    @XmlElement(name = "PreventIndicator", type = Boolean.class)
    protected List<Boolean> preventIndicator;
    @XmlElement(name = "Financing")
    protected FinancingType financing;
    @XmlElement(name = "Appointment")
    protected List<AppointmentType> appointment;
    @XmlElement(name = "SalesActivity")
    protected List<SalesActivityType> salesActivity;

    /**
     * Gets the value of the preventIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preventIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreventIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getPreventIndicator() {
        if (preventIndicator == null) {
            preventIndicator = new ArrayList<Boolean>();
        }
        return this.preventIndicator;
    }

    /**
     * Gets the value of the financing property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingType }
     *     
     */
    public FinancingType getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingType }
     *     
     */
    public void setFinancing(FinancingType value) {
        this.financing = value;
    }

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentType }
     * 
     * 
     */
    public List<AppointmentType> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<AppointmentType>();
        }
        return this.appointment;
    }

    /**
     * Gets the value of the salesActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesActivityType }
     * 
     * 
     */
    public List<SalesActivityType> getSalesActivity() {
        if (salesActivity == null) {
            salesActivity = new ArrayList<SalesActivityType>();
        }
        return this.salesActivity;
    }

}