package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final View f44841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final View f44842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f44843c = new float[2];

    public FadeThroughUpdateListener(@Nullable View view, @Nullable View view2) {
        this.f44841a = view;
        this.f44842b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f44843c;
        b.a(fFloatValue, fArr);
        View view = this.f44841a;
        if (view != null) {
            view.setAlpha(fArr[0]);
        }
        View view2 = this.f44842b;
        if (view2 != null) {
            view2.setAlpha(fArr[1]);
        }
    }
}
