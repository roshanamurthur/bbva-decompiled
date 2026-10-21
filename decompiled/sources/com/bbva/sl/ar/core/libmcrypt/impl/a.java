package com.bbva.sl.ar.core.libmcrypt.impl;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36625d;

    public a(String str) throws LibMCryptException {
        try {
            this.f36622a = str.substring(0, 2);
            this.f36623b = str.substring(2, 4);
            this.f36624c = str.substring(4, LibMCryptConstants.IND_HEX_SEGMENTO2);
            this.f36625d = str.substring(LibMCryptConstants.IND_HEX_SEGMENTO2);
        } catch (IndexOutOfBoundsException unused) {
            throw new LibMCryptException(203, ErrorCodes.ERR_CRY_BAD_RSA_DATA_LEN_MSG);
        }
    }

    public final String a() {
        return this.f36622a;
    }

    public final String b() {
        return this.f36623b;
    }

    public final String c() {
        return this.f36624c;
    }

    public final String d() {
        return this.f36625d;
    }
}
