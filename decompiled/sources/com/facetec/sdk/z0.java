package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f43011p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f43012q0;

    public /* synthetic */ z0(Object obj, int i10) {
        this.f43011p0 = i10;
        this.f43012q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43011p0;
        Object obj = this.f43012q0;
        switch (i10) {
            case 0:
                ((al) obj).x();
                break;
            case 1:
                ((be) obj).aw();
                break;
            case 2:
                bg.q((Context) obj);
                break;
            case 3:
                ((bz) obj).j();
                break;
            default:
                ((cn) obj).C();
                break;
        }
    }
}
