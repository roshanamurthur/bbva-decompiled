package com.facetec.sdk;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42814p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42815q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f42816r0;

    public /* synthetic */ s0(Object obj, Object obj2, int i10) {
        this.f42814p0 = i10;
        this.f42815q0 = obj;
        this.f42816r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f42814p0;
        Object obj = this.f42816r0;
        Object obj2 = this.f42815q0;
        switch (i10) {
            case 0:
                ((al) obj2).U_((ViewGroup) obj);
                break;
            case 1:
                ((cz) obj2).c((aq.b) obj);
                break;
            default:
                ((bj) obj2).e((View) obj);
                break;
        }
    }
}
