package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/SpringSpec;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedSpringSpec;", "vectorize", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "a", "F", "getDampingRatio", "()F", "dampingRatio", "b", "getStiffness", "stiffness", "c", "Ljava/lang/Object;", "getVisibilityThreshold", "()Ljava/lang/Object;", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float dampingRatio;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float stiffness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof SpringSpec)) {
            return false;
        }
        SpringSpec springSpec = (SpringSpec) other;
        return springSpec.dampingRatio == this.dampingRatio && springSpec.stiffness == this.stiffness && Intrinsics.areEqual(springSpec.visibilityThreshold, this.visibilityThreshold);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Nullable
    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t10 = this.visibilityThreshold;
        return Float.floatToIntBits(this.stiffness) + z1.a(this.dampingRatio, (t10 != null ? t10.hashCode() : 0) * 31, 31);
    }

    public SpringSpec(float f6, float f10, @Nullable T t10) {
        this.dampingRatio = f6;
        this.stiffness = f10;
        this.visibilityThreshold = t10;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedSpringSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedSpringSpec<>(this.dampingRatio, this.stiffness, AnimationSpecKt.access$convert(converter, this.visibilityThreshold));
    }

    public /* synthetic */ SpringSpec(float f6, float f10, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f6, (i10 & 2) != 0 ? 1500.0f : f10, (i10 & 4) != 0 ? null : obj);
    }
}
