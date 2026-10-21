package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001Bx\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010(\u001a\u00020#\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020\u0005\u0012\u0006\u0010G\u001a\u00020\u0003ø\u0001\u0002¢\u0006\u0004\b[\u0010\\J\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003J*\u0010\u000b\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010(\u001a\u00020#8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00107\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010;\u001a\u0002088\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u0017\u0010>\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u0017\u0010A\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u0017\u0010D\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010,R\u0017\u0010G\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u00106R\u0017\u0010M\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010S\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010V\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bT\u00104\u001a\u0004\bU\u00106R\u0019\u0010\u0006\u001a\u00020\u0005*\u00020\b8Æ\u0002ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0019\u0010S\u001a\u00020\u0003*\u00020\b8Æ\u0002ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006]"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "", "itemIndex", "", "isFullSpan", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getSpanRange-lOCCd4c", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", "getSpanRange", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "b", "Ljava/util/List;", "getPinnedItems", "()Ljava/util/List;", "pinnedItems", "c", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "getItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "d", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getResolvedSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "e", "J", "getConstraints-msEJaDk", "()J", "constraints", "f", "Z", "isVertical", "()Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "g", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "getMeasureScope", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "h", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMainAxisAvailableSize", "()I", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/IntOffset;", "i", "getContentOffset-nOcc-ac", "contentOffset", "j", "getBeforeContentPadding", "beforeContentPadding", "k", "getAfterContentPadding", "afterContentPadding", "l", "getReverseLayout", "reverseLayout", "m", "getMainAxisSpacing", "mainAxisSpacing", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "n", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getMeasuredItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "o", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "p", "getLaneCount", "laneCount", "isFullSpan-SZVOQXA", "(J)Z", "getLaneInfo-SZVOQXA", "(J)I", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1158:1\n231#1:1164\n908#2:1159\n907#2:1160\n906#2:1162\n908#2:1165\n907#2:1166\n906#2:1168\n62#3:1161\n55#3:1163\n62#3:1167\n55#3:1169\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n234#1:1164\n231#1:1159\n231#1:1160\n231#1:1162\n234#1:1165\n234#1:1166\n234#1:1168\n231#1:1161\n231#1:1163\n234#1:1167\n234#1:1169\n*E\n"})
public final class LazyStaggeredGridMeasureContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridState state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Integer> pinnedItems;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridItemProvider itemProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridSlots resolvedSlots;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long constraints;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean isVertical;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyLayoutMeasureScope measureScope;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisAvailableSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final long contentOffset;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int beforeContentPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int afterContentPadding;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean reverseLayout;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int mainAxisSpacing;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridMeasureContext$measuredItemProvider$1 f5226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyStaggeredGridLaneInfo laneInfo;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final int laneCount;

    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1] */
    public LazyStaggeredGridMeasureContext(LazyStaggeredGridState state, List pinnedItems, final LazyStaggeredGridItemProvider itemProvider, final LazyStaggeredGridSlots resolvedSlots, long j10, final boolean z10, final LazyLayoutMeasureScope measureScope, int i10, long j11, int i11, int i12, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(resolvedSlots, "resolvedSlots");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        this.state = state;
        this.pinnedItems = pinnedItems;
        this.itemProvider = itemProvider;
        this.resolvedSlots = resolvedSlots;
        this.constraints = j10;
        this.isVertical = z10;
        this.measureScope = measureScope;
        this.mainAxisAvailableSize = i10;
        this.contentOffset = j11;
        this.beforeContentPadding = i11;
        this.afterContentPadding = i12;
        this.reverseLayout = z11;
        this.mainAxisSpacing = i13;
        this.f5226n = new LazyStaggeredGridMeasureProvider(z10, itemProvider, measureScope, resolvedSlots) { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext$measuredItemProvider$1
            @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureProvider
            @NotNull
            public LazyStaggeredGridMeasuredItem createItem(int index, int lane, int span, @NotNull Object key, @Nullable Object contentType, @NotNull List<? extends Placeable> placeables) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(placeables, "placeables");
                LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = this.f5229e;
                return new LazyStaggeredGridMeasuredItem(index, key, placeables, lazyStaggeredGridMeasureContext.getIsVertical(), lazyStaggeredGridMeasureContext.getMainAxisSpacing(), lane, span, lazyStaggeredGridMeasureContext.getBeforeContentPadding(), lazyStaggeredGridMeasureContext.getAfterContentPadding(), contentType);
            }
        };
        this.laneInfo = state.getLaneInfo();
        this.laneCount = resolvedSlots.getSizes().length;
    }

    public final int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* JADX INFO: renamed from: getContentOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getContentOffset() {
        return this.contentOffset;
    }

    @NotNull
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.itemProvider;
    }

    public final int getLaneCount() {
        return this.laneCount;
    }

    @NotNull
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.laneInfo;
    }

    /* JADX INFO: renamed from: getLaneInfo-SZVOQXA, reason: not valid java name */
    public final int m426getLaneInfoSZVOQXA(long j10) {
        int i10 = (int) (4294967295L & j10);
        int i11 = (int) (j10 >> 32);
        if (i10 - i11 != 1) {
            return -2;
        }
        return i11;
    }

    public final int getMainAxisAvailableSize() {
        return this.mainAxisAvailableSize;
    }

    public final int getMainAxisSpacing() {
        return this.mainAxisSpacing;
    }

    @NotNull
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.measureScope;
    }

    @NotNull
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.f5226n;
    }

    @NotNull
    public final List<Integer> getPinnedItems() {
        return this.pinnedItems;
    }

    @NotNull
    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.resolvedSlots;
    }

    public final boolean getReverseLayout() {
        return this.reverseLayout;
    }

    /* JADX INFO: renamed from: getSpanRange-lOCCd4c, reason: not valid java name */
    public final long m427getSpanRangelOCCd4c(@NotNull LazyStaggeredGridItemProvider getSpanRange, int i10, int i11) {
        Intrinsics.checkNotNullParameter(getSpanRange, "$this$getSpanRange");
        boolean zIsFullSpan = getSpanRange.getSpanProvider().isFullSpan(i10);
        int i12 = zIsFullSpan ? this.laneCount : 1;
        if (zIsFullSpan) {
            i11 = 0;
        }
        return SpanRange.m433constructorimpl(i11, i12);
    }

    @NotNull
    public final LazyStaggeredGridState getState() {
        return this.state;
    }

    public final boolean isFullSpan(@NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, int i10) {
        Intrinsics.checkNotNullParameter(lazyStaggeredGridItemProvider, "<this>");
        return lazyStaggeredGridItemProvider.getSpanProvider().isFullSpan(i10);
    }

    /* JADX INFO: renamed from: isFullSpan-SZVOQXA, reason: not valid java name */
    public final boolean m428isFullSpanSZVOQXA(long j10) {
        return ((int) (4294967295L & j10)) - ((int) (j10 >> 32)) != 1;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }
}
