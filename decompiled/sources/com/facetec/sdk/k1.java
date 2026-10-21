package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41966p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41967q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f41968r0;

    public /* synthetic */ k1(Object obj, Object obj2, int i10) {
        this.f41966p0 = i10;
        this.f41967q0 = obj;
        this.f41968r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f41966p0;
        Object obj = this.f41968r0;
        Object obj2 = this.f41967q0;
        switch (i10) {
            case 0:
                ((az) obj2).a((bh) obj);
                break;
            case 1:
                ((be) obj2).i((FaceTecIDScanNextStep) obj);
                break;
            case 2:
                ((cc) obj2).c((byte[]) obj);
                break;
            case 3:
                ((cz) obj2).a((aq.b) obj);
                break;
            default:
                t.e((Context) obj2, (m) obj);
                break;
        }
    }
}
