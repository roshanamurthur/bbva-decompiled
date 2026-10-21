package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentInstrument {
    private String cvv2PrintedInd;
    private String expDatePrintedInd;
    private ExpirationDate expirationDate;
    private List<String> indicators;
    private String last4;
    private String paymentAccountReference;

    public String getCvv2PrintedInd() {
        return this.cvv2PrintedInd;
    }

    public String getExpDatePrintedInd() {
        return this.expDatePrintedInd;
    }

    public ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public List<String> getIndicators() {
        return this.indicators;
    }

    public String getLast4() {
        return this.last4;
    }

    public String getPaymentAccountReference() {
        return this.paymentAccountReference;
    }

    public void setCvv2PrintedInd(String str) {
        this.cvv2PrintedInd = str;
    }

    public void setExpDatePrintedInd(String str) {
        this.expDatePrintedInd = str;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setIndicators(List<String> list) {
        this.indicators = list;
    }

    public void setLast4(String str) {
        this.last4 = str;
    }

    public void setPaymentAccountReference(String str) {
        this.paymentAccountReference = str;
    }
}
