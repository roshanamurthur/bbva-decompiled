package com.bbva.glomohybrid.splash.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.bbva.glomohybrid.splash.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySplashBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f34498p0;

    @NonNull
    public final LottieAnimationView splashLottieView;

    public ActivitySplashBinding(@NonNull LottieAnimationView lottieAnimationView, @NonNull LottieAnimationView lottieAnimationView2) {
        this.f34498p0 = lottieAnimationView;
        this.splashLottieView = lottieAnimationView2;
    }

    @NonNull
    public static ActivitySplashBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view;
        return new ActivitySplashBinding(lottieAnimationView, lottieAnimationView);
    }

    @NonNull
    public static ActivitySplashBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySplashBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_splash, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LottieAnimationView getRoot() {
        return this.f34498p0;
    }
}
