package com.bbva.glomohybrid.login.presentation.animation;

import android.animation.Animator;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FadeAnimation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/login/presentation/animation/VisibilityListener;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "", "onAnimationRepeat", "onAnimationStart", "onAnimationCancel", "onAnimationEnd", "Landroid/view/View;", "view", "", "visibility", "", "alpha", "<init>", "(Landroid/view/View;IF)V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class VisibilityListener implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f33478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f33480c;

    public VisibilityListener(@NotNull View view, int i10, float f6) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f33478a = view;
        this.f33479b = i10;
        this.f33480c = f6;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i10 = this.f33479b;
        View view = this.f33478a;
        view.setVisibility(i10);
        view.setAlpha(this.f33480c);
    }

    public /* synthetic */ VisibilityListener(View view, int i10, float f6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? 0.0f : f6);
    }
}
