package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes8.dex */
public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f90032p0;

    public ExtendedInvalidKeySpecException(String str, Throwable th2) {
        super(str);
        this.f90032p0 = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f90032p0;
    }
}
