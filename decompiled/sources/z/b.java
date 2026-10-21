package z;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyGridState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements LazyGridLayoutInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f94883a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<LazyGridItemInfo> f94884b = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f94885c = IntSize.INSTANCE.m4554getZeroYbymL2g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Orientation f94886d = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getAfterContentPadding() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getBeforeContentPadding() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getMainAxisItemSpacing() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public final Orientation getOrientation() {
        return f94886d;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final boolean getReverseLayout() {
        return false;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getTotalItemsCount() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getViewportEndOffset() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public final long mo388getViewportSizeYbymL2g() {
        return f94885c;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public final int getViewportStartOffset() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public final List<LazyGridItemInfo> getVisibleItemsInfo() {
        return f94884b;
    }
}
