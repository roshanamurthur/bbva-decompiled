package com.bbva.glomohybrid.login.presentation.animation;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FadeAnimation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001J$\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/animation/Fade;", "", "", TypedValues.TransitionType.S_DURATION, "delay", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/view/ViewPropertyAnimator;", "buildAnimator", "Lcom/bbva/glomohybrid/login/presentation/animation/FadeIn;", "Lcom/bbva/glomohybrid/login/presentation/animation/FadeOut;", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public abstract class Fade {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f33476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f33477b;

    public Fade(View view, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this.f33476a = view;
        this.f33477b = f6;
    }

    public static /* synthetic */ ViewPropertyAnimator buildAnimator$default(Fade fade, long j10, long j11, Interpolator interpolator, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildAnimator");
        }
        if ((i10 & 1) != 0) {
            j10 = 300;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = 600;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            interpolator = new LinearInterpolator();
        }
        return fade.buildAnimator(j12, j13, interpolator);
    }

    @NotNull
    public final ViewPropertyAnimator buildAnimator(long duration, long delay, @NotNull Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        View view = this.f33476a;
        float f6 = this.f33477b;
        view.setAlpha(f6);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.setInterpolator(interpolator);
        viewPropertyAnimatorAnimate.setDuration(duration);
        viewPropertyAnimatorAnimate.alpha(1.0f - f6);
        viewPropertyAnimatorAnimate.setStartDelay(delay);
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAnimate, "apply(...)");
        return viewPropertyAnimatorAnimate;
    }
}
