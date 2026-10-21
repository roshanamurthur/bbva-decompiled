package org.bouncycastle.x509;

import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends CertificateEncodingException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f91745p0;

    public c(String str, Exception exc) {
        super(str);
        this.f91745p0 = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f91745p0;
    }
}
