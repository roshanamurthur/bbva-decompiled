package com.bbva.component.ui.login.animations;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultAnimationTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/component/ui/login/animations/DefaultAnimationTemplate;", "Lcom/bbva/component/ui/login/animations/AnimationTemplate;", "", "animate", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Companion", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class DefaultAnimationTemplate implements AnimationTemplate {
    public static final long ANIMATION_DELAY = 600;
    public static final long ANIMATION_DURATION = 350;
    public static final int ANIMATION_TRANSLATION_DISTANCE = 40;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TranslateOnYAnimation f28474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FadeInAnimation f28475b;

    public DefaultAnimationTemplate(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f28474a = new TranslateOnYAnimation(view);
        this.f28475b = new FadeInAnimation(view);
    }

    @Override // com.bbva.component.ui.login.animations.AnimationTemplate
    public void animate() {
        TranslateOnYAnimation.buildAnimator$default(this.f28474a, 0L, 0L, null, 0, 15, null);
        ValueAnimator valueAnimatorBuildAnimator$default = TranslateOnYAnimation.buildAnimator$default(this.f28474a, 350L, 600L, null, 40, 4, null);
        ValueAnimator valueAnimatorBuildAnimator$default2 = FadeInAnimation.buildAnimator$default(this.f28475b, 350L, 600L, null, 4, null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorBuildAnimator$default, valueAnimatorBuildAnimator$default2);
        animatorSet.start();
    }
}
