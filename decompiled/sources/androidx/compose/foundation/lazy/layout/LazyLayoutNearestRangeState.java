package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lkotlin/ranges/IntRange;", "", "firstVisibleItem", "", "update", "<set-?>", "r0", "Landroidx/compose/runtime/MutableState;", "getValue", "()Lkotlin/ranges/IntRange;", "setValue", "(Lkotlin/ranges/IntRange;)V", "value", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "a", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,65:1\n81#2:66\n107#2,2:67\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n31#1:66\n31#1:67,2\n*E\n"})
public final class LazyLayoutNearestRangeState implements State<IntRange> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f5004p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f5005q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState value;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f5007s0;

    /* JADX INFO: compiled from: LazyLayoutNearestRangeState.kt */
    public static final class a {
    }

    public LazyLayoutNearestRangeState(int i10, int i11, int i12) {
        this.f5004p0 = i11;
        this.f5005q0 = i12;
        int i13 = (i10 / i11) * i11;
        this.value = SnapshotStateKt.mutableStateOf(kotlin.ranges.c.until(Math.max(i13 - i12, 0), i13 + i11 + i12), SnapshotStateKt.structuralEqualityPolicy());
        this.f5007s0 = i10;
    }

    public final void update(int firstVisibleItem) {
        if (firstVisibleItem != this.f5007s0) {
            this.f5007s0 = firstVisibleItem;
            int i10 = this.f5004p0;
            int i11 = (firstVisibleItem / i10) * i10;
            int i12 = this.f5005q0;
            this.value.setValue(kotlin.ranges.c.until(Math.max(i11 - i12, 0), i11 + i10 + i12));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.State
    @NotNull
    public IntRange getValue() {
        return (IntRange) this.value.getValue();
    }
}
