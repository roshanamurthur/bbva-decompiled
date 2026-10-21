package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u00109\u001a\u00028\u0000\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010:\u001a\u00028\u0001\u0012\u0006\u0010,\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u00103\u001a\u000201\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00050;¢\u0006\u0004\b=\u0010>J\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010 \u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010,\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00148F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010+R*\u00100\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00148F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010+R+\u00103\u001a\u0002012\u0006\u0010\u001a\u001a\u0002018F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0011\u00108\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b7\u0010\u0012¨\u0006?"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "cancelAnimation", "Landroidx/compose/animation/core/AnimationState;", "toAnimationState", "Landroidx/compose/animation/core/TwoWayConverter;", "a", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "b", "Ljava/lang/Object;", "getTargetValue", "()Ljava/lang/Object;", "targetValue", "", "c", "J", "getStartTimeNanos", "()J", "startTimeNanos", "<set-?>", "e", "Landroidx/compose/runtime/MutableState;", "getValue", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", "f", "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core_release", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", "g", "getLastFrameTimeNanos", "setLastFrameTimeNanos$animation_core_release", "(J)V", "lastFrameTimeNanos", "h", "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core_release", "finishedTimeNanos", "", "i", "isRunning", "()Z", "setRunning$animation_core_release", "(Z)V", "getVelocity", "velocity", "initialValue", "initialVelocityVector", "Lkotlin/Function0;", "onCancel", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
public final class AnimationScope<T, V extends AnimationVector> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TwoWayConverter<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final T targetValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long startTimeNanos;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f2883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState value;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public V velocityVector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long lastFrameTimeNanos;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public long finishedTimeNanos;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isRunning;

    public AnimationScope(T t10, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull V initialVelocityVector, long j10, T t11, long j11, boolean z10, @NotNull Function0<Unit> onCancel) {
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.typeConverter = typeConverter;
        this.targetValue = t11;
        this.startTimeNanos = j11;
        this.f2883d = onCancel;
        this.value = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.velocityVector = (V) AnimationVectorsKt.copy(initialVelocityVector);
        this.lastFrameTimeNanos = j10;
        this.finishedTimeNanos = Long.MIN_VALUE;
        this.isRunning = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z10), null, 2, null);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.f2883d.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getValue() {
        return this.value.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    @NotNull
    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j10) {
        this.finishedTimeNanos = j10;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j10) {
        this.lastFrameTimeNanos = j10;
    }

    public final void setRunning$animation_core_release(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    public final void setValue$animation_core_release(T t10) {
        this.value.setValue(t10);
    }

    public final void setVelocityVector$animation_core_release(@NotNull V v3) {
        Intrinsics.checkNotNullParameter(v3, "<set-?>");
        this.velocityVector = v3;
    }

    @NotNull
    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
