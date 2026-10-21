package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s.c;

/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016J(\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/FloatTweenSpec;", "Landroidx/compose/animation/core/FloatAnimationSpec;", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "getDurationNanos", "getVelocityFromNanos", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDuration", "()I", TypedValues.TransitionType.S_DURATION, "b", "getDelay", "delay", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Easing f2967c;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float initialValue, float targetValue, float initialVelocity) {
        return ((long) (this.delay + this.duration)) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final /* synthetic */ float getEndVelocity(float f6, float f10, float f11) {
        return c.a(this, f6, f10, f11);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j10 = (playTimeNanos / AnimationKt.MillisToNanos) - ((long) this.delay);
        int i10 = this.duration;
        return VectorConvertersKt.lerp(initialValue, targetValue, this.f2967c.transform(kotlin.ranges.c.coerceIn(i10 == 0 ? 1.0f : kotlin.ranges.c.coerceIn(j10, 0L, i10) / i10, 0.0f, 1.0f)));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long jCoerceIn = kotlin.ranges.c.coerceIn((playTimeNanos / AnimationKt.MillisToNanos) - ((long) this.delay), 0L, this.duration);
        if (jCoerceIn < 0) {
            return 0.0f;
        }
        if (jCoerceIn == 0) {
            return initialVelocity;
        }
        return (getValueFromNanos(jCoerceIn * AnimationKt.MillisToNanos, initialValue, targetValue, initialVelocity) - getValueFromNanos((jCoerceIn - 1) * AnimationKt.MillisToNanos, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final /* bridge */ /* synthetic */ VectorizedAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return vectorize(twoWayConverter);
    }

    public FloatTweenSpec(int i10, int i11, @NotNull Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.duration = i10;
        this.delay = i11;
        this.f2967c = easing;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final /* synthetic */ VectorizedFloatAnimationSpec vectorize(TwoWayConverter twoWayConverter) {
        return c.c(this, twoWayConverter);
    }

    public /* synthetic */ FloatTweenSpec(int i10, int i11, Easing easing, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
