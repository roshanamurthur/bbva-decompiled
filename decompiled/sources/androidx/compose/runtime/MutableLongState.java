package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.Metadata;
import m0.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotLongState.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0018\u0010\u0004\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/MutableState;", "", "longValue", "getLongValue", "()J", "setLongValue", "(J)V", "value", "getValue", "()Ljava/lang/Long;", "setValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface MutableLongState extends LongState, MutableState<Long> {

    /* JADX INFO: compiled from: SnapshotLongState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        @NotNull
        public static Long getValue(@NotNull MutableLongState mutableLongState) {
            return Long.valueOf(s.a(mutableLongState).longValue());
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
        @Deprecated
        public static void setValue(@NotNull MutableLongState mutableLongState, long j10) {
            s.c(mutableLongState, j10);
        }
    }

    @Override // androidx.compose.runtime.LongState
    long getLongValue();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    @NotNull
    Long getValue();

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Long getValue();

    void setLongValue(long j10);

    @AutoboxingStateValueProperty(preferredPropertyName = "longValue")
    void setValue(long j10);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Long l6);
}
