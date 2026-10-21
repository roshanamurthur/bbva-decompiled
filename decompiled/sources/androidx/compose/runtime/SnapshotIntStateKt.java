package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotIntState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0})
public final class SnapshotIntStateKt {
    public static final int getValue(@NotNull IntState intState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return intState.getIntValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableIntState mutableIntStateOf(int i10) {
        return ActualAndroid_androidKt.createSnapshotMutableIntState(i10);
    }

    public static final void setValue(@NotNull MutableIntState mutableIntState, @Nullable Object obj, @NotNull KProperty<?> kProperty, int i10) {
        mutableIntState.setIntValue(i10);
    }
}
