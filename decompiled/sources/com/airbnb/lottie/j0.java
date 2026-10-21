package com.airbnb.lottie;

import android.annotation.SuppressLint;
import android.os.Build;
import com.airbnb.lottie.utils.Logger;
import java.util.HashSet;

/* JADX INFO: compiled from: LottieFeatureFlags.java */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<LottieFeatureFlag> f25929a = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    public final boolean a(LottieFeatureFlag lottieFeatureFlag, boolean z10) {
        HashSet<LottieFeatureFlag> hashSet = this.f25929a;
        if (!z10) {
            return hashSet.remove(lottieFeatureFlag);
        }
        if (Build.VERSION.SDK_INT >= lottieFeatureFlag.minRequiredSdkVersion) {
            return hashSet.add(lottieFeatureFlag);
        }
        Logger.warning(String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
        return false;
    }
}
