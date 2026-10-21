package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public static final long COLLAPSE_DELAY = 0;
    public static final long COLLAPSE_DURATION = 150;
    public static final long EXPAND_DELAY = 75;
    public static final long EXPAND_DURATION = 150;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final MotionTiming f45831r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final MotionTiming f45832s0;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f45833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f45834b;

        public a(boolean z10, View view) {
            this.f45833a = z10;
            this.f45834b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f45833a) {
                return;
            }
            this.f45834b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f45833a) {
                this.f45834b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f45831r0 = new MotionTiming(75L, 150L);
        this.f45832s0 = new MotionTiming(0L, 150L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public AnimatorSet onCreateExpandedStateChangeAnimation(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        MotionTiming motionTiming = z10 ? this.f45831r0 : this.f45832s0;
        if (z10) {
            if (!z11) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        motionTiming.apply(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45831r0 = new MotionTiming(75L, 150L);
        this.f45832s0 = new MotionTiming(0L, 150L);
    }
}
