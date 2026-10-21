package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'B4\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001a\u0012\b\b\u0002\u0010%\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b&\u0010(J,\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0013\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010%\u001a\u00020 8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/animation/core/RepeatableSpec;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "vectorize", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIterations", "()I", "iterations", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "b", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "getAnimation", "()Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "animation", "Landroidx/compose/animation/core/RepeatMode;", "c", "Landroidx/compose/animation/core/RepeatMode;", "getRepeatMode", "()Landroidx/compose/animation/core/RepeatMode;", "repeatMode", "Landroidx/compose/animation/core/StartOffset;", "d", "J", "getInitialStartOffset-Rmkjzm4", "()J", "initialStartOffset", "<init>", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class RepeatableSpec<T> implements FiniteAnimationSpec<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int iterations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DurationBasedAnimationSpec<T> animation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final RepeatMode repeatMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long initialStartOffset;

    public RepeatableSpec() {
        throw null;
    }

    public RepeatableSpec(int i10, DurationBasedAnimationSpec animation, RepeatMode repeatMode, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
        this.iterations = i10;
        this.animation = animation;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j10;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof RepeatableSpec)) {
            return false;
        }
        RepeatableSpec repeatableSpec = (RepeatableSpec) other;
        return repeatableSpec.iterations == this.iterations && Intrinsics.areEqual(repeatableSpec.animation, this.animation) && repeatableSpec.repeatMode == this.repeatMode && StartOffset.m99equalsimpl0(repeatableSpec.initialStartOffset, this.initialStartOffset);
    }

    @NotNull
    public final DurationBasedAnimationSpec<T> getAnimation() {
        return this.animation;
    }

    /* JADX INFO: renamed from: getInitialStartOffset-Rmkjzm4, reason: not valid java name and from getter */
    public final long getInitialStartOffset() {
        return this.initialStartOffset;
    }

    public final int getIterations() {
        return this.iterations;
    }

    @NotNull
    public final RepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public int hashCode() {
        return StartOffset.m102hashCodeimpl(this.initialStartOffset) + ((this.repeatMode.hashCode() + ((this.animation.hashCode() + (this.iterations * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(@NotNull TwoWayConverter<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedRepeatableSpec(this.iterations, this.animation.vectorize((TwoWayConverter) converter), this.repeatMode, this.initialStartOffset, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ RepeatableSpec(int i10, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, durationBasedAnimationSpec, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i11 & 8) != 0 ? StartOffset.m97constructorimpl$default(0, 0, 2, null) : j10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ RepeatableSpec(int i10, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, durationBasedAnimationSpec, (i11 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ RepeatableSpec(int i10, DurationBasedAnimationSpec animation, RepeatMode repeatMode) {
        this(i10, animation, repeatMode, StartOffset.m97constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(repeatMode, "repeatMode");
    }
}
