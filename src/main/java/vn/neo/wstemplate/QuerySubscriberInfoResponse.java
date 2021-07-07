package vn.neo.wstemplate;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "sessionID",
        "transactionID",
        "responseStatus",
        "description",
        "accountId",
        "subscriberInfo",
        "imsi",
        "profile",
        "simState",
        "homeZone1",
        "homeZone2",
        "homeZone3",
        "homeZone4",
        "homeZone5",
        "psHomeZone1",
        "psHomeZone2",
        "psHomeZone3",
        "language",
        "simPin",
        "mainBalance",
        "loanAmount",
        "suspendRecharge",
        "allowBalanceTransfer",
        "postcallNotification",
        "validDate",
        "inactiveDate",
        "deactiveDate",
        "activeDate",
        "prepaid",
        "bundleList",
        "ffGroupList"
})
@XmlRootElement(name = "QuerySubscriberInfoResponse")
public class QuerySubscriberInfoResponse {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "TransactionID", required = true)
    protected String transactionID;
    @XmlElement(name = "ResponseStatus")
    protected String responseStatus;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "SubscriberInfo")
    protected String subscriberInfo;
    @XmlElement(name = "IMSI")
    protected String imsi;
    @XmlElement(name = "Profile")
    protected String profile;
    @XmlElement(name = "SimState")
    protected String simState;
    @XmlElement(name = "HomeZone1")
    protected String homeZone1;
    @XmlElement(name = "HomeZone2")
    protected String homeZone2;
    @XmlElement(name = "HomeZone3")
    protected String homeZone3;
    @XmlElement(name = "HomeZone4")
    protected String homeZone4;
    @XmlElement(name = "HomeZone5")
    protected String homeZone5;
    @XmlElement(name = "PSHomeZone1")
    protected String psHomeZone1;
    @XmlElement(name = "PSHomeZone2")
    protected String psHomeZone2;
    @XmlElement(name = "PSHomeZone3")
    protected String psHomeZone3;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "SimPin")
    protected String simPin;
    @XmlElement(name = "MainBalance")
    protected String mainBalance;
    @XmlElement(name = "LoanAmount")
    protected String loanAmount;
    @XmlElement(name = "SuspendRecharge")
    protected String suspendRecharge;
    @XmlElement(name = "AllowBalanceTransfer")
    protected String allowBalanceTransfer;
    @XmlElement(name = "PostcallNotification")
    protected String postcallNotification;
    @XmlElement(name = "ValidDate")
    protected String validDate;
    @XmlElement(name = "InactiveDate")
    protected String inactiveDate;
    @XmlElement(name = "DeactiveDate")
    protected String deactiveDate;
    @XmlElement(name = "ActiveDate")
    protected String activeDate;
    @XmlElement(name = "Prepaid")
    protected String prepaid;
    @XmlElement(name = "BundleList")
    protected QuerySubscriberInfoResponse.BundleList bundleList;
    @XmlElement(name = "FFGroupList")
    protected QuerySubscriberInfoResponse.FFGroupList ffGroupList;

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
     * Gets the value of the responseStatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResponseStatus(String value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the accountId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the subscriberInfo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubscriberInfo() {
        return subscriberInfo;
    }

    /**
     * Sets the value of the subscriberInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubscriberInfo(String value) {
        this.subscriberInfo = value;
    }

    /**
     * Gets the value of the imsi property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the profile property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * Gets the value of the simState property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSimState() {
        return simState;
    }

    /**
     * Sets the value of the simState property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSimState(String value) {
        this.simState = value;
    }

    /**
     * Gets the value of the homeZone1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHomeZone1() {
        return homeZone1;
    }

    /**
     * Sets the value of the homeZone1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHomeZone1(String value) {
        this.homeZone1 = value;
    }

    /**
     * Gets the value of the homeZone2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHomeZone2() {
        return homeZone2;
    }

    /**
     * Sets the value of the homeZone2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHomeZone2(String value) {
        this.homeZone2 = value;
    }

    /**
     * Gets the value of the homeZone3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHomeZone3() {
        return homeZone3;
    }

    /**
     * Sets the value of the homeZone3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHomeZone3(String value) {
        this.homeZone3 = value;
    }

    /**
     * Gets the value of the homeZone4 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHomeZone4() {
        return homeZone4;
    }

    /**
     * Sets the value of the homeZone4 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHomeZone4(String value) {
        this.homeZone4 = value;
    }

    /**
     * Gets the value of the homeZone5 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHomeZone5() {
        return homeZone5;
    }

    /**
     * Sets the value of the homeZone5 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHomeZone5(String value) {
        this.homeZone5 = value;
    }

    /**
     * Gets the value of the psHomeZone1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPSHomeZone1() {
        return psHomeZone1;
    }

    /**
     * Sets the value of the psHomeZone1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPSHomeZone1(String value) {
        this.psHomeZone1 = value;
    }

    /**
     * Gets the value of the psHomeZone2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPSHomeZone2() {
        return psHomeZone2;
    }

    /**
     * Sets the value of the psHomeZone2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPSHomeZone2(String value) {
        this.psHomeZone2 = value;
    }

    /**
     * Gets the value of the psHomeZone3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPSHomeZone3() {
        return psHomeZone3;
    }

    /**
     * Sets the value of the psHomeZone3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPSHomeZone3(String value) {
        this.psHomeZone3 = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the simPin property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSimPin() {
        return simPin;
    }

    /**
     * Sets the value of the simPin property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSimPin(String value) {
        this.simPin = value;
    }

    /**
     * Gets the value of the mainBalance property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMainBalance() {
        return mainBalance;
    }

    /**
     * Sets the value of the mainBalance property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMainBalance(String value) {
        this.mainBalance = value;
    }

    /**
     * Gets the value of the loanAmount property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoanAmount() {
        return loanAmount;
    }

    /**
     * Sets the value of the loanAmount property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoanAmount(String value) {
        this.loanAmount = value;
    }

    /**
     * Gets the value of the suspendRecharge property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSuspendRecharge() {
        return suspendRecharge;
    }

    /**
     * Sets the value of the suspendRecharge property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSuspendRecharge(String value) {
        this.suspendRecharge = value;
    }

    /**
     * Gets the value of the allowBalanceTransfer property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAllowBalanceTransfer() {
        return allowBalanceTransfer;
    }

    /**
     * Sets the value of the allowBalanceTransfer property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAllowBalanceTransfer(String value) {
        this.allowBalanceTransfer = value;
    }

    /**
     * Gets the value of the postcallNotification property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostcallNotification() {
        return postcallNotification;
    }

    /**
     * Sets the value of the postcallNotification property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostcallNotification(String value) {
        this.postcallNotification = value;
    }

    /**
     * Gets the value of the validDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getValidDate() {
        return validDate;
    }

    /**
     * Sets the value of the validDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setValidDate(String value) {
        this.validDate = value;
    }

    /**
     * Gets the value of the inactiveDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInactiveDate() {
        return inactiveDate;
    }

    /**
     * Sets the value of the inactiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInactiveDate(String value) {
        this.inactiveDate = value;
    }

    /**
     * Gets the value of the deactiveDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeactiveDate() {
        return deactiveDate;
    }

    /**
     * Sets the value of the deactiveDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeactiveDate(String value) {
        this.deactiveDate = value;
    }

    /**
     * Gets the value of the activeDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getActiveDate() {
        return activeDate;
    }

    /**
     * Sets the value of the activeDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setActiveDate(String value) {
        this.activeDate = value;
    }

    /**
     * Gets the value of the prepaid property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrepaid() {
        return prepaid;
    }

    /**
     * Sets the value of the prepaid property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrepaid(String value) {
        this.prepaid = value;
    }

    /**
     * Gets the value of the bundleList property.
     *
     * @return
     *     possible object is
     *     {@link QuerySubscriberInfoResponse.BundleList }
     *
     */
    public QuerySubscriberInfoResponse.BundleList getBundleList() {
        return bundleList;
    }

    /**
     * Sets the value of the bundleList property.
     *
     * @param value
     *     allowed object is
     *     {@link QuerySubscriberInfoResponse.BundleList }
     *
     */
    public void setBundleList(QuerySubscriberInfoResponse.BundleList value) {
        this.bundleList = value;
    }

    /**
     * Gets the value of the ffGroupList property.
     *
     * @return
     *     possible object is
     *     {@link QuerySubscriberInfoResponse.FFGroupList }
     *
     */
    public QuerySubscriberInfoResponse.FFGroupList getFFGroupList() {
        return ffGroupList;
    }

    /**
     * Sets the value of the ffGroupList property.
     *
     * @param value
     *     allowed object is
     *     {@link QuerySubscriberInfoResponse.FFGroupList }
     *
     */
    public void setFFGroupList(QuerySubscriberInfoResponse.FFGroupList value) {
        this.ffGroupList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Bundle" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "bundle"
    })
    public static class BundleList {

        @XmlElement(name = "Bundle")
        protected List<Bundle> bundle;

        /**
         * Gets the value of the bundle property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bundle property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBundle().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         *
         *
         */
        public List<Bundle> getBundle() {
            if (bundle == null) {
                bundle = new ArrayList<>();
            }
            return this.bundle;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        public static class Bundle {

            @XmlElement(name = "BundleId")
            @JsonProperty("BUNDLE_ID")
            protected String bundleId;

            @XmlElement(name = "BucketId")
            @JsonProperty("BUCKET_ID")
            protected String bucketId;

            @XmlElement(name = "State")
            @JsonProperty("STATE")
            protected String state;

            @XmlElement(name = "StartTime")
            @JsonProperty("START_TIME")
            protected String startTime;

            @XmlElement(name = "EndTime")
            @JsonProperty("END_TIME")
            protected String endTime;

            @XmlElement(name = "BundleAmount")
            @JsonProperty("BUNDLE_AMOUNT")
            protected String bundleAmount;

            public String getBundleId() {
                return bundleId;
            }

            public void setBundleId(String bundleId) {
                this.bundleId = bundleId;
            }

            public String getBucketId() {
                return bucketId;
            }

            public void setBucketId(String bucketId) {
                this.bucketId = bucketId;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getEndTime() {
                return endTime;
            }

            public void setEndTime(String endTime) {
                this.endTime = endTime;
            }

            public String getBundleAmount() {
                return bundleAmount;
            }

            public void setBundleAmount(String bundleAmount) {
                this.bundleAmount = bundleAmount;
            }
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="FFGroup" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "ffGroup"
    })
    public static class FFGroupList {

        @XmlElement(name = "FFGroup")
        protected List<Object> ffGroup;

        /**
         * Gets the value of the ffGroup property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ffGroup property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFFGroup().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         *
         *
         */
        public List<Object> getFFGroup() {
            if (ffGroup == null) {
                ffGroup = new ArrayList<Object>();
            }
            return this.ffGroup;
        }

    }

}

