package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B9\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b)\u0010*B;\b\u0016\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b)\u0010,B;\b\u0016\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000+\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0004\b)\u0010.J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\"\u001a\u00020\u00058VX\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020#8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006/"}, d2 = {"Landroidx/compose/animation/core/DecayAnimation;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/Animation;", "", "playTimeNanos", "getValueFromNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/TwoWayConverter;", "b", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "c", "Ljava/lang/Object;", "getInitialValue", "()Ljava/lang/Object;", "initialValue", "e", "Landroidx/compose/animation/core/AnimationVector;", "getInitialVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "initialVelocityVector", "g", "getTargetValue", "targetValue", "h", "J", "getDurationNanos", "()J", "durationNanos", "", "isInfinite", "Z", "()Z", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "animationSpec", "<init>", "(Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "initialVelocity", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final VectorizedDecayAnimationSpec<V> f2915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TwoWayConverter<T, V> typeConverter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final T initialValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final V f2918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final V initialVelocityVector;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final V f2920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final T targetValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final long durationNanos;

    public DecayAnimation(@NotNull VectorizedDecayAnimationSpec<V> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t10, @NotNull V initialVelocityVector) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        this.f2915a = animationSpec;
        this.typeConverter = typeConverter;
        this.initialValue = t10;
        V vInvoke = getTypeConverter().getConvertToVector().invoke(t10);
        this.f2918d = vInvoke;
        this.initialVelocityVector = (V) AnimationVectorsKt.copy(initialVelocityVector);
        this.targetValue = (T) getTypeConverter().getConvertFromVector().invoke(animationSpec.getTargetValue(vInvoke, initialVelocityVector));
        this.durationNanos = animationSpec.getDurationNanos(vInvoke, initialVelocityVector);
        V v3 = (V) AnimationVectorsKt.copy(animationSpec.getVelocityFromNanos(getDurationNanos(), vInvoke, initialVelocityVector));
        this.f2920f = v3;
        int size = v3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v6 = this.f2920f;
            v6.set$animation_core_release(i10, c.coerceIn(v6.get$animation_core_release(i10), -this.f2915a.getAbsVelocityThreshold(), this.f2915a.getAbsVelocityThreshold()));
        }
    }

    @Override // androidx.compose.animation.core.Animation
    public long getDurationNanos() {
        return this.durationNanos;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    @NotNull
    public final V getInitialVelocityVector() {
        return this.initialVelocityVector;
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
        return (T) getTypeConverter().getConvertFromVector().invoke(this.f2915a.getValueFromNanos(playTimeNanos, this.f2918d, this.initialVelocityVector));
    }

    @Override // androidx.compose.animation.core.Animation
    @NotNull
    public V getVelocityVectorFromNanos(long playTimeNanos) {
        if (s.a.a(this, playTimeNanos)) {
            return this.f2920f;
        }
        return (V) this.f2915a.getVelocityFromNanos(playTimeNanos, this.f2918d, this.initialVelocityVector);
    }

    @Override // androidx.compose.animation.core.Animation
    public final /* synthetic */ boolean isFinishedFromNanos(long j10) {
        return s.a.a(this, j10);
    }

    @Override // androidx.compose.animation.core.Animation
    public boolean isInfinite() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(@NotNull DecayAnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t10, @NotNull V initialVelocityVector) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t10, initialVelocityVector);
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DecayAnimation(@NotNull DecayAnimationSpec<T> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, T t10, T t11) {
        this(animationSpec.vectorize(typeConverter), typeConverter, t10, typeConverter.getConvertToVector().invoke(t11));
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
    }
}
