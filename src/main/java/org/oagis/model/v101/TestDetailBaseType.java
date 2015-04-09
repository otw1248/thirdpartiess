//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:59:34 PM CST 
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
 * The type that represents unique details for the parent element
 * 
 * <p>Java class for TestDetailBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestDetailBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.openapplications.org/oagis/10}ReferencesGroup"/>
 *         &lt;element name="TestMethodValue" type="{http://www.openapplications.org/oagis/10}NameValuePairType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasureRange" type="{http://www.openapplications.org/oagis/10}MeasureRangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcceptableValue" type="{http://www.openapplications.org/oagis/10}NameValuePairType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcceptableNameValueRange" type="{http://www.openapplications.org/oagis/10}NameValueRangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DesiredPointValue" type="{http://www.openapplications.org/oagis/10}NameValuePairType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EnvironmentalParameterValue" type="{http://www.openapplications.org/oagis/10}NameValuePairType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestDetailBaseType", propOrder = {
    "documentReference",
    "attachment",
    "testMethodValue",
    "measureRange",
    "acceptableValue",
    "acceptableNameValueRange",
    "desiredPointValue",
    "environmentalParameterValue"
})
@XmlSeeAlso({
    TestDetailType.class
})
public class TestDetailBaseType
    extends IdentificationType
{

    @XmlElement(name = "DocumentReference")
    protected List<DocumentReferenceType> documentReference;
    @XmlElement(name = "Attachment")
    protected List<AttachmentType> attachment;
    @XmlElement(name = "TestMethodValue")
    protected List<NameValuePairType> testMethodValue;
    @XmlElement(name = "MeasureRange")
    protected List<MeasureRangeType> measureRange;
    @XmlElement(name = "AcceptableValue")
    protected List<NameValuePairType> acceptableValue;
    @XmlElement(name = "AcceptableNameValueRange")
    protected List<NameValueRangeType> acceptableNameValueRange;
    @XmlElement(name = "DesiredPointValue")
    protected List<NameValuePairType> desiredPointValue;
    @XmlElement(name = "EnvironmentalParameterValue")
    protected List<NameValuePairType> environmentalParameterValue;

    /**
     * Gets the value of the documentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     * 
     * 
     */
    public List<DocumentReferenceType> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.documentReference;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<AttachmentType>();
        }
        return this.attachment;
    }

    /**
     * Gets the value of the testMethodValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testMethodValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestMethodValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePairType }
     * 
     * 
     */
    public List<NameValuePairType> getTestMethodValue() {
        if (testMethodValue == null) {
            testMethodValue = new ArrayList<NameValuePairType>();
        }
        return this.testMethodValue;
    }

    /**
     * Gets the value of the measureRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measureRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasureRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasureRangeType }
     * 
     * 
     */
    public List<MeasureRangeType> getMeasureRange() {
        if (measureRange == null) {
            measureRange = new ArrayList<MeasureRangeType>();
        }
        return this.measureRange;
    }

    /**
     * Gets the value of the acceptableValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptableValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptableValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePairType }
     * 
     * 
     */
    public List<NameValuePairType> getAcceptableValue() {
        if (acceptableValue == null) {
            acceptableValue = new ArrayList<NameValuePairType>();
        }
        return this.acceptableValue;
    }

    /**
     * Gets the value of the acceptableNameValueRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptableNameValueRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptableNameValueRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueRangeType }
     * 
     * 
     */
    public List<NameValueRangeType> getAcceptableNameValueRange() {
        if (acceptableNameValueRange == null) {
            acceptableNameValueRange = new ArrayList<NameValueRangeType>();
        }
        return this.acceptableNameValueRange;
    }

    /**
     * Gets the value of the desiredPointValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desiredPointValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesiredPointValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePairType }
     * 
     * 
     */
    public List<NameValuePairType> getDesiredPointValue() {
        if (desiredPointValue == null) {
            desiredPointValue = new ArrayList<NameValuePairType>();
        }
        return this.desiredPointValue;
    }

    /**
     * Gets the value of the environmentalParameterValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentalParameterValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentalParameterValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePairType }
     * 
     * 
     */
    public List<NameValuePairType> getEnvironmentalParameterValue() {
        if (environmentalParameterValue == null) {
            environmentalParameterValue = new ArrayList<NameValuePairType>();
        }
        return this.environmentalParameterValue;
    }

}