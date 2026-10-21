package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40443p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f40444q0;

    public /* synthetic */ b1(Object obj, int i10) {
        this.f40443p0 = i10;
        this.f40444q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f40443p0;
        Object obj = this.f40444q0;
        switch (i10) {
            case 0:
                ((al) obj).v();
                break;
            case 1:
                ((be) obj).aS();
                break;
            case 2:
                ((bt) obj).m();
                break;
            case 3:
                t.b((Context) obj);
                break;
            case 4:
                ((az) obj).p();
                break;
            case 5:
                ((bj) obj).a();
                break;
            case 6:
                ((bo) obj).z();
                break;
            case 7:
                ((bz) obj).a();
                break;
            default:
                ((co) obj).h();
                break;
        }
    }
}
