package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f44871a;

    public ReversableAnimatedValueInterpolator(@NonNull TimeInterpolator timeInterpolator) {
        this.f44871a = timeInterpolator;
    }

    @NonNull
    public static TimeInterpolator of(boolean z10, @NonNull TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        return 1.0f - this.f44871a.getInterpolation(f6);
    }
}
