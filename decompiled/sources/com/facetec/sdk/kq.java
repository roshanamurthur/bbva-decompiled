package com.facetec.sdk;

import java.io.Closeable;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class kq implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ko f42126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final ke f42127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f42128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kr f42129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final String f42130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    final kq f42131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    final kq f42132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final kj f42133h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final kt f42134i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    final kq f42135j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final long f42136l;

    @Nullable
    private volatile jx m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final long f42137n;

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        ke f42138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f42139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f42140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        kr f42141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        ko f42142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        kt f42143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        kq f42144g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        kq f42145h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public kq f42146i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public kj.d f42147j;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f42148n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f42149o;

        public d() {
            this.f42140c = -1;
            this.f42147j = new kj.d();
        }

        public final d a(kr krVar) {
            this.f42141d = krVar;
            return this;
        }

        public final d b(long j10) {
            this.f42148n = j10;
            return this;
        }

        public final d c(@Nullable kt ktVar) {
            this.f42143f = ktVar;
            return this;
        }

        public final d d(int i10) {
            this.f42140c = i10;
            return this;
        }

        public final d e(ko koVar) {
            this.f42142e = koVar;
            return this;
        }

        public final d a(String str, String str2) {
            this.f42147j.e(str, str2);
            return this;
        }

        public final kq c() {
            if (this.f42141d == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f42142e == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f42140c >= 0) {
                if (this.f42139b != null) {
                    return new kq(this);
                }
                throw new IllegalStateException("message == null");
            }
            StringBuilder sb2 = new StringBuilder("code < 0: ");
            sb2.append(this.f42140c);
            throw new IllegalStateException(sb2.toString());
        }

        public final d d(String str) {
            this.f42139b = str;
            return this;
        }

        public final d e(@Nullable ke keVar) {
            this.f42138a = keVar;
            return this;
        }

        private static void a(String str, kq kqVar) {
            if (kqVar.f42134i == null) {
                if (kqVar.f42131f == null) {
                    if (kqVar.f42135j == null) {
                        if (kqVar.f42132g == null) {
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(".priorResponse != null");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(".cacheResponse != null");
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".networkResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(".body != null");
            throw new IllegalArgumentException(sb5.toString());
        }

        public final d d(@Nullable kq kqVar) {
            if (kqVar != null) {
                a("cacheResponse", kqVar);
            }
            this.f42145h = kqVar;
            return this;
        }

        public final d e(kj kjVar) {
            this.f42147j = kjVar.b();
            return this;
        }

        public d(kq kqVar) {
            this.f42140c = -1;
            this.f42141d = kqVar.f42129d;
            this.f42142e = kqVar.f42126a;
            this.f42140c = kqVar.f42128c;
            this.f42139b = kqVar.f42130e;
            this.f42138a = kqVar.f42127b;
            this.f42147j = kqVar.f42133h.b();
            this.f42143f = kqVar.f42134i;
            this.f42144g = kqVar.f42131f;
            this.f42145h = kqVar.f42135j;
            this.f42146i = kqVar.f42132g;
            this.f42148n = kqVar.f42136l;
            this.f42149o = kqVar.f42137n;
        }

        public final d e(@Nullable kq kqVar) {
            if (kqVar != null) {
                a("networkResponse", kqVar);
            }
            this.f42144g = kqVar;
            return this;
        }

        public final d d(long j10) {
            this.f42149o = j10;
            return this;
        }
    }

    public kq(d dVar) {
        this.f42129d = dVar.f42141d;
        this.f42126a = dVar.f42142e;
        this.f42128c = dVar.f42140c;
        this.f42130e = dVar.f42139b;
        this.f42127b = dVar.f42138a;
        this.f42133h = dVar.f42147j.d();
        this.f42134i = dVar.f42143f;
        this.f42131f = dVar.f42144g;
        this.f42135j = dVar.f42145h;
        this.f42132g = dVar.f42146i;
        this.f42136l = dVar.f42148n;
        this.f42137n = dVar.f42149o;
    }

    @Nullable
    public final kt a() {
        return this.f42134i;
    }

    public final kr b() {
        return this.f42129d;
    }

    public final kj c() {
        return this.f42133h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kt ktVar = this.f42134i;
        if (ktVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        ktVar.close();
    }

    public final boolean d() {
        int i10 = this.f42128c;
        return i10 >= 200 && i10 < 300;
    }

    public final int e() {
        return this.f42128c;
    }

    @Nullable
    public final kq f() {
        return this.f42132g;
    }

    public final long g() {
        return this.f42136l;
    }

    public final jx h() {
        jx jxVar = this.m;
        if (jxVar != null) {
            return jxVar;
        }
        jx jxVarC = jx.c(this.f42133h);
        this.m = jxVarC;
        return jxVarC;
    }

    public final long i() {
        return this.f42137n;
    }

    public final d j() {
        return new d(this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Response{protocol=");
        sb2.append(this.f42126a);
        sb2.append(", code=");
        sb2.append(this.f42128c);
        sb2.append(", message=");
        sb2.append(this.f42130e);
        sb2.append(", url=");
        sb2.append(this.f42129d.a());
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Nullable
    public final String d(String str) {
        String strB = this.f42133h.b(str);
        if (strB != null) {
            return strB;
        }
        return null;
    }
}
