package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import s.g;
import s.h;
import s.i;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDurationMillis", "()I", "durationMillis", "c", "getDelayMillis", "delayMillis", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "<init>", "(Ljava/util/Map;II)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Integer, Pair<V, Easing>> f3192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int durationMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int delayMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f3195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f3196e;

    /* JADX WARN: Multi-variable type inference failed */
    public VectorizedKeyframesSpec(@NotNull Map<Integer, ? extends Pair<? extends V, ? extends Easing>> keyframes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(keyframes, "keyframes");
        this.f3192a = keyframes;
        this.durationMillis = i10;
        this.delayMillis = i11;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final /* synthetic */ long getDurationNanos(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        return h.a(this, animationVector, animationVector2, animationVector3);
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
        int iCoerceIn = (int) c.coerceIn((playTimeNanos / AnimationKt.MillisToNanos) - ((long) getDelayMillis()), 0L, (long) getDurationMillis());
        Integer numValueOf = Integer.valueOf(iCoerceIn);
        Map<Integer, Pair<V, Easing>> map = this.f3192a;
        if (map.containsKey(numValueOf)) {
            return (V) ((Pair) q.getValue(map, Integer.valueOf(iCoerceIn))).getFirst();
        }
        if (iCoerceIn >= getDurationMillis()) {
            return targetValue;
        }
        if (iCoerceIn <= 0) {
            return initialValue;
        }
        int durationMillis = getDurationMillis();
        Easing linearEasing = EasingKt.getLinearEasing();
        int i10 = 0;
        V first = initialValue;
        int i11 = 0;
        for (Map.Entry<Integer, Pair<V, Easing>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<V, Easing> value = entry.getValue();
            if (iCoerceIn > iIntValue && iIntValue >= i11) {
                first = value.getFirst();
                linearEasing = value.getSecond();
                i11 = iIntValue;
            } else if (iCoerceIn < iIntValue && iIntValue <= durationMillis) {
                targetValue = value.getFirst();
                durationMillis = iIntValue;
            }
        }
        float fTransform = linearEasing.transform((iCoerceIn - i11) / (durationMillis - i11));
        if (this.f3195d == null) {
            this.f3195d = (V) AnimationVectorsKt.newInstance(initialValue);
            this.f3196e = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        int size = first.getSize();
        while (true) {
            V v3 = null;
            if (i10 >= size) {
                break;
            }
            V v6 = this.f3195d;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            } else {
                v3 = v6;
            }
            v3.set$animation_core_release(i10, VectorConvertersKt.lerp(first.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), fTransform));
            i10++;
        }
        V v10 = this.f3195d;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getVelocityFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        long jCoerceIn = c.coerceIn((playTimeNanos / AnimationKt.MillisToNanos) - ((long) getDelayMillis()), 0L, (long) getDurationMillis());
        if (jCoerceIn <= 0) {
            return initialVelocity;
        }
        AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, jCoerceIn - 1, initialValue, targetValue, initialVelocity);
        AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, jCoerceIn, initialValue, targetValue, initialVelocity);
        if (this.f3195d == null) {
            this.f3195d = (V) AnimationVectorsKt.newInstance(initialValue);
            this.f3196e = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        int size = valueFromMillis.getSize();
        int i10 = 0;
        while (true) {
            V v3 = null;
            if (i10 >= size) {
                break;
            }
            V v6 = this.f3196e;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            } else {
                v3 = v6;
            }
            v3.set$animation_core_release(i10, (valueFromMillis.get$animation_core_release(i10) - valueFromMillis2.get$animation_core_release(i10)) * 1000.0f);
            i10++;
        }
        V v10 = this.f3196e;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedFiniteAnimationSpec, androidx.compose.animation.core.VectorizedAnimationSpec
    public final /* synthetic */ boolean isInfinite() {
        return i.a(this);
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i10, (i12 & 4) != 0 ? 0 : i11);
    }
}
