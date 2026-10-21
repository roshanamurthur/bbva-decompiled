package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionDetails {
    private String amount;
    private String currencyCode;
    private String merchantName;
    private String tokenId;
    private String transactionDate;
    private String transactionStatus;
    private String transactionType;

    public String getAmount() {
        return this.amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public String getTransactionStatus() {
        return this.transactionStatus;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }

    public void setTransactionDate(String str) {
        this.transactionDate = str;
    }

    public void setTransactionStatus(String str) {
        this.transactionStatus = str;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionDetails{tokenId='");
        sb2.append(this.tokenId);
        sb2.append("', transactionType='");
        sb2.append(this.transactionType);
        sb2.append("', transactionDate='");
        sb2.append(this.transactionDate);
        sb2.append("', merchantName='");
        sb2.append(this.merchantName);
        sb2.append("', amount='");
        sb2.append(this.amount);
        sb2.append("', transactionStatus='");
        sb2.append(this.transactionStatus);
        sb2.append("', currencyCode='");
        return d.f(sb2, this.currencyCode, "'}");
    }
}
