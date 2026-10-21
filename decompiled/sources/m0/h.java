package m0;

import androidx.compose.runtime.FloatState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotFloatState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h {
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @NotNull
    public static Float a(FloatState floatState) {
        return Float.valueOf(floatState.getFloatValue());
    }
}
