package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1Exception extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f86510p0;

    public ASN1Exception(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.f86510p0 = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f86510p0;
    }
}
