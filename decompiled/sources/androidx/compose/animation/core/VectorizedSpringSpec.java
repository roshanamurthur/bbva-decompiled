package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.i;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0016\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00198VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/VectorizedSpringSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "a", "F", "getDampingRatio", "()F", "dampingRatio", "b", "getStiffness", "stiffness", "", "isInfinite", "()Z", "visibilityThreshold", "<init>", "(FFLandroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class VectorizedSpringSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VectorizedFloatAnimationSpec<V> f3205c;

    public /* synthetic */ VectorizedSpringSpec(float f6, float f10, AnimationVector animationVector, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f6, (i10 & 2) != 0 ? 1500.0f : f10, (i10 & 4) != 0 ? null : animationVector);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f3205c.getDurationNanos(initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getEndVelocity(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f3205c.getEndVelocity(initialValue, targetValue, initialVelocity);
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f3205c.getValueFromNanos(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return (V) this.f3205c.getVelocityFromNanos(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        VectorizedFloatAnimationSpec<V> vectorizedFloatAnimationSpec = this.f3205c;
        vectorizedFloatAnimationSpec.getClass();
        return i.a(vectorizedFloatAnimationSpec);
    }

    public VectorizedSpringSpec(float f6, float f10, @Nullable V v3) {
        Animations animationsAccess$createSpringAnimations = VectorizedAnimationSpecKt.access$createSpringAnimations(v3, f6, f10);
        this.dampingRatio = f6;
        this.stiffness = f10;
        this.f3205c = new VectorizedFloatAnimationSpec<>(animationsAccess$createSpringAnimations);
    }
}
