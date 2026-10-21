package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements FloatDecayAnimationSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4490a;

    public e(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f4490a = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    public final float a(float f6) {
        float[] fArr = AndroidFlingSpline.f4154a;
        float f10 = WindowInsetsConnection_androidKt.f4411a;
        float f11 = this.f4490a;
        double dLog = Math.log(((double) (Math.abs(f6) * 0.35f)) / ((double) (f10 * f11)));
        return Math.signum(f6) * ((float) (Math.exp((WindowInsetsConnection_androidKt.f4412b / WindowInsetsConnection_androidKt.f4413c) * dLog) * ((double) (WindowInsetsConnection_androidKt.f4411a * f11))));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final long getDurationNanos(float f6, float f10) {
        float[] fArr = AndroidFlingSpline.f4154a;
        return (long) (Math.exp(Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) (WindowInsetsConnection_androidKt.f4411a * this.f4490a))) / WindowInsetsConnection_androidKt.f4413c) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getTargetValue(float f6, float f10) {
        return a(f10) + f6;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getValueFromNanos(long j10, float f6, float f10) {
        long durationNanos = getDurationNanos(0.0f, f10);
        return (AndroidFlingSpline.FlingResult.m241getDistanceCoefficientimpl(AndroidFlingSpline.a(durationNanos > 0 ? j10 / durationNanos : 1.0f)) * a(f10)) + f6;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public final float getVelocityFromNanos(long j10, float f6, float f10) {
        long durationNanos = getDurationNanos(0.0f, f10);
        return ((AndroidFlingSpline.FlingResult.m242getVelocityCoefficientimpl(AndroidFlingSpline.a(durationNanos > 0 ? j10 / durationNanos : 1.0f)) * a(f10)) / durationNanos) * 1.0E9f;
    }
}
