package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewPropertyAnimatorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f20278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f20279b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f20280c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f20281d = -1;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimatorListener f20282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f20283b;

        public a(ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            this.f20282a = viewPropertyAnimatorListener;
            this.f20283b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f20282a.onAnimationCancel(this.f20283b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f20282a.onAnimationEnd(this.f20283b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.f20282a.onAnimationStart(this.f20283b);
        }
    }

    @RequiresApi(16)
    public static class b {
        @DoNotInline
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @DoNotInline
        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @DoNotInline
        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    @RequiresApi(18)
    public static class c {
        @DoNotInline
        public static Interpolator a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    @RequiresApi(19)
    public static class d {
        @DoNotInline
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    @RequiresApi(21)
    public static class e {
        @DoNotInline
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.translationZ(f6);
        }

        @DoNotInline
        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.translationZBy(f6);
        }

        @DoNotInline
        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.z(f6);
        }

        @DoNotInline
        public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.zBy(f6);
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f20278a = new WeakReference<>(view);
    }

    private void a(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new a(viewPropertyAnimatorListener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat alpha(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat alphaBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().alphaBy(f6);
        }
        return this;
    }

    public void cancel() {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long getDuration() {
        View view = this.f20278a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @Nullable
    public Interpolator getInterpolator() {
        View view = this.f20278a.get();
        if (view != null) {
            return c.a(view.animate());
        }
        return null;
    }

    public long getStartDelay() {
        View view = this.f20278a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotation(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().rotation(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().rotationBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationX(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().rotationX(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationXBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().rotationXBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationY(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().rotationY(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat rotationYBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().rotationYBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleX(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().scaleX(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleXBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().scaleXBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleY(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().scaleY(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat scaleYBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().scaleYBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setDuration(long j10) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setInterpolator(@Nullable Interpolator interpolator) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setListener(@Nullable ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = this.f20278a.get();
        if (view != null) {
            a(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setStartDelay(long j10) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat setUpdateListener(@Nullable final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final View view = this.f20278a.get();
        if (view != null) {
            d.a(view.animate(), viewPropertyAnimatorUpdateListener != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.c0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    viewPropertyAnimatorUpdateListener.onAnimationUpdate(view);
                }
            } : null);
        }
        return this;
    }

    public void start() {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationX(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().translationX(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationXBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().translationXBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationY(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationYBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().translationYBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZ(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            e.a(view.animate(), f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat translationZBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            e.b(view.animate(), f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withEndAction(@NonNull Runnable runnable) {
        View view = this.f20278a.get();
        if (view != null) {
            b.a(view.animate(), runnable);
        }
        return this;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    public ViewPropertyAnimatorCompat withLayer() {
        View view = this.f20278a.get();
        if (view != null) {
            b.b(view.animate());
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat withStartAction(@NonNull Runnable runnable) {
        View view = this.f20278a.get();
        if (view != null) {
            b.c(view.animate(), runnable);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat x(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().x(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat xBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().xBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat y(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().y(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat yBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            view.animate().yBy(f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat z(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            e.c(view.animate(), f6);
        }
        return this;
    }

    @NonNull
    public ViewPropertyAnimatorCompat zBy(float f6) {
        View view = this.f20278a.get();
        if (view != null) {
            e.d(view.animate(), f6);
        }
        return this;
    }
}
