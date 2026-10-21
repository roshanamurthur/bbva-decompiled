package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import s.c;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/FloatSpringSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "getVelocityFromNanos", "getEndVelocity", "getDurationNanos", "a", "F", "getDampingRatio", "()F", "dampingRatio", "b", "getStiffness", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SpringSimulation f2964d;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        SpringSimulation springSimulation = this.f2964d;
        float stiffness = springSimulation.getStiffness();
        float dampingRatio = springSimulation.getDampingRatio();
        float f6 = initialValue - targetValue;
        float f10 = this.f2963c;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, initialVelocity / f10, f6 / f10, 1.0f) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float initialValue, float targetValue, float initialVelocity) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j10 = playTimeNanos / AnimationKt.MillisToNanos;
        SpringSimulation springSimulation = this.f2964d;
        springSimulation.setFinalPosition(targetValue);
        return Motion.m88getValueimpl(springSimulation.m94updateValuesIJZedt4$animation_core_release(initialValue, initialVelocity, j10));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j10 = playTimeNanos / AnimationKt.MillisToNanos;
        SpringSimulation springSimulation = this.f2964d;
        springSimulation.setFinalPosition(targetValue);
        return Motion.m89getVelocityimpl(springSimulation.m94updateValuesIJZedt4$animation_core_release(initialValue, initialVelocity, j10));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return vectorize(twoWayConverter);
    }

    public FloatSpringSpec(float f6, float f10, float f11) {
        this.dampingRatio = f6;
        this.stiffness = f10;
        this.f2963c = f11;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f6);
        springSimulation.setStiffness(f10);
        this.f2964d = springSimulation;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final /* synthetic */ VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return c.c(this, twoWayConverter);
    }

    public /* synthetic */ FloatSpringSpec(float f6, float f10, float f11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f6, (i10 & 2) != 0 ? 1500.0f : f10, (i10 & 4) != 0 ? 0.01f : f11);
    }
}
