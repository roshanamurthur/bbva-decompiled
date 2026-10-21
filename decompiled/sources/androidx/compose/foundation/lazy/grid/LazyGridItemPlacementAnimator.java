package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import bk.f;
import bk.q;
import dk.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import z.d;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "positionedItems", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "", "isVertical", "", "onMeasured", "reset", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n311#1,2:336\n313#1,2:339\n311#1,2:376\n313#1,2:380\n311#1,2:382\n313#1,2:385\n311#1,4:387\n101#2,2:322\n33#2,6:324\n103#2:330\n33#2,4:331\n38#2:341\n33#2,6:344\n33#2,6:352\n33#2,6:362\n33#2,6:370\n1#3:335\n86#4:338\n79#4:378\n86#4:379\n79#4:384\n1011#5,2:342\n1002#5,2:350\n1855#5,2:358\n1011#5,2:360\n1002#5,2:368\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n110#1:336,2\n110#1:339,2\n280#1:376,2\n280#1:380,2\n288#1:382,2\n288#1:385,2\n304#1:387,4\n63#1:322,2\n63#1:324,6\n63#1:330\n86#1:331,4\n86#1:341\n129#1:344,6\n146#1:352,6\n201#1:362,6\n227#1:370,6\n112#1:338\n282#1:378\n283#1:379\n294#1:384\n128#1:342,2\n145#1:350,2\n160#1:358,2\n200#1:360,2\n226#1:368,2\n*E\n"})
public final class LazyGridItemPlacementAnimator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4766c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f4764a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public LazyLayoutKeyIndexMap f4765b = LazyLayoutKeyIndexMap.INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Object> f4767d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f4768e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f4769f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList f4770g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f4771h = new ArrayList();

    public static void a(LazyGridMeasuredItem lazyGridMeasuredItem, int i10) {
        long offset = lazyGridMeasuredItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
        long jM4503copyiSbpLlY$default = lazyGridMeasuredItem.getIsVertical() ? IntOffset.m4503copyiSbpLlY$default(offset, 0, i10, 1, null) : IntOffset.m4503copyiSbpLlY$default(offset, i10, 0, 2, null);
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i11 = 0; i11 < placeablesCount; i11++) {
            Object parentData = lazyGridMeasuredItem.getParentData(i11);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long offset2 = lazyGridMeasuredItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(offset2) - IntOffset.m4507getXimpl(offset), IntOffset.m4508getYimpl(offset2) - IntOffset.m4508getYimpl(offset));
                lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jIntOffset) + IntOffset.m4507getXimpl(jM4503copyiSbpLlY$default), IntOffset.m4508getYimpl(jIntOffset) + IntOffset.m4508getYimpl(jM4503copyiSbpLlY$default)));
            }
        }
    }

    public static void b(LazyGridMeasuredItem lazyGridMeasuredItem) {
        int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            Object parentData = lazyGridMeasuredItem.getParentData(i10);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long offset = lazyGridMeasuredItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                long rawOffset = lazyLayoutAnimateItemModifierNode.getRawOffset();
                if (!IntOffset.m4506equalsimpl0(rawOffset, LazyLayoutAnimateItemModifierNode.INSTANCE.m399getNotInitializednOccac()) && !IntOffset.m4506equalsimpl0(rawOffset, offset)) {
                    lazyLayoutAnimateItemModifierNode.m395animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(offset) - IntOffset.m4507getXimpl(rawOffset), IntOffset.m4508getYimpl(offset) - IntOffset.m4508getYimpl(rawOffset)));
                }
                lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(offset);
            }
        }
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyGridMeasuredItem> positionedItems, @NotNull LazyGridMeasuredItemProvider itemProvider, @NotNull LazyGridSpanLayoutProvider spanLayoutProvider, boolean isVertical) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap;
        int i10;
        List<LazyGridMeasuredItem> positionedItems2 = positionedItems;
        Intrinsics.checkNotNullParameter(positionedItems2, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        int size = positionedItems.size();
        int i11 = 0;
        loop0: while (true) {
            linkedHashMap = this.f4764a;
            if (i11 >= size) {
                if (!linkedHashMap.isEmpty()) {
                    break;
                }
                reset();
                return;
            }
            LazyGridMeasuredItem lazyGridMeasuredItem = positionedItems2.get(i11);
            int placeablesCount = lazyGridMeasuredItem.getPlaceablesCount();
            for (int i12 = 0; i12 < placeablesCount; i12++) {
                Object parentData = lazyGridMeasuredItem.getParentData(i12);
                if ((parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null) != null) {
                    break loop0;
                }
            }
            i11++;
        }
        int i13 = this.f4766c;
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) CollectionsKt___CollectionsKt.firstOrNull((List) positionedItems);
        this.f4766c = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : 0;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = this.f4765b;
        this.f4765b = itemProvider.getKeyIndexMap();
        int i14 = isVertical ? layoutHeight : layoutWidth;
        long jIntOffset = isVertical ? IntOffsetKt.IntOffset(0, consumedScroll) : IntOffsetKt.IntOffset(consumedScroll, 0);
        LinkedHashSet<Object> linkedHashSet = this.f4767d;
        linkedHashSet.addAll(linkedHashMap.keySet());
        int size2 = positionedItems.size();
        int i15 = 0;
        while (true) {
            arrayList = this.f4769f;
            arrayList2 = this.f4768e;
            if (i15 >= size2) {
                break;
            }
            LazyGridMeasuredItem lazyGridMeasuredItem3 = positionedItems2.get(i15);
            linkedHashSet.remove(lazyGridMeasuredItem3.getKey());
            int placeablesCount2 = lazyGridMeasuredItem3.getPlaceablesCount();
            int i16 = size2;
            int i17 = 0;
            while (true) {
                if (i17 >= placeablesCount2) {
                    linkedHashMap.remove(lazyGridMeasuredItem3.getKey());
                    break;
                }
                Object parentData2 = lazyGridMeasuredItem3.getParentData(i17);
                int i18 = placeablesCount2;
                if ((parentData2 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData2 : null) != null) {
                    d dVar = (d) linkedHashMap.get(lazyGridMeasuredItem3.getKey());
                    if (dVar != null) {
                        int placeablesCount3 = lazyGridMeasuredItem3.getPlaceablesCount();
                        int i19 = 0;
                        while (i19 < placeablesCount3) {
                            Object parentData3 = lazyGridMeasuredItem3.getParentData(i19);
                            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData3 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData3 : null;
                            if (lazyLayoutAnimateItemModifierNode != null) {
                                i10 = placeablesCount3;
                                if (!IntOffset.m4506equalsimpl0(lazyLayoutAnimateItemModifierNode.getRawOffset(), LazyLayoutAnimateItemModifierNode.INSTANCE.m399getNotInitializednOccac())) {
                                    long rawOffset = lazyLayoutAnimateItemModifierNode.getRawOffset();
                                    lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jIntOffset) + IntOffset.m4507getXimpl(rawOffset), IntOffset.m4508getYimpl(jIntOffset) + IntOffset.m4508getYimpl(rawOffset)));
                                }
                            } else {
                                i10 = placeablesCount3;
                            }
                            i19++;
                            placeablesCount3 = i10;
                        }
                        dVar.f94891a = lazyGridMeasuredItem3.getCrossAxisSize();
                        dVar.f94892b = lazyGridMeasuredItem3.getCrossAxisOffset();
                        b(lazyGridMeasuredItem3);
                        break;
                    }
                    Object key = lazyGridMeasuredItem3.getKey();
                    int crossAxisSize = lazyGridMeasuredItem3.getCrossAxisSize();
                    int crossAxisOffset = lazyGridMeasuredItem3.getCrossAxisOffset();
                    d dVar2 = new d();
                    dVar2.f94891a = crossAxisSize;
                    dVar2.f94892b = crossAxisOffset;
                    linkedHashMap.put(key, dVar2);
                    int index = lazyLayoutKeyIndexMap2.getIndex(lazyGridMeasuredItem3.getKey());
                    if (index != -1 && lazyGridMeasuredItem3.getIndex() != index) {
                        if (index < i13) {
                            arrayList2.add(lazyGridMeasuredItem3);
                            break;
                        } else {
                            arrayList.add(lazyGridMeasuredItem3);
                            break;
                        }
                    }
                    long offset = lazyGridMeasuredItem3.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                    a(lazyGridMeasuredItem3, lazyGridMeasuredItem3.getIsVertical() ? IntOffset.m4508getYimpl(offset) : IntOffset.m4507getXimpl(offset));
                    break;
                }
                i17++;
                placeablesCount2 = i18;
            }
            i15++;
            positionedItems2 = positionedItems;
            size2 = i16;
        }
        if (arrayList2.size() > 1) {
            f.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    Object key2 = ((LazyGridMeasuredItem) t11).getKey();
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap2;
                    return e.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(key2)), Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyGridMeasuredItem) t10).getKey())));
                }
            });
        }
        int size3 = arrayList2.size();
        int i20 = -1;
        int i21 = 0;
        int mainAxisSize = 0;
        for (int i22 = 0; i22 < size3; i22++) {
            LazyGridMeasuredItem lazyGridMeasuredItem4 = (LazyGridMeasuredItem) arrayList2.get(i22);
            int row = isVertical ? lazyGridMeasuredItem4.getRow() : lazyGridMeasuredItem4.getColumn();
            if (row == -1 || row != i20) {
                i21 += mainAxisSize;
                mainAxisSize = lazyGridMeasuredItem4.getMainAxisSize();
                i20 = row;
            } else {
                mainAxisSize = Math.max(mainAxisSize, lazyGridMeasuredItem4.getMainAxisSize());
            }
            a(lazyGridMeasuredItem4, (0 - i21) - lazyGridMeasuredItem4.getMainAxisSize());
            b(lazyGridMeasuredItem4);
        }
        if (arrayList.size() > 1) {
            f.sortWith(arrayList, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    Object key2 = ((LazyGridMeasuredItem) t10).getKey();
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap2;
                    return e.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(key2)), Integer.valueOf(lazyLayoutKeyIndexMap3.getIndex(((LazyGridMeasuredItem) t11).getKey())));
                }
            });
        }
        int size4 = arrayList.size();
        int i23 = -1;
        int i24 = 0;
        int mainAxisSize2 = 0;
        for (int i25 = 0; i25 < size4; i25++) {
            LazyGridMeasuredItem lazyGridMeasuredItem5 = (LazyGridMeasuredItem) arrayList.get(i25);
            int row2 = isVertical ? lazyGridMeasuredItem5.getRow() : lazyGridMeasuredItem5.getColumn();
            if (row2 == -1 || row2 != i23) {
                i24 += mainAxisSize2;
                mainAxisSize2 = lazyGridMeasuredItem5.getMainAxisSize();
                i23 = row2;
            } else {
                mainAxisSize2 = Math.max(mainAxisSize2, lazyGridMeasuredItem5.getMainAxisSize());
            }
            a(lazyGridMeasuredItem5, i14 + i24);
            b(lazyGridMeasuredItem5);
        }
        Iterator<T> it = linkedHashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList3 = this.f4771h;
            arrayList4 = this.f4770g;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            d dVar3 = (d) q.getValue(linkedHashMap, next);
            int index2 = this.f4765b.getIndex(next);
            if (index2 == -1) {
                linkedHashMap.remove(next);
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap2;
            } else {
                arrayList5 = arrayList2;
                arrayList6 = arrayList;
                LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap2;
                LazyGridMeasuredItem lazyGridMeasuredItemM390getAndMeasure3p2s80s$default = LazyGridMeasuredItemProvider.m390getAndMeasure3p2s80s$default(itemProvider, index2, 0, isVertical ? Constraints.INSTANCE.m4367fixedWidthOenEA2s(dVar3.f94891a) : Constraints.INSTANCE.m4366fixedHeightOenEA2s(dVar3.f94891a), 2, null);
                int placeablesCount4 = lazyGridMeasuredItemM390getAndMeasure3p2s80s$default.getPlaceablesCount();
                boolean z10 = false;
                for (int i26 = 0; i26 < placeablesCount4; i26++) {
                    Object parentData4 = lazyGridMeasuredItemM390getAndMeasure3p2s80s$default.getParentData(i26);
                    LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode2 = parentData4 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData4 : null;
                    if (lazyLayoutAnimateItemModifierNode2 != null && lazyLayoutAnimateItemModifierNode2.isAnimationInProgress()) {
                        z10 = true;
                    }
                }
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap3;
                if (!z10 && index2 == lazyLayoutKeyIndexMap.getIndex(next)) {
                    linkedHashMap.remove(next);
                } else if (index2 < this.f4766c) {
                    arrayList4.add(lazyGridMeasuredItemM390getAndMeasure3p2s80s$default);
                } else {
                    arrayList3.add(lazyGridMeasuredItemM390getAndMeasure3p2s80s$default);
                }
            }
            lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
            arrayList = arrayList6;
            arrayList2 = arrayList5;
        }
        ArrayList arrayList7 = arrayList2;
        ArrayList arrayList8 = arrayList;
        if (arrayList4.size() > 1) {
            f.sortWith(arrayList4, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = this.f4775p0;
                    return e.compareValues(Integer.valueOf(lazyGridItemPlacementAnimator.f4765b.getIndex(((LazyGridMeasuredItem) t11).getKey())), Integer.valueOf(lazyGridItemPlacementAnimator.f4765b.getIndex(((LazyGridMeasuredItem) t10).getKey())));
                }
            });
        }
        int size5 = arrayList4.size();
        int i27 = 0;
        int mainAxisSize3 = 0;
        int i28 = -1;
        for (int i29 = 0; i29 < size5; i29++) {
            LazyGridMeasuredItem lazyGridMeasuredItem6 = (LazyGridMeasuredItem) arrayList4.get(i29);
            int lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem6.getIndex());
            if (lineIndexOfItem == -1 || lineIndexOfItem != i28) {
                i27 += mainAxisSize3;
                mainAxisSize3 = lazyGridMeasuredItem6.getMainAxisSize();
                i28 = lineIndexOfItem;
            } else {
                mainAxisSize3 = Math.max(mainAxisSize3, lazyGridMeasuredItem6.getMainAxisSize());
            }
            lazyGridMeasuredItem6.position((0 - i27) - lazyGridMeasuredItem6.getMainAxisSize(), ((d) q.getValue(linkedHashMap, lazyGridMeasuredItem6.getKey())).f94892b, layoutWidth, layoutHeight, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
            positionedItems.add(lazyGridMeasuredItem6);
            b(lazyGridMeasuredItem6);
        }
        if (arrayList3.size() > 1) {
            f.sortWith(arrayList3, new Comparator() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = this.f4773p0;
                    return e.compareValues(Integer.valueOf(lazyGridItemPlacementAnimator.f4765b.getIndex(((LazyGridMeasuredItem) t10).getKey())), Integer.valueOf(lazyGridItemPlacementAnimator.f4765b.getIndex(((LazyGridMeasuredItem) t11).getKey())));
                }
            });
        }
        int size6 = arrayList3.size();
        int mainAxisSize4 = 0;
        int i30 = -1;
        int i31 = 0;
        for (int i32 = 0; i32 < size6; i32++) {
            LazyGridMeasuredItem lazyGridMeasuredItem7 = (LazyGridMeasuredItem) arrayList3.get(i32);
            int lineIndexOfItem2 = spanLayoutProvider.getLineIndexOfItem(lazyGridMeasuredItem7.getIndex());
            if (lineIndexOfItem2 == -1 || lineIndexOfItem2 != i30) {
                i31 += mainAxisSize4;
                mainAxisSize4 = lazyGridMeasuredItem7.getMainAxisSize();
                i30 = lineIndexOfItem2;
            } else {
                mainAxisSize4 = Math.max(mainAxisSize4, lazyGridMeasuredItem7.getMainAxisSize());
            }
            lazyGridMeasuredItem7.position(i14 + i31, ((d) q.getValue(linkedHashMap, lazyGridMeasuredItem7.getKey())).f94892b, layoutWidth, layoutHeight, (48 & 16) != 0 ? -1 : 0, (48 & 32) != 0 ? -1 : 0);
            positionedItems.add(lazyGridMeasuredItem7);
            b(lazyGridMeasuredItem7);
        }
        arrayList7.clear();
        arrayList8.clear();
        arrayList4.clear();
        arrayList3.clear();
        linkedHashSet.clear();
    }

    public final void reset() {
        this.f4764a.clear();
        this.f4765b = LazyLayoutKeyIndexMap.INSTANCE;
        this.f4766c = -1;
    }
}
