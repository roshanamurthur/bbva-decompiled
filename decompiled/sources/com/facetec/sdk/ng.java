package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class ng implements nz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nz f42684b;

    public ng(nz nzVar) {
        if (nzVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f42684b = nzVar;
    }

    @Override // com.facetec.sdk.nz
    public final ny a() {
        return this.f42684b.a();
    }

    public final nz c() {
        return this.f42684b;
    }

    @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42684b.close();
    }

    @Override // com.facetec.sdk.nz
    public long d(nb nbVar, long j10) throws IOException {
        return this.f42684b.d(nbVar, j10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        sb2.append(this.f42684b.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
