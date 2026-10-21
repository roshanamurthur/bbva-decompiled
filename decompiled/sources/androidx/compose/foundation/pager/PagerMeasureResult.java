package androidx.compose.foundation.pager;

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

/* JADX INFO: compiled from: PagerMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010#\u001a\u00020\f\u0012\u0006\u0010&\u001a\u00020\f\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00102\u001a\u00020-\u0012\b\u00108\u001a\u0004\u0018\u000103\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010@\u001a\u00020\f\u0012\u0006\u0010C\u001a\u00020'\u0012\u0006\u0010S\u001a\u00020\u0002¢\u0006\u0004\bT\u0010UJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0001R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010R\u001a\u0010&\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u000e\u001a\u0004\b%\u0010\u0010R\u001a\u0010,\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u00108\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010=\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010@\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010\u000e\u001a\u0004\b?\u0010\u0010R\u0017\u0010C\u001a\u00020'8\u0006¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010+R \u0010H\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\f0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010\u0010R\u0014\u0010L\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010\u0010R\u001d\u0010P\u001a\u00020M8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "placeChildren", "", "Landroidx/compose/foundation/pager/PageInfo;", "a", "Ljava/util/List;", "getVisiblePagesInfo", "()Ljava/util/List;", "visiblePagesInfo", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPagesCount", "()I", "pagesCount", "c", "getPageSize", "pageSize", "d", "getPageSpacing", "pageSpacing", "e", "getAfterContentPadding", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "f", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "g", "getViewportStartOffset", "viewportStartOffset", "h", "getViewportEndOffset", "viewportEndOffset", "", "i", "Z", "getReverseLayout", "()Z", "reverseLayout", "", "j", "F", "getConsumedScroll", "()F", "consumedScroll", "Landroidx/compose/foundation/pager/MeasuredPage;", "k", "Landroidx/compose/foundation/pager/MeasuredPage;", "getFirstVisiblePage", "()Landroidx/compose/foundation/pager/MeasuredPage;", "firstVisiblePage", "l", "Landroidx/compose/foundation/pager/PageInfo;", "getClosestPageToSnapPosition", "()Landroidx/compose/foundation/pager/PageInfo;", "closestPageToSnapPosition", "m", "getFirstVisiblePageOffset", "firstVisiblePageOffset", "n", "getCanScrollForward", "canScrollForward", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "measureResult", "<init>", "(Ljava/util/List;IIIILandroidx/compose/foundation/gestures/Orientation;IIZFLandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/PageInfo;IZLandroidx/compose/ui/layout/MeasureResult;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<PageInfo> visiblePagesInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int pagesCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int pageSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int pageSpacing;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int afterContentPadding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Orientation orientation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int viewportStartOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int viewportEndOffset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final boolean reverseLayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final float consumedScroll;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final MeasuredPage firstVisiblePage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PageInfo closestPageToSnapPosition;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int firstVisiblePageOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final boolean canScrollForward;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ MeasureResult f5477o;

    /* JADX WARN: Multi-variable type inference failed */
    public PagerMeasureResult(@NotNull List<? extends PageInfo> visiblePagesInfo, int i10, int i11, int i12, int i13, @NotNull Orientation orientation, int i14, int i15, boolean z10, float f6, @Nullable MeasuredPage measuredPage, @Nullable PageInfo pageInfo, int i16, boolean z11, @NotNull MeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(visiblePagesInfo, "visiblePagesInfo");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        this.visiblePagesInfo = visiblePagesInfo;
        this.pagesCount = i10;
        this.pageSize = i11;
        this.pageSpacing = i12;
        this.afterContentPadding = i13;
        this.orientation = orientation;
        this.viewportStartOffset = i14;
        this.viewportEndOffset = i15;
        this.reverseLayout = z10;
        this.consumedScroll = f6;
        this.firstVisiblePage = measuredPage;
        this.closestPageToSnapPosition = pageInfo;
        this.firstVisiblePageOffset = i16;
        this.canScrollForward = z11;
        this.f5477o = measureResult;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.f5477o.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @Nullable
    public PageInfo getClosestPageToSnapPosition() {
        return this.closestPageToSnapPosition;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    @Nullable
    public final MeasuredPage getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.f5477o.getHeight();
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.pageSpacing;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPagesCount() {
        return this.pagesCount;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo449getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public List<PageInfo> getVisiblePagesInfo() {
        return this.visiblePagesInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.f5477o.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.f5477o.placeChildren();
    }
}
