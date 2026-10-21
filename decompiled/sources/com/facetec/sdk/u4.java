package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42900p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42901q0;

    public /* synthetic */ u4(Object obj, int i10) {
        this.f42900p0 = i10;
        this.f42901q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42900p0;
        Object obj = this.f42901q0;
        switch (i10) {
            case 0:
                bg.q((Context) obj);
                break;
            case 1:
                ((bt) obj).o();
                break;
            case 2:
                ((cc) obj).aa();
                break;
            case 3:
                ((az) obj).k();
                break;
            case 4:
                ((bz) obj).h();
                break;
            case 5:
                ((cn) obj).A();
                break;
            case 6:
                ((co) obj).l();
                break;
            default:
                ((cz) obj).a();
                break;
        }
    }
}
