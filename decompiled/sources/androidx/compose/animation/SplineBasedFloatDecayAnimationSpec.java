package androidx.compose.animation;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SplineBasedFloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/SplineBasedFloatDecayAnimationSpec;", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "initialValue", "initialVelocity", "getTargetValue", "", "playTimeNanos", "getValueFromNanos", "getDurationNanos", "getVelocityFromNanos", "getAbsVelocityThreshold", "()F", "absVelocityThreshold", "Landroidx/compose/ui/unit/Density;", "density", "<init>", "(Landroidx/compose/ui/unit/Density;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FlingCalculator f2818a;

    public SplineBasedFloatDecayAnimationSpec(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f2818a = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float initialValue, float initialVelocity) {
        return this.f2818a.flingDuration(initialVelocity) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float initialValue, float initialVelocity) {
        return (Math.signum(initialVelocity) * this.f2818a.flingDistance(initialVelocity)) + initialValue;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.f2818a.flingInfo(initialVelocity).position(playTimeNanos / AnimationKt.MillisToNanos) + initialValue;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float initialVelocity) {
        return this.f2818a.flingInfo(initialVelocity).velocity(playTimeNanos / AnimationKt.MillisToNanos);
    }
}
