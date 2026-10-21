package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f45460a;

    public c(BaseTransientBottomBar baseTransientBottomBar) {
        this.f45460a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BaseTransientBottomBar baseTransientBottomBar = this.f45460a;
        baseTransientBottomBar.view.setScaleX(fFloatValue);
        baseTransientBottomBar.view.setScaleY(fFloatValue);
    }
}
