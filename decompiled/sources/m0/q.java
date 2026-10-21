package m0;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotFloatState.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q {
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    @NotNull
    public static Float a(MutableFloatState mutableFloatState) {
        return Float.valueOf(mutableFloatState.getFloatValue());
    }

    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    public static void c(MutableFloatState mutableFloatState, float f6) {
        mutableFloatState.setFloatValue(f6);
    }
}
