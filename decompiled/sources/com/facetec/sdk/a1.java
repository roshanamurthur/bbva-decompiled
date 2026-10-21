package com.facetec.sdk;

import android.content.Context;
import android.graphics.Rect;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f40180p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f40181q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f40182r0;

    public /* synthetic */ a1(Object obj, Object obj2, int i10) {
        this.f40180p0 = i10;
        this.f40181q0 = obj;
        this.f40182r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f40180p0;
        Object obj = this.f40182r0;
        Object obj2 = this.f40181q0;
        switch (i10) {
            case 0:
                ((al) obj2).T_((Rect) obj);
                break;
            case 1:
                ((bt) obj2).c((String) obj);
                break;
            case 2:
                t.e((Context) obj2, (m) obj);
                break;
            default:
                ((co) obj2).c((Runnable) obj);
                break;
        }
    }
}
