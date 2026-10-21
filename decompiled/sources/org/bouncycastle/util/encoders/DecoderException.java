package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes13.dex */
public class DecoderException extends IllegalStateException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f91644p0;

    public DecoderException(String str, Exception exc) {
        super(str);
        this.f91644p0 = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f91644p0;
    }
}
