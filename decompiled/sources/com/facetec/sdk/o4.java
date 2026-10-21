package com.facetec.sdk;

import android.view.View;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42744p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ be f42745q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f42746r0;

    public /* synthetic */ o4(be beVar, Object obj, int i10) {
        this.f42744p0 = i10;
        this.f42745q0 = beVar;
        this.f42746r0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42744p0;
        be beVar = this.f42745q0;
        Object obj = this.f42746r0;
        switch (i10) {
            case 0:
                beVar.c((Runnable) obj);
                break;
            default:
                beVar.b((View) obj);
                break;
        }
    }
}
