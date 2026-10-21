package com.facetec.sdk;

import android.content.Context;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42960p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f42961q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f42962r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f42963s0;

    public /* synthetic */ x4(e eVar, ec ecVar, Context context) {
        this.f42962r0 = eVar;
        this.f42963s0 = ecVar;
        this.f42961q0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj = this.f42962r0;
        int i10 = this.f42960p0;
        Context context = this.f42961q0;
        Object obj2 = this.f42963s0;
        switch (i10) {
            case 0:
                bg.a((String) obj, context, (FaceTecSDK.InitializeCallback) obj2);
                break;
            default:
                t.c((e) obj, (ec) obj2, context);
                break;
        }
    }

    public /* synthetic */ x4(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback) {
        this.f42962r0 = str;
        this.f42961q0 = context;
        this.f42963s0 = initializeCallback;
    }
}
