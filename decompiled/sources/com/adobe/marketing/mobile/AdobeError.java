package com.adobe.marketing.mobile;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class AdobeError implements Serializable {
    private static final long serialVersionUID = 1;
    private final int errorCode;
    private final String errorName;
    public static final AdobeError UNEXPECTED_ERROR = new AdobeError("general.unexpected", 0);
    public static final AdobeError CALLBACK_TIMEOUT = new AdobeError("general.callback.timeout", 1);
    public static final AdobeError CALLBACK_NULL = new AdobeError("general.callback.null", 2);
    public static final AdobeError EXTENSION_NOT_INITIALIZED = new AdobeError("general.extension.not.initialized", 11);

    public AdobeError(String str, int i10) {
        this.errorName = str;
        this.errorCode = i10;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorName() {
        return this.errorName;
    }
}
