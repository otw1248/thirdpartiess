//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 04:58:29 PM CST 
//


package org.oagis.model.v101;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oacl_CreditTransferCodeEnumerationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="oacl_CreditTransferCodeEnumerationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="CORT"/>
 *     &lt;enumeration value="DIVI"/>
 *     &lt;enumeration value="GOVT"/>
 *     &lt;enumeration value="HEDG"/>
 *     &lt;enumeration value="INTC"/>
 *     &lt;enumeration value="INTE"/>
 *     &lt;enumeration value="LOAN"/>
 *     &lt;enumeration value="PENS"/>
 *     &lt;enumeration value="SALA"/>
 *     &lt;enumeration value="SECU"/>
 *     &lt;enumeration value="SSBE"/>
 *     &lt;enumeration value="SUPP"/>
 *     &lt;enumeration value="TAXS"/>
 *     &lt;enumeration value="TRAD"/>
 *     &lt;enumeration value="TREA"/>
 *     &lt;enumeration value="VATX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "oacl_CreditTransferCodeEnumerationType")
@XmlEnum
public enum OaclCreditTransferCodeEnumerationType {


    /**
     * Cash management transfer.
     * 
     */
    CASH,

    /**
     * Payment made in settlement of a trade
     * 
     */
    CORT,

    /**
     * Dividend.
     * 
     */
    DIVI,

    /**
     * Government payment.
     * 
     */
    GOVT,

    /**
     * Hedging
     * 
     */
    HEDG,

    /**
     * Intra-company payment
     * 
     */
    INTC,

    /**
     * Interest
     * 
     */
    INTE,

    /**
     * Loan. Transfer of loan to borrower.
     * 
     */
    LOAN,

    /**
     * Pension payment
     * 
     */
    PENS,

    /**
     * Salary payment
     * 
     */
    SALA,

    /**
     * Securities.
     * 
     */
    SECU,

    /**
     * Social security benefit. Payment made by government to support individuals.
     * 
     */
    SSBE,

    /**
     * Supplier payment
     * 
     */
    SUPP,

    /**
     * Tax payment
     * 
     */
    TAXS,

    /**
     * Trade.
     * 
     */
    TRAD,

    /**
     * Treasury payment
     * 
     */
    TREA,

    /**
     * Value added Tax payment
     * 
     */
    VATX;

    public String value() {
        return name();
    }

    public static OaclCreditTransferCodeEnumerationType fromValue(String v) {
        return valueOf(v);
    }

}