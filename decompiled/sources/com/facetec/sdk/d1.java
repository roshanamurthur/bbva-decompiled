package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41131p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41132q0;

    public /* synthetic */ d1(Object obj, int i10) {
        this.f41131p0 = i10;
        this.f41132q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41131p0;
        Object obj = this.f41132q0;
        switch (i10) {
            case 0:
                ((al) obj).y();
                break;
            case 1:
                az.d((bh) obj);
                break;
            case 2:
                ((be) obj).az();
                break;
            case 3:
                bg.p((Context) obj);
                break;
            case 4:
                ((bt) obj).s();
                break;
            case 5:
                ((bz.AnonymousClass3) obj).d();
                break;
            case 6:
                ((cc) obj).Z();
                break;
            case 7:
                ((bj) obj).r();
                break;
            default:
                ((bo) obj).u();
                break;
        }
    }
}
