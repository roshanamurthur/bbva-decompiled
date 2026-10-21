package com.bbva.sl.ar.android.sslpinning.exception;

/* JADX INFO: loaded from: classes8.dex */
public class SSLPinningException extends ErrorCodeException {
    public SSLPinningException(int i10, String str) {
        super(i10, str);
    }

    @Override // com.bbva.sl.ar.android.sslpinning.exception.ErrorCodeException
    public String a() {
        return "SSLP_ERR";
    }

    @Override // com.bbva.sl.ar.android.sslpinning.exception.ErrorCodeException
    public int getErrCode() {
        return this.f36596a;
    }

    public void setErrCode(int i10) {
        this.f36596a = i10;
    }

    public SSLPinningException(int i10, String str, Throwable th2) {
        super(i10, str, th2);
    }

    public SSLPinningException(int i10, Throwable th2) {
        super(i10, th2);
    }

    public SSLPinningException(Throwable th2) {
        super(th2);
    }
}
