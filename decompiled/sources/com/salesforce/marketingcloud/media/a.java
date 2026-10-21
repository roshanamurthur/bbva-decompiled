package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f64444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final WeakReference<T> f64445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final v<T> f64446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f64447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f64448e;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.media.a$a, reason: collision with other inner class name */
    public static class C0257a<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f64449a;

        public C0257a(a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f64449a = aVar;
        }
    }

    public a(o oVar, v<T> vVar, s sVar) {
        this.f64447d = oVar;
        this.f64444a = sVar;
        if (vVar == null) {
            this.f64445b = null;
        } else {
            this.f64445b = new C0257a(this, vVar.f64570a, oVar.f64521h);
            vVar.f64570a = null;
        }
        this.f64446c = vVar;
    }

    public void a() {
        this.f64448e = true;
    }

    public abstract void a(u.b bVar);

    public abstract void a(Exception exc);

    public o b() {
        return this.f64447d;
    }

    public String c() {
        return this.f64444a.f64538b;
    }

    public o.c d() {
        return this.f64444a.f64539c;
    }

    public s e() {
        return this.f64444a;
    }

    public T f() {
        WeakReference<T> weakReference = this.f64445b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean g() {
        return this.f64448e;
    }
}
