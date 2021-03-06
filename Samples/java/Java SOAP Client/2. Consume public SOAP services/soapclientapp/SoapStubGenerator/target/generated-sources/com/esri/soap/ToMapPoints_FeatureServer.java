
package com.esri.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &amp;lt;element name="MapDescription" type="{http://www.esri.com/schemas/ArcGIS/10.7}MapDescription"/&amp;gt;
 *         &amp;lt;element name="MapImageDisplay" type="{http://www.esri.com/schemas/ArcGIS/10.7}ImageDisplay"/&amp;gt;
 *         &amp;lt;element name="ScreenXValues" type="{http://www.esri.com/schemas/ArcGIS/10.7}ArrayOfInt"/&amp;gt;
 *         &amp;lt;element name="ScreenYValues" type="{http://www.esri.com/schemas/ArcGIS/10.7}ArrayOfInt"/&amp;gt;
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
    "mapDescription",
    "mapImageDisplay",
    "screenXValues",
    "screenYValues"
})
@XmlRootElement(name = "ToMapPoints")
public class ToMapPoints_FeatureServer {

    @XmlElement(name = "MapDescription", required = true)
    protected MapDescription mapDescription;
    @XmlElement(name = "MapImageDisplay", required = true)
    protected ImageDisplay mapImageDisplay;
    @XmlElement(name = "ScreenXValues", required = true)
    protected ArrayOfInt screenXValues;
    @XmlElement(name = "ScreenYValues", required = true)
    protected ArrayOfInt screenYValues;

    /**
     * Gets the value of the mapDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MapDescription }
     *     
     */
    public MapDescription getMapDescription() {
        return mapDescription;
    }

    /**
     * Sets the value of the mapDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapDescription }
     *     
     */
    public void setMapDescription(MapDescription value) {
        this.mapDescription = value;
    }

    /**
     * Gets the value of the mapImageDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDisplay }
     *     
     */
    public ImageDisplay getMapImageDisplay() {
        return mapImageDisplay;
    }

    /**
     * Sets the value of the mapImageDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDisplay }
     *     
     */
    public void setMapImageDisplay(ImageDisplay value) {
        this.mapImageDisplay = value;
    }

    /**
     * Gets the value of the screenXValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getScreenXValues() {
        return screenXValues;
    }

    /**
     * Sets the value of the screenXValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setScreenXValues(ArrayOfInt value) {
        this.screenXValues = value;
    }

    /**
     * Gets the value of the screenYValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getScreenYValues() {
        return screenYValues;
    }

    /**
     * Sets the value of the screenYValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setScreenYValues(ArrayOfInt value) {
        this.screenYValues = value;
    }

}
