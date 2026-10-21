package org.bouncycastle.jce.provider;

import org.bouncycastle.jce.exception.ExtException;

/* JADX INFO: loaded from: classes8.dex */
public class AnnotatedException extends Exception implements ExtException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f90372p0;

    public AnnotatedException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this.f90372p0;
    }

    public AnnotatedException(String str, Throwable th2) {
        super(str);
        this.f90372p0 = th2;
    }
}
