package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n6 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42660p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42661q0;

    public /* synthetic */ n6(Object obj, int i10) {
        this.f42660p0 = i10;
        this.f42661q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42660p0;
        Object obj = this.f42661q0;
        switch (i10) {
            case 0:
                ((cc) obj).I();
                break;
            case 1:
                dn.a((Context) obj);
                break;
            case 2:
                ((bo) obj).D();
                break;
            default:
                ((cn) obj).I();
                break;
        }
    }
}
