package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import s.i;

/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J/\u0010\t\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Landroidx/compose/animation/core/VectorizedFloatAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "getEndVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getDurationNanos", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "Landroidx/compose/animation/core/Animations;", "anims", "<init>", "(Landroidx/compose/animation/core/Animations;)V", "Landroidx/compose/animation/core/FloatAnimationSpec;", "anim", "(Landroidx/compose/animation/core/FloatAnimationSpec;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,813:1\n1855#2,2:814\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedFloatAnimationSpec\n*L\n804#1:814,2\n*E\n"})
public final class VectorizedFloatAnimationSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Animations f3183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f3184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f3185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f3186d;

    public VectorizedFloatAnimationSpec(@NotNull Animations anims) {
        Intrinsics.checkNotNullParameter(anims, "anims");
        this.f3183a = anims;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        Iterator<Integer> it = c.until(0, initialValue.getSize()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            jMax = Math.max(jMax, this.f3183a.get(iNextInt).getDurationNanos(initialValue.get$animation_core_release(iNextInt), targetValue.get$animation_core_release(iNextInt), initialVelocity.get$animation_core_release(iNextInt)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getEndVelocity(@NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f3186d == null) {
            this.f3186d = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v3 = this.f3186d;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v6 = this.f3186d;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
                v6 = null;
            }
            v6.set$animation_core_release(i10, this.f3183a.get(i10).getEndVelocity(initialValue.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        V v10 = this.f3186d;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endVelocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    @NotNull
    public V getValueFromNanos(long playTimeNanos, @NotNull V initialValue, @NotNull V targetValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f3184b == null) {
            this.f3184b = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v3 = this.f3184b;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v6 = this.f3184b;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v6 = null;
            }
            v6.set$animation_core_release(i10, this.f3183a.get(i10).getValueFromNanos(playTimeNanos, initialValue.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        V v10 = this.f3184b;
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
        if (this.f3185c == null) {
            this.f3185c = (V) AnimationVectorsKt.newInstance(initialVelocity);
        }
        V v3 = this.f3185c;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            V v6 = this.f3185c;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v6 = null;
            }
            v6.set$animation_core_release(i10, this.f3183a.get(i10).getVelocityFromNanos(playTimeNanos, initialValue.get$animation_core_release(i10), targetValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        V v10 = this.f3185c;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VectorizedFloatAnimationSpec(@NotNull final FloatAnimationSpec anim) {
        this(new Animations() { // from class: androidx.compose.animation.core.VectorizedFloatAnimationSpec.1
            @Override // androidx.compose.animation.core.Animations
            @NotNull
            public FloatAnimationSpec get(int index) {
                return anim;
            }
        });
        Intrinsics.checkNotNullParameter(anim, "anim");
    }
}
