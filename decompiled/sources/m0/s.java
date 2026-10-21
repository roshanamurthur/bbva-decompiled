package m0;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s {
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @NotNull
    public static Long a(MutableLongState mutableLongState) {
        return Long.valueOf(mutableLongState.getLongValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    public static void c(MutableLongState mutableLongState, long j10) {
        mutableLongState.setLongValue(j10);
    }
}
