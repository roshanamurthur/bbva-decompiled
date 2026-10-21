package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41868p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41869q0;

    public /* synthetic */ i1(Object obj, int i10) {
        this.f41868p0 = i10;
        this.f41869q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f41868p0;
        Object obj = this.f41869q0;
        switch (i10) {
            case 0:
                av.e((Context) obj);
                break;
            case 1:
                ((be) obj).aH();
                break;
            case 2:
                ((bv) obj).d();
                break;
            case 3:
                ((cs) obj).c();
                break;
            case 4:
                ((GuidanceCenterContentFragment) obj).c();
                break;
            case 5:
                ((bo) obj).B();
                break;
            default:
                ((c) obj).b();
                break;
        }
    }
}
