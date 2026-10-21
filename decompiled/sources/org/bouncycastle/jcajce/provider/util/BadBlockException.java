package org.bouncycastle.jcajce.provider.util;

import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes8.dex */
public class BadBlockException extends BadPaddingException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f90240p0;

    public BadBlockException(String str, Throwable th2) {
        super(str);
        this.f90240p0 = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f90240p0;
    }
}
