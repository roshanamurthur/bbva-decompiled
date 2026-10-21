package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0013\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/TweenSpec;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedTweenSpec;", "vectorize", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDurationMillis", "()I", "durationMillis", "b", "getDelay", "delay", "Landroidx/compose/animation/core/Easing;", "c", "Landroidx/compose/animation/core/Easing;", "getEasing", "()Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(IILandroidx/compose/animation/core/Easing;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class TweenSpec<T> implements DurationBasedAnimationSpec<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int durationMillis;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int delay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Easing easing;

    public TweenSpec() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof TweenSpec)) {
            return false;
        }
        TweenSpec tweenSpec = (TweenSpec) other;
        return tweenSpec.durationMillis == this.durationMillis && tweenSpec.delay == this.delay && Intrinsics.areEqual(tweenSpec.easing, this.easing);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    @NotNull
    public final Easing getEasing() {
        return this.easing;
    }

    public int hashCode() {
        return ((this.easing.hashCode() + (this.durationMillis * 31)) * 31) + this.delay;
    }

    public TweenSpec(int i10, int i11, @NotNull Easing easing) {
        Intrinsics.checkNotNullParameter(easing, "easing");
        this.durationMillis = i10;
        this.delay = i11;
        this.easing = easing;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedTweenSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedTweenSpec<>(this.durationMillis, this.delay, this.easing);
    }

    public /* synthetic */ TweenSpec(int i10, int i11, Easing easing, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }
}
