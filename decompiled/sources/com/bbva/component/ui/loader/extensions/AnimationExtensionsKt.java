package com.bbva.component.ui.loader.extensions;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.lifecycle.b;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.cells.component.kit.ui.animation.AnimatorBuilder;
import com.bbva.component.ui.loader.LoaderViewModel;
import com.bbva.component.ui.loader.R;
import com.bbva.component.ui.loader.behavior.SpinnerBehavior;
import com.bbva.component.ui.loader.behavior.ViewBehavior;
import com.bbva.component.ui.loader.databinding.LayoutLoaderviewBinding;
import com.bbva.ui.widget.BbvaTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a \u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\bø\u0001\u0000\u001a \u0010\u0013\u001a\u00020\u0017*\u00020\u00172\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\bø\u0001\u0000\u001a \u0010\u0013\u001a\u00020\u0001*\u00020\u00182\u000e\b\u0004\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016H\u0080\bø\u0001\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u001a\f\u0010\u001c\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u001d\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0012\u0010\u001e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"animateNextMessage", "", "Lcom/bbva/component/ui/loader/databinding/LayoutLoaderviewBinding;", "message", "", "behavior", "Lcom/bbva/component/ui/loader/behavior/ViewBehavior;", "hideLabel", "hideNow", "hideSecondaryMessage", "interceptTouches", "intercept", "", "loadAnimationId", "", "", "context", "Landroid/content/Context;", "nextMessageNow", "onEnd", "Landroid/animation/Animator;", "action", "Lkotlin/Function0;", "Landroid/view/animation/Animation;", "Lcom/airbnb/lottie/LottieAnimationView;", "playLockLottie", "viewModel", "Lcom/bbva/component/ui/loader/LoaderViewModel;", "resetConstraints", "showNow", "showSecondaryMessage", "component-ui-loader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimationExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationExtensions.kt\ncom/bbva/component/ui/loader/extensions/AnimationExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n127#1,9:192\n1#2:191\n*S KotlinDebug\n*F\n+ 1 AnimationExtensions.kt\ncom/bbva/component/ui/loader/extensions/AnimationExtensionsKt\n*L\n95#1:192,9\n*E\n"})
public final class AnimationExtensionsKt {
    public static final void animateNextMessage(@NotNull final LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull final CharSequence message, @Nullable ViewBehavior viewBehavior) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        if (viewBehavior instanceof SpinnerBehavior) {
            layoutLoaderviewBinding.nextMessageLabel.setGravity(1);
        }
        layoutLoaderviewBinding.nextMessageLabel.setText(message);
        final FloatEvaluator floatEvaluator = new FloatEvaluator();
        Context context = layoutLoaderviewBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final float dp = DimensionExtensionsKt.toDp(30.0f, context);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(AnimatorBuilder.build().interpolator(PathInterpolatorCompat.create(0.6f, 0.0f, 0.4f, 1.0f)).duration(400L).updateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m5.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                LayoutLoaderviewBinding this_animateNextMessage = layoutLoaderviewBinding;
                Intrinsics.checkNotNullParameter(this_animateNextMessage, "$this_animateNextMessage");
                FloatEvaluator evaluator = floatEvaluator;
                Intrinsics.checkNotNullParameter(evaluator, "$evaluator");
                Intrinsics.checkNotNullParameter(it, "it");
                BbvaTextView bbvaTextView = this_animateNextMessage.messageLabel;
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                Float fEvaluate = evaluator.evaluate(((Float) animatedValue).floatValue(), (Number) Float.valueOf(1.0f), (Number) Float.valueOf(0.0f));
                Intrinsics.checkNotNullExpressionValue(fEvaluate, "evaluate(...)");
                bbvaTextView.setAlpha(fEvaluate.floatValue());
            }
        }).create(), AnimatorBuilder.build().interpolator(PathInterpolatorCompat.create(0.6f, 0.0f, 0.2f, 1.0f)).delay(80L).duration(400L).updateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m5.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                LayoutLoaderviewBinding this_animateNextMessage = layoutLoaderviewBinding;
                Intrinsics.checkNotNullParameter(this_animateNextMessage, "$this_animateNextMessage");
                FloatEvaluator evaluator = floatEvaluator;
                Intrinsics.checkNotNullParameter(evaluator, "$evaluator");
                Intrinsics.checkNotNullParameter(it, "it");
                BbvaTextView bbvaTextView = this_animateNextMessage.nextMessageLabel;
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                Float fEvaluate = evaluator.evaluate(((Float) animatedValue).floatValue(), (Number) Float.valueOf(dp), (Number) 0);
                Intrinsics.checkNotNullExpressionValue(fEvaluate, "evaluate(...)");
                bbvaTextView.setTranslationY(fEvaluate.floatValue());
            }
        }).create(), AnimatorBuilder.build().interpolator(PathInterpolatorCompat.create(0.6f, 0.0f, 0.4f, 1.0f)).delay(80L).duration(400L).updateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m5.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                LayoutLoaderviewBinding this_animateNextMessage = layoutLoaderviewBinding;
                Intrinsics.checkNotNullParameter(this_animateNextMessage, "$this_animateNextMessage");
                FloatEvaluator evaluator = floatEvaluator;
                Intrinsics.checkNotNullParameter(evaluator, "$evaluator");
                Intrinsics.checkNotNullParameter(it, "it");
                BbvaTextView bbvaTextView = this_animateNextMessage.nextMessageLabel;
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                Float fEvaluate = evaluator.evaluate(((Float) animatedValue).floatValue(), (Number) Float.valueOf(0.0f), (Number) Float.valueOf(1.0f));
                Intrinsics.checkNotNullExpressionValue(fEvaluate, "evaluate(...)");
                bbvaTextView.setAlpha(fEvaluate.floatValue());
            }
        }).create());
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.bbva.component.ui.loader.extensions.AnimationExtensionsKt$animateNextMessage$lambda$9$$inlined$onEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                LayoutLoaderviewBinding layoutLoaderviewBinding2 = layoutLoaderviewBinding;
                layoutLoaderviewBinding2.nextMessageLabel.setTranslationY(dp);
                AnimationExtensionsKt.nextMessageNow(layoutLoaderviewBinding2, message);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
        animatorSet.start();
    }

    public static /* synthetic */ void animateNextMessage$default(LayoutLoaderviewBinding layoutLoaderviewBinding, CharSequence charSequence, ViewBehavior viewBehavior, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            viewBehavior = null;
        }
        animateNextMessage(layoutLoaderviewBinding, charSequence, viewBehavior);
    }

    public static final void hideLabel(@NotNull final LayoutLoaderviewBinding layoutLoaderviewBinding) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        final FloatEvaluator floatEvaluator = new FloatEvaluator();
        AnimatorBuilder.build().interpolator(PathInterpolatorCompat.create(0.6f, 0.0f, 0.4f, 1.0f)).duration(400L).updateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m5.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                LayoutLoaderviewBinding this_hideLabel = layoutLoaderviewBinding;
                Intrinsics.checkNotNullParameter(this_hideLabel, "$this_hideLabel");
                FloatEvaluator evaluator = floatEvaluator;
                Intrinsics.checkNotNullParameter(evaluator, "$evaluator");
                Intrinsics.checkNotNullParameter(it, "it");
                BbvaTextView bbvaTextView = this_hideLabel.messageLabel;
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                Float fValueOf = Float.valueOf(1.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                Float fEvaluate = evaluator.evaluate(fFloatValue, (Number) fValueOf, (Number) fValueOf2);
                Intrinsics.checkNotNullExpressionValue(fEvaluate, "evaluate(...)");
                bbvaTextView.setAlpha(fEvaluate.floatValue());
                BbvaTextView bbvaTextView2 = this_hideLabel.secondaryMessageLabel;
                Object animatedValue2 = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                Float fEvaluate2 = evaluator.evaluate(((Float) animatedValue2).floatValue(), (Number) fValueOf, (Number) fValueOf2);
                Intrinsics.checkNotNullExpressionValue(fEvaluate2, "evaluate(...)");
                bbvaTextView2.setAlpha(fEvaluate2.floatValue());
            }
        }).create().start();
    }

    public static final void hideNow(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        View root = layoutLoaderviewBinding.getRoot();
        root.setAlpha(1.0f);
        root.setVisibility(8);
    }

    public static final void hideSecondaryMessage(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        BbvaTextView bbvaTextView = layoutLoaderviewBinding.secondaryMessageLabel;
        ViewPropertyAnimator viewPropertyAnimatorAlpha = bbvaTextView.animate().alpha(0.0f);
        Context context = layoutLoaderviewBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        viewPropertyAnimatorAlpha.translationY(DimensionExtensionsKt.toDp(30.0f, context)).setDuration(400L).withEndAction(new b(bbvaTextView, 2)).start();
    }

    public static final void interceptTouches(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, boolean z10) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        View root = layoutLoaderviewBinding.getRoot();
        root.setFocusable(z10);
        root.setFocusableInTouchMode(z10);
        root.setClickable(z10);
    }

    public static final int loadAnimationId(@NotNull String str, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    public static final void nextMessageNow(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        layoutLoaderviewBinding.nextMessageLabel.setAlpha(0.0f);
        layoutLoaderviewBinding.messageLabel.setAlpha(1.0f);
        layoutLoaderviewBinding.messageLabel.setText(charSequence);
    }

    public static final void onEnd(@NotNull Animator animator, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        animator.addListener(new Animator.AnimatorListener() { // from class: com.bbva.component.ui.loader.extensions.AnimationExtensionsKt.onEnd.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                action.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
    }

    public static final void playLockLottie(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull LoaderViewModel viewModel) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        LottieAnimationView lottieAnimationView = layoutLoaderviewBinding.lockLottieView;
        if (lottieAnimationView.getVisibility() == 0) {
            lottieAnimationView.playAnimation();
        } else {
            viewModel.lastStepFinish$component_ui_loader_release();
        }
    }

    public static final void resetConstraints(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(layoutLoaderviewBinding.getRoot().getContext(), R.layout.constraint_loaderview);
        View root = layoutLoaderviewBinding.getRoot();
        Intrinsics.checkNotNull(root, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        constraintSet.applyTo((ConstraintLayout) root);
    }

    public static final void showNow(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        View root = layoutLoaderviewBinding.getRoot();
        root.setAlpha(1.0f);
        root.setVisibility(0);
    }

    public static final void showSecondaryMessage(@NotNull LayoutLoaderviewBinding layoutLoaderviewBinding, @NotNull String message) {
        Intrinsics.checkNotNullParameter(layoutLoaderviewBinding, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        BbvaTextView bbvaTextView = layoutLoaderviewBinding.secondaryMessageLabel;
        bbvaTextView.setText(message);
        bbvaTextView.setVisibility(0);
        bbvaTextView.setAlpha(0.0f);
        Context context = layoutLoaderviewBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        bbvaTextView.setTranslationY(DimensionExtensionsKt.toDp(30.0f, context));
        bbvaTextView.animate().alpha(1.0f).translationY(0.0f).setStartDelay(1000L).setDuration(400L).start();
    }

    public static final void onEnd(@NotNull LottieAnimationView lottieAnimationView, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.bbva.component.ui.loader.extensions.AnimationExtensionsKt.onEnd.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                action.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
    }

    @NotNull
    public static final Animation onEnd(@NotNull Animation animation, @NotNull final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(animation, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bbva.component.ui.loader.extensions.AnimationExtensionsKt$onEnd$3$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(@Nullable Animation animation2) {
                action.invoke();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(@Nullable Animation animation2) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(@Nullable Animation animation2) {
            }
        });
        return animation;
    }
}
