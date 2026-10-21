package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b6 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40453p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f40454q0;

    public /* synthetic */ b6(Object obj, int i10) {
        this.f40453p0 = i10;
        this.f40454q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f40453p0;
        Object obj = this.f40454q0;
        switch (i10) {
            case 0:
                ((bt) obj).r();
                break;
            case 1:
                ch.a((Context) obj);
                break;
            case 2:
                ((bj) obj).C();
                break;
            case 3:
                ((bo) obj).y();
                break;
            default:
                ((co) obj).k();
                break;
        }
    }
}
