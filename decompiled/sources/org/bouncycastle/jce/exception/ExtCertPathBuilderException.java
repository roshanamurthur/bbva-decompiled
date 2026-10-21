package org.bouncycastle.jce.exception;

import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;

/* JADX INFO: loaded from: classes8.dex */
public class ExtCertPathBuilderException extends CertPathBuilderException implements ExtException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f90362p0;

    public ExtCertPathBuilderException(String str, Throwable th2) {
        super(str);
        this.f90362p0 = th2;
    }

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this.f90362p0;
    }

    public ExtCertPathBuilderException(String str, Throwable th2, CertPath certPath, int i10) {
        super(str, th2);
        this.f90362p0 = th2;
    }
}
