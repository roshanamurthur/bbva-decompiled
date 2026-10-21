package com.bbva.component.ui.login.animations;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.bbva.component.ui.login.animations.TranslateOnYAnimation;
import com.bbva.component.ui.login.extensions.ValueAnimatorExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TranslateOnYAnimation.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/component/ui/login/animations/TranslateOnYAnimation;", "", "", TypedValues.TransitionType.S_DURATION, "delay", "Landroid/view/animation/Interpolator;", "interpolator", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroid/animation/ValueAnimator;", "buildAnimator", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class TranslateOnYAnimation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f28477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28478b;

    public TranslateOnYAnimation(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f28477a = view;
    }

    public static /* synthetic */ ValueAnimator buildAnimator$default(TranslateOnYAnimation translateOnYAnimation, long j10, long j11, Interpolator interpolator, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = 300;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = 600;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            interpolator = PathInterpolatorCompat.create(0.0f, 0.0f, 0.1f, 0.0f);
            Intrinsics.checkNotNullExpressionValue(interpolator, "create(...)");
        }
        Interpolator interpolator2 = interpolator;
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return translateOnYAnimation.buildAnimator(j12, j13, interpolator2, i10);
    }

    @NotNull
    public final ValueAnimator buildAnimator(long duration, long delay, @NotNull Interpolator interpolator, int offset) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.f28478b = offset;
        this.f28477a.setTranslationY(offset);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(duration);
        valueAnimatorOfFloat.setStartDelay(delay);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o5.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                TranslateOnYAnimation this$0 = this.f85276a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.f28477a.setTranslationY(this$0.f28478b - (ValueAnimatorExtensionsKt.getFloatAnimatedValue(it) * this$0.f28478b));
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }
}
