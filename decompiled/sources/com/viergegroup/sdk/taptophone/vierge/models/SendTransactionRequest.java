package com.viergegroup.sdk.taptophone.vierge.models;

/* JADX INFO: loaded from: classes7.dex */
public class SendTransactionRequest {
    private String authorizationIdResponse;
    private String hostType;
    private String merchantType;
    private String pointOfServiceEntryMode;
    private String terminalSerialNumber;
    private String transactionType;

    public String getAuthorizationIdResponse() {
        return this.authorizationIdResponse;
    }

    public String getHostType() {
        return this.hostType;
    }

    public String getMerchantType() {
        return this.merchantType;
    }

    public String getPointOfServiceEntryMode() {
        return this.pointOfServiceEntryMode;
    }

    public String getTerminalSerialNumber() {
        return this.terminalSerialNumber;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setAuthorizationIdResponse(String str) {
        this.authorizationIdResponse = str;
    }

    public void setHostType(String str) {
        this.hostType = str;
    }

    public void setMerchantType(String str) {
        this.merchantType = str;
    }

    public void setPointOfServiceEntryMode(String str) {
        this.pointOfServiceEntryMode = str;
    }

    public void setTerminalSerialNumber(String str) {
        this.terminalSerialNumber = str;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }
}
