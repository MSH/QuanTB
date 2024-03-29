//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.23 at 04:53:00 PM EEST 
//


package org.msh.quantb.model.forecast;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is a regimen result for one phase
 * 
 * <p>Java class for PhaseResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhaseResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newCases" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="oldCases" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhaseResult", propOrder = {
    "newCases",
    "oldCases"
})
public class PhaseResult {

    @XmlElement(required = true)
    protected BigDecimal newCases;
    @XmlElement(required = true)
    protected BigDecimal oldCases;

    /**
     * Gets the value of the newCases property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewCases() {
        return newCases;
    }

    /**
     * Sets the value of the newCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewCases(BigDecimal value) {
        this.newCases = value;
    }

    /**
     * Gets the value of the oldCases property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOldCases() {
        return oldCases;
    }

    /**
     * Sets the value of the oldCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOldCases(BigDecimal value) {
        this.oldCases = value;
    }

}
