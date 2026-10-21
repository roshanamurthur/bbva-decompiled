package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u2 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42896p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42897q0;

    public /* synthetic */ u2(Object obj, int i10) {
        this.f42896p0 = i10;
        this.f42897q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42896p0;
        Object obj = this.f42897q0;
        switch (i10) {
            case 0:
                ((be) obj).as();
                break;
            case 1:
                ((bt) obj).f();
                break;
            case 2:
                ((bz.AnonymousClass1) obj).c();
                break;
            case 3:
                cc.d((Context) obj);
                break;
            case 4:
                ((az) obj).q();
                break;
            case 5:
                ((bj) obj).l();
                break;
            case 6:
                ((bo) obj).w();
                break;
            default:
                ((co) obj).o();
                break;
        }
    }
}
