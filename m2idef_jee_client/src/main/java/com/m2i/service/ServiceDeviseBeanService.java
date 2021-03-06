
package com.m2i.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceDeviseBeanService", targetNamespace = "http://service.m2i.com/", wsdlLocation = "http://localhost:8080/m2idef_jee_ejb_impl/ServiceDeviseBean?WSDL")
public class ServiceDeviseBeanService
    extends Service
{

    private final static URL SERVICEDEVISEBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEDEVISEBEANSERVICE_EXCEPTION;
    private final static QName SERVICEDEVISEBEANSERVICE_QNAME = new QName("http://service.m2i.com/", "ServiceDeviseBeanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/m2idef_jee_ejb_impl/ServiceDeviseBean?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEDEVISEBEANSERVICE_WSDL_LOCATION = url;
        SERVICEDEVISEBEANSERVICE_EXCEPTION = e;
    }

    public ServiceDeviseBeanService() {
        super(__getWsdlLocation(), SERVICEDEVISEBEANSERVICE_QNAME);
    }

    public ServiceDeviseBeanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEDEVISEBEANSERVICE_QNAME, features);
    }

    public ServiceDeviseBeanService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEDEVISEBEANSERVICE_QNAME);
    }

    public ServiceDeviseBeanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEDEVISEBEANSERVICE_QNAME, features);
    }

    public ServiceDeviseBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceDeviseBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IServiceDevise
     */
    @WebEndpoint(name = "ServiceDeviseBeanPort")
    public IServiceDevise getServiceDeviseBeanPort() {
        return super.getPort(new QName("http://service.m2i.com/", "ServiceDeviseBeanPort"), IServiceDevise.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServiceDevise
     */
    @WebEndpoint(name = "ServiceDeviseBeanPort")
    public IServiceDevise getServiceDeviseBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.m2i.com/", "ServiceDeviseBeanPort"), IServiceDevise.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEDEVISEBEANSERVICE_EXCEPTION!= null) {
            throw SERVICEDEVISEBEANSERVICE_EXCEPTION;
        }
        return SERVICEDEVISEBEANSERVICE_WSDL_LOCATION;
    }

}
