
package cl.bicevida.apv.model.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getProductosAPV complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getProductosAPV"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InProducto_1" type="{http://services.model.apv.bicevida.cl/}InProducto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductosAPV", propOrder = {
    "inProducto1"
})
public class GetProductosAPV {

    @XmlElement(name = "InProducto_1", required = true, nillable = true)
    protected InProducto inProducto1;

    /**
     * Gets the value of the inProducto1 property.
     * 
     * @return
     *     possible object is
     *     {@link InProducto }
     *     
     */
    public InProducto getInProducto1() {
        return inProducto1;
    }

    /**
     * Sets the value of the inProducto1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InProducto }
     *     
     */
    public void setInProducto1(InProducto value) {
        this.inProducto1 = value;
    }

}
