package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class j extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Throwable f66085p0;

    public j(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f66085p0;
    }

    public j(String str, Throwable th2) {
        super(str);
        this.f66085p0 = th2;
    }
}
