package de;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f68170a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f68170a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        MaterialShapeDrawable materialShapeDrawable = this.f68170a.f44089y0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(fFloatValue);
        }
    }
}
