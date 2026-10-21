package com.facetec.sdk;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c6 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f40787q0;

    public /* synthetic */ c6(Object obj, int i10) {
        this.f40786p0 = i10;
        this.f40787q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f40786p0;
        Object obj = this.f40787q0;
        switch (i10) {
            case 0:
                ((bt.AnonymousClass4) obj).e();
                break;
            default:
                ((GuidanceCenterContentFragment) obj).a();
                break;
        }
    }
}
