package org.bouncycastle.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class CryptoException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f87854p0;

    public CryptoException() {
    }

    public CryptoException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f87854p0;
    }

    public CryptoException(String str, Throwable th2) {
        super(str);
        this.f87854p0 = th2;
    }
}
