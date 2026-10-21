package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.widget.ImageView;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f64564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.a f64565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f64566c;

    public t(o oVar, Uri uri) {
        this.f64564a = oVar;
        this.f64565b = new s.a(uri);
    }

    private s a(long j10) {
        s sVarA = this.f64565b.a();
        sVarA.f64548l = j10;
        return sVarA;
    }

    public t b() {
        this.f64565b.c();
        return this;
    }

    public void c() {
        a((f) null);
    }

    public t d() {
        this.f64566c = true;
        return this;
    }

    public t a() {
        this.f64565b.b();
        return this;
    }

    public t a(float f6, float f10, @ColorInt int i10) {
        this.f64565b.a(f6, f10, i10);
        return this;
    }

    public t a(int i10, int i11) {
        this.f64565b.a(i10, i11);
        return this;
    }

    public t a(o.c cVar) {
        this.f64565b.a(cVar);
        return this;
    }

    public t a(s.b bVar, s.b... bVarArr) {
        this.f64565b.a(bVar, bVarArr);
        return this;
    }

    public void a(ImageView imageView) {
        a(imageView, (f) null);
    }

    public void a(ImageView imageView, f fVar) {
        Bitmap bitmapA;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("TODO");
        }
        if (!this.f64565b.d()) {
            this.f64565b.a(o.c.HIGH);
        }
        if (this.f64566c) {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                this.f64564a.a(imageView, new g(this, imageView, fVar));
                return;
            }
            this.f64565b.a(width, height);
        }
        s sVarA = a(System.nanoTime());
        if (!s.b.a(sVarA.f64540d) || (bitmapA = this.f64564a.a(sVarA.f64538b)) == null) {
            this.f64564a.a((a) new p(this.f64564a, new v(imageView), sVarA, fVar));
            return;
        }
        u.b bVar = new u.b(bitmapA, o.b.MEMORY);
        l.a(imageView, this.f64564a.f64514a, bVar);
        com.salesforce.marketingcloud.g.a("IMAGE", "onSuccess - Loaded from: %s", bVar.c());
        if (fVar != null) {
            fVar.a();
        }
    }

    public void a(f fVar) {
        long jNanoTime = System.nanoTime();
        if (!this.f64565b.d()) {
            this.f64565b.a(o.c.NORMAL);
        }
        s sVarA = a(jNanoTime);
        if (!s.b.a(sVarA.f64540d) || this.f64564a.a(sVarA.f64538b) == null) {
            this.f64564a.a((a) new j(this.f64564a, sVarA, fVar));
        } else {
            com.salesforce.marketingcloud.g.a("IMAGE", "onSuccess - Loaded from: MEMORY", new Object[0]);
            if (fVar != null) {
                fVar.a();
            }
        }
    }
}
