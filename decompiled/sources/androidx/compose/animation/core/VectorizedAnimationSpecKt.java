package androidx.compose.animation.core;

import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\u001a;\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aC\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "initialValue", "targetValue", "initialVelocity", "", "getDurationMillis", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "playTimeMillis", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "startVelocity", "getValueFromMillis", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 8, 0})
public final class VectorizedAnimationSpecKt {
    public static final Animations access$createSpringAnimations(final AnimationVector animationVector, final float f6, final float f10) {
        return animationVector != null ? new Animations(animationVector, f6, f10) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final ArrayList f3181a;

            /* JADX WARN: Multi-variable type inference failed */
            {
                IntRange intRangeUntil = c.until(0, animationVector.getSize());
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    arrayList.add(new FloatSpringSpec(f6, f10, animationVector.get$animation_core_release(((IntIterator) it).nextInt())));
                }
                this.f3181a = arrayList;
            }

            @Override // androidx.compose.animation.core.Animations
            @NotNull
            public FloatSpringSpec get(int index) {
                return (FloatSpringSpec) this.f3181a.get(index);
            }
        } : new Animations(f6, f10) { // from class: androidx.compose.animation.core.VectorizedAnimationSpecKt$createSpringAnimations$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final FloatSpringSpec f3182a;

            {
                this.f3182a = new FloatSpringSpec(f6, f10, 0.0f, 4, null);
            }

            @Override // androidx.compose.animation.core.Animations
            @NotNull
            public FloatSpringSpec get(int index) {
                return this.f3182a;
            }
        };
    }

    public static final <V extends AnimationVector> long getDurationMillis(@NotNull VectorizedAnimationSpec<V> vectorizedAnimationSpec, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(vectorizedAnimationSpec, "<this>");
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        return vectorizedAnimationSpec.getDurationNanos(initialValue, targetValue, initialVelocity) / AnimationKt.MillisToNanos;
    }

    @NotNull
    public static final <V extends AnimationVector> V getValueFromMillis(@NotNull VectorizedAnimationSpec<V> vectorizedAnimationSpec, long j10, @NotNull V start, @NotNull V end, @NotNull V startVelocity) {
        Intrinsics.checkNotNullParameter(vectorizedAnimationSpec, "<this>");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(startVelocity, "startVelocity");
        return (V) vectorizedAnimationSpec.getValueFromNanos(j10 * AnimationKt.MillisToNanos, start, end, startVelocity);
    }
}
