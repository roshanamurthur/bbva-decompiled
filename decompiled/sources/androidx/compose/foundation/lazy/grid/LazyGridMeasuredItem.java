package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u001a\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010A\u001a\u00020\u0002\u0012\u0006\u0010B\u001a\u00020\u0002\u0012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C\u0012\u0006\u0010F\u001a\u000201\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J:\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0014R\u001c\u0010$\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0012\u001a\u0004\b&\u0010\u0014R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0014R#\u00100\u001a\u00020+8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R-\u00105\u001a\u0002012\u0006\u00102\u001a\u0002018\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/R$\u0010\n\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u0010\u0012\u001a\u0004\b7\u0010\u0014R$\u0010\u000b\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00028\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b8\u0010\u0012\u001a\u0004\b9\u0010\u0014R\u0011\u0010;\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "", FirebaseAnalytics.Param.INDEX, "", "getParentData", "mainAxisOffset", "crossAxisOffset", "layoutWidth", "layoutHeight", "row", "column", "", "position", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "place", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "", "c", "Z", "isVertical", "()Z", "d", "getCrossAxisSize", "crossAxisSize", "k", "getContentType", "contentType", "l", "getMainAxisSize", "mainAxisSize", "m", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "Landroidx/compose/ui/unit/IntSize;", "q", "J", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", "r", "getOffset-nOcc-ac", TypedValues.CycleType.S_WAVE_OFFSET, "s", "getRow", "t", "getColumn", "getPlaceablesCount", "placeablesCount", "getCrossAxisOffset", "mainAxisSpacing", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "beforeContentPadding", "afterContentPadding", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "visualOffset", "<init>", "(ILjava/lang/Object;ZIIZLandroidx/compose/ui/unit/LayoutDirection;IILjava/util/List;JLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,167:1\n164#1:176\n33#2,6:168\n1#3:174\n86#4:175\n86#4:177\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n148#1:176\n72#1:168,6\n138#1:175\n152#1:177\n*E\n"})
public final class LazyGridMeasuredItem implements LazyGridItemInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isVertical;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int crossAxisSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f4818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<Placeable> f4821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f4822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object contentType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int mainAxisSizeWithSpacings;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4825n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4826o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public long offset;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int row;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int column;

    public LazyGridMeasuredItem() {
        throw null;
    }

    public LazyGridMeasuredItem(int i10, Object key, boolean z10, int i11, int i12, boolean z11, LayoutDirection layoutDirection, int i13, int i14, List placeables, long j10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.index = i10;
        this.key = key;
        this.isVertical = z10;
        this.crossAxisSize = i11;
        this.f4817e = z11;
        this.f4818f = layoutDirection;
        this.f4819g = i13;
        this.f4820h = i14;
        this.f4821i = placeables;
        this.f4822j = j10;
        this.contentType = obj;
        this.f4825n = Integer.MIN_VALUE;
        int size = placeables.size();
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Placeable placeable = (Placeable) placeables.get(i15);
            iMax = Math.max(iMax, this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.mainAxisSize = iMax;
        this.mainAxisSizeWithSpacings = c.coerceAtLeast(i12 + iMax, 0);
        this.size = this.isVertical ? IntSizeKt.IntSize(this.crossAxisSize, iMax) : IntSizeKt.IntSize(iMax, this.crossAxisSize);
        this.offset = IntOffset.INSTANCE.m4517getZeronOccac();
        this.row = -1;
        this.column = -1;
    }

    public final int a(long j10) {
        return this.isVertical ? IntOffset.m4508getYimpl(j10) : IntOffset.m4507getXimpl(j10);
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.column;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @Nullable
    public Object getContentType() {
        return this.contentType;
    }

    public final int getCrossAxisOffset() {
        return this.isVertical ? IntOffset.m4507getXimpl(getOffset()) : IntOffset.m4508getYimpl(getOffset());
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Nullable
    public final Object getParentData(int index) {
        return this.f4821i.get(index).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.f4821i.size();
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getRow() {
        return this.row;
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    public final void place(@NotNull Placeable.PlacementScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (this.f4825n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            Placeable placeable = this.f4821i.get(i10);
            int i11 = this.f4826o;
            boolean z10 = this.isVertical;
            int height = i11 - (z10 ? placeable.getHeight() : placeable.getWidth());
            int i12 = this.f4827p;
            long offset = getOffset();
            Object parentData = getParentData(i10);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long jM396getPlacementDeltanOccac = lazyLayoutAnimateItemModifierNode.m396getPlacementDeltanOccac();
                long jB = f.b(jM396getPlacementDeltanOccac, IntOffset.m4508getYimpl(offset), IntOffset.m4507getXimpl(jM396getPlacementDeltanOccac) + IntOffset.m4507getXimpl(offset));
                if ((a(offset) <= height && a(jB) <= height) || (a(offset) >= i12 && a(jB) >= i12)) {
                    lazyLayoutAnimateItemModifierNode.cancelAnimation();
                }
                offset = jB;
            }
            if (this.f4817e) {
                int iM4507getXimpl = IntOffset.m4507getXimpl(offset);
                if (!z10) {
                    iM4507getXimpl = (this.f4825n - iM4507getXimpl) - (z10 ? placeable.getHeight() : placeable.getWidth());
                }
                offset = IntOffsetKt.IntOffset(iM4507getXimpl, z10 ? (this.f4825n - IntOffset.m4508getYimpl(offset)) - (z10 ? placeable.getHeight() : placeable.getWidth()) : IntOffset.m4508getYimpl(offset));
            }
            int iM4507getXimpl2 = IntOffset.m4507getXimpl(offset);
            long j10 = this.f4822j;
            long jB2 = f.b(j10, IntOffset.m4508getYimpl(offset), IntOffset.m4507getXimpl(j10) + iM4507getXimpl2);
            if (z10) {
                Placeable.PlacementScope.m3614placeWithLayeraW9wM$default(scope, placeable, jB2, 0.0f, null, 6, null);
            } else {
                Placeable.PlacementScope.m3613placeRelativeWithLayeraW9wM$default(scope, placeable, jB2, 0.0f, null, 6, null);
            }
        }
    }

    public final void position(int mainAxisOffset, int crossAxisOffset, int layoutWidth, int layoutHeight, int row, int column) {
        boolean z10 = this.isVertical;
        this.f4825n = z10 ? layoutHeight : layoutWidth;
        if (!z10) {
            layoutWidth = layoutHeight;
        }
        if (z10 && this.f4818f == LayoutDirection.Rtl) {
            crossAxisOffset = (layoutWidth - crossAxisOffset) - this.crossAxisSize;
        }
        this.offset = z10 ? IntOffsetKt.IntOffset(crossAxisOffset, mainAxisOffset) : IntOffsetKt.IntOffset(mainAxisOffset, crossAxisOffset);
        this.row = row;
        this.column = column;
        this.f4826o = -this.f4819g;
        this.f4827p = this.f4825n + this.f4820h;
    }
}
