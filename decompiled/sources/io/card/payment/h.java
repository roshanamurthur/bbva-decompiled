package io.card.payment;

import android.graphics.Canvas;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: Preview.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h extends ViewGroup {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69789p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f69790q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SurfaceView f69791r0;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (!z10 || getChildCount() <= 0) {
            return;
        }
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = this.f69790q0;
        int i17 = i14 * i16;
        int i18 = this.f69789p0;
        int i19 = i15 * i18;
        SurfaceView surfaceView = this.f69791r0;
        if (i17 > i19) {
            int i20 = (i18 * i15) / i16;
            surfaceView.layout((i14 - i20) / 2, 0, (i14 + i20) / 2, i15);
        } else {
            int i21 = (i16 * i14) / i18;
            surfaceView.layout(0, (i15 - i21) / 2, i14, (i15 + i21) / 2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int iResolveSize = View.resolveSize(getSuggestedMinimumWidth(), i10);
        int iResolveSize2 = View.resolveSize(getSuggestedMinimumHeight(), i11);
        String.format("Preview.onMeasure(w:%d, h:%d) setMeasuredDimension(w:%d, h:%d)", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(iResolveSize), Integer.valueOf(iResolveSize2));
        setMeasuredDimension(iResolveSize, iResolveSize2);
    }
}
