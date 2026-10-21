package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\tR+\u0010\n\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/MutableTransitionState;", ExifInterface.LATITUDE_SOUTH, "", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getCurrentState", "()Ljava/lang/Object;", "setCurrentState$animation_core_release", "(Ljava/lang/Object;)V", "currentState", "b", "getTargetState", "setTargetState", "targetState", "", "c", "isRunning$animation_core_release", "()Z", "setRunning$animation_core_release", "(Z)V", "isRunning", "isIdle", "initialState", "<init>", "animation-core_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n81#2:1160\n107#2,2:1161\n81#2:1163\n107#2,2:1164\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n104#1:1157\n104#1:1158,2\n116#1:1160\n116#1:1161,2\n128#1:1163\n128#1:1164,2\n*E\n"})
public final class MutableTransitionState<S> {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState currentState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState targetState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isRunning = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public MutableTransitionState(S s4) {
        this.currentState = SnapshotStateKt.mutableStateOf$default(s4, null, 2, null);
        this.targetState = SnapshotStateKt.mutableStateOf$default(s4, null, 2, null);
    }

    public final S getCurrentState() {
        return (S) this.currentState.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState.getValue();
    }

    public final boolean isIdle() {
        return Intrinsics.areEqual(getCurrentState(), getTargetState()) && !isRunning$animation_core_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void setCurrentState$animation_core_release(S s4) {
        this.currentState.setValue(s4);
    }

    public final void setRunning$animation_core_release(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }

    public final void setTargetState(S s4) {
        this.targetState.setValue(s4);
    }
}
