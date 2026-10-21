package com.bbva.sl.ar.core.libmcrypt.exception;

import ad.d;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes8.dex */
public class LibMCryptException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36617b;

    public LibMCryptException(int i10, String str) {
        this.f36616a = i10;
        this.f36617b = str;
    }

    public int getErrCode() {
        return this.f36616a;
    }

    public String getErrMsg() {
        return this.f36617b;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder("LibMCrypt_ERR [");
        sb2.append(this.f36616a);
        sb2.append(Constant.BRACKET_CLOSE);
        sb2.append(super.getMessage() != null ? d.f(new StringBuilder(": ["), super.getMessage(), Constant.BRACKET_CLOSE) : "");
        return sb2.toString();
    }
}
