//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 05:01:29 PM CST 
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
 * <p>Java class for ManufacturingMaterialBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingMaterialBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="Classification" type="{http://www.openapplications.org/oagis/10}ClassificationType" minOccurs="0"/>
 *         &lt;element name="MaterialLotID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="MaterialSubLotID" type="{http://www.openapplications.org/oagis/10}IDType" minOccurs="0"/>
 *         &lt;element name="MaterialUseCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.openapplications.org/oagis/10}DescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.openapplications.org/oagis/10}LocationType" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://www.openapplications.org/oagis/10}NoteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequiredByRequestedSegmentResponseCode" type="{http://www.openapplications.org/oagis/10}CodeType" minOccurs="0"/>
 *         &lt;element name="InventoryActual" type="{http://www.openapplications.org/oagis/10}InventoryActualType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManufacturingMaterialBaseType", propOrder = {
    "classification",
    "materialLotID",
    "materialSubLotID",
    "materialUseCode",
    "description",
    "location",
    "note",
    "requiredByRequestedSegmentResponseCode",
    "inventoryActual"
})
@XmlSeeAlso({
    ManufacturingMaterialType.class
})
public class ManufacturingMaterialBaseType
    extends IdentificationType
{

    @XmlElement(name = "Classification")
    protected ClassificationType classification;
    @XmlElement(name = "MaterialLotID")
    protected IDType materialLotID;
    @XmlElement(name = "MaterialSubLotID")
    protected IDType materialSubLotID;
    @XmlElement(name = "MaterialUseCode")
    protected CodeType materialUseCode;
    @XmlElement(name = "Description")
    protected List<DescriptionType> description;
    @XmlElement(name = "Location")
    protected LocationType location;
    @XmlElement(name = "Note")
    protected List<NoteType> note;
    @XmlElement(name = "RequiredByRequestedSegmentResponseCode")
    protected CodeType requiredByRequestedSegmentResponseCode;
    @XmlElement(name = "InventoryActual")
    protected InventoryActualType inventoryActual;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType }
     *     
     */
    public ClassificationType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType }
     *     
     */
    public void setClassification(ClassificationType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the materialLotID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMaterialLotID() {
        return materialLotID;
    }

    /**
     * Sets the value of the materialLotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMaterialLotID(IDType value) {
        this.materialLotID = value;
    }

    /**
     * Gets the value of the materialSubLotID property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getMaterialSubLotID() {
        return materialSubLotID;
    }

    /**
     * Sets the value of the materialSubLotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setMaterialSubLotID(IDType value) {
        this.materialSubLotID = value;
    }

    /**
     * Gets the value of the materialUseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getMaterialUseCode() {
        return materialUseCode;
    }

    /**
     * Sets the value of the materialUseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setMaterialUseCode(CodeType value) {
        this.materialUseCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getNote() {
        if (note == null) {
            note = new ArrayList<NoteType>();
        }
        return this.note;
    }

    /**
     * Gets the value of the requiredByRequestedSegmentResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getRequiredByRequestedSegmentResponseCode() {
        return requiredByRequestedSegmentResponseCode;
    }

    /**
     * Sets the value of the requiredByRequestedSegmentResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setRequiredByRequestedSegmentResponseCode(CodeType value) {
        this.requiredByRequestedSegmentResponseCode = value;
    }

    /**
     * Gets the value of the inventoryActual property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryActualType }
     *     
     */
    public InventoryActualType getInventoryActual() {
        return inventoryActual;
    }

    /**
     * Sets the value of the inventoryActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryActualType }
     *     
     */
    public void setInventoryActual(InventoryActualType value) {
        this.inventoryActual = value;
    }

}
