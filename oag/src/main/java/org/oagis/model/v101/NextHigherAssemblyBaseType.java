//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:58:52 PM CST 
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
 * STEP "next_higher_assembly" entity.  AP214-FDIS Definition: A next_higher_assembly is a relationship where the attribute 'related' specifies a constituent of an assembly and the attribute 'relating' specifies the immediate parent assembly of the constituent.
 * 
 * <p>Java class for NextHigherAssemblyBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NextHigherAssemblyBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.openapplications.org/oagis/10}IdentificationType">
 *       &lt;sequence>
 *         &lt;element name="ParentAssemblyItemDesignReference" type="{http://www.openapplications.org/oagis/10}ItemDesignReferenceType" minOccurs="0"/>
 *         &lt;element name="ChildAssemblyItemDesignReference" type="{http://www.openapplications.org/oagis/10}ItemDesignReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PlacementText" type="{http://www.openapplications.org/oagis/10}TextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NextHigherAssemblyBaseType", propOrder = {
    "parentAssemblyItemDesignReference",
    "childAssemblyItemDesignReference",
    "placementText"
})
@XmlSeeAlso({
    NextHigherAssemblyType.class
})
public class NextHigherAssemblyBaseType
    extends IdentificationType
{

    @XmlElement(name = "ParentAssemblyItemDesignReference")
    protected ItemDesignReferenceType parentAssemblyItemDesignReference;
    @XmlElement(name = "ChildAssemblyItemDesignReference")
    protected List<ItemDesignReferenceType> childAssemblyItemDesignReference;
    @XmlElement(name = "PlacementText")
    protected List<TextType> placementText;

    /**
     * Gets the value of the parentAssemblyItemDesignReference property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDesignReferenceType }
     *     
     */
    public ItemDesignReferenceType getParentAssemblyItemDesignReference() {
        return parentAssemblyItemDesignReference;
    }

    /**
     * Sets the value of the parentAssemblyItemDesignReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDesignReferenceType }
     *     
     */
    public void setParentAssemblyItemDesignReference(ItemDesignReferenceType value) {
        this.parentAssemblyItemDesignReference = value;
    }

    /**
     * Gets the value of the childAssemblyItemDesignReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childAssemblyItemDesignReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildAssemblyItemDesignReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDesignReferenceType }
     * 
     * 
     */
    public List<ItemDesignReferenceType> getChildAssemblyItemDesignReference() {
        if (childAssemblyItemDesignReference == null) {
            childAssemblyItemDesignReference = new ArrayList<ItemDesignReferenceType>();
        }
        return this.childAssemblyItemDesignReference;
    }

    /**
     * Gets the value of the placementText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placementText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacementText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getPlacementText() {
        if (placementText == null) {
            placementText = new ArrayList<TextType>();
        }
        return this.placementText;
    }

}
