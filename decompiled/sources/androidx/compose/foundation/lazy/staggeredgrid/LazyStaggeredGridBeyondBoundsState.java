package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.ui.layout.Remeasurement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "", "remeasure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "getItemCount", "()I", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyStaggeredGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridState state;

    public LazyStaggeredGridBeyondBoundsState(@NotNull LazyStaggeredGridState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return this.state.getFirstVisibleItemIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.state.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.state.getLayoutInfo().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return ((LazyStaggeredGridItemInfo) CollectionsKt___CollectionsKt.last((List) this.state.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    @NotNull
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public void remeasure() {
        Remeasurement remeasurement = this.state.getRemeasurement();
        if (remeasurement != null) {
            remeasurement.forceRemeasure();
        }
    }
}
