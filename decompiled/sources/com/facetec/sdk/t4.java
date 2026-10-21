package com.facetec.sdk;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t4 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42868p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f42869q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f42870r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f42871s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Object f42872t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Object f42873u0;

    public /* synthetic */ t4(n nVar, t.b bVar, Context context, ArrayList arrayList) {
        this.f42868p0 = 1;
        this.f42871s0 = nVar;
        this.f42872t0 = bVar;
        this.f42869q0 = context;
        this.f42870r0 = null;
        this.f42873u0 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj = this.f42872t0;
        int i10 = this.f42868p0;
        String str = this.f42870r0;
        Context context = this.f42869q0;
        Object obj2 = this.f42873u0;
        Object obj3 = this.f42871s0;
        switch (i10) {
            case 0:
                bg.e(str, context, (FaceTecSDK.InitializeCallback) obj2, (String) obj3, (String) obj);
                break;
            default:
                ((n) obj3).d((t.b) obj, context, str, (ArrayList) obj2);
                break;
        }
    }

    public /* synthetic */ t4(String str, Context context, FaceTecSDK.InitializeCallback initializeCallback, String str2, String str3) {
        this.f42868p0 = 0;
        this.f42870r0 = str;
        this.f42869q0 = context;
        this.f42873u0 = initializeCallback;
        this.f42871s0 = str2;
        this.f42872t0 = str3;
    }
}
