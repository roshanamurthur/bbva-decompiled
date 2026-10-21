package com.facetec.sdk;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ls implements km.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final lm f42348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<km> f42349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lj f42350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final lr f42351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f42352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f42353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kr f42354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jw f42355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final kf f42356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f42357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f42358k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f42359n;

    public ls(List<km> list, lj ljVar, lr lrVar, lm lmVar, int i10, kr krVar, jw jwVar, kf kfVar, int i11, int i12, int i13) {
        this.f42349b = list;
        this.f42348a = lmVar;
        this.f42350c = ljVar;
        this.f42351d = lrVar;
        this.f42352e = i10;
        this.f42354g = krVar;
        this.f42355h = jwVar;
        this.f42356i = kfVar;
        this.f42353f = i11;
        this.f42357j = i12;
        this.f42359n = i13;
    }

    @Override // com.facetec.sdk.km.e
    public final int a() {
        return this.f42357j;
    }

    @Override // com.facetec.sdk.km.e
    public final int b() {
        return this.f42359n;
    }

    public final lj c() {
        return this.f42350c;
    }

    @Override // com.facetec.sdk.km.e
    public final kr d() {
        return this.f42354g;
    }

    @Override // com.facetec.sdk.km.e
    public final int e() {
        return this.f42353f;
    }

    public final jw h() {
        return this.f42355h;
    }

    public final kf j() {
        return this.f42356i;
    }

    @Override // com.facetec.sdk.km.e
    public final kq b(kr krVar) throws IOException {
        return c(krVar, this.f42350c, this.f42351d, this.f42348a);
    }

    public final kq c(kr krVar, lj ljVar, lr lrVar, lm lmVar) throws IOException {
        if (this.f42352e >= this.f42349b.size()) {
            throw new AssertionError();
        }
        this.f42358k++;
        if (this.f42351d != null && !this.f42348a.a(krVar.a())) {
            StringBuilder sb2 = new StringBuilder("network interceptor ");
            sb2.append(this.f42349b.get(this.f42352e - 1));
            sb2.append(" must retain the same host and port");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f42351d != null && this.f42358k > 1) {
            StringBuilder sb3 = new StringBuilder("network interceptor ");
            sb3.append(this.f42349b.get(this.f42352e - 1));
            sb3.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb3.toString());
        }
        ls lsVar = new ls(this.f42349b, ljVar, lrVar, lmVar, this.f42352e + 1, krVar, this.f42355h, this.f42356i, this.f42353f, this.f42357j, this.f42359n);
        km kmVar = this.f42349b.get(this.f42352e);
        kq kqVarC = kmVar.c(lsVar);
        if (lrVar != null && this.f42352e + 1 < this.f42349b.size() && lsVar.f42358k != 1) {
            StringBuilder sb4 = new StringBuilder("network interceptor ");
            sb4.append(kmVar);
            sb4.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb4.toString());
        }
        if (kqVarC == null) {
            StringBuilder sb5 = new StringBuilder("interceptor ");
            sb5.append(kmVar);
            sb5.append(" returned null");
            throw new NullPointerException(sb5.toString());
        }
        if (kqVarC.a() != null) {
            return kqVarC;
        }
        StringBuilder sb6 = new StringBuilder("interceptor ");
        sb6.append(kmVar);
        sb6.append(" returned a response with no body");
        throw new IllegalStateException(sb6.toString());
    }
}
