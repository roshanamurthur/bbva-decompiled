package com.bbva.sl.ar.android.libkeymanagement.exception;

/* JADX INFO: loaded from: classes8.dex */
public class InitializationException extends KeyManagementException {
    private static final long serialVersionUID = -5940334038944651232L;

    public InitializationException(String str, String str2) {
        super(str, str2);
    }

    public InitializationException(String str, String str2, Throwable th2) {
        super(str, str2, th2);
    }

    public InitializationException(ErrorCodeEnum errorCodeEnum, Throwable th2) {
        super(errorCodeEnum, th2);
    }

    public InitializationException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum);
    }

    public InitializationException(ErrorCodeEnum errorCodeEnum, String str, Throwable th2) {
        super(errorCodeEnum, str, th2);
    }

    public InitializationException(ErrorCodeEnum errorCodeEnum, String str) {
        super(errorCodeEnum, str);
    }
}
