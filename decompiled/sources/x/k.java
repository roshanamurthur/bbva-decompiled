package x;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.ui.Modifier;

/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    public static /* synthetic */ Modifier a(ColumnScope columnScope, Modifier modifier, float f6, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return columnScope.weight(modifier, f6, z10);
    }
}
