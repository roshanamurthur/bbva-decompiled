package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import qe.d;
import qe.e;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45917a = 1.0f;

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        float f6 = this.f45917a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(view, 0.0f, alpha, f6));
        valueAnimatorOfFloat.addListener(new e(alpha, view));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(view, alpha, 0.0f, 1.0f));
        valueAnimatorOfFloat.addListener(new e(alpha, view));
        return valueAnimatorOfFloat;
    }

    public float getIncomingEndThreshold() {
        return this.f45917a;
    }

    public void setIncomingEndThreshold(float f6) {
        this.f45917a = f6;
    }
}
