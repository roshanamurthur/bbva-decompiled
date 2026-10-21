package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public AnimatorSet f45821q0;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f45821q0 = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @NonNull
    public abstract AnimatorSet onCreateExpandedStateChangeAnimation(View view, View view2, boolean z10, boolean z11);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public boolean onExpandedStateChange(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f45821q0;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetOnCreateExpandedStateChangeAnimation = onCreateExpandedStateChangeAnimation(view, view2, z10, z12);
        this.f45821q0 = animatorSetOnCreateExpandedStateChangeAnimation;
        animatorSetOnCreateExpandedStateChangeAnimation.addListener(new a());
        this.f45821q0.start();
        if (!z11) {
            this.f45821q0.end();
        }
        return true;
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
