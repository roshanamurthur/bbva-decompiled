package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41529p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41530q0;

    public /* synthetic */ f1(Object obj, int i10) {
        this.f41529p0 = i10;
        this.f41530q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41529p0;
        Object obj = this.f41530q0;
        switch (i10) {
            case 0:
                ap.b((Context) obj);
                break;
            case 1:
                ((ba) obj).y();
                break;
            case 2:
                ((bz.AnonymousClass4) obj).d();
                break;
            case 3:
                ((cm) obj).b();
                break;
            case 4:
                ((co.AnonymousClass2) obj).c();
                break;
            case 5:
                ((bj) obj).B();
                break;
            case 6:
                ((bo) obj).v();
                break;
            default:
                ((co) obj).j();
                break;
        }
    }
}
