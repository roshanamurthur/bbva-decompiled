package com.bbva.sl.ar.android.sslpinning.exception;

import ad.d;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ErrorCodeException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f36596a;

    public ErrorCodeException() {
        this.f36596a = -1;
    }

    public abstract String a();

    public int getErrCode() {
        return this.f36596a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a());
        sb2.append(" [");
        sb2.append(this.f36596a);
        sb2.append(Constant.BRACKET_CLOSE);
        sb2.append(super.getMessage() != null ? d.f(new StringBuilder(": ["), super.getMessage(), Constant.BRACKET_CLOSE) : "");
        return sb2.toString();
    }

    public ErrorCodeException(int i10) {
        this.f36596a = i10;
    }

    public ErrorCodeException(int i10, String str) {
        super(str);
        this.f36596a = i10;
    }

    public ErrorCodeException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f36596a = i10;
    }

    public ErrorCodeException(int i10, Throwable th2) {
        super(th2);
        this.f36596a = i10;
    }

    public ErrorCodeException(Throwable th2) {
        super(th2);
        this.f36596a = -1;
        if (th2 instanceof ErrorCodeException) {
            this.f36596a = ((ErrorCodeException) th2).getErrCode();
        }
    }
}
