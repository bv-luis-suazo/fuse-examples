
package cl.bicevida.apv.model.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cl.bicevida.apv.model.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProductosAPV_QNAME = new QName("http://services.model.apv.bicevida.cl/", "getProductosAPV");
    private final static QName _GetProductosAPVResponse_QNAME = new QName("http://services.model.apv.bicevida.cl/", "getProductosAPVResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cl.bicevida.apv.model.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductosAPV }
     * 
     */
    public GetProductosAPV createGetProductosAPV() {
        return new GetProductosAPV();
    }

    /**
     * Create an instance of {@link GetProductosAPVResponse }
     * 
     */
    public GetProductosAPVResponse createGetProductosAPVResponse() {
        return new GetProductosAPVResponse();
    }

    /**
     * Create an instance of {@link InProducto }
     * 
     */
    public InProducto createInProducto() {
        return new InProducto();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link ListOfProducto }
     * 
     */
    public ListOfProducto createListOfProducto() {
        return new ListOfProducto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductosAPV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.apv.bicevida.cl/", name = "getProductosAPV")
    public JAXBElement<GetProductosAPV> createGetProductosAPV(GetProductosAPV value) {
        return new JAXBElement<GetProductosAPV>(_GetProductosAPV_QNAME, GetProductosAPV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductosAPVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.model.apv.bicevida.cl/", name = "getProductosAPVResponse")
    public JAXBElement<GetProductosAPVResponse> createGetProductosAPVResponse(GetProductosAPVResponse value) {
        return new JAXBElement<GetProductosAPVResponse>(_GetProductosAPVResponse_QNAME, GetProductosAPVResponse.class, null, value);
    }

}
