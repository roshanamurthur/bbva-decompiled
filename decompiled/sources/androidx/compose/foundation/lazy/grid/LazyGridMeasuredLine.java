package androidx.compose.foundation.lazy.grid;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyGridMeasuredLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BF\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "", "", "isEmpty", "", TypedValues.CycleType.S_WAVE_OFFSET, "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "position", "(III)[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "b", "[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "getItems", "()[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", FirebaseAnalytics.Param.ITEMS, "g", "getMainAxisSize", "mainAxisSize", "h", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "slots", "", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "spans", "isVertical", "mainAxisSpacing", "<init>", "(I[Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;Landroidx/compose/foundation/lazy/grid/LazyGridSlots;Ljava/util/List;ZI)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,89:1\n13579#2,2:90\n13644#2,3:92\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n49#1:90,2\n71#1:92,3\n*E\n"})
public final class LazyGridMeasuredLine {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LazyGridMeasuredItem[] items;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LazyGridSlots f4837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<GridItemSpan> f4838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisSizeWithSpacings;

    public LazyGridMeasuredLine(int i10, @NotNull LazyGridMeasuredItem[] items, @NotNull LazyGridSlots slots, @NotNull List<GridItemSpan> spans, boolean z10, int i11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(spans, "spans");
        this.index = i10;
        this.items = items;
        this.f4837c = slots;
        this.f4838d = spans;
        this.f4839e = z10;
        this.f4840f = i11;
        int iMax = 0;
        for (LazyGridMeasuredItem lazyGridMeasuredItem : items) {
            iMax = Math.max(iMax, lazyGridMeasuredItem.getMainAxisSize());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = c.coerceAtLeast(iMax + this.f4840f, 0);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final LazyGridMeasuredItem[] getItems() {
        return this.items;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final boolean isEmpty() {
        return this.items.length == 0;
    }

    @NotNull
    public final LazyGridMeasuredItem[] position(int offset, int layoutWidth, int layoutHeight) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr = this.items;
        int length = lazyGridMeasuredItemArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            LazyGridMeasuredItem lazyGridMeasuredItem = lazyGridMeasuredItemArr[i10];
            int i13 = i11 + 1;
            int iM378getCurrentLineSpanimpl = GridItemSpan.m378getCurrentLineSpanimpl(this.f4838d.get(i11).getF4697a());
            int i14 = this.f4837c.getPositions()[i12];
            int i15 = this.index;
            boolean z10 = this.f4839e;
            lazyGridMeasuredItem.position(offset, i14, layoutWidth, layoutHeight, z10 ? i15 : i12, z10 ? i12 : i15);
            Unit unit = Unit.INSTANCE;
            i12 += iM378getCurrentLineSpanimpl;
            i10++;
            i11 = i13;
        }
        return lazyGridMeasuredItemArr;
    }
}
