package u;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {472, 481, 600, 650}, m = "awaitDownAndSlop", n = {"$this$awaitDownAndSlop", "canDrag", "startDragImmediately", "velocityTracker", "orientation", "$this$awaitDownAndSlop", "velocityTracker", "orientation", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv", "initialDelta", "postPointerSlop", "$this$awaitPointerSlopOrCancellation_u2dwtdNQyU_u24default$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "triggerOnMainAxisSlop$iv", "touchSlop$iv", "totalMainPositionChange$iv", "totalCrossPositionChange$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "F$0", "F$1", "F$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "F$0", "F$1", "F$2"})
public final class b extends ContinuationImpl {
    public /* synthetic */ Object E0;
    public int F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Object f93631p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Object f93632q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Object f93633r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Object f93634s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Serializable f93635t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PointerInputChange f93636u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f93637w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f93638x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public float f93639y0;

    public b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.E0 = obj;
        this.F0 |= Integer.MIN_VALUE;
        return DraggableKt.access$awaitDownAndSlop(null, null, null, null, null, this);
    }
}
