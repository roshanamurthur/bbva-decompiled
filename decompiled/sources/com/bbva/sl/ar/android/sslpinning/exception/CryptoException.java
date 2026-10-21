package com.bbva.sl.ar.android.sslpinning.exception;

/* JADX INFO: loaded from: classes8.dex */
public class CryptoException extends SSLPinningException {
    public CryptoException(Throwable th2) {
        super(th2);
    }

    @Override // com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException, com.bbva.sl.ar.android.sslpinning.exception.ErrorCodeException
    public final String a() {
        return "CRYPT_ERR";
    }
}
