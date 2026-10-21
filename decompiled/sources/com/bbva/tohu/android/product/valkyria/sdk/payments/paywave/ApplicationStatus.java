package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave;

/* JADX INFO: loaded from: classes6.dex */
public class ApplicationStatus {
    public static final String NOT_READY_TO_PAY = "notReadyToPay";
    public static final String STATUS_BLOCKED = "blocked";
    public static final String STATUS_READY_TO_PAY = "readyToPay";
    private String status = STATUS_READY_TO_PAY;

    public boolean isBlocked() {
        return this.status.equals(STATUS_BLOCKED);
    }

    public boolean isReadyToPay() {
        return !this.status.equals(NOT_READY_TO_PAY);
    }

    public void reset() {
        this.status = STATUS_READY_TO_PAY;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
