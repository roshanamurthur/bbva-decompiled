package com.facetec.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
final class j extends SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41881b;

    public j(Context context) {
        this(context, null);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = this.f41881b;
        if (i13 == 0 || (i12 = this.f41880a) == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (i12 * size) / i13);
        }
    }

    public final void setAspectRatio(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f41881b = i10;
        this.f41880a = i11;
        requestLayout();
    }

    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f41881b = 0;
        this.f41880a = 0;
    }
}
