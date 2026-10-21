package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u00101\u001a\u00028\u0000\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010#\u001a\u00020\u001c\u0012\b\b\u0002\u0010'\u001a\u00020\u001c\u0012\b\b\u0002\u0010+\u001a\u00020(¢\u0006\u0004\b3\u00104J\b\u0010\u0006\u001a\u00020\u0005H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR+\u0010\u0014\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u001b\u001a\u00028\u00012\u0006\u0010\r\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010'\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R*\u0010+\u001a\u00020(2\u0006\u0010\r\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00100\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b/\u0010\u0011¨\u00065"}, d2 = {"Landroidx/compose/animation/core/AnimationState;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "", "toString", "Landroidx/compose/animation/core/TwoWayConverter;", "p0", "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "<set-?>", "q0", "Landroidx/compose/runtime/MutableState;", "getValue", "()Ljava/lang/Object;", "setValue$animation_core_release", "(Ljava/lang/Object;)V", "value", "r0", "Landroidx/compose/animation/core/AnimationVector;", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "setVelocityVector$animation_core_release", "(Landroidx/compose/animation/core/AnimationVector;)V", "velocityVector", "", "s0", "J", "getLastFrameTimeNanos", "()J", "setLastFrameTimeNanos$animation_core_release", "(J)V", "lastFrameTimeNanos", "t0", "getFinishedTimeNanos", "setFinishedTimeNanos$animation_core_release", "finishedTimeNanos", "", "u0", "Z", "isRunning", "()Z", "setRunning$animation_core_release", "(Z)V", "getVelocity", "velocity", "initialValue", "initialVelocityVector", "<init>", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZ)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
public final class AnimationState<T, V extends AnimationVector> implements State<T> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TwoWayConverter<T, V> typeConverter;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState value;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public V velocityVector;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata and from toString */
    public long lastFrameTimeNanos;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata and from toString */
    public long finishedTimeNanos;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean isRunning;

    public AnimationState(@NotNull TwoWayConverter<T, V> typeConverter, T t10, @Nullable V v3, long j10, long j11, boolean z10) {
        V v6;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.typeConverter = typeConverter;
        this.value = SnapshotStateKt.mutableStateOf$default(t10, null, 2, null);
        this.velocityVector = (v3 == null || (v6 = (V) AnimationVectorsKt.copy(v3)) == null) ? (V) AnimationStateKt.createZeroVectorFrom(typeConverter, t10) : v6;
        this.lastFrameTimeNanos = j10;
        this.finishedTimeNanos = j11;
        this.isRunning = z10;
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    @NotNull
    public final TwoWayConverter<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    @NotNull
    public final V getVelocityVector() {
        return this.velocityVector;
    }

    /* JADX INFO: renamed from: isRunning, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j10) {
        this.finishedTimeNanos = j10;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j10) {
        this.lastFrameTimeNanos = j10;
    }

    public final void setRunning$animation_core_release(boolean z10) {
        this.isRunning = z10;
    }

    public void setValue$animation_core_release(T t10) {
        this.value.setValue(t10);
    }

    public final void setVelocityVector$animation_core_release(@NotNull V v3) {
        Intrinsics.checkNotNullParameter(v3, "<set-?>");
        this.velocityVector = v3;
    }

    @NotNull
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ AnimationState(TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(twoWayConverter, obj, (i10 & 4) != 0 ? null : animationVector, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
