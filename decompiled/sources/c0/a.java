package c0;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: BringIntoViewRequester.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static /* synthetic */ Object a(BringIntoViewRequester bringIntoViewRequester, Rect rect, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return bringIntoViewRequester.bringIntoView(rect, continuation);
    }
}
