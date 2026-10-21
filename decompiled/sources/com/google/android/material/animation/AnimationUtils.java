package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.RestrictTo;
import androidx.datastore.preferences.protobuf.e;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f6, float f10, float f11) {
        return e.a(f10, f6, f11, f6);
    }

    public static int lerp(int i10, int i11, float f6) {
        return Math.round(f6 * (i11 - i10)) + i10;
    }

    public static float lerp(float f6, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f6;
        }
        return f13 >= f12 ? f10 : lerp(f6, f10, (f13 - f11) / (f12 - f11));
    }
}
