package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010I\u001a\u00020\u0002\u0012\u0006\u0010J\u001a\u00020\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bK\u0010LJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010\u0015R\u001c\u0010(\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010\u0019R\"\u0010*\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010,R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b1\u0010\u0015R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0013\u001a\u0004\b4\u0010\u0015R#\u0010;\u001a\u0002068\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R-\u0010@\u001a\u00020<2\u0006\u0010=\u001a\u00020<8\u0016@RX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\b?\u0010:R\u0011\u0010B\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010\u0015R\u0011\u0010D\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bC\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "", FirebaseAnalytics.Param.INDEX, "", "getParentData", "mainAxis", "crossAxis", "mainAxisLayoutSize", "", "position", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "scope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "context", "place", "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "", "d", "Z", "isVertical", "()Z", "e", "getLane", "lane", "f", "getSpan", "span", "i", "getContentType", "contentType", "j", "isVisible", "setVisible", "(Z)V", "k", "getMainAxisSize", "mainAxisSize", "l", "getSizeWithSpacings", "sizeWithSpacings", "m", "getCrossAxisSize", "crossAxisSize", "Landroidx/compose/ui/unit/IntSize;", "q", "J", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", "r", "getOffset-nOcc-ac", TypedValues.CycleType.S_WAVE_OFFSET, "getPlaceablesCount", "placeablesCount", "getCrossAxisOffset", "crossAxisOffset", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "spacing", "beforeContentPadding", "afterContentPadding", "<init>", "(ILjava/lang/Object;Ljava/util/List;ZIIIIILjava/lang/Object;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1158:1\n1145#1:1180\n1147#1:1182\n1145#1:1183\n99#2,8:1159\n99#2,8:1167\n1#3:1175\n69#4,4:1176\n74#4:1185\n86#5:1181\n86#5:1184\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1118#1:1180\n1134#1:1182\n1135#1:1183\n1072#1:1159,8\n1078#1:1167,8\n1117#1:1176,4\n1117#1:1185\n1124#1:1181\n1138#1:1184\n*E\n"})
public final class LazyStaggeredGridMeasuredItem implements LazyStaggeredGridItemInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object key;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Placeable> f5261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isVertical;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int lane;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object contentType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isVisible;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int mainAxisSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int sizeWithSpacings;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int crossAxisSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final long size;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public long offset;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyStaggeredGridMeasuredItem(int i10, @NotNull Object key, @NotNull List<? extends Placeable> placeables, boolean z10, int i11, int i12, int i13, int i14, int i15, @Nullable Object obj) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(placeables, "placeables");
        this.index = i10;
        this.key = key;
        this.f5261c = placeables;
        this.isVertical = z10;
        this.lane = i12;
        this.span = i13;
        this.f5265g = i14;
        this.f5266h = i15;
        this.contentType = obj;
        int i16 = 1;
        this.isVisible = true;
        Integer num = null;
        if (!placeables.isEmpty()) {
            Placeable placeable = (Placeable) placeables.get(0);
            numValueOf = Integer.valueOf(z10 ? placeable.getHeight() : placeable.getWidth());
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(placeables);
            if (1 <= lastIndex) {
                int i17 = 1;
                while (true) {
                    Placeable placeable2 = (Placeable) placeables.get(i17);
                    Integer numValueOf2 = Integer.valueOf(this.isVertical ? placeable2.getHeight() : placeable2.getWidth());
                    numValueOf = numValueOf2.compareTo(numValueOf) > 0 ? numValueOf2 : numValueOf;
                    if (i17 == lastIndex) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        this.mainAxisSize = iIntValue;
        this.sizeWithSpacings = c.coerceAtLeast(iIntValue + i11, 0);
        List<Placeable> list = this.f5261c;
        if (!list.isEmpty()) {
            Placeable placeable3 = list.get(0);
            Integer numValueOf3 = Integer.valueOf(this.isVertical ? placeable3.getWidth() : placeable3.getHeight());
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex2) {
                while (true) {
                    Placeable placeable4 = list.get(i16);
                    Integer numValueOf4 = Integer.valueOf(this.isVertical ? placeable4.getWidth() : placeable4.getHeight());
                    numValueOf3 = numValueOf4.compareTo(numValueOf3) > 0 ? numValueOf4 : numValueOf3;
                    if (i16 == lastIndex2) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            num = numValueOf3;
        }
        int iIntValue2 = num != null ? num.intValue() : 0;
        this.crossAxisSize = iIntValue2;
        this.f5271n = -1;
        this.size = this.isVertical ? IntSizeKt.IntSize(iIntValue2, this.mainAxisSize) : IntSizeKt.IntSize(this.mainAxisSize, iIntValue2);
        this.offset = IntOffset.INSTANCE.m4517getZeronOccac();
    }

    public final int a(long j10) {
        return this.isVertical ? IntOffset.m4508getYimpl(j10) : IntOffset.m4507getXimpl(j10);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
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

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @NotNull
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getLane() {
        return this.lane;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: from getter */
    public long getOffset() {
        return this.offset;
    }

    @Nullable
    public final Object getParentData(int index) {
        return this.f5261c.get(index).getParentData();
    }

    public final int getPlaceablesCount() {
        return this.f5261c.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getSize() {
        return this.size;
    }

    public final int getSizeWithSpacings() {
        return this.sizeWithSpacings;
    }

    public final int getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX INFO: renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public final void place(@NotNull Placeable.PlacementScope scope, @NotNull LazyStaggeredGridMeasureContext context) {
        int iM4508getYimpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f5271n == -1) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        List<Placeable> list = this.f5261c;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Placeable placeable = list.get(i10);
            int i11 = this.f5272o;
            boolean z10 = this.isVertical;
            int height = i11 - (z10 ? placeable.getHeight() : placeable.getWidth());
            int i12 = this.f5273p;
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
            if (context.getReverseLayout()) {
                int iM4507getXimpl = IntOffset.m4507getXimpl(offset);
                if (!z10) {
                    iM4507getXimpl = (this.f5271n - iM4507getXimpl) - (z10 ? placeable.getHeight() : placeable.getWidth());
                }
                if (z10) {
                    iM4508getYimpl = (this.f5271n - IntOffset.m4508getYimpl(offset)) - (z10 ? placeable.getHeight() : placeable.getWidth());
                } else {
                    iM4508getYimpl = IntOffset.m4508getYimpl(offset);
                }
                offset = IntOffsetKt.IntOffset(iM4507getXimpl, iM4508getYimpl);
            }
            long contentOffset = context.getContentOffset();
            Placeable.PlacementScope.m3613placeRelativeWithLayeraW9wM$default(scope, placeable, f.b(contentOffset, IntOffset.m4508getYimpl(offset), IntOffset.m4507getXimpl(contentOffset) + IntOffset.m4507getXimpl(offset)), 0.0f, null, 6, null);
            i10++;
            list = list;
        }
    }

    public final void position(int mainAxis, int crossAxis, int mainAxisLayoutSize) {
        this.f5271n = mainAxisLayoutSize;
        this.f5272o = -this.f5265g;
        this.f5273p = mainAxisLayoutSize + this.f5266h;
        this.offset = this.isVertical ? IntOffsetKt.IntOffset(crossAxis, mainAxis) : IntOffsetKt.IntOffset(mainAxis, crossAxis);
    }

    public final void setVisible(boolean z10) {
        this.isVisible = z10;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }
}
