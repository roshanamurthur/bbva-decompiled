package org.bouncycastle.asn1;

/* JADX INFO: loaded from: classes12.dex */
public class ASN1ParsingException extends IllegalStateException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f86523p0;

    public ASN1ParsingException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f86523p0;
    }

    public ASN1ParsingException(String str, Throwable th2) {
        super(str);
        this.f86523p0 = th2;
    }
}
