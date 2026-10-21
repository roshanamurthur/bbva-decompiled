package org.bouncycastle.util;

/* JADX INFO: loaded from: classes13.dex */
public class StreamParsingException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f91641p0;

    public StreamParsingException(String str, Throwable th2) {
        super(str);
        this.f91641p0 = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f91641p0;
    }
}
