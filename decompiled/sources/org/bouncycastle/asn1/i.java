package org.bouncycastle.asn1;

import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class i extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InputStream f87270p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f87271q0;

    public i(InputStream inputStream, int i10) {
        this.f87270p0 = inputStream;
        this.f87271q0 = i10;
    }

    public final void b() {
        InputStream inputStream = this.f87270p0;
        if (inputStream instanceof f) {
            f fVar = (f) inputStream;
            fVar.f87263u0 = true;
            fVar.e();
        }
    }
}
