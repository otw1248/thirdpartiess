//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 03:58:45 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancelAcknowledgeEmployeeWorkScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelAcknowledgeEmployeeWorkScheduleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}CancelAcknowledgeEmployeeWorkScheduleDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelAcknowledgeEmployeeWorkScheduleType", propOrder = {
    "dataArea"
})
public class CancelAcknowledgeEmployeeWorkScheduleType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected CancelAcknowledgeEmployeeWorkScheduleDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link CancelAcknowledgeEmployeeWorkScheduleDataAreaType }
     *     
     */
    public CancelAcknowledgeEmployeeWorkScheduleDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelAcknowledgeEmployeeWorkScheduleDataAreaType }
     *     
     */
    public void setDataArea(CancelAcknowledgeEmployeeWorkScheduleDataAreaType value) {
        this.dataArea = value;
    }

}