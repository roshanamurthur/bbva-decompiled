package com.salesforce.marketingcloud.media;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final o f64465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d f64466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h f64467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Exception f64468d;

    public e(h hVar, d dVar) {
        this.f64465a = dVar.c();
        this.f64467c = hVar;
        this.f64466b = dVar;
    }

    public Exception a() {
        return this.f64468d;
    }

    public boolean b() {
        return this.f64468d != null;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                Thread.currentThread().setName("CacheCleaner - Cleaning");
                r rVarA = this.f64466b.a();
                Iterator<String> it = this.f64466b.d().iterator();
                while (it.hasNext()) {
                    rVarA.b(it.next());
                }
                rVarA.a();
            } catch (Exception e5) {
                this.f64468d = e5;
            }
            Thread.currentThread().setName("CacheCleaner - Idle");
            this.f64467c.a(this);
        } catch (Throwable th2) {
            Thread.currentThread().setName("CacheCleaner - Idle");
            throw th2;
        }
    }
}
