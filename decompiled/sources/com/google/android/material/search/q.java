package com.google.android.material.search;

import android.animation.ValueAnimator;
import com.google.android.material.internal.FadeThroughDrawable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45178b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f45177a = i10;
        this.f45178b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f45177a;
        Object obj = this.f45178b;
        switch (i10) {
            case 0:
                ((FadeThroughDrawable) obj).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                com.google.android.material.textfield.l lVar = (com.google.android.material.textfield.l) obj;
                lVar.getClass();
                lVar.f45662d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
