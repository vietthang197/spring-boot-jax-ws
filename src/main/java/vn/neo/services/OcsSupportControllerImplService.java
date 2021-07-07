package vn.neo.services;

import org.springframework.stereotype.Component;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import javax.xml.ws.Service;
import java.net.URL;

@Component(value = "OcsSupportControllerImplService")
@WebService
public class OcsSupportControllerImplService{

    @WebMethod(operationName = "Login")
    @RequestWrapper(localName = "LoginRequest", targetNamespace = "vnpt-technology.vn", className = "vn.neo.wstemplate.LoginRequest")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "vnpt-technology.vn", className = "vn.neo.request.LoginResponse")
    public void login(
            @WebParam(name = "Username", targetNamespace = "")
                    String username,
            @WebParam(name = "Password", targetNamespace = "")
                    String password,
            @WebParam(name = "SessionID", targetNamespace = "", mode = WebParam.Mode.OUT)
                    Holder<String> sessionID,
            @WebParam(name = "TransactionID", targetNamespace = "", mode = WebParam.Mode.OUT)
                    Holder<String> transactionID,
            @WebParam(name = "ResponseStatus", targetNamespace = "", mode = WebParam.Mode.OUT)
                    Holder<String> responseStatus,
            @WebParam(name = "Description", targetNamespace = "", mode = WebParam.Mode.OUT)
                    Holder<String> description
    ) {
        sessionID.value = "1235466";
        transactionID.value = "6653535";
        responseStatus.value = "343434";
        description.value = "23424234";
    }

    @WebMethod(operationName = "QuerySubscriberInfo")
    @RequestWrapper(localName = "QuerySubscriberInfoRequest", targetNamespace = "vnpt-technology.vn", className = "vn.neo.wstemplate.QuerySubscriberInfoRequest")
    @ResponseWrapper(localName = "QuerySubscriberInfoResponse", targetNamespace = "vnpt-technology.vn", className = "vn.neo.request.QuerySubscriberInfoResponse")
    public void querySubscriberInfo(
            @WebParam(name = "SessionID", targetNamespace = "", mode = WebParam.Mode.INOUT)
                    Holder<String> sessionID,
            @WebParam(name = "TransactionID", targetNamespace = "", mode = WebParam.Mode.INOUT)
                    Holder<String> transactionID,
            @WebParam(name = "AccountID", targetNamespace = "", mode = WebParam.Mode.INOUT)
                    Holder<String> accountID,
            @WebParam(name = "QueryBundle", targetNamespace = "", mode = WebParam.Mode.IN)
                    Holder<String> queryBundle,
            @WebParam(name = "QueryFF", targetNamespace = "", mode = WebParam.Mode.IN)
                    Holder<String> queryFF,
            @WebParam(name = "QuerySubscriberInfo", targetNamespace = "", mode = WebParam.Mode.IN)
                    Holder<String> querySubscriberInfo,
            @WebParam(name = "ResponseStatus", targetNamespace = "", mode = WebParam.Mode.OUT)
                    Holder<String> responseStatus,
            @WebParam(name = "Description", targetNamespace = "", mode = WebParam.Mode.OUT)
                    Holder<String> description
    ) {
        sessionID.value = "1235466";
        transactionID.value = "6653535";
        responseStatus.value = "343434";
        description.value = "23424234";
    }

    protected void alterSoapEnvelope(SaajSoapMessage soapResponse) {
        try {
            SOAPMessage soapMessage = soapResponse.getSaajMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();
            SOAPEnvelope envelope = soapPart.getEnvelope();
            SOAPHeader header = soapMessage.getSOAPHeader();
            SOAPBody body = soapMessage.getSOAPBody();
            SOAPFault fault = body.getFault();
            envelope.removeNamespaceDeclaration(envelope.getPrefix());
            envelope.setPrefix("soap");
            header.setPrefix("soap");
            body.setPrefix("soap");

            if (fault != null) {
                fault.setPrefix("soap");
            }
        } catch (SOAPException e) {
            e.printStackTrace();
        }
    }
}
