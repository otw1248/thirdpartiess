//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 03:51:57 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgeBatchCertificateOfAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcknowledgeBatchCertificateOfAnalysisType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}BusinessObjectDocumentType">
 *       &lt;sequence>
 *         &lt;element name="DataArea" type="{http://www.openapplications.org/oagis/10}AcknowledgeBatchCertificateOfAnalysisDataAreaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcknowledgeBatchCertificateOfAnalysisType", propOrder = {
    "dataArea"
})
public class AcknowledgeBatchCertificateOfAnalysisType
    extends BusinessObjectDocumentType
{

    @XmlElement(name = "DataArea", required = true)
    protected AcknowledgeBatchCertificateOfAnalysisDataAreaType dataArea;

    /**
     * Gets the value of the dataArea property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgeBatchCertificateOfAnalysisDataAreaType }
     *     
     */
    public AcknowledgeBatchCertificateOfAnalysisDataAreaType getDataArea() {
        return dataArea;
    }

    /**
     * Sets the value of the dataArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgeBatchCertificateOfAnalysisDataAreaType }
     *     
     */
    public void setDataArea(AcknowledgeBatchCertificateOfAnalysisDataAreaType value) {
        this.dataArea = value;
    }

}