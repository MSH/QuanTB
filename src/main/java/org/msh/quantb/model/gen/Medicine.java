//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.23 at 04:53:00 PM EEST 
//


package org.msh.quantb.model.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Medicine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Medicine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abbrevName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="strength" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="form" type="{http://www.msh.org/quantb/model/gen}MedicineFormEnum" minOccurs="0"/>
 *         &lt;element name="dosage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.msh.org/quantb/model/gen}MedicineTypesEnum"/>
 *         &lt;element name="classifier" type="{http://www.msh.org/quantb/model/gen}ClassifierTypesEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medicine", propOrder = {
    "name",
    "abbrevName",
    "strength",
    "form",
    "dosage",
    "type",
    "classifier"
})
public class Medicine {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String abbrevName;
    @XmlElement(required = true)
    protected String strength;
    protected MedicineFormEnum form;
    @XmlElement(required = true)
    protected String dosage;
    @XmlElement(required = true)
    protected MedicineTypesEnum type;
    @XmlElement(required = true)
    protected ClassifierTypesEnum classifier;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the abbrevName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbrevName() {
        return abbrevName;
    }

    /**
     * Sets the value of the abbrevName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbrevName(String value) {
        this.abbrevName = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrength(String value) {
        this.strength = value;
    }

    /**
     * Gets the value of the form property.
     * 
     * @return
     *     possible object is
     *     {@link MedicineFormEnum }
     *     
     */
    public MedicineFormEnum getForm() {
        return form;
    }

    /**
     * Sets the value of the form property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicineFormEnum }
     *     
     */
    public void setForm(MedicineFormEnum value) {
        this.form = value;
    }

    /**
     * Gets the value of the dosage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * Sets the value of the dosage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosage(String value) {
        this.dosage = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MedicineTypesEnum }
     *     
     */
    public MedicineTypesEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicineTypesEnum }
     *     
     */
    public void setType(MedicineTypesEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the classifier property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifierTypesEnum }
     *     
     */
    public ClassifierTypesEnum getClassifier() {
        return classifier;
    }

    /**
     * Sets the value of the classifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifierTypesEnum }
     *     
     */
    public void setClassifier(ClassifierTypesEnum value) {
        this.classifier = value;
    }

}