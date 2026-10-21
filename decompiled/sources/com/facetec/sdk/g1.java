package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41731p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41732q0;

    public /* synthetic */ g1(Object obj, int i10) {
        this.f41731p0 = i10;
        this.f41732q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41731p0;
        Object obj = this.f41732q0;
        switch (i10) {
            case 0:
                as.f((Context) obj);
                break;
            case 1:
                ((ba) obj).D();
                break;
            case 2:
                ((cm) obj).a();
                break;
            case 3:
                ((bj) obj).u();
                break;
            default:
                ((c) obj).c();
                break;
        }
    }
}
