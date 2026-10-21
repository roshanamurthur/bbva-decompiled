package com.facetec.sdk;

/* JADX INFO: loaded from: classes9.dex */
class ah {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ boolean f40250d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f40251a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f40252b = false;

    public final void e(boolean z10) {
        synchronized (this.f40251a) {
            try {
                if (this.f40252b != z10) {
                    this.f40252b = z10;
                    this.f40251a.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
