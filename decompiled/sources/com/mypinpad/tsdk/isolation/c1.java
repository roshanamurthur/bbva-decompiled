package com.mypinpad.tsdk.isolation;

import java.security.cert.CRLException;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 extends CRLException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Throwable f54758p0;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Object[] objArr = {this};
        System.identityHashCode(this);
        return ((c1) objArr[0]).f54758p0;
    }
}
