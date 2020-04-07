package com.bharath.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2020-03-28T09:14:36.752-07:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://soap.ws.bharath.com/", name = "PaymentProcessor")
@XmlSeeAlso({ObjectFactory.class})
public interface PaymentProcessor {

    @WebMethod
    @RequestWrapper(localName = "processPayment", targetNamespace = "http://soap.ws.bharath.com/", className = "com.bharath.ws.soap.ProcessPayment")
    @ResponseWrapper(localName = "processPaymentResponse", targetNamespace = "http://soap.ws.bharath.com/", className = "com.bharath.ws.soap.ProcessPaymentResponse")
    @WebResult(name = "response", targetNamespace = "")
    public com.bharath.ws.soap.PaymentProcessorResponse processPayment(
        @WebParam(name = "paymentProcessorRequest", targetNamespace = "")
        com.bharath.ws.soap.PaymentProcessorRequest paymentProcessorRequest
    );
}
