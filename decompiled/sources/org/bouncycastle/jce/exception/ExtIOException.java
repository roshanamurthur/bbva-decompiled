package org.bouncycastle.jce.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class ExtIOException extends IOException implements ExtException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f90365p0;

    public ExtIOException(String str, Throwable th2) {
        super(str);
        this.f90365p0 = th2;
    }

    @Override // java.lang.Throwable, org.bouncycastle.jce.exception.ExtException
    public Throwable getCause() {
        return this.f90365p0;
    }
}
