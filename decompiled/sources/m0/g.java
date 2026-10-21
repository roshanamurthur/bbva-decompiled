package m0;

import androidx.compose.runtime.DoubleState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    @NotNull
    public static Double a(DoubleState doubleState) {
        return Double.valueOf(doubleState.getDoubleValue());
    }
}
