package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41874p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41875q0;

    public /* synthetic */ i4(Object obj, int i10) {
        this.f41874p0 = i10;
        this.f41875q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41874p0;
        Object obj = this.f41875q0;
        switch (i10) {
            case 0:
                ((be) obj).ap();
                break;
            case 1:
                ((cc) obj).Y();
                break;
            case 2:
                bs.n((Context) obj);
                break;
            default:
                ((cn) obj).H();
                break;
        }
    }
}
