package com.facetec.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
final class g extends TextureView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41728c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f41729e;

    public g(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i13 = this.f41728c;
        if (i13 == 0 || (i12 = this.f41729e) == 0) {
            setMeasuredDimension(size, size2);
        } else {
            setMeasuredDimension(size, (i12 * size) / i13);
        }
    }

    public final void setAspectRatio(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Size cannot be negative.");
        }
        this.f41728c = i10;
        this.f41729e = i11;
        requestLayout();
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f41728c = 0;
        this.f41729e = 0;
    }
}
