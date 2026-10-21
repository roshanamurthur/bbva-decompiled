package com.bbva.tohu.android.product.valkyria.sdk.export.exceptions;

import com.bbva.tohu.android.core.constants.ResponseCodes;

/* JADX INFO: loaded from: classes6.dex */
public class TohuSdkException extends Exception {
    private final String broadcastCode;
    private final int callbackCode;

    public TohuSdkException(Exception exc) {
        super(exc);
        this.broadcastCode = ResponseCodes.TOHU_INTERNAL_ERROR;
        this.callbackCode = 3;
    }

    public String getBroadcastCode() {
        return this.broadcastCode;
    }

    public int getCallbackCode() {
        return this.callbackCode;
    }

    public TohuSdkException() {
        this.broadcastCode = ResponseCodes.TOHU_INTERNAL_ERROR;
        this.callbackCode = 3;
    }

    public TohuSdkException(String str, int i10) {
        this.broadcastCode = str;
        this.callbackCode = i10;
    }

    public TohuSdkException(String str, int i10, String str2) {
        super(str2);
        this.broadcastCode = str;
        this.callbackCode = i10;
    }

    public TohuSdkException(String str, int i10, Exception exc) {
        super(exc);
        this.broadcastCode = str;
        this.callbackCode = i10;
    }

    public TohuSdkException(String str, int i10, String str2, Exception exc) {
        super(str2, exc);
        this.broadcastCode = str;
        this.callbackCode = i10;
    }

    public TohuSdkException(String str, Exception exc) {
        super(exc);
        this.broadcastCode = str;
        this.callbackCode = 3;
    }

    public TohuSdkException(String str) {
        super(str);
        this.broadcastCode = ResponseCodes.TOHU_INTERNAL_ERROR;
        this.callbackCode = 3;
    }
}
