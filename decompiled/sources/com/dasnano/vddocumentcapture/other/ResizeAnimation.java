package com.dasnano.vddocumentcapture.other;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.e;

/* JADX INFO: loaded from: classes9.dex */
public class ResizeAnimation extends Animation {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f39486p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TextView f39487q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final float f39488r0;

    public ResizeAnimation(TextView textView, float f6, float f10) {
        this.f39487q0 = textView;
        this.f39486p0 = f6;
        this.f39488r0 = f10;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f6, Transformation transformation) {
        float f10 = this.f39486p0;
        float f11 = this.f39488r0;
        float fA = e.a(f10, f11, f6, f11);
        TextView textView = this.f39487q0;
        textView.setTextSize(fA);
        textView.requestLayout();
    }

    @Override // android.view.animation.Animation
    public void finalize() throws Throwable {
        super.finalize();
    }

    @Override // android.view.animation.Animation
    public void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
