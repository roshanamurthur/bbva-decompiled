package s;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVectorsKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.VectorizedDecayAnimationSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FloatDecayAnimationSpec f93112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f93113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f93114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f93115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f93116e;

    public j(@NotNull FloatDecayAnimationSpec floatDecaySpec) {
        Intrinsics.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f93112a = floatDecaySpec;
        this.f93116e = floatDecaySpec.getAbsVelocityThreshold();
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final float getAbsVelocityThreshold() {
        return this.f93116e;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public final long getDurationNanos(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f93114c == null) {
            this.f93114c = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v3 = this.f93114c;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int size = v3.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, this.f93112a.getDurationNanos(initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public final V getTargetValue(@NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f93115d == null) {
            this.f93115d = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v3 = this.f93115d;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v3 = null;
        }
        int size = v3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v6 = this.f93115d;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                v6 = null;
            }
            v6.set$animation_core_release(i10, this.f93112a.getTargetValue(initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        V v10 = this.f93115d;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public final V getValueFromNanos(long j10, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f93113b == null) {
            this.f93113b = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v3 = this.f93113b;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v3 = null;
        }
        int size = v3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v6 = this.f93113b;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v6 = null;
            }
            v6.set$animation_core_release(i10, this.f93112a.getValueFromNanos(j10, initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        V v10 = this.f93113b;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    @NotNull
    public final V getVelocityFromNanos(long j10, @NotNull V initialValue, @NotNull V initialVelocity) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity");
        if (this.f93114c == null) {
            this.f93114c = (V) AnimationVectorsKt.newInstance(initialValue);
        }
        V v3 = this.f93114c;
        if (v3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int size = v3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v6 = this.f93114c;
            if (v6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v6 = null;
            }
            v6.set$animation_core_release(i10, this.f93112a.getVelocityFromNanos(j10, initialValue.get$animation_core_release(i10), initialVelocity.get$animation_core_release(i10)));
        }
        V v10 = this.f93114c;
        if (v10 != null) {
            return v10;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
