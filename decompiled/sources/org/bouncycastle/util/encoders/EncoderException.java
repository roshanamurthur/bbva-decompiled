package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes13.dex */
public class EncoderException extends IllegalStateException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f91645p0;

    public EncoderException(String str, Exception exc) {
        super(str);
        this.f91645p0 = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f91645p0;
    }
}
