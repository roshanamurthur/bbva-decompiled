package com.google.android.material.dialog;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class InsetDialogOnTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final Dialog f44611p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f44612q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f44613r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f44614s0;

    public InsetDialogOnTouchListener(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.f44611p0 = dialog;
        this.f44612q0 = rect.left;
        this.f44613r0 = rect.top;
        this.f44614s0 = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f44612q0;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f44613r0;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f44614s0;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f44611p0.onTouchEvent(motionEventObtain);
    }
}
