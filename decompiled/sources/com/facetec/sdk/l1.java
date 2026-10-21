package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42237p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42238q0;

    public /* synthetic */ l1(Object obj, int i10) {
        this.f42237p0 = i10;
        this.f42238q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42237p0;
        Object obj = this.f42238q0;
        switch (i10) {
            case 0:
                az.g((bh) obj);
                break;
            case 1:
                ((cz.AnonymousClass3) obj).a();
                break;
            case 2:
                ((bj) obj).G();
                break;
            case 3:
                bn.a((Context) obj);
                break;
            case 4:
                ((bz) obj).f();
                break;
            default:
                ((cn) obj).B();
                break;
        }
    }
}
