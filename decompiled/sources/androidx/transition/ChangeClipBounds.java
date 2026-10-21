package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h3.j;
import h3.n;
import h3.r;

/* JADX INFO: loaded from: classes2.dex */
public class ChangeClipBounds extends Transition {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String[] f23572j1 = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final Rect f23573k1 = new Rect();

    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f23574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f23575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f23576c;

        public a(View view, Rect rect, Rect rect2) {
            this.f23576c = view;
            this.f23574a = rect;
            this.f23575b = rect2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(@NonNull Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(@NonNull Transition transition) {
            View view = this.f23576c;
            Rect clipBounds = view.getClipBounds();
            if (clipBounds == null) {
                clipBounds = ChangeClipBounds.f23573k1;
            }
            view.setTag(R.id.transition_clip, clipBounds);
            view.setClipBounds(this.f23575b);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(@NonNull Transition transition) {
            int i10 = R.id.transition_clip;
            View view = this.f23576c;
            view.setClipBounds((Rect) view.getTag(i10));
            view.setTag(i10, null);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(@NonNull Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            View view = this.f23576c;
            if (z10) {
                view.setClipBounds(this.f23574a);
            } else {
                view.setClipBounds(this.f23575b);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionEnd(Transition transition, boolean z10) {
            n.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final /* synthetic */ void onTransitionStart(Transition transition, boolean z10) {
            n.b(this, transition, z10);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(@NonNull Transition transition) {
        }
    }

    public ChangeClipBounds() {
    }

    public static void q(TransitionValues transitionValues, boolean z10) {
        View view = transitionValues.view;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z10 ? (Rect) view.getTag(R.id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f23573k1 ? clipBounds : null;
        transitionValues.values.put("android:clipBounds:clip", rect);
        if (rect == null) {
            transitionValues.values.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        q(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null || !transitionValues.values.containsKey("android:clipBounds:clip") || !transitionValues2.values.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) transitionValues.values.get("android:clipBounds:clip");
        Rect rect2 = (Rect) transitionValues2.values.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) transitionValues.values.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) transitionValues2.values.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        transitionValues2.view.setClipBounds(rect);
        Rect rect5 = new Rect();
        j jVar = new j();
        jVar.f69314a = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(transitionValues2.view, r.f69341c, jVar, rect3, rect4);
        a aVar = new a(transitionValues2.view, rect, rect2);
        objectAnimatorOfObject.addListener(aVar);
        addListener(aVar);
        return objectAnimatorOfObject;
    }

    @Override // androidx.transition.Transition
    @NonNull
    public String[] getTransitionProperties() {
        return f23572j1;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    public ChangeClipBounds(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
