package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class amn extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f53226p0;

    public amn(String str, Throwable th2) {
        super(str);
        this.f53226p0 = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f53226p0;
    }
}
