package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h3 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41854p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41855q0;

    public /* synthetic */ h3(Object obj, int i10) {
        this.f41854p0 = i10;
        this.f41855q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41854p0;
        Object obj = this.f41855q0;
        switch (i10) {
            case 0:
                ((be) obj).ai();
                break;
            case 1:
                bg.s((Context) obj);
                break;
            case 2:
                ((bt) obj).n();
                break;
            case 3:
                ((cc) obj).y();
                break;
            case 4:
                ((az) obj).o();
                break;
            case 5:
                ((bj) obj).y();
                break;
            case 6:
                ((cn) obj).u();
                break;
            case 7:
                ((co) obj).n();
                break;
            default:
                ((cz) obj).b();
                break;
        }
    }
}
