package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0})
public final class SnapshotDoubleStateKt {
    public static final double getValue(@NotNull DoubleState doubleState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return doubleState.getDoubleValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableDoubleState mutableDoubleStateOf(double d2) {
        return ActualAndroid_androidKt.createSnapshotMutableDoubleState(d2);
    }

    public static final void setValue(@NotNull MutableDoubleState mutableDoubleState, @Nullable Object obj, @NotNull KProperty<?> kProperty, double d2) {
        mutableDoubleState.setDoubleValue(d2);
    }
}
