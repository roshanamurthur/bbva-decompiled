package com.facetec.sdk;

import android.animation.Animator;

/* JADX INFO: loaded from: classes9.dex */
@FunctionalInterface
interface b extends Animator.AnimatorListener {
    @Override // android.animation.Animator.AnimatorListener
    void onAnimationCancel(Animator animator);

    @Override // android.animation.Animator.AnimatorListener
    void onAnimationRepeat(Animator animator);

    @Override // android.animation.Animator.AnimatorListener
    void onAnimationStart(Animator animator);
}
