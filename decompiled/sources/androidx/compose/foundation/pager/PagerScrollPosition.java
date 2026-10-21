package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PagerScrollPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006\u0012\b\b\u0002\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R+\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measureResult", "", "updateFromMeasureResult", "", FirebaseAnalytics.Param.INDEX, "scrollOffset", "requestPosition", "<set-?>", "a", "Landroidx/compose/runtime/MutableIntState;", "getFirstVisiblePage", "()I", "setFirstVisiblePage", "(I)V", "firstVisiblePage", "b", "getCurrentPage", "setCurrentPage", "currentPage", "c", "getScrollOffset", "setScrollOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "f", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "initialPage", "initialScrollOffset", "<init>", "(II)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n75#2:111\n108#2,2:112\n75#2:114\n108#2,2:115\n75#2:117\n108#2,2:118\n1#3:120\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n34#1:111\n34#1:112,2\n35#1:114\n35#1:115,2\n37#1:117\n37#1:118,2\n*E\n"})
public final class PagerScrollPosition {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState firstVisiblePage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState currentPage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState scrollOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Object f5482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutNearestRangeState nearestRangeState;

    /* JADX WARN: Illegal instructions before constructor call */
    public PagerScrollPosition() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public final void a(int i10, int i11) {
        if (i10 < 0.0f) {
            throw new IllegalArgumentException(androidx.collection.g.a("Index should be non-negative (", i10, RootService.CLOSE_BRACKET).toString());
        }
        setFirstVisiblePage(i10);
        this.nearestRangeState.update(i10);
        this.scrollOffset.setIntValue(i11);
    }

    public final int getCurrentPage() {
        return this.currentPage.getIntValue();
    }

    public final int getFirstVisiblePage() {
        return this.firstVisiblePage.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.nearestRangeState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset.getIntValue();
    }

    public final void requestPosition(int index, int scrollOffset) {
        a(index, scrollOffset);
    }

    public final void setCurrentPage(int i10) {
        this.currentPage.setIntValue(i10);
    }

    public final void setFirstVisiblePage(int i10) {
        this.firstVisiblePage.setIntValue(i10);
    }

    public final void updateFromMeasureResult(@NotNull PagerMeasureResult measureResult) {
        Intrinsics.checkNotNullParameter(measureResult, "measureResult");
        MeasuredPage firstVisiblePage = measureResult.getFirstVisiblePage();
        this.f5482e = firstVisiblePage != null ? firstVisiblePage.getKey() : null;
        if (this.f5481d || measureResult.getPagesCount() > 0) {
            this.f5481d = true;
            int firstVisiblePageOffset = measureResult.getFirstVisiblePageOffset();
            if (firstVisiblePageOffset < 0.0f) {
                throw new IllegalStateException(androidx.collection.g.a("scrollOffset should be non-negative (", firstVisiblePageOffset, RootService.CLOSE_BRACKET).toString());
            }
            MeasuredPage firstVisiblePage2 = measureResult.getFirstVisiblePage();
            a(firstVisiblePage2 != null ? firstVisiblePage2.getIndex() : 0, firstVisiblePageOffset);
            PageInfo closestPageToSnapPosition = measureResult.getClosestPageToSnapPosition();
            if (closestPageToSnapPosition != null) {
                setCurrentPage(closestPageToSnapPosition.getIndex());
            }
        }
    }

    public PagerScrollPosition(int i10, int i11) {
        this.firstVisiblePage = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.currentPage = SnapshotIntStateKt.mutableIntStateOf(i10);
        this.scrollOffset = SnapshotIntStateKt.mutableIntStateOf(i11);
        this.nearestRangeState = new LazyLayoutNearestRangeState(i10, 30, 100);
    }

    public /* synthetic */ PagerScrollPosition(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
