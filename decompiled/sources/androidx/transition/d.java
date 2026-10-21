package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h3.n;

/* JADX INFO: compiled from: TranslationAnimationCreator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: compiled from: TranslationAnimationCreator.java */
    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f23745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f23746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f23747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f23748d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f23749e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f23750f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f23751g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f23752h;

        public a(View view, View view2, float f6, float f10) {
            this.f23746b = view;
            this.f23745a = view2;
            this.f23750f = f6;
            this.f23751g = f10;
            int i10 = R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i10);
            this.f23747c = iArr;
            if (iArr != null) {
                view2.setTag(i10, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f23752h = true;
            float f6 = this.f23750f;
            View view = this.f23746b;
            view.setTranslationX(f6);
            view.setTranslationY(this.f23751g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            float f6 = this.f23750f;
            View view = this.f23746b;
            view.setTranslationX(f6);
            view.setTranslationY(this.f23751g);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
            this.f23752h = true;
            float f6 = this.f23750f;
            View view = this.f23746b;
            view.setTranslationX(f6);
            view.setTranslationY(this.f23751g);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition, boolean z10) {
            if (this.f23752h) {
                return;
            }
            this.f23745a.setTag(R.id.transition_position, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            if (this.f23747c == null) {
                this.f23747c = new int[2];
            }
            int[] iArr = this.f23747c;
            View view = this.f23746b;
            view.getLocationOnScreen(iArr);
            this.f23745a.setTag(R.id.transition_position, this.f23747c);
            this.f23748d = view.getTranslationX();
            this.f23749e = view.getTranslationY();
            view.setTranslationX(this.f23750f);
            view.setTranslationY(this.f23751g);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            float f6 = this.f23748d;
            View view = this.f23746b;
            view.setTranslationX(f6);
            view.setTranslationY(this.f23749e);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NonNull Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
            onTransitionEnd(transition, false);
        }
    }

    @Nullable
    public static ObjectAnimator a(@NonNull View view, @NonNull TransitionValues transitionValues, int i10, int i11, float f6, float f10, float f11, float f12, @Nullable BaseInterpolator baseInterpolator, @NonNull Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transition_position);
        if (iArr != null) {
            f6 = (iArr[0] - i10) + translationX;
            f10 = (iArr[1] - i11) + translationY;
        }
        view.setTranslationX(f6);
        view.setTranslationY(f10);
        if (f6 == f11 && f10 == f12) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f6, f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f10, f12));
        a aVar = new a(view, transitionValues.view, translationX, translationY);
        transition.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
