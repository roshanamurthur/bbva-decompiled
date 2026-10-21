package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lb implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42249d;

    public lb(String str, Object... objArr) {
        this.f42249d = kz.e(str, objArr);
    }

    public abstract void d();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f42249d);
        try {
            d();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
