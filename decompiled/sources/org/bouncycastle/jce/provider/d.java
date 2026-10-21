package org.bouncycastle.jce.provider;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends CRLException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Throwable f90494p0;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f90494p0;
    }
}
