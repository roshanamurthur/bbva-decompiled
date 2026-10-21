package com.bbva.sl.ar.android.sslpinning.result;

import com.bbva.sl.ar.android.sslpinning.exception.SSLPinningException;

/* JADX INFO: loaded from: classes8.dex */
public class ErrorInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f36606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f36607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f36608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Throwable f36609d;

    public ErrorInfo() {
        this.f36606a = System.currentTimeMillis();
    }

    public Throwable getCause() {
        return this.f36609d;
    }

    public int getCode() {
        return this.f36608c;
    }

    public String getDescription() {
        return this.f36607b;
    }

    public long getTimestamp() {
        return this.f36606a;
    }

    public void setCause(Throwable th2) {
        this.f36609d = th2;
    }

    public void setCode(int i10) {
        this.f36608c = i10;
    }

    public void setDescription(String str) {
        this.f36607b = str;
    }

    public void setTimestamp(long j10) {
        this.f36606a = j10;
    }

    public ErrorInfo(int i10, String str, Throwable th2) {
        this();
        this.f36609d = th2;
        this.f36608c = i10;
        this.f36607b = str;
    }

    public ErrorInfo(SSLPinningException sSLPinningException) {
        this();
        this.f36609d = sSLPinningException;
        this.f36608c = sSLPinningException.getErrCode();
        this.f36607b = sSLPinningException.getMessage();
    }
}
