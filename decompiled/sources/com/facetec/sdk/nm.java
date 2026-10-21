package com.facetec.sdk;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class nm extends ny {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ny f42695c;

    public nm(ny nyVar) {
        if (nyVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f42695c = nyVar;
    }

    @Override // com.facetec.sdk.ny
    public final long a_() {
        return this.f42695c.a_();
    }

    @Override // com.facetec.sdk.ny
    public final boolean b_() {
        return this.f42695c.b_();
    }

    @Override // com.facetec.sdk.ny
    public final ny c(long j10, TimeUnit timeUnit) {
        return this.f42695c.c(j10, timeUnit);
    }

    @Override // com.facetec.sdk.ny
    public final long c_() {
        return this.f42695c.c_();
    }

    @Override // com.facetec.sdk.ny
    public final ny d(long j10) {
        return this.f42695c.d(j10);
    }

    @Override // com.facetec.sdk.ny
    public final ny d_() {
        return this.f42695c.d_();
    }

    @Override // com.facetec.sdk.ny
    public final void e_() throws Throwable {
        this.f42695c.e_();
    }

    @Override // com.facetec.sdk.ny
    public final ny f_() {
        return this.f42695c.f_();
    }
}
