package com.veridas.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.veridas.camera.resolution.Resolution;

/* JADX INFO: loaded from: classes9.dex */
public class AutoFitTextureView extends TextureView implements AutoFitView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final AutoFitView.DefaultAutoFitView f66673p0;

    public AutoFitTextureView(Context context) {
        super(context);
        this.f66673p0 = new AutoFitView.DefaultAutoFitView();
    }

    @Override // com.veridas.camera.view.AutoFitView
    public Resolution getResolution() {
        return this.f66673p0.getResolution();
    }

    @Override // com.veridas.camera.view.AutoFitView
    public float getScale() {
        return this.f66673p0.getScale();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Resolution resolutionFit = this.f66673p0.fit(Resolution.create(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)));
        setMeasuredDimension(resolutionFit.width, resolutionFit.height);
    }

    @Override // com.veridas.camera.view.AutoFitView
    public void setResolution(Resolution resolution) {
        this.f66673p0.setResolution(resolution);
        requestLayout();
    }

    @Override // com.veridas.camera.view.AutoFitView
    public void setScale(float f6) {
        this.f66673p0.setScale(f6);
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66673p0 = new AutoFitView.DefaultAutoFitView();
    }

    public AutoFitTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f66673p0 = new AutoFitView.DefaultAutoFitView();
    }
}
