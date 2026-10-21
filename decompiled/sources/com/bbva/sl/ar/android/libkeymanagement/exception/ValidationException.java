package com.bbva.sl.ar.android.libkeymanagement.exception;

/* JADX INFO: loaded from: classes8.dex */
public class ValidationException extends KeyManagementException {
    private static final long serialVersionUID = 8146691583906730689L;

    public ValidationException(String str, String str2, String str3) {
        super(str, String.format(str2, str3));
    }
}
