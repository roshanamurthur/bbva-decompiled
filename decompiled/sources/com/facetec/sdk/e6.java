package com.facetec.sdk;

import android.animation.AnimatorSet;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e6 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41457p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41458q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f41459r0;

    public /* synthetic */ e6(Object obj, Object obj2, int i10) {
        this.f41457p0 = i10;
        this.f41458q0 = obj;
        this.f41459r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41457p0;
        Object obj = this.f41459r0;
        Object obj2 = this.f41458q0;
        switch (i10) {
            case 0:
                ((bv) obj2).e((bv) obj);
                break;
            default:
                ((cs) obj2).br_((AnimatorSet) obj);
                break;
        }
    }
}
