package com.bbva.sl.ar.android.libkeymanagement.exception;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes8.dex */
public class CryptoException extends Exception {
    private static final long serialVersionUID = -3242701023294127570L;

    public CryptoException() {
    }

    @SuppressLint({"NewApi"})
    public CryptoException(String str, Throwable th2, boolean z10, boolean z11) {
        super(str, th2, z10, z11);
    }

    public CryptoException(String str, Throwable th2) {
        super(str, th2);
    }

    public CryptoException(String str) {
        super(str);
    }

    public CryptoException(Throwable th2) {
        super(th2);
    }
}
