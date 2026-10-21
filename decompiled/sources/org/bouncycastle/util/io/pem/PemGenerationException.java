package org.bouncycastle.util.io.pem;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class PemGenerationException extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f91658p0;

    public PemGenerationException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f91658p0;
    }

    public PemGenerationException(String str, Throwable th2) {
        super(str);
        this.f91658p0 = th2;
    }
}
