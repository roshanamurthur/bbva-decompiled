package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
abstract class n3 extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected final InputStream f66212p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f66213q0;

    public n3(InputStream inputStream, int i10) {
        this.f66212p0 = inputStream;
        this.f66213q0 = i10;
    }

    public int a() {
        return this.f66213q0;
    }

    public void a(boolean z10) {
        InputStream inputStream = this.f66212p0;
        if (inputStream instanceof h3) {
            ((h3) inputStream).b(z10);
        }
    }
}
