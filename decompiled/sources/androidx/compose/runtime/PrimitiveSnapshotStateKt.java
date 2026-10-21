package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnapshotFloatState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0})
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(@NotNull FloatState floatState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return floatState.getFloatValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableFloatState mutableFloatStateOf(float f6) {
        return ActualAndroid_androidKt.createSnapshotMutableFloatState(f6);
    }

    public static final void setValue(@NotNull MutableFloatState mutableFloatState, @Nullable Object obj, @NotNull KProperty<?> kProperty, float f6) {
        mutableFloatState.setFloatValue(f6);
    }
}
