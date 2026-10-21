package u;

import androidx.compose.foundation.gestures.DraggableNode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", i = {0, 0}, l = {451, 454}, m = "processDragCancel", n = {"this", "$this$processDragCancel"}, s = {"L$0", "L$1"})
public final class d extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DraggableNode f93642p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CoroutineScope f93643q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public /* synthetic */ Object f93644r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ DraggableNode f93645s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f93646t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DraggableNode draggableNode, Continuation<? super d> continuation) {
        super(continuation);
        this.f93645s0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f93644r0 = obj;
        this.f93646t0 |= Integer.MIN_VALUE;
        return DraggableNode.access$processDragCancel(this.f93645s0, null, this);
    }
}
