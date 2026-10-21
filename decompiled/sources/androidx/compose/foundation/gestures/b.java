package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.DragInteraction;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableNode", f = "Draggable.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {433, 436, 438}, m = "processDragStart", n = {"this", "$this$processDragStart", "event", "this", "$this$processDragStart", "event", "interaction"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
public final class b extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public DraggableNode f4014p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CoroutineScope f4015q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public DragEvent.DragStarted f4016r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public DragInteraction.Start f4017s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public /* synthetic */ Object f4018t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ DraggableNode f4019u0;
    public int v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DraggableNode draggableNode, Continuation<? super b> continuation) {
        super(continuation);
        this.f4019u0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f4018t0 = obj;
        this.v0 |= Integer.MIN_VALUE;
        return DraggableNode.access$processDragStart(this.f4019u0, null, null, this);
    }
}
