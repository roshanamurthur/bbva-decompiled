package com.airbnb.lottie;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class Lottie {
    public static void initialize(@NonNull LottieConfig lottieConfig) {
        L.setFetcher(lottieConfig.f25608a);
        L.setCacheProvider(lottieConfig.f25609b);
        L.setTraceEnabled(lottieConfig.f25610c);
        L.setNetworkCacheEnabled(lottieConfig.f25611d);
        L.setDisablePathInterpolatorCache(lottieConfig.f25612e);
        L.setDefaultAsyncUpdates(lottieConfig.f25613f);
        L.setReducedMotionOption(lottieConfig.f25614g);
    }
}
