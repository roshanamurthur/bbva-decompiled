package org.bouncycastle.util;

/* JADX INFO: loaded from: classes13.dex */
public class StoreException extends RuntimeException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f91640p0;

    public StoreException(String str, Throwable th2) {
        super(str);
        this.f91640p0 = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f91640p0;
    }
}
