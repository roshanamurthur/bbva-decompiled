package com.facetec.sdk;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class kr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final kj f42150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map<Class<?>, Object> f42151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f42152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final kp f42153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kk f42154e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private volatile jx f42155h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public kj.d f42156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        kk f42157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Map<Class<?>, Object> f42158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f42159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        kp f42160e;

        public a() {
            this.f42158c = Collections.emptyMap();
            this.f42159d = "GET";
            this.f42156a = new kj.d();
        }

        public final a b(String str, String str2) {
            this.f42156a.e(str, str2);
            return this;
        }

        public final a c(String str, String str2) {
            this.f42156a.d(str, str2);
            return this;
        }

        public final a e(kk kkVar) {
            if (kkVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f42157b = kkVar;
            return this;
        }

        public final a b(String str, @Nullable kp kpVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (kpVar != null && !lv.d(str)) {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must not have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
            if (kpVar != null || !lv.c(str)) {
                this.f42159d = str;
                this.f42160e = kpVar;
                return this;
            }
            StringBuilder sb3 = new StringBuilder("method ");
            sb3.append(str);
            sb3.append(" must have a request body.");
            throw new IllegalArgumentException(sb3.toString());
        }

        public final a c(String str) {
            this.f42156a.b(str);
            return this;
        }

        public final a c(kp kpVar) {
            return b("POST", kpVar);
        }

        public final a e(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb2 = new StringBuilder("http:");
                    sb2.append(str.substring(3));
                    str = sb2.toString();
                } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    StringBuilder sb3 = new StringBuilder("https:");
                    sb3.append(str.substring(4));
                    str = sb3.toString();
                }
                return e(kk.e(str));
            }
            throw new NullPointerException("url == null");
        }

        public a(kr krVar) {
            Map<Class<?>, Object> linkedHashMap;
            this.f42158c = Collections.emptyMap();
            this.f42157b = krVar.f42154e;
            this.f42159d = krVar.f42152c;
            this.f42160e = krVar.f42153d;
            if (krVar.f42151b.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap<>(krVar.f42151b);
            }
            this.f42158c = linkedHashMap;
            this.f42156a = krVar.f42150a.b();
        }

        public final kr e() {
            if (this.f42157b != null) {
                return new kr(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public kr(a aVar) {
        this.f42154e = aVar.f42157b;
        this.f42152c = aVar.f42159d;
        this.f42150a = aVar.f42156a.d();
        this.f42153d = aVar.f42160e;
        this.f42151b = kz.a(aVar.f42158c);
    }

    public final kk a() {
        return this.f42154e;
    }

    public final a b() {
        return new a(this);
    }

    public final String c() {
        return this.f42152c;
    }

    public final kj d() {
        return this.f42150a;
    }

    @Nullable
    public final kp e() {
        return this.f42153d;
    }

    public final boolean h() {
        return this.f42154e.a();
    }

    public final jx j() {
        jx jxVar = this.f42155h;
        if (jxVar != null) {
            return jxVar;
        }
        jx jxVarC = jx.c(this.f42150a);
        this.f42155h = jxVarC;
        return jxVarC;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f42152c);
        sb2.append(", url=");
        sb2.append(this.f42154e);
        sb2.append(", tags=");
        sb2.append(this.f42151b);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    @Nullable
    public final String d(String str) {
        return this.f42150a.b(str);
    }
}
