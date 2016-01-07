//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.18 at 05:23:45 PM JST 
//


package net.tiger.star.nsen.jaxb;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}stream"/>
 *         &lt;element ref="{}user"/>
 *         &lt;element ref="{}rtmp"/>
 *         &lt;element ref="{}ms"/>
 *         &lt;element ref="{}tid_list"/>
 *         &lt;element ref="{}twitter"/>
 *         &lt;element ref="{}player"/>
 *         &lt;element ref="{}ns"/>
 *         &lt;element ref="{}marquee"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stream",
    "user",
    "rtmp",
    "ms",
    "tidList",
    "twitter",
    "player",
    "ns",
    "marquee"
})
@XmlRootElement(name = "getplayerstatus")
public class Getplayerstatus {

    @XmlElement(required = true)
    protected Stream stream;
    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected Rtmp rtmp;
    @XmlElement(required = true)
    protected Ms ms;
    @XmlElement(name = "tid_list", required = true)
    protected TidList tidList;
    @XmlElement(required = true)
    protected Twitter twitter;
    @XmlElement(required = true)
    protected Player player;
    @XmlElement(required = true)
    protected Ns ns;
    @XmlElement(required = true)
    protected Marquee marquee;
    @XmlAttribute(name = "status", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String status;
    @XmlAttribute(name = "time", required = true)
    protected BigInteger time;

    /**
     * Gets the value of the stream property.
     * 
     * @return
     *     possible object is
     *     {@link Stream }
     *     
     */
    public Stream getStream() {
        return stream;
    }

    /**
     * Sets the value of the stream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stream }
     *     
     */
    public void setStream(Stream value) {
        this.stream = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the rtmp property.
     * 
     * @return
     *     possible object is
     *     {@link Rtmp }
     *     
     */
    public Rtmp getRtmp() {
        return rtmp;
    }

    /**
     * Sets the value of the rtmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rtmp }
     *     
     */
    public void setRtmp(Rtmp value) {
        this.rtmp = value;
    }

    /**
     * Gets the value of the ms property.
     * 
     * @return
     *     possible object is
     *     {@link Ms }
     *     
     */
    public Ms getMs() {
        return ms;
    }

    /**
     * Sets the value of the ms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ms }
     *     
     */
    public void setMs(Ms value) {
        this.ms = value;
    }

    /**
     * Gets the value of the tidList property.
     * 
     * @return
     *     possible object is
     *     {@link TidList }
     *     
     */
    public TidList getTidList() {
        return tidList;
    }

    /**
     * Sets the value of the tidList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidList }
     *     
     */
    public void setTidList(TidList value) {
        this.tidList = value;
    }

    /**
     * Gets the value of the twitter property.
     * 
     * @return
     *     possible object is
     *     {@link Twitter }
     *     
     */
    public Twitter getTwitter() {
        return twitter;
    }

    /**
     * Sets the value of the twitter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Twitter }
     *     
     */
    public void setTwitter(Twitter value) {
        this.twitter = value;
    }

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    public void setPlayer(Player value) {
        this.player = value;
    }

    /**
     * Gets the value of the ns property.
     * 
     * @return
     *     possible object is
     *     {@link Ns }
     *     
     */
    public Ns getNs() {
        return ns;
    }

    /**
     * Sets the value of the ns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ns }
     *     
     */
    public void setNs(Ns value) {
        this.ns = value;
    }

    /**
     * Gets the value of the marquee property.
     * 
     * @return
     *     possible object is
     *     {@link Marquee }
     *     
     */
    public Marquee getMarquee() {
        return marquee;
    }

    /**
     * Sets the value of the marquee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Marquee }
     *     
     */
    public void setMarquee(Marquee value) {
        this.marquee = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTime(BigInteger value) {
        this.time = value;
    }

}
