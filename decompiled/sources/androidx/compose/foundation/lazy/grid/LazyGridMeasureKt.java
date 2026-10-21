package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bk.g;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aè\u0001\u0010)\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2/\u0010%\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#\u0012\u0004\u0012\u00020$0\u001fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;", "measuredLineProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", PluginUtils.IDENTIFIER_LAYOUT, "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid-ZRKPzZ8", "(ILandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLineProvider;Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;IIIIIIFJZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Ljava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureLazyGrid", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,416:1\n310#1,3:423\n313#1,12:430\n326#1:443\n310#1,3:444\n313#1,12:451\n326#1:464\n33#2,6:417\n33#2,4:426\n38#2:442\n33#2,4:447\n38#2:463\n33#2,4:468\n38#2:474\n33#2,6:476\n132#2,3:482\n33#2,4:485\n135#2,2:489\n38#2:491\n137#2:492\n33#2,6:493\n33#2,6:499\n33#2,6:505\n36#3,3:465\n39#3,2:472\n41#3:475\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n210#1:423,3\n210#1:430,12\n210#1:443\n217#1:444,3\n217#1:451,12\n217#1:464\n138#1:417,6\n210#1:426,4\n210#1:442\n217#1:447,4\n217#1:463\n290#1:468,4\n290#1:474\n312#1:476,6\n353#1:482,3\n353#1:485,4\n353#1:489,2\n353#1:491\n353#1:492\n396#1:493,6\n403#1:499,6\n408#1:505,6\n290#1:465,3\n290#1:472,2\n290#1:475\n*E\n"})
public final class LazyGridMeasureKt {

    /* JADX INFO: compiled from: LazyGridMeasure.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4799p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope invoke = placementScope;
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyGridMeasure.kt */
    @SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,416:1\n33#2,6:417\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt$measureLazyGrid$3\n*L\n283#1:417,6\n*E\n"})
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<LazyGridMeasuredItem> f4800p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList) {
            super(1);
            this.f4800p0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope invoke = placementScope;
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            List<LazyGridMeasuredItem> list = this.f4800p0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).place(invoke);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: measureLazyGrid-ZRKPzZ8, reason: not valid java name */
    public static final LazyGridMeasureResult m389measureLazyGridZRKPzZ8(int i10, @NotNull LazyGridMeasuredLineProvider measuredLineProvider, @NotNull LazyGridMeasuredItemProvider measuredItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, float f6, long j10, boolean z10, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z11, @NotNull Density density, @NotNull LazyGridItemPlacementAnimator placementAnimator, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, @NotNull List<Integer> list, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i17;
        int i18;
        List list2;
        ArrayList arrayList;
        int[] iArr;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        int i19;
        int i20;
        int i21;
        List<Integer> pinnedItems = list;
        Intrinsics.checkNotNullParameter(measuredLineProvider, "measuredLineProvider");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i10 <= 0) {
            return new LazyGridMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m4359getMinWidthimpl(j10)), Integer.valueOf(Constraints.m4358getMinHeightimpl(j10)), a.f4799p0), CollectionsKt__CollectionsKt.emptyList(), -i12, i11 + i13, 0, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13, i14);
        }
        int iRoundToInt = c.roundToInt(f6);
        int i22 = i16 - iRoundToInt;
        if (i15 == 0 && i22 < 0) {
            iRoundToInt += i22;
            i22 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i23 = -i12;
        int i24 = i23 + (i14 < 0 ? i14 : 0);
        int mainAxisSizeWithSpacings = i22 + i24;
        int i25 = i15;
        while (mainAxisSizeWithSpacings < 0 && i25 > 0) {
            int i26 = i25 - 1;
            LazyGridMeasuredLine andMeasure = measuredLineProvider.getAndMeasure(i26);
            arrayDeque.add(0, andMeasure);
            mainAxisSizeWithSpacings += andMeasure.getMainAxisSizeWithSpacings();
            i25 = i26;
        }
        if (mainAxisSizeWithSpacings < i24) {
            iRoundToInt += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i24;
        }
        int i27 = mainAxisSizeWithSpacings - i24;
        int i28 = i11 + i13;
        int i29 = i25;
        int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(i28, 0);
        int i30 = -i27;
        int size = arrayDeque.size();
        int i31 = i29;
        int mainAxisSizeWithSpacings2 = i30;
        for (int i32 = 0; i32 < size; i32++) {
            i31++;
            mainAxisSizeWithSpacings2 = ((LazyGridMeasuredLine) arrayDeque.get(i32)).getMainAxisSizeWithSpacings() + mainAxisSizeWithSpacings2;
        }
        int mainAxisSizeWithSpacings3 = i27;
        int i33 = mainAxisSizeWithSpacings2;
        int i34 = i28;
        int i35 = i31;
        while (i35 < i10 && (i33 < iCoerceAtLeast || i33 <= 0 || arrayDeque.isEmpty())) {
            int i36 = iCoerceAtLeast;
            LazyGridMeasuredLine andMeasure2 = measuredLineProvider.getAndMeasure(i35);
            if (andMeasure2.isEmpty()) {
                break;
            }
            int mainAxisSizeWithSpacings4 = andMeasure2.getMainAxisSizeWithSpacings() + i33;
            if (mainAxisSizeWithSpacings4 <= i24) {
                i19 = mainAxisSizeWithSpacings4;
                i20 = i24;
                if (((LazyGridMeasuredItem) ArraysKt___ArraysKt.last(andMeasure2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS java.lang.String())).getIndex() != i10 - 1) {
                    i21 = i35 + 1;
                    mainAxisSizeWithSpacings3 -= andMeasure2.getMainAxisSizeWithSpacings();
                }
                i35++;
                i29 = i21;
                iCoerceAtLeast = i36;
                i24 = i20;
                i33 = i19;
            } else {
                i19 = mainAxisSizeWithSpacings4;
                i20 = i24;
            }
            arrayDeque.add(andMeasure2);
            i21 = i29;
            i35++;
            i29 = i21;
            iCoerceAtLeast = i36;
            i24 = i20;
            i33 = i19;
        }
        if (i33 < i11) {
            int i37 = i11 - i33;
            i33 += i37;
            int mainAxisSizeWithSpacings5 = mainAxisSizeWithSpacings3 - i37;
            int i38 = i29;
            while (mainAxisSizeWithSpacings5 < i12 && i38 > 0) {
                i38--;
                LazyGridMeasuredLine andMeasure3 = measuredLineProvider.getAndMeasure(i38);
                arrayDeque.add(0, andMeasure3);
                mainAxisSizeWithSpacings5 += andMeasure3.getMainAxisSizeWithSpacings();
            }
            i17 = 0;
            iRoundToInt += i37;
            if (mainAxisSizeWithSpacings5 < 0) {
                iRoundToInt += mainAxisSizeWithSpacings5;
                i33 += mainAxisSizeWithSpacings5;
                i18 = 0;
            } else {
                i18 = mainAxisSizeWithSpacings5;
            }
        } else {
            i17 = 0;
            i18 = mainAxisSizeWithSpacings3;
        }
        float f10 = (c.getSign(c.roundToInt(f6)) != c.getSign(iRoundToInt) || Math.abs(c.roundToInt(f6)) < Math.abs(iRoundToInt)) ? f6 : iRoundToInt;
        if (i18 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i39 = -i18;
        LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt___ArraysKt.firstOrNull(lazyGridMeasuredLine.getCom.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS java.lang.String());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : i17;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
        int index2 = (lazyGridMeasuredLine2 == null || (lazyGridMeasuredItemArr = lazyGridMeasuredLine2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS java.lang.String()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt___ArraysKt.lastOrNull(lazyGridMeasuredItemArr)) == null) ? i17 : lazyGridMeasuredItem.getIndex();
        int size2 = list.size();
        List listEmptyList = null;
        ArrayDeque arrayDeque2 = arrayDeque;
        List listEmptyList2 = null;
        int i40 = 0;
        while (i40 < size2) {
            int i41 = size2;
            int iIntValue = pinnedItems.get(i40).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                LazyGridMeasuredItem lazyGridMeasuredItemM390getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m390getAndMeasure3p2s80s$default(measuredItemProvider, iIntValue, 0, measuredLineProvider.m393itemConstraintsOenEA2s(iIntValue), 2, null);
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                List list3 = listEmptyList2;
                list3.add(lazyGridMeasuredItemM390getAndMeasure3p2s80s$default);
                listEmptyList2 = list3;
            }
            i40++;
            arrayDeque2 = arrayDeque2;
            i39 = i39;
            index2 = index2;
            index = index;
            i34 = i34;
            f10 = f10;
            size2 = i41;
        }
        int i42 = index2;
        int i43 = index;
        float f11 = f10;
        int i44 = i39;
        int i45 = i34;
        ArrayDeque arrayDeque3 = arrayDeque2;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        List list4 = listEmptyList2;
        int size3 = list.size();
        int i46 = 0;
        while (i46 < size3) {
            int iIntValue2 = pinnedItems.get(i46).intValue();
            int i47 = i42;
            if (i47 + 1 <= iIntValue2 && iIntValue2 < i10) {
                LazyGridMeasuredItem lazyGridMeasuredItemM390getAndMeasure3p2s80s$default2 = LazyGridMeasuredItemProvider.m390getAndMeasure3p2s80s$default(measuredItemProvider, iIntValue2, 0, measuredLineProvider.m393itemConstraintsOenEA2s(iIntValue2), 2, null);
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                List list5 = listEmptyList;
                list5.add(lazyGridMeasuredItemM390getAndMeasure3p2s80s$default2);
                listEmptyList = list5;
            }
            i46++;
            list4 = list4;
            size3 = size3;
            i42 = i47;
            pinnedItems = list;
        }
        List list6 = list4;
        int i48 = i42;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        List list7 = listEmptyList;
        if (i12 > 0 || i14 < 0) {
            int size4 = arrayDeque3.size();
            int i49 = 0;
            while (i49 < size4) {
                int mainAxisSizeWithSpacings6 = ((LazyGridMeasuredLine) arrayDeque3.get(i49)).getMainAxisSizeWithSpacings();
                if (i18 == 0 || mainAxisSizeWithSpacings6 > i18 || i49 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque3)) {
                    break;
                }
                i18 -= mainAxisSizeWithSpacings6;
                i49++;
                lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque3.get(i49);
            }
        }
        int i50 = i18;
        int iM4357getMaxWidthimpl = z10 ? Constraints.m4357getMaxWidthimpl(j10) : ConstraintsKt.m4371constrainWidthK40F9xA(j10, i33);
        int iM4370constrainHeightK40F9xA = z10 ? ConstraintsKt.m4370constrainHeightK40F9xA(j10, i33) : Constraints.m4356getMaxHeightimpl(j10);
        int i51 = z10 ? iM4370constrainHeightK40F9xA : iM4357getMaxWidthimpl;
        boolean z12 = true;
        boolean z13 = i33 < Math.min(i51, i11);
        if (z13 && i44 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        int size5 = arrayDeque3.size();
        int length = 0;
        for (int i52 = 0; i52 < size5; i52++) {
            length += ((LazyGridMeasuredLine) arrayDeque3.get(i52)).getCom.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS java.lang.String().length;
        }
        ArrayList arrayList2 = new ArrayList(length);
        if (!z13) {
            int size6 = list6.size();
            int mainAxisSizeWithSpacings7 = i44;
            for (int i53 = 0; i53 < size6; i53++) {
                LazyGridMeasuredItem lazyGridMeasuredItem3 = (LazyGridMeasuredItem) list6.get(i53);
                mainAxisSizeWithSpacings7 -= lazyGridMeasuredItem3.getMainAxisSizeWithSpacings();
                lazyGridMeasuredItem3.position(mainAxisSizeWithSpacings7, 0, iM4357getMaxWidthimpl, iM4370constrainHeightK40F9xA, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                arrayList2.add(lazyGridMeasuredItem3);
            }
            list2 = list6;
            int size7 = arrayDeque3.size();
            int mainAxisSizeWithSpacings8 = i44;
            for (int i54 = 0; i54 < size7; i54++) {
                LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine) arrayDeque3.get(i54);
                g.addAll(arrayList2, lazyGridMeasuredLine3.position(mainAxisSizeWithSpacings8, iM4357getMaxWidthimpl, iM4370constrainHeightK40F9xA));
                mainAxisSizeWithSpacings8 += lazyGridMeasuredLine3.getMainAxisSizeWithSpacings();
            }
            int size8 = list7.size();
            for (int i55 = 0; i55 < size8; i55++) {
                LazyGridMeasuredItem lazyGridMeasuredItem4 = (LazyGridMeasuredItem) list7.get(i55);
                lazyGridMeasuredItem4.position(mainAxisSizeWithSpacings8, 0, iM4357getMaxWidthimpl, iM4370constrainHeightK40F9xA, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
                arrayList2.add(lazyGridMeasuredItem4);
                mainAxisSizeWithSpacings8 += lazyGridMeasuredItem4.getMainAxisSizeWithSpacings();
            }
        } else {
            if (!list6.isEmpty() || !list7.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int size9 = arrayDeque3.size();
            int[] iArr2 = new int[size9];
            for (int i56 = 0; i56 < size9; i56++) {
                iArr2[i56] = ((LazyGridMeasuredLine) arrayDeque3.get(!z11 ? i56 : (size9 - i56) - 1)).getMainAxisSize();
            }
            int[] iArr3 = new int[size9];
            for (int i57 = 0; i57 < size9; i57++) {
                iArr3[i57] = 0;
            }
            if (z10) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i51, iArr2, iArr3);
                iArr = iArr3;
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iArr = iArr3;
                horizontal.arrange(density, i51, iArr2, LayoutDirection.Ltr, iArr);
            }
            IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr);
            if (z11) {
                indices = kotlin.ranges.c.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine4 = (LazyGridMeasuredLine) arrayDeque3.get(!z11 ? first : (size9 - first) - 1);
                    if (z11) {
                        mainAxisSize = (i51 - mainAxisSize) - lazyGridMeasuredLine4.getMainAxisSize();
                    }
                    g.addAll(arrayList2, lazyGridMeasuredLine4.position(mainAxisSize, iM4357getMaxWidthimpl, iM4370constrainHeightK40F9xA));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            list2 = list6;
        }
        placementAnimator.onMeasured((int) f11, iM4357getMaxWidthimpl, iM4370constrainHeightK40F9xA, arrayList2, measuredItemProvider, spanLayoutProvider, z10);
        if (i48 == i10 - 1 && i33 <= i11) {
            z12 = false;
        }
        MeasureResult measureResultInvoke = layout.invoke(Integer.valueOf(iM4357getMaxWidthimpl), Integer.valueOf(iM4370constrainHeightK40F9xA), new b(arrayList2));
        if (list2.isEmpty() && list7.isEmpty()) {
            arrayList = arrayList2;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size10 = arrayList2.size();
            int i58 = 0;
            while (i58 < size10) {
                Object obj = arrayList2.get(i58);
                int index3 = ((LazyGridMeasuredItem) obj).getIndex();
                int i59 = i43;
                if (i59 <= index3 && index3 <= i48) {
                    arrayList3.add(obj);
                }
                i58++;
                i43 = i59;
            }
            arrayList = arrayList3;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine, i50, z12, f11, measureResultInvoke, arrayList, i23, i45, i10, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13, i14);
    }
}
