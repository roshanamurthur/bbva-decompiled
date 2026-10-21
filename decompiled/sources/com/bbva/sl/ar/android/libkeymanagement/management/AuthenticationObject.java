package com.bbva.sl.ar.android.libkeymanagement.management;

/* JADX INFO: loaded from: classes8.dex */
public class AuthenticationObject {
    private boolean confirmRequest;
    private boolean mainRequest;
    private boolean override;
    private String value;

    public AuthenticationObject(String str, boolean z10, boolean z11, boolean z12) {
        this.value = str;
        this.mainRequest = z10;
        this.confirmRequest = z11;
        this.override = z12;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isConfirmRequest() {
        return this.confirmRequest;
    }

    public boolean isMainRequest() {
        return this.mainRequest;
    }

    public boolean isOverride() {
        return this.override;
    }

    public void setConfirmRequest(boolean z10) {
        this.confirmRequest = z10;
    }

    public void setMainRequest(boolean z10) {
        this.mainRequest = z10;
    }

    public void setOverride(boolean z10) {
        this.override = z10;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
