package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TextToolbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        textToolbar.showMenu(rect, (i10 & 2) != 0 ? null : function0, (i10 & 4) != 0 ? null : function1, (i10 & 8) != 0 ? null : function2, (i10 & 16) != 0 ? null : function3);
    }
}
