package com.facetec.sdk;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f41848p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f41849q0;

    public /* synthetic */ h0(Object obj, int i10) {
        this.f41848p0 = i10;
        this.f41849q0 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f41848p0;
        Object obj = this.f41849q0;
        switch (i10) {
            case 0:
                return ((a) obj).k_(view, motionEvent);
            default:
                return ((bj) obj).aJ_(view, motionEvent);
        }
    }
}
