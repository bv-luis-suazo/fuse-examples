
package cl.bicevida.apv.model.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InProducto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InProducto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rut" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InProducto", propOrder = {
    "rut"
})
public class InProducto {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long rut;

    /**
     * Gets the value of the rut property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRut() {
        return rut;
    }

    /**
     * Sets the value of the rut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRut(Long value) {
        this.rut = value;
    }

}
