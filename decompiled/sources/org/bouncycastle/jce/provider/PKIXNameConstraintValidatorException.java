package org.bouncycastle.jce.provider;

/* JADX INFO: loaded from: classes8.dex */
public class PKIXNameConstraintValidatorException extends Exception {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f90438p0;

    public PKIXNameConstraintValidatorException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f90438p0;
    }

    public PKIXNameConstraintValidatorException(String str, Throwable th2) {
        super(str);
        this.f90438p0 = th2;
    }
}
