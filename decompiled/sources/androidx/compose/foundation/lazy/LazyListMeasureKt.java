package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyListMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aî\u0001\u0010'\u001a\u00020$2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u00102/\u0010#\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0002\b!\u0012\u0004\u0012\u00020\"0\u001dH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, d2 = {"", "itemsCount", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "", "headerIndexes", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "reverseLayout", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "beyondBoundsItemCount", "pinnedItems", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/MeasureResult;", PluginUtils.IDENTIFIER_LAYOUT, "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList-CD5nmq0", "(ILandroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;IIIIIIFJZLjava/util/List;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ZLandroidx/compose/ui/unit/Density;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;ILjava/util/List;Lkotlin/jvm/functions/Function3;)Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureLazyList", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,476:1\n33#2,6:477\n33#2,6:483\n33#2,6:489\n33#2,4:498\n38#2:504\n33#2,6:506\n33#2,6:512\n33#2,6:518\n33#2,6:524\n33#2,6:530\n36#3,3:495\n39#3,2:502\n41#3:505\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n146#1:477,6\n240#1:483,6\n254#1:489,6\n321#1:498,4\n321#1:504\n352#1:506,6\n379#1:512,6\n455#1:518,6\n462#1:524,6\n468#1:530,6\n321#1:495,3\n321#1:502,2\n321#1:505\n*E\n"})
public final class LazyListMeasureKt {

    /* JADX INFO: compiled from: LazyListMeasure.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4607p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope invoke = placementScope;
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyListMeasure.kt */
    @SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,476:1\n33#2,6:477\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt$measureLazyList$5\n*L\n311#1:477,6\n*E\n"})
    public static final class b extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<LazyListMeasuredItem> f4608p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListMeasuredItem f4609q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ArrayList arrayList, LazyListMeasuredItem lazyListMeasuredItem) {
            super(1);
            this.f4608p0 = arrayList;
            this.f4609q0 = lazyListMeasuredItem;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            LazyListMeasuredItem lazyListMeasuredItem;
            Placeable.PlacementScope invoke = placementScope;
            Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
            List<LazyListMeasuredItem> list = this.f4608p0;
            int size = list.size();
            int i10 = 0;
            while (true) {
                lazyListMeasuredItem = this.f4609q0;
                if (i10 >= size) {
                    break;
                }
                LazyListMeasuredItem lazyListMeasuredItem2 = list.get(i10);
                if (lazyListMeasuredItem2 != lazyListMeasuredItem) {
                    lazyListMeasuredItem2.place(invoke);
                }
                i10++;
            }
            if (lazyListMeasuredItem != null) {
                lazyListMeasuredItem.place(invoke);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: measureLazyList-CD5nmq0, reason: not valid java name */
    public static final LazyListMeasureResult m369measureLazyListCD5nmq0(int i10, @NotNull LazyListMeasuredItemProvider measuredItemProvider, int i11, int i12, int i13, int i14, int i15, int i16, float f6, long j10, boolean z10, @NotNull List<Integer> headerIndexes, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, boolean z11, @NotNull Density density, @NotNull LazyListItemPlacementAnimator placementAnimator, int i17, @NotNull List<Integer> list, @NotNull Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> layout) {
        int i18;
        String str;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f10;
        int i24;
        int i25;
        List listEmptyList;
        int i26;
        List listEmptyList2;
        ArrayList arrayList;
        int i27;
        int i28;
        int i29;
        List<Integer> pinnedItems = list;
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(placementAnimator, "placementAnimator");
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(layout, "layout");
        String str2 = "Failed requirement.";
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i10 <= 0) {
            return new LazyListMeasureResult(null, 0, false, 0.0f, layout.invoke(Integer.valueOf(Constraints.m4359getMinWidthimpl(j10)), Integer.valueOf(Constraints.m4358getMinHeightimpl(j10)), a.f4607p0), CollectionsKt__CollectionsKt.emptyList(), -i12, i11 + i13, 0, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13, i14);
        }
        int i30 = i15;
        if (i30 >= i10) {
            i30 = i10 - 1;
            i18 = 0;
        } else {
            i18 = i16;
        }
        int iRoundToInt = c.roundToInt(f6);
        int i31 = i18 - iRoundToInt;
        if (i30 == 0 && i31 < 0) {
            iRoundToInt += i31;
            i31 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i32 = i30;
        int i33 = -i12;
        int i34 = i33 + (i14 < 0 ? i14 : 0);
        int sizeWithSpacings = i31 + i34;
        int iMax = 0;
        int i35 = i32;
        while (sizeWithSpacings < 0 && i35 > 0) {
            int i36 = i35 - 1;
            LazyListMeasuredItem andMeasure = measuredItemProvider.getAndMeasure(i36);
            arrayDeque.add(0, andMeasure);
            iMax = Math.max(iMax, andMeasure.getCrossAxisSize());
            sizeWithSpacings += andMeasure.getSizeWithSpacings();
            i35 = i36;
        }
        if (sizeWithSpacings < i34) {
            iRoundToInt += sizeWithSpacings;
            sizeWithSpacings = i34;
        }
        int i37 = sizeWithSpacings - i34;
        int i38 = i11 + i13;
        int i39 = iMax;
        int i40 = i35;
        int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast(i38, 0);
        int sizeWithSpacings2 = -i37;
        int size = arrayDeque.size();
        int i41 = i40;
        int sizeWithSpacings3 = i37;
        for (int i42 = 0; i42 < size; i42++) {
            i41++;
            sizeWithSpacings2 = ((LazyListMeasuredItem) arrayDeque.get(i42)).getSizeWithSpacings() + sizeWithSpacings2;
        }
        int iMax2 = i39;
        int i43 = i40;
        int sizeWithSpacings4 = sizeWithSpacings2;
        int i44 = i41;
        while (i44 < i10 && (sizeWithSpacings4 < iCoerceAtLeast || sizeWithSpacings4 <= 0 || arrayDeque.isEmpty())) {
            int i45 = iCoerceAtLeast;
            LazyListMeasuredItem andMeasure2 = measuredItemProvider.getAndMeasure(i44);
            sizeWithSpacings4 = andMeasure2.getSizeWithSpacings() + sizeWithSpacings4;
            if (sizeWithSpacings4 <= i34) {
                i28 = i34;
                if (i44 != i10 - 1) {
                    i29 = i44 + 1;
                    sizeWithSpacings3 -= andMeasure2.getSizeWithSpacings();
                }
                i44++;
                i43 = i29;
                iCoerceAtLeast = i45;
                i34 = i28;
            } else {
                i28 = i34;
            }
            int iMax3 = Math.max(iMax2, andMeasure2.getCrossAxisSize());
            arrayDeque.add(andMeasure2);
            iMax2 = iMax3;
            i29 = i43;
            i44++;
            i43 = i29;
            iCoerceAtLeast = i45;
            i34 = i28;
        }
        if (sizeWithSpacings4 < i11) {
            int i46 = i11 - sizeWithSpacings4;
            int i47 = sizeWithSpacings4 + i46;
            int i48 = i43;
            i19 = i44;
            int sizeWithSpacings5 = sizeWithSpacings3 - i46;
            while (sizeWithSpacings5 < i12 && i48 > 0) {
                int i49 = i48 - 1;
                String str3 = str2;
                LazyListMeasuredItem andMeasure3 = measuredItemProvider.getAndMeasure(i49);
                arrayDeque.add(0, andMeasure3);
                iMax2 = Math.max(iMax2, andMeasure3.getCrossAxisSize());
                sizeWithSpacings5 += andMeasure3.getSizeWithSpacings();
                i48 = i49;
                str2 = str3;
            }
            str = str2;
            int i50 = iRoundToInt + i46;
            if (sizeWithSpacings5 < 0) {
                int i51 = i50 + sizeWithSpacings5;
                i20 = i47 + sizeWithSpacings5;
                i23 = i48;
                i21 = i51;
                i22 = 0;
            } else {
                i22 = sizeWithSpacings5;
                i20 = i47;
                i23 = i48;
                i21 = i50;
            }
        } else {
            str = "Failed requirement.";
            i19 = i44;
            i20 = sizeWithSpacings4;
            i21 = iRoundToInt;
            i22 = sizeWithSpacings3;
            i23 = i43;
        }
        int i52 = iMax2;
        float f11 = (c.getSign(c.roundToInt(f6)) != c.getSign(i21) || Math.abs(c.roundToInt(f6)) < Math.abs(i21)) ? f6 : i21;
        if (i22 < 0) {
            throw new IllegalArgumentException(str.toString());
        }
        int i53 = -i22;
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) arrayDeque.first();
        if (i12 > 0 || i14 < 0) {
            int i54 = i22;
            int size2 = arrayDeque.size();
            int i55 = 0;
            LazyListMeasuredItem lazyListMeasuredItem2 = lazyListMeasuredItem;
            int i56 = i54;
            while (true) {
                if (i55 < size2) {
                    int i57 = size2;
                    int sizeWithSpacings6 = ((LazyListMeasuredItem) arrayDeque.get(i55)).getSizeWithSpacings();
                    if (i56 != 0 && sizeWithSpacings6 <= i56) {
                        f10 = f11;
                        if (i55 == CollectionsKt__CollectionsKt.getLastIndex(arrayDeque)) {
                            break;
                        }
                        i56 -= sizeWithSpacings6;
                        i55++;
                        lazyListMeasuredItem2 = (LazyListMeasuredItem) arrayDeque.get(i55);
                        size2 = i57;
                        f11 = f10;
                    }
                }
                f10 = f11;
                break;
            }
            i24 = i56;
            lazyListMeasuredItem = lazyListMeasuredItem2;
        } else {
            i24 = i22;
            f10 = f11;
        }
        int iMax4 = Math.max(0, i23 - i17);
        int i58 = i23 - 1;
        if (iMax4 <= i58) {
            List arrayList2 = null;
            while (true) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                listEmptyList = arrayList2;
                i25 = i24;
                listEmptyList.add(measuredItemProvider.getAndMeasure(i58));
                if (i58 == iMax4) {
                    break;
                }
                i58--;
                i24 = i25;
                arrayList2 = listEmptyList;
            }
        } else {
            i25 = i24;
            listEmptyList = null;
        }
        int size3 = list.size();
        int i59 = 0;
        while (i59 < size3) {
            int i60 = size3;
            int iIntValue = pinnedItems.get(i59).intValue();
            if (iIntValue < iMax4) {
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                listEmptyList.add(measuredItemProvider.getAndMeasure(iIntValue));
            }
            i59++;
            size3 = i60;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        int iMax5 = i52;
        int i61 = 0;
        for (int size4 = listEmptyList.size(); i61 < size4; size4 = size4) {
            iMax5 = Math.max(iMax5, ((LazyListMeasuredItem) listEmptyList.get(i61)).getCrossAxisSize());
            i61++;
        }
        int iMin = Math.min(((LazyListMeasuredItem) CollectionsKt___CollectionsKt.last((List) arrayDeque)).getIndex() + i17, i10 - 1);
        int index = ((LazyListMeasuredItem) CollectionsKt___CollectionsKt.last((List) arrayDeque)).getIndex() + 1;
        if (index <= iMin) {
            List arrayList3 = null;
            while (true) {
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                i26 = iMax5;
                listEmptyList2 = arrayList3;
                listEmptyList2.add(measuredItemProvider.getAndMeasure(index));
                if (index == iMin) {
                    break;
                }
                index++;
                arrayList3 = listEmptyList2;
                iMax5 = i26;
            }
        } else {
            i26 = iMax5;
            listEmptyList2 = null;
        }
        int size5 = list.size();
        int i62 = 0;
        while (i62 < size5) {
            int iIntValue2 = pinnedItems.get(i62).intValue();
            if (iIntValue2 > iMin) {
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                listEmptyList2.add(measuredItemProvider.getAndMeasure(iIntValue2));
            }
            i62++;
            pinnedItems = list;
        }
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        }
        int size6 = listEmptyList2.size();
        int iMax6 = i26;
        for (int i63 = 0; i63 < size6; i63++) {
            iMax6 = Math.max(iMax6, ((LazyListMeasuredItem) listEmptyList2.get(i63)).getCrossAxisSize());
        }
        boolean z12 = Intrinsics.areEqual(lazyListMeasuredItem, arrayDeque.first()) && listEmptyList.isEmpty() && listEmptyList2.isEmpty();
        int iM4371constrainWidthK40F9xA = ConstraintsKt.m4371constrainWidthK40F9xA(j10, z10 ? iMax6 : i20);
        if (z10) {
            iMax6 = i20;
        }
        int iM4370constrainHeightK40F9xA = ConstraintsKt.m4370constrainHeightK40F9xA(j10, iMax6);
        int i64 = z10 ? iM4370constrainHeightK40F9xA : iM4371constrainWidthK40F9xA;
        boolean z13 = i20 < Math.min(i64, i11);
        if (z13 && i53 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ArrayList arrayList4 = new ArrayList(listEmptyList2.size() + listEmptyList.size() + arrayDeque.size());
        if (!z13) {
            arrayList = arrayList4;
            i27 = 0;
            int size7 = listEmptyList.size();
            int sizeWithSpacings7 = i53;
            for (int i65 = 0; i65 < size7; i65++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) listEmptyList.get(i65);
                sizeWithSpacings7 -= lazyListMeasuredItem3.getSizeWithSpacings();
                lazyListMeasuredItem3.position(sizeWithSpacings7, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                arrayList.add(lazyListMeasuredItem3);
            }
            int size8 = arrayDeque.size();
            int sizeWithSpacings8 = i53;
            for (int i66 = 0; i66 < size8; i66++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) arrayDeque.get(i66);
                lazyListMeasuredItem4.position(sizeWithSpacings8, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                arrayList.add(lazyListMeasuredItem4);
                sizeWithSpacings8 += lazyListMeasuredItem4.getSizeWithSpacings();
            }
            int size9 = listEmptyList2.size();
            for (int i67 = 0; i67 < size9; i67++) {
                LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) listEmptyList2.get(i67);
                lazyListMeasuredItem5.position(sizeWithSpacings8, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                arrayList.add(lazyListMeasuredItem5);
                sizeWithSpacings8 += lazyListMeasuredItem5.getSizeWithSpacings();
            }
        } else {
            if (!listEmptyList.isEmpty() || !listEmptyList2.isEmpty()) {
                throw new IllegalArgumentException(str.toString());
            }
            int size10 = arrayDeque.size();
            int[] iArr = new int[size10];
            for (int i68 = 0; i68 < size10; i68++) {
                iArr[i68] = ((LazyListMeasuredItem) arrayDeque.get(!z11 ? i68 : (size10 - i68) - 1)).getSize();
            }
            int[] iArr2 = new int[size10];
            for (int i69 = 0; i69 < size10; i69++) {
                iArr2[i69] = 0;
            }
            i27 = 0;
            if (z10) {
                if (vertical == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                vertical.arrange(density, i64, iArr, iArr2);
                arrayList = arrayList4;
            } else {
                if (horizontal == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                arrayList = arrayList4;
                horizontal.arrange(density, i64, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntProgression indices = ArraysKt___ArraysKt.getIndices(iArr2);
            if (z11) {
                indices = kotlin.ranges.c.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size11 = iArr2[first];
                    LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayDeque.get(!z11 ? first : (size10 - first) - 1);
                    if (z11) {
                        size11 = (i64 - size11) - lazyListMeasuredItem6.getSize();
                    }
                    lazyListMeasuredItem6.position(size11, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA);
                    arrayList.add(lazyListMeasuredItem6);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        }
        float f12 = f10;
        placementAnimator.onMeasured((int) f12, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA, arrayList, measuredItemProvider, z10);
        LazyListMeasuredItem lazyListMeasuredItemFindOrComposeLazyListHeader = headerIndexes.isEmpty() ^ true ? LazyListHeadersKt.findOrComposeLazyListHeader(arrayList, measuredItemProvider, headerIndexes, i12, iM4371constrainWidthK40F9xA, iM4370constrainHeightK40F9xA) : null;
        boolean z14 = (i19 < i10 || i20 > i11) ? 1 : i27;
        MeasureResult measureResultInvoke = layout.invoke(Integer.valueOf(iM4371constrainWidthK40F9xA), Integer.valueOf(iM4370constrainHeightK40F9xA), new b(arrayList, lazyListMeasuredItemFindOrComposeLazyListHeader));
        if (!z12) {
            ArrayList arrayList5 = new ArrayList(arrayList.size());
            int size12 = arrayList.size();
            for (int i70 = i27; i70 < size12; i70++) {
                Object obj = arrayList.get(i70);
                LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) obj;
                if ((lazyListMeasuredItem7.getIndex() >= ((LazyListMeasuredItem) arrayDeque.first()).getIndex() && lazyListMeasuredItem7.getIndex() <= ((LazyListMeasuredItem) arrayDeque.last()).getIndex()) || lazyListMeasuredItem7 == lazyListMeasuredItemFindOrComposeLazyListHeader) {
                    arrayList5.add(obj);
                }
            }
            arrayList = arrayList5;
        }
        return new LazyListMeasureResult(lazyListMeasuredItem, i25, z14, f12, measureResultInvoke, arrayList, i33, i38, i10, z11, z10 ? Orientation.Vertical : Orientation.Horizontal, i13, i14);
    }
}
