/*******************************************************************************
 *  Copyright (c) 2016 Dr.-Ing. Marc Mültin.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Dr.-Ing. Marc Mültin - initial API and implementation and initial documentation
 *******************************************************************************/
//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.07 um 04:55:05 PM CEST 
//


package org.eclipse.risev2g.shared.v2gMessages.msgDef;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ChargeParameterDiscoveryResType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ChargeParameterDiscoveryResType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:iso:15118:2:2013:MsgBody}BodyBaseType">
 *       &lt;sequence>
 *         &lt;element name="ResponseCode" type="{urn:iso:15118:2:2013:MsgDataTypes}responseCodeType"/>
 *         &lt;element name="EVSEProcessing" type="{urn:iso:15118:2:2013:MsgDataTypes}EVSEProcessingType"/>
 *         &lt;element ref="{urn:iso:15118:2:2013:MsgDataTypes}SASchedules" minOccurs="0"/>
 *         &lt;element ref="{urn:iso:15118:2:2013:MsgDataTypes}EVSEChargeParameter"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeParameterDiscoveryResType", namespace = "urn:iso:15118:2:2013:MsgBody", propOrder = {
    "responseCode",
    "evseProcessing",
    "saSchedules",
    "evseChargeParameter"
})
public class ChargeParameterDiscoveryResType
    extends BodyBaseType
{

    @XmlElement(name = "ResponseCode", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseCodeType responseCode;
    @XmlElement(name = "EVSEProcessing", required = true)
    @XmlSchemaType(name = "string")
    protected EVSEProcessingType evseProcessing;
    @XmlElementRef(name = "SASchedules", namespace = "urn:iso:15118:2:2013:MsgDataTypes", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends SASchedulesType> saSchedules;
    @XmlElementRef(name = "EVSEChargeParameter", namespace = "urn:iso:15118:2:2013:MsgDataTypes", type = JAXBElement.class)
    protected JAXBElement<? extends EVSEChargeParameterType> evseChargeParameter;

    /**
     * Ruft den Wert der responseCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCodeType }
     *     
     */
    public ResponseCodeType getResponseCode() {
        return responseCode;
    }

    /**
     * Legt den Wert der responseCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCodeType }
     *     
     */
    public void setResponseCode(ResponseCodeType value) {
        this.responseCode = value;
    }

    /**
     * Ruft den Wert der evseProcessing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EVSEProcessingType }
     *     
     */
    public EVSEProcessingType getEVSEProcessing() {
        return evseProcessing;
    }

    /**
     * Legt den Wert der evseProcessing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EVSEProcessingType }
     *     
     */
    public void setEVSEProcessing(EVSEProcessingType value) {
        this.evseProcessing = value;
    }

    /**
     * Ruft den Wert der saSchedules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SAScheduleListType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SASchedulesType }{@code >}
     *     
     */
    public JAXBElement<? extends SASchedulesType> getSASchedules() {
        return saSchedules;
    }

    /**
     * Legt den Wert der saSchedules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SAScheduleListType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SASchedulesType }{@code >}
     *     
     */
    public void setSASchedules(JAXBElement<? extends SASchedulesType> value) {
        this.saSchedules = value;
    }

    /**
     * Ruft den Wert der evseChargeParameter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DCEVSEChargeParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EVSEChargeParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ACEVSEChargeParameterType }{@code >}
     *     
     */
    public JAXBElement<? extends EVSEChargeParameterType> getEVSEChargeParameter() {
        return evseChargeParameter;
    }

    /**
     * Legt den Wert der evseChargeParameter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DCEVSEChargeParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EVSEChargeParameterType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ACEVSEChargeParameterType }{@code >}
     *     
     */
    public void setEVSEChargeParameter(JAXBElement<? extends EVSEChargeParameterType> value) {
        this.evseChargeParameter = value;
    }

}
