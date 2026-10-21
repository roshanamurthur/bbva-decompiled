package com.nimbusds.jwt.proc;

import com.nimbusds.jose.proc.BadJOSEException;

/* JADX INFO: loaded from: classes10.dex */
public class BadJWTException extends BadJOSEException {
    public BadJWTException(String str) {
        super(str);
    }

    public BadJWTException(String str, Throwable th2) {
        super(str, th2);
    }
}
