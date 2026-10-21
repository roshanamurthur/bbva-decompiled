package com.viergegroup.sdk.taptophone.vierge.models;

/* JADX INFO: loaded from: classes7.dex */
public class SendTransactionResponse {
    private int errorCode = 0;
    private String errorMessage = "";
    private TransactionResponse transactionResponse = null;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TransactionResponse getTransactionResponse() {
        return this.transactionResponse;
    }

    public void setErrorCode(int i10) {
        this.errorCode = i10;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setTransactionResponse(TransactionResponse transactionResponse) {
        this.transactionResponse = transactionResponse;
    }
}
