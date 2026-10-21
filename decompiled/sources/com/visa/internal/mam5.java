package com.visa.internal;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mam5 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogoElement f68038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f68039b;

    public mam5(LogoElement logoElement, Function0 function0) {
        this.f68038a = logoElement;
        this.f68039b = function0;
    }

    public static final void a(LogoElement this$0, Function0 function0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        LogoElement logoElement = this.f68038a;
        logoElement.postDelayed(new androidx.camera.camera2.interop.a(logoElement, this.f68039b, 7), 80L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
