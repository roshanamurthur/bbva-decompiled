package m0;

import androidx.compose.runtime.LongState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n {
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @NotNull
    public static Long a(LongState longState) {
        return Long.valueOf(longState.getLongValue());
    }
}
