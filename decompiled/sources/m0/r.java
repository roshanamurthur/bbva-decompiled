package m0;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotIntState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r {
    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    @NotNull
    public static Integer a(MutableIntState mutableIntState) {
        return Integer.valueOf(mutableIntState.getIntValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "intValue")
    public static void c(MutableIntState mutableIntState, int i10) {
        mutableIntState.setIntValue(i10);
    }
}
