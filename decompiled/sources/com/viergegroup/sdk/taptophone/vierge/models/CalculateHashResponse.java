package com.viergegroup.sdk.taptophone.vierge.models;

/* JADX INFO: loaded from: classes7.dex */
public class CalculateHashResponse {
    private String expectedHash = "";
    private String kcv = "";
    private int errorCode = 0;
    private String errorMessage = "";
    private TransactionResponse transactionResponse = null;
    private String hash = "";

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getExpectedHash() {
        return this.expectedHash;
    }

    public String getHash() {
        return this.hash;
    }

    public TransactionResponse getTransactionResponse() {
        return this.transactionResponse;
    }

    public String getkcv() {
        return this.kcv;
    }

    public void setErrorCode(int i10) {
        this.errorCode = i10;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExpectedHash(String str) {
        this.expectedHash = str;
    }

    public void setHash(String str) {
        this.hash = str;
    }

    public void setTransactionResponse(TransactionResponse transactionResponse) {
        this.transactionResponse = transactionResponse;
    }

    public void setkcv(String str) {
        this.kcv = str;
    }
}
