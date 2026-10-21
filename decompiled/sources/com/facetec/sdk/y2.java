package com.facetec.sdk;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f42990p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f42991q0;

    public /* synthetic */ y2(Object obj, int i10) {
        this.f42990p0 = i10;
        this.f42991q0 = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f42990p0;
        Object obj = this.f42991q0;
        switch (i10) {
            case 0:
                return ((be) obj).ar_(view, motionEvent);
            default:
                return ((co) obj).bi_(view, motionEvent);
        }
    }
}
