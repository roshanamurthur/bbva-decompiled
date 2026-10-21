package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: FloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u001a\u0010\u000f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/core/FloatExponentialDecaySpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "playTimeNanos", "", "initialValue", "initialVelocity", "getValueFromNanos", "getVelocityFromNanos", "getDurationNanos", "getTargetValue", "a", "F", "getAbsVelocityThreshold", "()F", "absVelocityThreshold", "frictionMultiplier", "<init>", "(FF)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float absVelocityThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2960b;

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatExponentialDecaySpec() {
        float f6 = 0.0f;
        this(f6, f6, 3, null);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float initialValue, float initialVelocity) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(initialVelocity))) * 1000.0f) / this.f2960b)) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float initialValue, float initialVelocity) {
        if (Math.abs(initialVelocity) <= getAbsVelocityThreshold()) {
            return initialValue;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / initialVelocity));
        float f6 = this.f2960b;
        return ((initialVelocity / f6) * ((float) Math.exp((((double) f6) * ((dLog / ((double) f6)) * ((double) 1000))) / ((double) 1000.0f)))) + (initialValue - (initialVelocity / f6));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        long j10 = playTimeNanos / AnimationKt.MillisToNanos;
        float f6 = this.f2960b;
        return ((initialVelocity / f6) * ((float) Math.exp((f6 * j10) / 1000.0f))) + (initialValue - (initialVelocity / f6));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        return initialVelocity * ((float) Math.exp(((playTimeNanos / AnimationKt.MillisToNanos) / 1000.0f) * this.f2960b));
    }

    public FloatExponentialDecaySpec(float f6, float f10) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f10));
        this.f2960b = Math.max(1.0E-4f, f6) * (-4.2f);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f6, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f6, (i10 & 2) != 0 ? 0.1f : f10);
    }
}
