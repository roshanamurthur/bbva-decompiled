package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import qe.f;
import qe.g;

/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(21)
public final class FadeThroughProvider implements VisibilityAnimatorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f45918a = 0.35f;

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        float f6 = this.f45918a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new f(view, 0.0f, alpha, f6, 1.0f));
        valueAnimatorOfFloat.addListener(new g(alpha, view));
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        float f6 = this.f45918a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new f(view, alpha, 0.0f, 0.0f, f6));
        valueAnimatorOfFloat.addListener(new g(alpha, view));
        return valueAnimatorOfFloat;
    }

    public float getProgressThreshold() {
        return this.f45918a;
    }

    public void setProgressThreshold(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        this.f45918a = f6;
    }
}
