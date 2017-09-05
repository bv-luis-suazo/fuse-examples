
package cl.bicevida.apv.model.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Producto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Producto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estadoPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FIniVig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NPoliza" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ramSubRamo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="desclProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoSeguro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dvAsegurado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rutAsegurado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nlProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="desccProd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FTerVig" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Producto", propOrder = {
    "estadoPoliza",
    "fIniVig",
    "nPoliza",
    "clave",
    "ramSubRamo",
    "desclProd",
    "tipoSeguro",
    "dvAsegurado",
    "rutAsegurado",
    "nlProd",
    "desccProd",
    "fTerVig"
})
public class Producto {

    @XmlElement(required = true, nillable = true)
    protected String estadoPoliza;
    @XmlElement(name = "FIniVig", required = true, nillable = true)
    protected String fIniVig;
    @XmlElement(name = "NPoliza", required = true, type = Long.class, nillable = true)
    protected Long nPoliza;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long clave;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long ramSubRamo;
    @XmlElement(required = true, nillable = true)
    protected String desclProd;
    @XmlElement(required = true, nillable = true)
    protected String tipoSeguro;
    @XmlElement(required = true, nillable = true)
    protected String dvAsegurado;
    @XmlElement(required = true, nillable = true)
    protected String rutAsegurado;
    @XmlElement(required = true, nillable = true)
    protected String nlProd;
    @XmlElement(required = true, nillable = true)
    protected String desccProd;
    @XmlElement(name = "FTerVig", required = true, nillable = true)
    protected String fTerVig;

    /**
     * Gets the value of the estadoPoliza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoPoliza() {
        return estadoPoliza;
    }

    /**
     * Sets the value of the estadoPoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoPoliza(String value) {
        this.estadoPoliza = value;
    }

    /**
     * Gets the value of the fIniVig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIniVig() {
        return fIniVig;
    }

    /**
     * Sets the value of the fIniVig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIniVig(String value) {
        this.fIniVig = value;
    }

    /**
     * Gets the value of the nPoliza property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNPoliza() {
        return nPoliza;
    }

    /**
     * Sets the value of the nPoliza property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNPoliza(Long value) {
        this.nPoliza = value;
    }

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClave(Long value) {
        this.clave = value;
    }

    /**
     * Gets the value of the ramSubRamo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRamSubRamo() {
        return ramSubRamo;
    }

    /**
     * Sets the value of the ramSubRamo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRamSubRamo(Long value) {
        this.ramSubRamo = value;
    }

    /**
     * Gets the value of the desclProd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesclProd() {
        return desclProd;
    }

    /**
     * Sets the value of the desclProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesclProd(String value) {
        this.desclProd = value;
    }

    /**
     * Gets the value of the tipoSeguro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoSeguro() {
        return tipoSeguro;
    }

    /**
     * Sets the value of the tipoSeguro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoSeguro(String value) {
        this.tipoSeguro = value;
    }

    /**
     * Gets the value of the dvAsegurado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvAsegurado() {
        return dvAsegurado;
    }

    /**
     * Sets the value of the dvAsegurado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvAsegurado(String value) {
        this.dvAsegurado = value;
    }

    /**
     * Gets the value of the rutAsegurado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutAsegurado() {
        return rutAsegurado;
    }

    /**
     * Sets the value of the rutAsegurado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutAsegurado(String value) {
        this.rutAsegurado = value;
    }

    /**
     * Gets the value of the nlProd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlProd() {
        return nlProd;
    }

    /**
     * Sets the value of the nlProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlProd(String value) {
        this.nlProd = value;
    }

    /**
     * Gets the value of the desccProd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesccProd() {
        return desccProd;
    }

    /**
     * Sets the value of the desccProd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesccProd(String value) {
        this.desccProd = value;
    }

    /**
     * Gets the value of the fTerVig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTerVig() {
        return fTerVig;
    }

    /**
     * Sets the value of the fTerVig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTerVig(String value) {
        this.fTerVig = value;
    }

}
