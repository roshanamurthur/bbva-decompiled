package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyGridLayoutInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u001d\u0010\u0012\u001a\u00020\u000f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0014\u0010\u001e\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0014\u0010 \u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\t\u0082\u0001\u0002!\"ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "", "getViewportStartOffset", "()I", "viewportStartOffset", "getViewportEndOffset", "viewportEndOffset", "getTotalItemsCount", "totalItemsCount", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "getReverseLayout", "()Z", "reverseLayout", "getBeforeContentPadding", "beforeContentPadding", "getAfterContentPadding", "afterContentPadding", "getMainAxisItemSpacing", "mainAxisItemSpacing", "Lz/b;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "foundation_release"}, k = 1, mv = {1, 8, 0})
public interface LazyGridLayoutInfo {
    int getAfterContentPadding();

    int getBeforeContentPadding();

    int getMainAxisItemSpacing();

    @NotNull
    Orientation getOrientation();

    boolean getReverseLayout();

    int getTotalItemsCount();

    int getViewportEndOffset();

    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo388getViewportSizeYbymL2g();

    int getViewportStartOffset();

    @NotNull
    List<LazyGridItemInfo> getVisibleItemsInfo();
}
