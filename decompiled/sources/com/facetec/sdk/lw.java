package com.facetec.sdk;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class lw extends kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f42365a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nh f42366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f42367e;

    public lw(@Nullable String str, long j10, nh nhVar) {
        this.f42365a = str;
        this.f42367e = j10;
        this.f42366d = nhVar;
    }

    @Override // com.facetec.sdk.kt
    public final nh b() {
        return this.f42366d;
    }

    @Override // com.facetec.sdk.kt
    public final long c() {
        return this.f42367e;
    }

    @Override // com.facetec.sdk.kt
    public final kn d() {
        String str = this.f42365a;
        if (str != null) {
            return kn.e(str);
        }
        return null;
    }
}
