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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ForecastingBatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastingBatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expired" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="expiryDate" type="{http://www.msh.org/quantb/model/forecast}Month"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantityAvailable" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="quantityExpired" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="consumptionInMonth" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="availFrom" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="exclude" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastingBatch", propOrder = {
    "expired",
    "expiryDate",
    "quantity",
    "comment",
    "quantityAvailable",
    "quantityExpired",
    "consumptionInMonth",
    "availFrom",
    "exclude"
})
public class ForecastingBatch {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expired;
    @XmlElement(required = true)
    protected Month expiryDate;
    protected int quantity;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected BigDecimal quantityAvailable;
    protected int quantityExpired;
    @XmlElement(required = true)
    protected BigDecimal consumptionInMonth;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar availFrom;
    protected boolean exclude;

    /**
     * Gets the value of the expired property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpired() {
        return expired;
    }

    /**
     * Sets the value of the expired property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpired(XMLGregorianCalendar value) {
        this.expired = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link Month }
     *     
     */
    public Month getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Month }
     *     
     */
    public void setExpiryDate(Month value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityAvailable() {
        return quantityAvailable;
    }

    /**
     * Sets the value of the quantityAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityAvailable(BigDecimal value) {
        this.quantityAvailable = value;
    }

    /**
     * Gets the value of the quantityExpired property.
     * 
     */
    public int getQuantityExpired() {
        return quantityExpired;
    }

    /**
     * Sets the value of the quantityExpired property.
     * 
     */
    public void setQuantityExpired(int value) {
        this.quantityExpired = value;
    }

    /**
     * Gets the value of the consumptionInMonth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getConsumptionInMonth() {
        return consumptionInMonth;
    }

    /**
     * Sets the value of the consumptionInMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setConsumptionInMonth(BigDecimal value) {
        this.consumptionInMonth = value;
    }

    /**
     * Gets the value of the availFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailFrom() {
        return availFrom;
    }

    /**
     * Sets the value of the availFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailFrom(XMLGregorianCalendar value) {
        this.availFrom = value;
    }

    /**
     * Gets the value of the exclude property.
     * 
     */
    public boolean isExclude() {
        return exclude;
    }

    /**
     * Sets the value of the exclude property.
     * 
     */
    public void setExclude(boolean value) {
        this.exclude = value;
    }

}
