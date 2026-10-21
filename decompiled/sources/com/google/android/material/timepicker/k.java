package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: compiled from: TimePickerView.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TimePickerView f45802a;

    public k(TimePickerView timePickerView) {
        this.f45802a = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView.b bVar = this.f45802a.f45766w0;
        if (bVar == null) {
            return false;
        }
        bVar.onDoubleTap();
        return true;
    }
}
