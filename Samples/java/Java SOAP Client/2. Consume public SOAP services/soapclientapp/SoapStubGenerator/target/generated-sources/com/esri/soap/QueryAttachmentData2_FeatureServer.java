
package com.esri.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="MapName" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="MapTableDescription" type="{http://www.esri.com/schemas/ArcGIS/10.7}MapTableDescription"/&amp;gt;
 *         &amp;lt;element name="AttachmentIDs" type="{http://www.esri.com/schemas/ArcGIS/10.7}ArrayOfInt"/&amp;gt;
 *         &amp;lt;element name="TransportType" type="{http://www.esri.com/schemas/ArcGIS/10.7}esriTransportType"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mapName",
    "mapTableDescription",
    "attachmentIDs",
    "transportType"
})
@XmlRootElement(name = "QueryAttachmentData2")
public class QueryAttachmentData2_FeatureServer {

    @XmlElement(name = "MapName", required = true)
    protected String mapName;
    @XmlElement(name = "MapTableDescription", required = true)
    protected MapTableDescription mapTableDescription;
    @XmlElement(name = "AttachmentIDs", required = true)
    protected ArrayOfInt attachmentIDs;
    @XmlElement(name = "TransportType", required = true)
    @XmlSchemaType(name = "string")
    protected EsriTransportType transportType;

    /**
     * Gets the value of the mapName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapName() {
        return mapName;
    }

    /**
     * Sets the value of the mapName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapName(String value) {
        this.mapName = value;
    }

    /**
     * Gets the value of the mapTableDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MapTableDescription }
     *     
     */
    public MapTableDescription getMapTableDescription() {
        return mapTableDescription;
    }

    /**
     * Sets the value of the mapTableDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapTableDescription }
     *     
     */
    public void setMapTableDescription(MapTableDescription value) {
        this.mapTableDescription = value;
    }

    /**
     * Gets the value of the attachmentIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAttachmentIDs() {
        return attachmentIDs;
    }

    /**
     * Sets the value of the attachmentIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAttachmentIDs(ArrayOfInt value) {
        this.attachmentIDs = value;
    }

    /**
     * Gets the value of the transportType property.
     * 
     * @return
     *     possible object is
     *     {@link EsriTransportType }
     *     
     */
    public EsriTransportType getTransportType() {
        return transportType;
    }

    /**
     * Sets the value of the transportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsriTransportType }
     *     
     */
    public void setTransportType(EsriTransportType value) {
        this.transportType = value;
    }

}
