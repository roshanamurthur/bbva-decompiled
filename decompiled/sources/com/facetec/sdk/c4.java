package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40781p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f40782q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f40783r0;

    public /* synthetic */ c4(Object obj, Object obj2, int i10) {
        this.f40781p0 = i10;
        this.f40782q0 = obj;
        this.f40783r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f40781p0;
        Object obj = this.f40783r0;
        Object obj2 = this.f40782q0;
        switch (i10) {
            case 0:
                ((be) obj2).e((Runnable) obj);
                break;
            default:
                ((cc) obj2).b((Context) obj);
                break;
        }
    }
}
