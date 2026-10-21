package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bw\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0017\u0012\u0006\u0010K\u001a\u00020\u0002\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\u0006\u0010,\u001a\u00020\u000b\u0012\u0006\u0010/\u001a\u00020\u0011\u0012\u0006\u00105\u001a\u000200\u0012\u0006\u00108\u001a\u00020\u000b\u0012\u0006\u0010;\u001a\u00020\u000b¢\u0006\u0004\bL\u0010MJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000fR\u001a\u0010)\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u000fR\u001a\u0010,\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b+\u0010\u000fR\u001a\u0010/\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00108\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u000fR\u001a\u0010;\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010\r\u001a\u0004\b:\u0010\u000fR \u0010@\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u000b0<8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010\u000fR\u0014\u0010D\u001a\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010\u000fR\u001d\u0010H\u001a\u00020E8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "placeChildren", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "a", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getFirstVisibleLine", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLine", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFirstVisibleLineScrollOffset", "()I", "firstVisibleLineScrollOffset", "", "c", "Z", "getCanScrollForward", "()Z", "canScrollForward", "", "d", "F", "getConsumedScroll", "()F", "consumedScroll", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "e", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "f", "getViewportStartOffset", "viewportStartOffset", "g", "getViewportEndOffset", "viewportEndOffset", "h", "getTotalItemsCount", "totalItemsCount", "i", "getReverseLayout", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "j", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "k", "getAfterContentPadding", "afterContentPadding", "l", "getMainAxisItemSpacing", "mainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "measureResult", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LazyGridMeasuredLine firstVisibleLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int firstVisibleLineScrollOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean canScrollForward;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float consumedScroll;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<LazyGridItemInfo> visibleItemsInfo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int viewportStartOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int viewportEndOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int totalItemsCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean reverseLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Orientation orientation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int afterContentPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisItemSpacing;
    public final /* synthetic */ MeasureResult m;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridMeasureResult(@Nullable LazyGridMeasuredLine lazyGridMeasuredLine, int i10, boolean z10, float f6, @NotNull MeasureResult measureResult, @NotNull List<? extends LazyGridItemInfo> visibleItemsInfo, int i11, int i12, int i13, boolean z11, @NotNull Orientation orientation, int i14, int i15) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        Intrinsics.checkNotNullParameter(visibleItemsInfo, "visibleItemsInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.firstVisibleLine = lazyGridMeasuredLine;
        this.firstVisibleLineScrollOffset = i10;
        this.canScrollForward = z10;
        this.consumedScroll = f6;
        this.visibleItemsInfo = visibleItemsInfo;
        this.viewportStartOffset = i11;
        this.viewportEndOffset = i12;
        this.totalItemsCount = i13;
        this.reverseLayout = z11;
        this.orientation = orientation;
        this.afterContentPadding = i14;
        this.mainAxisItemSpacing = i15;
        this.m = measureResult;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.m.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @Nullable
    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.firstVisibleLine;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.firstVisibleLineScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.m.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo388getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public List<LazyGridItemInfo> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.m.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.m.placeChildren();
    }
}
