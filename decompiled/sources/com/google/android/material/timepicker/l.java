package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: compiled from: TimePickerView.java */
/* JADX INFO: loaded from: classes10.dex */
public final class l implements View.OnTouchListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GestureDetector f45803p0;

    public l(GestureDetector gestureDetector) {
        this.f45803p0 = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f45803p0.onTouchEvent(motionEvent);
        }
        return false;
    }
}
