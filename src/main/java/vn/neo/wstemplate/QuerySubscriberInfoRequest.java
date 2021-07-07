package vn.neo.wstemplate;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sessionID",
        "transactionID",
        "accountID",
        "queryBundle",
        "queryFF",
        "querySubscriberInfo"
})
@XmlRootElement(name = "QuerySubscriberInfoRequest")
public class QuerySubscriberInfoRequest {

    @XmlElement(name = "SessionID", required = true)
    protected String sessionID;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "AccountID", required = true)
    protected String accountID;
    @XmlElement(name = "QueryBundle", required = true)
    protected String queryBundle;
    @XmlElement(name = "QueryFF", required = true)
    protected String queryFF;
    @XmlElement(name = "QuerySubscriberInfo", required = true)
    protected String querySubscriberInfo;

    /**
     * Gets the value of the sessionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the transactionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the accountID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountID(String value) {
        this.accountID = value;
    }

    /**
     * Gets the value of the queryBundle property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQueryBundle() {
        return queryBundle;
    }

    /**
     * Sets the value of the queryBundle property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQueryBundle(String value) {
        this.queryBundle = value;
    }

    /**
     * Gets the value of the queryFF property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQueryFF() {
        return queryFF;
    }

    /**
     * Sets the value of the queryFF property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQueryFF(String value) {
        this.queryFF = value;
    }

    /**
     * Gets the value of the querySubscriberInfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuerySubscriberInfo() {
        return querySubscriberInfo;
    }

    /**
     * Sets the value of the querySubscriberInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuerySubscriberInfo(String value) {
        this.querySubscriberInfo = value;
    }

}

