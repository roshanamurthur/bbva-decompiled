package org.bouncycastle.crypto.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class CipherIOException extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f88793p0;

    public CipherIOException(String str, Throwable th2) {
        super(str);
        this.f88793p0 = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f88793p0;
    }
}
