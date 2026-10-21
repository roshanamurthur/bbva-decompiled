package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0016R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/AnimationResult;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "toString", "Landroidx/compose/animation/core/AnimationState;", "a", "Landroidx/compose/animation/core/AnimationState;", "getEndState", "()Landroidx/compose/animation/core/AnimationState;", "endState", "Landroidx/compose/animation/core/AnimationEndReason;", "b", "Landroidx/compose/animation/core/AnimationEndReason;", "getEndReason", "()Landroidx/compose/animation/core/AnimationEndReason;", "endReason", "<init>", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationEndReason;)V", "animation-core_release"}, k = 1, mv = {1, 8, 0})
public final class AnimationResult<T, V extends AnimationVector> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnimationState<T, V> endState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AnimationEndReason endReason;

    public AnimationResult(@NotNull AnimationState<T, V> endState, @NotNull AnimationEndReason endReason) {
        Intrinsics.checkNotNullParameter(endState, "endState");
        Intrinsics.checkNotNullParameter(endReason, "endReason");
        this.endState = endState;
        this.endReason = endReason;
    }

    @NotNull
    public final AnimationEndReason getEndReason() {
        return this.endReason;
    }

    @NotNull
    public final AnimationState<T, V> getEndState() {
        return this.endState;
    }

    @NotNull
    public String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + RootService.CLOSE_BRACKET;
    }
}
