package u;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.TransformableState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t {
    public static /* synthetic */ Object a(TransformableState transformableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return transformableState.transform(mutatePriority, function2, continuation);
    }
}
