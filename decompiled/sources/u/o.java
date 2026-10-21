package u;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ScrollableState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o {
    public static boolean a(ScrollableState scrollableState) {
        return true;
    }

    public static boolean b(ScrollableState scrollableState) {
        return true;
    }

    public static /* synthetic */ Object e(ScrollableState scrollableState, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollableState.scroll(mutatePriority, function2, continuation);
    }
}
