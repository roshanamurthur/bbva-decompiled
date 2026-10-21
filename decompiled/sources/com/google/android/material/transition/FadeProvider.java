package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import pe.d;
import pe.e;

/* JADX INFO: loaded from: classes10.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45840a = 1.0f;

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        float f6 = this.f45840a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(view, 0.0f, alpha, f6));
        valueAnimatorOfFloat.addListener(new e(alpha, view));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d(view, alpha, 0.0f, 1.0f));
        valueAnimatorOfFloat.addListener(new e(alpha, view));
        return valueAnimatorOfFloat;
    }

    public float getIncomingEndThreshold() {
        return this.f45840a;
    }

    public void setIncomingEndThreshold(float f6) {
        this.f45840a = f6;
    }
}
