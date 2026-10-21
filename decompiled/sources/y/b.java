package y;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements LazyListLayoutInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f94686a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<LazyListItemInfo> f94687b = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f94688c = IntSize.INSTANCE.m4554getZeroYbymL2g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Orientation f94689d = Orientation.Vertical;

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getAfterContentPadding() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getBeforeContentPadding() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getMainAxisItemSpacing() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public final Orientation getOrientation() {
        return f94689d;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final boolean getReverseLayout() {
        return false;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getTotalItemsCount() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getViewportEndOffset() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public final long mo367getViewportSizeYbymL2g() {
        return f94688c;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public final int getViewportStartOffset() {
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public final List<LazyListItemInfo> getVisibleItemsInfo() {
        return f94687b;
    }
}
