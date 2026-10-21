package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class CvmIssuerOptions {
    private boolean ackAlwaysRequiredIfCurrencyNotProvided;
    private boolean ackAlwaysRequiredIfCurrencyProvided;
    private boolean ackAutomaticallyResetByApplication;
    private boolean ackPreEntryAllowed;
    private boolean pinAlwaysRequiredIfCurrencyNotProvided;
    private boolean pinAlwaysRequiredIfCurrencyProvided;
    private boolean pinAutomaticallyResetByApplication;
    private boolean pinPreEntryAllowed;

    public static byte setBit(byte b10, int i10) {
        return (byte) (b10 | (1 << i10));
    }

    public boolean isAckAlwaysRequiredIfCurrencyNotProvided() {
        return this.ackAlwaysRequiredIfCurrencyNotProvided;
    }

    public boolean isAckAlwaysRequiredIfCurrencyProvided() {
        return this.ackAlwaysRequiredIfCurrencyProvided;
    }

    public boolean isAckAutomaticallyResetByApplication() {
        return this.ackAutomaticallyResetByApplication;
    }

    public boolean isAckPreEntryAllowed() {
        return this.ackPreEntryAllowed;
    }

    public boolean isPinAlwaysRequiredIfCurrencyNotProvided() {
        return this.pinAlwaysRequiredIfCurrencyNotProvided;
    }

    public boolean isPinAlwaysRequiredIfCurrencyProvided() {
        return this.pinAlwaysRequiredIfCurrencyProvided;
    }

    public boolean isPinAutomaticallyResetByApplication() {
        return this.pinAutomaticallyResetByApplication;
    }

    public boolean isPinPreEntryAllowed() {
        return this.pinPreEntryAllowed;
    }

    public void setAckAlwaysRequiredIfCurrencyNotProvided(boolean z10) {
        this.ackAlwaysRequiredIfCurrencyNotProvided = z10;
    }

    public void setAckAlwaysRequiredIfCurrencyProvided(boolean z10) {
        this.ackAlwaysRequiredIfCurrencyProvided = z10;
    }

    public void setAckAutomaticallyResetByApplication(boolean z10) {
        this.ackAutomaticallyResetByApplication = z10;
    }

    public void setAckPreEntryAllowed(boolean z10) {
        this.ackPreEntryAllowed = z10;
    }

    public void setPinAlwaysRequiredIfCurrencyNotProvided(boolean z10) {
        this.pinAlwaysRequiredIfCurrencyNotProvided = z10;
    }

    public void setPinAlwaysRequiredIfCurrencyProvided(boolean z10) {
        this.pinAlwaysRequiredIfCurrencyProvided = z10;
    }

    public void setPinAutomaticallyResetByApplication(boolean z10) {
        this.pinAutomaticallyResetByApplication = z10;
    }

    public void setPinPreEntryAllowed(boolean z10) {
        this.pinPreEntryAllowed = z10;
    }
}
