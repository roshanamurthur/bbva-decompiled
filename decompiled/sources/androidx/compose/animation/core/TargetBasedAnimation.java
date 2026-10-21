package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u001d\u001a\u00028\u0000\u0012\u0006\u0010 \u001a\u00028\u0000\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b*\u0010+BG\b\u0016\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000,\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0010\u001d\u001a\u00028\u0000\u0012\u0006\u0010 \u001a\u00028\u0000\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b*\u0010-J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010%\u001a\u00020\u00058VX\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/Animation;", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "", "toString", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "a", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "getAnimationSpec$animation_core_release", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "animationSpec", "Landroidx/compose/animation/core/TwoWayConverter;", "b", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "c", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "initialValue", "d", "getTargetValue", "targetValue", "h", "J", "getDurationNanos", "()J", "durationNanos", "", "isInfinite", "()Z", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class TargetBasedAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final VectorizedAnimationSpec<V> animationSpec;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TwoWayConverter<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final T initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final T targetValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final V f3087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final V f3088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final V f3089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long durationNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final V f3091i;

    public TargetBasedAnimation(@NotNull VectorizedAnimationSpec<V> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t10, T t11, @Nullable V v3) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.animationSpec = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t10;
        this.targetValue = t11;
        V vInvoke = getTypeConverter().getConvertToVector().invoke(t10);
        this.f3087e = vInvoke;
        V vInvoke2 = getTypeConverter().getConvertToVector().invoke(getTargetValue());
        this.f3088f = vInvoke2;
        V v6 = (v3 == null || (v6 = (V) AnimationVectorsKt.copy(v3)) == null) ? (V) AnimationVectorsKt.newInstance(getTypeConverter().getConvertToVector().invoke(t10)) : v6;
        this.f3089g = v6;
        this.durationNanos = animationSpec.getDurationNanos(vInvoke, vInvoke2, v6);
        this.f3091i = (V) animationSpec.getEndVelocity(vInvoke, vInvoke2, v6);
    }

    @NotNull
    public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core_release() {
        return this.animationSpec;
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getTargetValue() {
        return this.targetValue;
    }

    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.animation.core.Animation
    public T getValueFromNanos(long playTimeNanos) {
        if (s.a.a(this, playTimeNanos)) {
            return getTargetValue();
        }
        AnimationVector valueFromNanos = this.animationSpec.getValueFromNanos(playTimeNanos, this.f3087e, this.f3088f, this.f3089g);
        int size = valueFromNanos.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(!Float.isNaN(valueFromNanos.get$animation_core_release(i10)))) {
                throw new IllegalStateException(("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + playTimeNanos).toString());
            }
        }
        return (T) getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
    }

    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public V getVelocityVectorFromNanos(long playTimeNanos) {
        return !s.a.a(this, playTimeNanos) ? (V) this.animationSpec.getVelocityFromNanos(playTimeNanos, this.f3087e, this.f3088f, this.f3089g) : this.f3091i;
    }

    @Override // androidx.compose.animation.core.Animation
    public final /* synthetic */ boolean isFinishedFromNanos(long j10) {
        return s.a.a(this, j10);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return this.animationSpec.isInfinite();
    }

    @NotNull
    public String toString() {
        return "TargetBasedAnimation: " + this.initialValue + " -> " + getTargetValue() + ",initial velocity: " + this.f3089g + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
    }

    public /* synthetic */ TargetBasedAnimation(VectorizedAnimationSpec vectorizedAnimationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((VectorizedAnimationSpec<AnimationVector>) vectorizedAnimationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i10 & 16) != 0 ? null : animationVector);
    }

    public /* synthetic */ TargetBasedAnimation(AnimationSpec animationSpec, TwoWayConverter twoWayConverter, Object obj, Object obj2, AnimationVector animationVector, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((AnimationSpec<Object>) animationSpec, (TwoWayConverter<Object, AnimationVector>) twoWayConverter, obj, obj2, (i10 & 16) != 0 ? null : animationVector);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TargetBasedAnimation(@NotNull AnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t10, T t11, @Nullable V v3) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t10, t11, v3);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
