package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import bk.f;
import dk.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyListItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "positionedItems", "Landroidx/compose/foundation/lazy/LazyListMeasuredItemProvider;", "itemProvider", "", "isVertical", "", "onMeasured", "reset", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n246#1,2:266\n248#1,2:270\n246#1,2:307\n248#1,2:312\n246#1,2:314\n248#1,2:318\n246#1,2:320\n248#1,2:323\n101#2,2:252\n33#2,6:254\n103#2:260\n33#2,4:261\n38#2:272\n33#2,6:275\n33#2,6:283\n33#2,6:293\n33#2,6:301\n1#3:265\n1#3:268\n1#3:309\n1#3:316\n1#3:322\n86#4:269\n79#4:310\n86#4:311\n79#4:317\n1011#5,2:273\n1002#5,2:281\n1855#5,2:289\n1011#5,2:291\n1002#5,2:299\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n105#1:266,2\n105#1:270,2\n215#1:307,2\n215#1:312,2\n223#1:314,2\n223#1:318,2\n239#1:320,2\n239#1:323,2\n61#1:252,2\n61#1:254,6\n61#1:260\n84#1:261,4\n84#1:272\n120#1:275,6\n128#1:283,6\n166#1:293,6\n176#1:301,6\n105#1:268\n215#1:309\n223#1:316\n239#1:322\n107#1:269\n217#1:310\n218#1:311\n229#1:317\n119#1:273,2\n127#1:281,2\n135#1:289,2\n165#1:291,2\n175#1:299,2\n*E\n"})
public final class LazyListItemPlacementAnimator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4572c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet f4570a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public LazyLayoutKeyIndexMap f4571b = LazyLayoutKeyIndexMap.INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Object> f4573d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f4574e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f4575f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList f4576g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f4577h = new ArrayList();

    public static void a(LazyListMeasuredItem lazyListMeasuredItem, int i10) {
        long jM370getOffsetBjo55l4 = lazyListMeasuredItem.m370getOffsetBjo55l4(0);
        long jM4503copyiSbpLlY$default = lazyListMeasuredItem.getIsVertical() ? IntOffset.m4503copyiSbpLlY$default(jM370getOffsetBjo55l4, 0, i10, 1, null) : IntOffset.m4503copyiSbpLlY$default(jM370getOffsetBjo55l4, i10, 0, 2, null);
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i11 = 0; i11 < placeablesCount; i11++) {
            Object parentData = lazyListMeasuredItem.getParentData(i11);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long jM370getOffsetBjo55l5 = lazyListMeasuredItem.m370getOffsetBjo55l4(i11);
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jM370getOffsetBjo55l5) - IntOffset.m4507getXimpl(jM370getOffsetBjo55l4), IntOffset.m4508getYimpl(jM370getOffsetBjo55l5) - IntOffset.m4508getYimpl(jM370getOffsetBjo55l4));
                lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jIntOffset) + IntOffset.m4507getXimpl(jM4503copyiSbpLlY$default), IntOffset.m4508getYimpl(jIntOffset) + IntOffset.m4508getYimpl(jM4503copyiSbpLlY$default)));
            }
        }
    }

    public static void b(LazyListMeasuredItem lazyListMeasuredItem) {
        int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            Object parentData = lazyListMeasuredItem.getParentData(i10);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long jM370getOffsetBjo55l4 = lazyListMeasuredItem.m370getOffsetBjo55l4(i10);
                long rawOffset = lazyLayoutAnimateItemModifierNode.getRawOffset();
                if (!IntOffset.m4506equalsimpl0(rawOffset, LazyLayoutAnimateItemModifierNode.INSTANCE.m399getNotInitializednOccac()) && !IntOffset.m4506equalsimpl0(rawOffset, jM370getOffsetBjo55l4)) {
                    lazyLayoutAnimateItemModifierNode.m395animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jM370getOffsetBjo55l4) - IntOffset.m4507getXimpl(rawOffset), IntOffset.m4508getYimpl(jM370getOffsetBjo55l4) - IntOffset.m4508getYimpl(rawOffset)));
                }
                lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(jM370getOffsetBjo55l4);
            }
        }
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyListMeasuredItem> positionedItems, @NotNull LazyListMeasuredItemProvider itemProvider, boolean isVertical) {
        LinkedHashSet linkedHashSet;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        int i10;
        int i11;
        List<LazyListMeasuredItem> positionedItems2 = positionedItems;
        Intrinsics.checkNotNullParameter(positionedItems2, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i12 = 0;
        loop0: while (true) {
            linkedHashSet = this.f4570a;
            if (i12 >= size) {
                if (!linkedHashSet.isEmpty()) {
                    break;
                }
                reset();
                return;
            }
            LazyListMeasuredItem lazyListMeasuredItem = positionedItems2.get(i12);
            int placeablesCount = lazyListMeasuredItem.getPlaceablesCount();
            for (int i13 = 0; i13 < placeablesCount; i13++) {
                Object parentData = lazyListMeasuredItem.getParentData(i13);
                if ((parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null) != null) {
                    break loop0;
                }
            }
            i12++;
        }
        int i14 = this.f4572c;
        LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) CollectionsKt___CollectionsKt.firstOrNull((List) positionedItems);
        this.f4572c = lazyListMeasuredItem2 != null ? lazyListMeasuredItem2.getIndex() : 0;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = this.f4571b;
        this.f4571b = itemProvider.getKeyIndexMap();
        int i15 = isVertical ? layoutHeight : layoutWidth;
        long jIntOffset = isVertical ? IntOffsetKt.IntOffset(0, consumedScroll) : IntOffsetKt.IntOffset(consumedScroll, 0);
        LinkedHashSet<Object> linkedHashSet2 = this.f4573d;
        linkedHashSet2.addAll(linkedHashSet);
        int size2 = positionedItems.size();
        int i16 = 0;
        while (true) {
            arrayList = this.f4575f;
            arrayList2 = this.f4574e;
            if (i16 >= size2) {
                break;
            }
            LazyListMeasuredItem lazyListMeasuredItem3 = positionedItems2.get(i16);
            int i17 = size2;
            linkedHashSet2.remove(lazyListMeasuredItem3.getKey());
            int placeablesCount2 = lazyListMeasuredItem3.getPlaceablesCount();
            int i18 = 0;
            while (true) {
                if (i18 >= placeablesCount2) {
                    i10 = i14;
                    linkedHashSet.remove(lazyListMeasuredItem3.getKey());
                    break;
                }
                int i19 = placeablesCount2;
                Object parentData2 = lazyListMeasuredItem3.getParentData(i18);
                if ((parentData2 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData2 : null) != null) {
                    if (!linkedHashSet.contains(lazyListMeasuredItem3.getKey())) {
                        linkedHashSet.add(lazyListMeasuredItem3.getKey());
                        int index = lazyLayoutKeyIndexMap.getIndex(lazyListMeasuredItem3.getKey());
                        if (index == -1 || lazyListMeasuredItem3.getIndex() == index) {
                            long jM370getOffsetBjo55l4 = lazyListMeasuredItem3.m370getOffsetBjo55l4(0);
                            a(lazyListMeasuredItem3, lazyListMeasuredItem3.getIsVertical() ? IntOffset.m4508getYimpl(jM370getOffsetBjo55l4) : IntOffset.m4507getXimpl(jM370getOffsetBjo55l4));
                        } else if (index < i14) {
                            arrayList2.add(lazyListMeasuredItem3);
                        } else {
                            arrayList.add(lazyListMeasuredItem3);
                        }
                        i10 = i14;
                        break;
                    }
                    int placeablesCount3 = lazyListMeasuredItem3.getPlaceablesCount();
                    int i20 = 0;
                    while (i20 < placeablesCount3) {
                        Object parentData3 = lazyListMeasuredItem3.getParentData(i20);
                        LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData3 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData3 : null;
                        int i21 = placeablesCount3;
                        if (lazyLayoutAnimateItemModifierNode != null) {
                            i11 = i14;
                            if (!IntOffset.m4506equalsimpl0(lazyLayoutAnimateItemModifierNode.getRawOffset(), LazyLayoutAnimateItemModifierNode.INSTANCE.m399getNotInitializednOccac())) {
                                long rawOffset = lazyLayoutAnimateItemModifierNode.getRawOffset();
                                lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jIntOffset) + IntOffset.m4507getXimpl(rawOffset), IntOffset.m4508getYimpl(jIntOffset) + IntOffset.m4508getYimpl(rawOffset)));
                            }
                        } else {
                            i11 = i14;
                        }
                        i20++;
                        placeablesCount3 = i21;
                        i14 = i11;
                    }
                    i10 = i14;
                    b(lazyListMeasuredItem3);
                    break;
                }
                i18++;
                placeablesCount2 = i19;
            }
            i16++;
            positionedItems2 = positionedItems;
            size2 = i17;
            i14 = i10;
        }
        if (arrayList2.size() > 1) {
            f.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    Object key = ((LazyListMeasuredItem) t11).getKey();
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                    return e.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(key)), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyListMeasuredItem) t10).getKey())));
                }
            });
        }
        int size3 = arrayList2.size();
        int size4 = 0;
        for (int i22 = 0; i22 < size3; i22++) {
            LazyListMeasuredItem lazyListMeasuredItem4 = (LazyListMeasuredItem) arrayList2.get(i22);
            size4 += lazyListMeasuredItem4.getSize();
            a(lazyListMeasuredItem4, 0 - size4);
            b(lazyListMeasuredItem4);
        }
        if (arrayList.size() > 1) {
            f.sortWith(arrayList, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    Object key = ((LazyListMeasuredItem) t10).getKey();
                    LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                    return e.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(key)), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyListMeasuredItem) t11).getKey())));
                }
            });
        }
        int size5 = arrayList.size();
        int size6 = 0;
        for (int i23 = 0; i23 < size5; i23++) {
            LazyListMeasuredItem lazyListMeasuredItem5 = (LazyListMeasuredItem) arrayList.get(i23);
            int i24 = i15 + size6;
            size6 += lazyListMeasuredItem5.getSize();
            a(lazyListMeasuredItem5, i24);
            b(lazyListMeasuredItem5);
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList3 = this.f4577h;
            arrayList4 = this.f4576g;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            int index2 = this.f4571b.getIndex(next);
            if (index2 == -1) {
                linkedHashSet.remove(next);
                it = it2;
            } else {
                LazyListMeasuredItem andMeasure = itemProvider.getAndMeasure(index2);
                int placeablesCount4 = andMeasure.getPlaceablesCount();
                int i25 = 0;
                boolean z10 = false;
                while (i25 < placeablesCount4) {
                    Iterator it3 = it2;
                    Object parentData4 = andMeasure.getParentData(i25);
                    int i26 = placeablesCount4;
                    LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode2 = parentData4 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData4 : null;
                    if (lazyLayoutAnimateItemModifierNode2 != null && lazyLayoutAnimateItemModifierNode2.isAnimationInProgress()) {
                        z10 = true;
                    }
                    i25++;
                    it2 = it3;
                    placeablesCount4 = i26;
                }
                it = it2;
                if (!z10 && index2 == lazyLayoutKeyIndexMap.getIndex(next)) {
                    linkedHashSet.remove(next);
                } else if (index2 < this.f4572c) {
                    arrayList4.add(andMeasure);
                } else {
                    arrayList3.add(andMeasure);
                }
            }
            it2 = it;
        }
        if (arrayList4.size() > 1) {
            f.sortWith(arrayList4, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    LazyListItemPlacementAnimator lazyListItemPlacementAnimator = this.f4581p0;
                    return e.compareValues(Integer.valueOf(lazyListItemPlacementAnimator.f4571b.getIndex(((LazyListMeasuredItem) t11).getKey())), Integer.valueOf(lazyListItemPlacementAnimator.f4571b.getIndex(((LazyListMeasuredItem) t10).getKey())));
                }
            });
        }
        int size7 = arrayList4.size();
        int size8 = 0;
        for (int i27 = 0; i27 < size7; i27++) {
            LazyListMeasuredItem lazyListMeasuredItem6 = (LazyListMeasuredItem) arrayList4.get(i27);
            size8 += lazyListMeasuredItem6.getSize();
            lazyListMeasuredItem6.position(0 - size8, layoutWidth, layoutHeight);
            positionedItems.add(lazyListMeasuredItem6);
            b(lazyListMeasuredItem6);
        }
        if (arrayList3.size() > 1) {
            f.sortWith(arrayList3, new Comparator() { // from class: androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    LazyListItemPlacementAnimator lazyListItemPlacementAnimator = this.f4579p0;
                    return e.compareValues(Integer.valueOf(lazyListItemPlacementAnimator.f4571b.getIndex(((LazyListMeasuredItem) t10).getKey())), Integer.valueOf(lazyListItemPlacementAnimator.f4571b.getIndex(((LazyListMeasuredItem) t11).getKey())));
                }
            });
        }
        int size9 = arrayList3.size();
        int size10 = 0;
        for (int i28 = 0; i28 < size9; i28++) {
            LazyListMeasuredItem lazyListMeasuredItem7 = (LazyListMeasuredItem) arrayList3.get(i28);
            int i29 = i15 + size10;
            size10 = lazyListMeasuredItem7.getSize() + size10;
            lazyListMeasuredItem7.position(i29, layoutWidth, layoutHeight);
            positionedItems.add(lazyListMeasuredItem7);
            b(lazyListMeasuredItem7);
        }
        arrayList2.clear();
        arrayList.clear();
        arrayList4.clear();
        arrayList3.clear();
        linkedHashSet2.clear();
    }

    public final void reset() {
        this.f4570a.clear();
        this.f4571b = LazyLayoutKeyIndexMap.INSTANCE;
        this.f4572c = -1;
    }
}
