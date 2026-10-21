package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class s {
    static final char m = '\n';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f64537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64538b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o.c f64539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f64542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f64545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f64546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f64547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f64548l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Uri f64549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        o.c f64550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f64551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f64552d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f64553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f64554f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f64555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f64556h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f64557i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f64558j;

        public a(Uri uri) {
            this.f64549a = uri;
        }

        public a a(float f6, float f10, @ColorInt int i10) {
            this.f64556h = f6;
            this.f64557i = f10;
            this.f64558j = i10;
            return this;
        }

        public a b() {
            this.f64554f = true;
            return this;
        }

        public a c() {
            this.f64555g = true;
            return this;
        }

        public boolean d() {
            return this.f64550b != null;
        }

        public a a(@Px int i10, @Px int i11) {
            this.f64552d = i10;
            this.f64553e = i11;
            return this;
        }

        public a a(o.c cVar) {
            this.f64550b = cVar;
            return this;
        }

        public a a(b bVar, b... bVarArr) {
            if (bVar == null) {
                return this;
            }
            this.f64551c = bVar.f64563a | this.f64551c;
            if (bVarArr == null) {
                return this;
            }
            for (b bVar2 : bVarArr) {
                this.f64551c = bVar2.f64563a | this.f64551c;
            }
            return this;
        }

        public s a() {
            if (this.f64550b == null) {
                this.f64550b = o.c.NORMAL;
            }
            return new s(this);
        }
    }

    public enum b {
        NO_MEMORY_CACHE(1),
        NO_MEMORY_STORE(2),
        NO_DISK_STORE(4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f64563a;

        b(int i10) {
            this.f64563a = i10;
        }

        public static boolean a(int i10) {
            return (i10 & NO_MEMORY_CACHE.f64563a) == 0;
        }

        public static boolean c(int i10) {
            return (i10 & NO_DISK_STORE.f64563a) == 0;
        }

        public int b() {
            return this.f64563a;
        }

        public static boolean b(int i10) {
            return (i10 & NO_MEMORY_STORE.f64563a) == 0;
        }
    }

    public s(a aVar) {
        this.f64537a = aVar.f64549a;
        this.f64539c = aVar.f64550b;
        this.f64540d = aVar.f64551c;
        this.f64541e = aVar.f64552d;
        this.f64542f = aVar.f64553e;
        this.f64543g = aVar.f64554f;
        this.f64544h = aVar.f64555g;
        this.f64545i = aVar.f64556h;
        this.f64546j = aVar.f64557i;
        this.f64547k = aVar.f64558j;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f64537a.toString());
        sb2.append(m);
        if (d()) {
            sb2.append("resize:");
            sb2.append(this.f64541e);
            sb2.append('x');
            sb2.append(this.f64542f);
            sb2.append(m);
        }
        if (this.f64543g) {
            sb2.append("centerCrop\n");
        }
        if (this.f64544h) {
            sb2.append("centerInside\n");
        }
        if (c()) {
            sb2.append("radius:");
            sb2.append(this.f64545i);
            sb2.append(",border:");
            sb2.append(this.f64546j);
            sb2.append(",color:");
            sb2.append(this.f64547k);
        }
        return sb2.toString();
    }

    public String b() {
        return String.valueOf(this.f64537a.getPath());
    }

    public boolean c() {
        return (this.f64545i == 0.0f && this.f64546j == 0.0f) ? false : true;
    }

    public boolean d() {
        return (this.f64541e == 0 && this.f64542f == 0) ? false : true;
    }

    public boolean e() {
        return d() || c();
    }
}
