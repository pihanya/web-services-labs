
package ru.gostev.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonService", targetNamespace = "http://impl.service.jaxws.gostev.ru/", wsdlLocation = "http://localhost:8080/jaxws/PersonService?wsdl")
public class PersonService_Service
    extends Service
{

    private final static URL PERSONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONSERVICE_EXCEPTION;
    private final static QName PERSONSERVICE_QNAME = new QName("http://impl.service.jaxws.gostev.ru/", "PersonService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/jaxws/PersonService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONSERVICE_WSDL_LOCATION = url;
        PERSONSERVICE_EXCEPTION = e;
    }

    public PersonService_Service() {
        super(__getWsdlLocation(), PERSONSERVICE_QNAME);
    }

    public PersonService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONSERVICE_QNAME, features);
    }

    public PersonService_Service(URL wsdlLocation) {
        super(wsdlLocation, PERSONSERVICE_QNAME);
    }

    public PersonService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONSERVICE_QNAME, features);
    }

    public PersonService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServicePort")
    public PersonService getPersonServicePort() {
        return super.getPort(new QName("http://impl.service.jaxws.gostev.ru/", "PersonServicePort"), PersonService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonService
     */
    @WebEndpoint(name = "PersonServicePort")
    public PersonService getPersonServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.jaxws.gostev.ru/", "PersonServicePort"), PersonService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONSERVICE_EXCEPTION!= null) {
            throw PERSONSERVICE_EXCEPTION;
        }
        return PERSONSERVICE_WSDL_LOCATION;
    }

}