package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getAndMeasure-jy6DScQ", "(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "getAndMeasure", "lane", "key", "contentType", "", "Landroidx/compose/ui/layout/Placeable;", "placeables", "createItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "getKeyIndexMap", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "", "isVertical", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "<init>", "(ZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1158:1\n906#2:1159\n908#2:1161\n907#2:1162\n906#2:1164\n908#2:1166\n907#2:1167\n906#2:1169\n55#3:1160\n62#3:1163\n55#3:1165\n62#3:1168\n55#3:1170\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n1031#1:1159\n1031#1:1161\n1031#1:1162\n1034#1:1164\n1035#1:1166\n1035#1:1167\n1035#1:1169\n1031#1:1160\n1031#1:1163\n1034#1:1165\n1035#1:1168\n1035#1:1170\n*E\n"})
public abstract class LazyStaggeredGridMeasureProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridItemProvider f5240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final LazyLayoutMeasureScope f5241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LazyStaggeredGridSlots f5242d;

    public LazyStaggeredGridMeasureProvider(boolean z10, @NotNull LazyStaggeredGridItemProvider itemProvider, @NotNull LazyLayoutMeasureScope measureScope, @NotNull LazyStaggeredGridSlots resolvedSlots) {
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(resolvedSlots, "resolvedSlots");
        this.f5239a = z10;
        this.f5240b = itemProvider;
        this.f5241c = measureScope;
        this.f5242d = resolvedSlots;
    }

    @NotNull
    public abstract LazyStaggeredGridMeasuredItem createItem(int index, int lane, int span, @NotNull Object key, @Nullable Object contentType, @NotNull List<? extends Placeable> placeables);

    @NotNull
    /* JADX INFO: renamed from: getAndMeasure-jy6DScQ, reason: not valid java name */
    public final LazyStaggeredGridMeasuredItem m431getAndMeasurejy6DScQ(int index, long span) {
        int i10;
        LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider = this.f5240b;
        Object key = lazyStaggeredGridItemProvider.getKey(index);
        Object contentType = lazyStaggeredGridItemProvider.getContentType(index);
        int i11 = (int) (span >> 32);
        int i12 = ((int) (span & 4294967295L)) - i11;
        LazyStaggeredGridSlots lazyStaggeredGridSlots = this.f5242d;
        int length = lazyStaggeredGridSlots.getSizes().length;
        int iCoerceAtMost = c.coerceAtMost(i11, length - 1);
        int iCoerceAtMost2 = c.coerceAtMost(i12, length - iCoerceAtMost);
        if (iCoerceAtMost2 == 1) {
            i10 = lazyStaggeredGridSlots.getSizes()[iCoerceAtMost];
        } else {
            int i13 = lazyStaggeredGridSlots.getPositions()[iCoerceAtMost];
            int i14 = (iCoerceAtMost + iCoerceAtMost2) - 1;
            i10 = (lazyStaggeredGridSlots.getPositions()[i14] + lazyStaggeredGridSlots.getSizes()[i14]) - i13;
        }
        return createItem(index, i11, i12, key, contentType, this.f5241c.mo403measure0kLqBqw(index, this.f5239a ? Constraints.INSTANCE.m4367fixedWidthOenEA2s(i10) : Constraints.INSTANCE.m4366fixedHeightOenEA2s(i10)));
    }

    @NotNull
    public final LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.f5240b.getKeyIndexMap();
    }
}
