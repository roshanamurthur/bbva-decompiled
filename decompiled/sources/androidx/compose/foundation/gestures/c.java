package androidx.compose.foundation.gestures;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", i = {0, 0, 0}, l = {443, 446}, m = "processDragStop", n = {"this", "$this$processDragStop", "event"}, s = {"L$0", "L$1", "L$2"})
public final class c extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DraggableNode f4020p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CoroutineScope f4021q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DragEvent.DragStopped f4022r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f4023s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ DraggableNode f4024t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f4025u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DraggableNode draggableNode, Continuation<? super c> continuation) {
        super(continuation);
        this.f4024t0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f4023s0 = obj;
        this.f4025u0 |= Integer.MIN_VALUE;
        return DraggableNode.access$processDragStop(this.f4024t0, null, null, this);
    }
}
