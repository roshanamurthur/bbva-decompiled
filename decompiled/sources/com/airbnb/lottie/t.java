package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.model.layer.CompositionLayer;
import com.bbva.glomohybrid.landing.presentation.adapter.holders.LandingHeaderViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26188b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f26187a = i10;
        this.f26188b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        int i10 = this.f26187a;
        Object obj = this.f26188b;
        switch (i10) {
            case 0:
                LottieDrawable lottieDrawable = (LottieDrawable) obj;
                boolean z10 = LottieDrawable.f25624o1;
                if (!lottieDrawable.getAsyncUpdatesEnabled()) {
                    CompositionLayer compositionLayer = lottieDrawable.M0;
                    if (compositionLayer != null) {
                        compositionLayer.setProgress(lottieDrawable.f25642q0.getAnimatedValueAbsolute());
                    }
                } else {
                    lottieDrawable.invalidateSelf();
                }
                break;
            case 1:
                LandingHeaderViewHolder this$0 = (LandingHeaderViewHolder) obj;
                int i11 = LandingHeaderViewHolder.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                View view = this$0.itemView;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.setLayoutParams(layoutParams);
                break;
            default:
                com.google.android.material.textfield.e eVar = (com.google.android.material.textfield.e) obj;
                eVar.getClass();
                eVar.f45662d.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                break;
        }
    }
}
