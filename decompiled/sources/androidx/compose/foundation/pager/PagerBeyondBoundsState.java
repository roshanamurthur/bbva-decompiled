package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.ui.layout.Remeasurement;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PagerBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/pager/PagerBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "", "remeasure", "", "getItemCount", "()I", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex", "Landroidx/compose/foundation/pager/PagerState;", "state", "beyondBoundsPageCount", "<init>", "(Landroidx/compose/foundation/pager/PagerState;I)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PagerState f5376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5377b;

    public PagerBeyondBoundsState(@NotNull PagerState state, int i10) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f5376a = state;
        this.f5377b = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.f5376a.getFirstVisiblePage$foundation_release() - this.f5377b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.f5376a.getLayoutInfo$foundation_release().getVisiblePagesInfo().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.f5376a.getLayoutInfo$foundation_release().getPagesCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return Math.min(getItemCount() - 1, ((PageInfo) CollectionsKt___CollectionsKt.last((List) this.f5376a.getLayoutInfo$foundation_release().getVisiblePagesInfo())).getIndex() + this.f5377b);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public void remeasure() {
        Remeasurement remeasurement$foundation_release = this.f5376a.getRemeasurement$foundation_release();
        if (remeasurement$foundation_release != null) {
            remeasurement$foundation_release.forceRemeasure();
        }
    }
}
