package com.bbva.component.ui.login.animations;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.bbva.component.ui.login.animations.FadeInAnimation;
import com.bbva.component.ui.login.extensions.ValueAnimatorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FadeInAnimation.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/ui/login/animations/FadeInAnimation;", "", "", TypedValues.TransitionType.S_DURATION, "delay", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/animation/ValueAnimator;", "buildAnimator", "", "Landroid/view/View;", "views", "<init>", "([Landroid/view/View;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFadeInAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FadeInAnimation.kt\ncom/bbva/component/ui/login/animations/FadeInAnimation\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,33:1\n13309#2,2:34\n13309#2,2:36\n*S KotlinDebug\n*F\n+ 1 FadeInAnimation.kt\ncom/bbva/component/ui/login/animations/FadeInAnimation\n*L\n17#1:34,2\n30#1:36,2\n*E\n"})
public final class FadeInAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View[] f28476a;

    public FadeInAnimation(@NotNull View... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        this.f28476a = views;
    }

    public static /* synthetic */ ValueAnimator buildAnimator$default(FadeInAnimation fadeInAnimation, long j10, long j11, Interpolator interpolator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 300;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = 600;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            interpolator = new FastOutLinearInInterpolator();
        }
        return fadeInAnimation.buildAnimator(j12, j13, interpolator);
    }

    @NotNull
    public final ValueAnimator buildAnimator(long duration, long delay, @NotNull Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        for (View view : this.f28476a) {
            view.setAlpha(0.0f);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(duration);
        valueAnimatorOfFloat.setStartDelay(delay);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o5.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                FadeInAnimation this$0 = this.f85275a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                for (View view2 : this$0.f28476a) {
                    view2.setAlpha(ValueAnimatorExtensionsKt.getFloatAnimatedValue(it));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }
}
