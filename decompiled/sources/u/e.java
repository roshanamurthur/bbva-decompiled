package u;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    public static /* synthetic */ Object a(DraggableState draggableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return draggableState.drag(mutatePriority, function2, continuation);
    }
}
