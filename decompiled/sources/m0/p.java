package m0;

import androidx.compose.runtime.MutableDoubleState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p {
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    @NotNull
    public static Double a(MutableDoubleState mutableDoubleState) {
        return Double.valueOf(mutableDoubleState.getDoubleValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    public static void c(MutableDoubleState mutableDoubleState, double d2) {
        mutableDoubleState.setDoubleValue(d2);
    }
}
