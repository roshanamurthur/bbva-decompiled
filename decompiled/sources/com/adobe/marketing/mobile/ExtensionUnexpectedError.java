package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionUnexpectedError extends Exception {
    private static final long serialVersionUID = 1;
    private ExtensionError errorCode;

    public ExtensionUnexpectedError(ExtensionError extensionError) {
        this.errorCode = extensionError;
    }

    public ExtensionError getErrorCode() {
        return this.errorCode;
    }

    public ExtensionUnexpectedError(String str, Throwable th2, ExtensionError extensionError) {
        super(str, th2);
        this.errorCode = extensionError;
    }

    public ExtensionUnexpectedError(String str, ExtensionError extensionError) {
        super(str);
        this.errorCode = extensionError;
    }

    public ExtensionUnexpectedError(Throwable th2, ExtensionError extensionError) {
        super(th2);
        this.errorCode = extensionError;
    }
}
