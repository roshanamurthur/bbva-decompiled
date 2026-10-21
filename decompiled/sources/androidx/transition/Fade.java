package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import h3.k;
import h3.n;
import h3.r;

/* JADX INFO: loaded from: classes2.dex */
public class Fade extends Visibility {
    public static final int IN = 1;
    public static final int OUT = 2;

    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f23620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23621b = false;

        public a(View view) {
            this.f23620a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            r.b(this.f23620a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f23620a;
            if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                this.f23621b = true;
                view.setLayerType(2, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            View view = this.f23620a;
            view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? r.f69339a.a(view) : 0.0f));
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            this.f23620a.setTag(R.id.transition_pause_alpha, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            boolean z11 = this.f23621b;
            View view = this.f23620a;
            if (z11) {
                view.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            r.b(view, 1.0f);
            r.f69339a.getClass();
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition, boolean z10) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
        }
    }

    public Fade(int i10) {
        setMode(i10);
    }

    public static float t(TransitionValues transitionValues, float f6) {
        Float f10;
        return (transitionValues == null || (f10 = (Float) transitionValues.values.get("android:fade:transitionAlpha")) == null) ? f6 : f10.floatValue();
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        Float fValueOf = (Float) transitionValues.view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            if (transitionValues.view.getVisibility() == 0) {
                fValueOf = Float.valueOf(r.f69339a.a(transitionValues.view));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        transitionValues.values.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        r.f69339a.getClass();
        return s(view, t(transitionValues, 0.0f), 1.0f);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        r.f69339a.getClass();
        ObjectAnimator objectAnimatorS = s(view, t(transitionValues, 1.0f), 0.0f);
        if (objectAnimatorS == null) {
            r.b(view, t(transitionValues2, 1.0f));
        }
        return objectAnimatorS;
    }

    public final ObjectAnimator s(View view, float f6, float f10) {
        if (f6 == f10) {
            return null;
        }
        r.b(view, f6);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, r.f69340b, f10);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        getRootTransition().addListener(aVar);
        return objectAnimatorOfFloat;
    }

    public Fade() {
    }

    public Fade(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69320f);
        setMode(TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, getMode()));
        typedArrayObtainStyledAttributes.recycle();
    }
}
