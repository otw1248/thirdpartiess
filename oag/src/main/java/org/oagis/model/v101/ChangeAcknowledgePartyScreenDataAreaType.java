//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:14:24 PM CST 
//


package org.oagis.model.v101;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeAcknowledgePartyScreenDataAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeAcknowledgePartyScreenDataAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeAcknowledge" type="{http://www.openapplications.org/oagis/10}AcknowledgeType"/>
 *         &lt;element name="PartyScreen" type="{http://www.openapplications.org/oagis/10}PartyScreenType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAcknowledgePartyScreenDataAreaType", propOrder = {
    "changeAcknowledge",
    "partyScreen"
})
public class ChangeAcknowledgePartyScreenDataAreaType {

    @XmlElement(name = "ChangeAcknowledge", required = true)
    protected AcknowledgeType changeAcknowledge;
    @XmlElement(name = "PartyScreen", required = true)
    protected List<PartyScreenType> partyScreen;

    /**
     * Gets the value of the changeAcknowledge property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeType }
     *     
     */
    public AcknowledgeType getChangeAcknowledge() {
        return changeAcknowledge;
    }

    /**
     * Sets the value of the changeAcknowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeType }
     *     
     */
    public void setChangeAcknowledge(AcknowledgeType value) {
        this.changeAcknowledge = value;
    }

    /**
     * Gets the value of the partyScreen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyScreen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyScreen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyScreenType }
     * 
     * 
     */
    public List<PartyScreenType> getPartyScreen() {
        if (partyScreen == null) {
            partyScreen = new ArrayList<PartyScreenType>();
        }
        return this.partyScreen;
    }

}