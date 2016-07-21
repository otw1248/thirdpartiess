//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:55:09 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The purpose of  ReceiveLocationService is to enable a mechanism to ensure that the physical location owned by the business applications are validated, geocoded, and standardized by the location service providers.                                                                       This BOD may also be initiated by the service provider in response to receiving a request for a particular service such as geocoding, address validation, etc.                                                                                      There are many possible business applications in several environments that may use this capability. For example, the customer management, the supplier management, or HRMS business applications could use this to communicate Location information to location service providers.
 * 
 * <p>Java class for SyncLocationServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncLocationServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}SyncLocationServiceDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncLocationServiceType", propOrder = {
    "dataArea"
})
public class SyncLocationServiceType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected SyncLocationServiceDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link SyncLocationServiceDataAreaType }
     *     
     */
    public SyncLocationServiceDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncLocationServiceDataAreaType }
     *     
     */
    public void setDataArea(SyncLocationServiceDataAreaType value) {
        this.dataArea = value;
    }

}