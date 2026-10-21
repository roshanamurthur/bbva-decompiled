package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.x509.ReasonFlags;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f90514b = new i(33023);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90515a;

    public i(int i10) {
        this.f90515a = i10;
    }

    public final boolean a() {
        return this.f90515a == f90514b.f90515a;
    }

    public i(ReasonFlags reasonFlags) {
        this.f90515a = reasonFlags.intValue();
    }
}
