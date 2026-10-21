package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements PrivilegedAction<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte[] f90088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f90089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f90090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DRBG.d f90091d;

    public a(DRBG.d dVar, byte[] bArr, int i10, int i11) {
        this.f90091d = dVar;
        this.f90088a = bArr;
        this.f90089b = i10;
        this.f90090c = i11;
    }

    @Override // java.security.PrivilegedAction
    public final Integer run() {
        try {
            return Integer.valueOf(this.f90091d.f90086p0.read(this.f90088a, this.f90089b, this.f90090c));
        } catch (IOException unused) {
            throw new InternalError("unable to read random source");
        }
    }
}
