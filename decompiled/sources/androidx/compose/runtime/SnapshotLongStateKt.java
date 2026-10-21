package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0})
public final class SnapshotLongStateKt {
    public static final long getValue(@NotNull LongState longState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return longState.getLongValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableLongState mutableLongStateOf(long j10) {
        return ActualAndroid_androidKt.createSnapshotMutableLongState(j10);
    }

    public static final void setValue(@NotNull MutableLongState mutableLongState, @Nullable Object obj, @NotNull KProperty<?> kProperty, long j10) {
        mutableLongState.setLongValue(j10);
    }
}
