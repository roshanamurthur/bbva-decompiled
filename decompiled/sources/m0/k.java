package m0;

import androidx.compose.runtime.IntState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotIntState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k {
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    @NotNull
    public static Integer a(IntState intState) {
        return Integer.valueOf(intState.getIntValue());
    }
}
