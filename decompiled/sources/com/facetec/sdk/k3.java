package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41970p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41971q0;

    public /* synthetic */ k3(Object obj, int i10) {
        this.f41970p0 = i10;
        this.f41971q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41970p0;
        Object obj = this.f41971q0;
        switch (i10) {
            case 0:
                ((be) obj).aB();
                break;
            case 1:
                bg.r((Context) obj);
                break;
            case 2:
                ((bm) obj).c();
                break;
            case 3:
                ((bt) obj).y();
                break;
            case 4:
                ((cc) obj).ab();
                break;
            case 5:
                ((az) obj).l();
                break;
            case 6:
                ((bj) obj).R();
                break;
            case 7:
                ((bz) obj).g();
                break;
            default:
                ((cn) obj).v();
                break;
        }
    }
}
