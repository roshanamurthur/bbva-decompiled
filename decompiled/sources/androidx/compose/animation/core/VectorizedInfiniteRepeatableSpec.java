package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s.g;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0017\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB,\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001eJ/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/VectorizedInfiniteRepeatableSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "c", "J", "getDurationNanos$animation_core_release", "()J", "durationNanos", "", "isInfinite", "()Z", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "<init>", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "Landroidx/compose/animation/core/StartOffset;", "initialStartOffset", "(Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VectorizedDurationBasedAnimationSpec<V> f3188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RepeatMode f3189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long durationNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3191d;

    public VectorizedInfiniteRepeatableSpec() {
        throw null;
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec animation, RepeatMode repeatMode, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        this.f3188a = animation;
        this.f3189b = repeatMode;
        this.durationNanos = ((long) (animation.getDurationMillis() + animation.getDelayMillis())) * AnimationKt.MillisToNanos;
        this.f3191d = j10 * AnimationKt.MillisToNanos;
    }

    public final long a(long j10) {
        long j11 = this.f3191d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.durationNanos;
        long j14 = j12 / j13;
        if (this.f3189b != RepeatMode.Restart && j14 % ((long) 2) != 0) {
            return ((j14 + 1) * j13) - j12;
        }
        Long.signum(j14);
        return j12 - (j14 * j13);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: getDurationNanos$animation_core_release, reason: from getter */
    public final long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public final /* synthetic */ AnimationVector getEndVelocity(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return g.a(this, animationVector, animationVector2, animationVector3);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec = this.f3188a;
        long jA = a(playTimeNanos);
        long j10 = this.f3191d;
        long j11 = playTimeNanos + j10;
        long j12 = this.durationNanos;
        return vectorizedDurationBasedAnimationSpec.getValueFromNanos(jA, initialValue, targetValue, j11 > j12 ? getVelocityFromNanos(j12 - j10, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec = this.f3188a;
        long jA = a(playTimeNanos);
        long j10 = this.f3191d;
        long j11 = playTimeNanos + j10;
        long j12 = this.durationNanos;
        return vectorizedDurationBasedAnimationSpec.getVelocityFromNanos(jA, initialValue, targetValue, j11 > j12 ? getVelocityFromNanos(j12 - j10, initialValue, initialVelocity, targetValue) : initialVelocity);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode, (i10 & 4) != 0 ? StartOffset.m97constructorimpl$default(0, 0, 2, null) : j10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (i10 & 2) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(animation, repeatMode, StartOffset.m97constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
