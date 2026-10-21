package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class MaterialBackAnimationHelper<V extends View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f44938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BackEventCompat f44939b;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;

    @NonNull
    protected final V view;

    public MaterialBackAnimationHelper(@NonNull V v3) {
        this.view = v3;
        Context context = v3.getContext();
        this.f44938a = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardDecelerateInterpolator, PathInterpolatorCompat.create(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f6) {
        return this.f44938a.getInterpolation(f6);
    }

    @Nullable
    public BackEventCompat onCancelBackProgress() {
        if (this.f44939b == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        BackEventCompat backEventCompat = this.f44939b;
        this.f44939b = null;
        return backEventCompat;
    }

    @Nullable
    public BackEventCompat onHandleBackInvoked() {
        BackEventCompat backEventCompat = this.f44939b;
        this.f44939b = null;
        return backEventCompat;
    }

    public void onStartBackProgress(@NonNull BackEventCompat backEventCompat) {
        this.f44939b = backEventCompat;
    }

    @Nullable
    public BackEventCompat onUpdateBackProgress(@NonNull BackEventCompat backEventCompat) {
        if (this.f44939b == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = this.f44939b;
        this.f44939b = backEventCompat;
        return backEventCompat2;
    }
}
