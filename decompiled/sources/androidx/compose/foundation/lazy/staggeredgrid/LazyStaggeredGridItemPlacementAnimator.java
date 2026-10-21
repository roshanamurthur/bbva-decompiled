package androidx.compose.foundation.lazy.staggeredgrid;

import a0.b;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
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
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LazyStaggeredGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u000e¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator;", "", "", "consumedScroll", "layoutWidth", "layoutHeight", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "positionedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "itemProvider", "", "isVertical", "laneCount", "", "onMeasured", "reset", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyStaggeredGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n268#1,2:294\n270#1,2:297\n268#1,2:334\n270#1,2:338\n268#1,2:340\n270#1,2:343\n268#1,4:345\n101#2,2:280\n33#2,6:282\n103#2:288\n33#2,4:289\n38#2:299\n33#2,6:302\n33#2,6:310\n33#2,6:320\n33#2,6:328\n1#3:293\n86#4:296\n79#4:336\n86#4:337\n79#4:342\n1011#5,2:300\n1002#5,2:308\n1855#5,2:316\n1011#5,2:318\n1002#5,2:326\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemPlacementAnimator\n*L\n110#1:294,2\n110#1:297,2\n237#1:334,2\n237#1:338,2\n245#1:340,2\n245#1:343,2\n261#1:345,4\n63#1:280,2\n63#1:282,6\n63#1:288\n86#1:289,4\n86#1:299\n129#1:302,6\n139#1:310,6\n183#1:320,6\n196#1:328,6\n112#1:296\n239#1:336\n240#1:337\n251#1:342\n128#1:300,2\n138#1:308,2\n148#1:316,2\n182#1:318,2\n195#1:326,2\n*E\n"})
public final class LazyStaggeredGridItemPlacementAnimator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5182c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f5180a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public LazyLayoutKeyIndexMap f5181b = LazyLayoutKeyIndexMap.INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashSet<Object> f5183d = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ArrayList f5184e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ArrayList f5185f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final ArrayList f5186g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final ArrayList f5187h = new ArrayList();

    public static void a(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem, int i10) {
        long j10 = lazyStaggeredGridMeasuredItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
        long jM4503copyiSbpLlY$default = lazyStaggeredGridMeasuredItem.getIsVertical() ? IntOffset.m4503copyiSbpLlY$default(j10, 0, i10, 1, null) : IntOffset.m4503copyiSbpLlY$default(j10, i10, 0, 2, null);
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i11 = 0; i11 < placeablesCount; i11++) {
            Object parentData = lazyStaggeredGridMeasuredItem.getParentData(i11);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long j11 = lazyStaggeredGridMeasuredItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                long jIntOffset = IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(j11) - IntOffset.m4507getXimpl(j10), IntOffset.m4508getYimpl(j11) - IntOffset.m4508getYimpl(j10));
                lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jIntOffset) + IntOffset.m4507getXimpl(jM4503copyiSbpLlY$default), IntOffset.m4508getYimpl(jIntOffset) + IntOffset.m4508getYimpl(jM4503copyiSbpLlY$default)));
            }
        }
    }

    public static void b(LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem) {
        int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
        for (int i10 = 0; i10 < placeablesCount; i10++) {
            Object parentData = lazyStaggeredGridMeasuredItem.getParentData(i10);
            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null;
            if (lazyLayoutAnimateItemModifierNode != null) {
                long j10 = lazyStaggeredGridMeasuredItem.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                long rawOffset = lazyLayoutAnimateItemModifierNode.getRawOffset();
                if (!IntOffset.m4506equalsimpl0(rawOffset, LazyLayoutAnimateItemModifierNode.INSTANCE.m399getNotInitializednOccac()) && !IntOffset.m4506equalsimpl0(rawOffset, j10)) {
                    lazyLayoutAnimateItemModifierNode.m395animatePlacementDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(j10) - IntOffset.m4507getXimpl(rawOffset), IntOffset.m4508getYimpl(j10) - IntOffset.m4508getYimpl(rawOffset)));
                }
                lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(j10);
            }
        }
    }

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, @NotNull List<LazyStaggeredGridMeasuredItem> positionedItems, @NotNull LazyStaggeredGridMeasureProvider itemProvider, boolean isVertical, int laneCount) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i10;
        int i11;
        Iterator it;
        int i12;
        int i13;
        int i14;
        int i15;
        LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator = this;
        List<LazyStaggeredGridMeasuredItem> positionedItems2 = positionedItems;
        Intrinsics.checkNotNullParameter(positionedItems2, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        int size = positionedItems.size();
        int i16 = 0;
        loop0: while (true) {
            linkedHashMap = lazyStaggeredGridItemPlacementAnimator.f5180a;
            if (i16 >= size) {
                if (!linkedHashMap.isEmpty()) {
                    break;
                }
                reset();
                return;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = positionedItems2.get(i16);
            int placeablesCount = lazyStaggeredGridMeasuredItem.getPlaceablesCount();
            for (int i17 = 0; i17 < placeablesCount; i17++) {
                Object parentData = lazyStaggeredGridMeasuredItem.getParentData(i17);
                if ((parentData instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData : null) != null) {
                    break loop0;
                }
            }
            i16++;
        }
        int i18 = lazyStaggeredGridItemPlacementAnimator.f5182c;
        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) CollectionsKt___CollectionsKt.firstOrNull((List) positionedItems);
        lazyStaggeredGridItemPlacementAnimator.f5182c = lazyStaggeredGridMeasuredItem2 != null ? lazyStaggeredGridMeasuredItem2.getIndex() : 0;
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap = lazyStaggeredGridItemPlacementAnimator.f5181b;
        lazyStaggeredGridItemPlacementAnimator.f5181b = itemProvider.getKeyIndexMap();
        int i19 = isVertical ? layoutHeight : layoutWidth;
        long jIntOffset = isVertical ? IntOffsetKt.IntOffset(0, consumedScroll) : IntOffsetKt.IntOffset(consumedScroll, 0);
        LinkedHashSet<Object> linkedHashSet = lazyStaggeredGridItemPlacementAnimator.f5183d;
        linkedHashSet.addAll(linkedHashMap.keySet());
        int size2 = positionedItems.size();
        int i20 = 0;
        while (true) {
            arrayList = lazyStaggeredGridItemPlacementAnimator.f5185f;
            arrayList2 = lazyStaggeredGridItemPlacementAnimator.f5184e;
            if (i20 >= size2) {
                break;
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem3 = positionedItems2.get(i20);
            int i21 = size2;
            linkedHashSet.remove(lazyStaggeredGridMeasuredItem3.getKey());
            int placeablesCount2 = lazyStaggeredGridMeasuredItem3.getPlaceablesCount();
            int i22 = 0;
            while (true) {
                if (i22 >= placeablesCount2) {
                    i12 = i18;
                    i13 = i19;
                    linkedHashMap.remove(lazyStaggeredGridMeasuredItem3.getKey());
                    break;
                }
                int i23 = placeablesCount2;
                Object parentData2 = lazyStaggeredGridMeasuredItem3.getParentData(i22);
                if ((parentData2 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData2 : null) != null) {
                    b bVar = (b) linkedHashMap.get(lazyStaggeredGridMeasuredItem3.getKey());
                    if (bVar != null) {
                        int placeablesCount3 = lazyStaggeredGridMeasuredItem3.getPlaceablesCount();
                        int i24 = 0;
                        while (i24 < placeablesCount3) {
                            Object parentData3 = lazyStaggeredGridMeasuredItem3.getParentData(i24);
                            LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode = parentData3 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData3 : null;
                            if (lazyLayoutAnimateItemModifierNode != null) {
                                i15 = i19;
                                i14 = i18;
                                if (!IntOffset.m4506equalsimpl0(lazyLayoutAnimateItemModifierNode.getRawOffset(), LazyLayoutAnimateItemModifierNode.INSTANCE.m399getNotInitializednOccac())) {
                                    long rawOffset = lazyLayoutAnimateItemModifierNode.getRawOffset();
                                    lazyLayoutAnimateItemModifierNode.m398setRawOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m4507getXimpl(jIntOffset) + IntOffset.m4507getXimpl(rawOffset), IntOffset.m4508getYimpl(jIntOffset) + IntOffset.m4508getYimpl(rawOffset)));
                                }
                            } else {
                                i14 = i18;
                                i15 = i19;
                            }
                            i24++;
                            i19 = i15;
                            i18 = i14;
                        }
                        i12 = i18;
                        i13 = i19;
                        bVar.f142a = lazyStaggeredGridMeasuredItem3.getLane();
                        bVar.f143b = lazyStaggeredGridMeasuredItem3.getSpan();
                        bVar.f144c = lazyStaggeredGridMeasuredItem3.getCrossAxisOffset();
                        b(lazyStaggeredGridMeasuredItem3);
                        break;
                    }
                    Object key = lazyStaggeredGridMeasuredItem3.getKey();
                    int lane = lazyStaggeredGridMeasuredItem3.getLane();
                    int span = lazyStaggeredGridMeasuredItem3.getSpan();
                    int crossAxisOffset = lazyStaggeredGridMeasuredItem3.getCrossAxisOffset();
                    b bVar2 = new b();
                    bVar2.f142a = lane;
                    bVar2.f143b = span;
                    bVar2.f144c = crossAxisOffset;
                    linkedHashMap.put(key, bVar2);
                    int index = lazyLayoutKeyIndexMap.getIndex(lazyStaggeredGridMeasuredItem3.getKey());
                    if (index == -1 || lazyStaggeredGridMeasuredItem3.getIndex() == index) {
                        long j10 = lazyStaggeredGridMeasuredItem3.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String();
                        a(lazyStaggeredGridMeasuredItem3, lazyStaggeredGridMeasuredItem3.getIsVertical() ? IntOffset.m4508getYimpl(j10) : IntOffset.m4507getXimpl(j10));
                    } else if (index < i18) {
                        arrayList2.add(lazyStaggeredGridMeasuredItem3);
                    } else {
                        arrayList.add(lazyStaggeredGridMeasuredItem3);
                    }
                    i12 = i18;
                    i13 = i19;
                    break;
                }
                i22++;
                placeablesCount2 = i23;
            }
            i20++;
            lazyStaggeredGridItemPlacementAnimator = this;
            positionedItems2 = positionedItems;
            i19 = i13;
            linkedHashSet = linkedHashSet;
            i18 = i12;
            size2 = i21;
        }
        LinkedHashSet<Object> linkedHashSet2 = linkedHashSet;
        int i25 = i19;
        int[] iArr = new int[laneCount];
        for (int i26 = 0; i26 < laneCount; i26++) {
            iArr[i26] = 0;
        }
        if (!arrayList2.isEmpty()) {
            if (arrayList2.size() > 1) {
                f.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        Object key2 = ((LazyStaggeredGridMeasuredItem) t11).getKey();
                        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                        return e.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(key2)), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t10).getKey())));
                    }
                });
            }
            int size3 = arrayList2.size();
            for (int i27 = 0; i27 < size3; i27++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem4 = (LazyStaggeredGridMeasuredItem) arrayList2.get(i27);
                int lane2 = lazyStaggeredGridMeasuredItem4.getLane();
                iArr[lane2] = lazyStaggeredGridMeasuredItem4.getMainAxisSize() + iArr[lane2];
                a(lazyStaggeredGridMeasuredItem4, 0 - iArr[lazyStaggeredGridMeasuredItem4.getLane()]);
                b(lazyStaggeredGridMeasuredItem4);
            }
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                f.sortWith(arrayList, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        Object key2 = ((LazyStaggeredGridMeasuredItem) t10).getKey();
                        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                        return e.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(key2)), Integer.valueOf(lazyLayoutKeyIndexMap2.getIndex(((LazyStaggeredGridMeasuredItem) t11).getKey())));
                    }
                });
            }
            int size4 = arrayList.size();
            for (int i28 = 0; i28 < size4; i28++) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem5 = (LazyStaggeredGridMeasuredItem) arrayList.get(i28);
                int i29 = iArr[lazyStaggeredGridMeasuredItem5.getLane()] + i25;
                int lane3 = lazyStaggeredGridMeasuredItem5.getLane();
                iArr[lane3] = lazyStaggeredGridMeasuredItem5.getMainAxisSize() + iArr[lane3];
                a(lazyStaggeredGridMeasuredItem5, i29);
                b(lazyStaggeredGridMeasuredItem5);
            }
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        Iterator it2 = linkedHashSet2.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList3 = this.f5187h;
            arrayList4 = this.f5186g;
            if (!zHasNext) {
                break;
            }
            Object next = it2.next();
            b bVar3 = (b) q.getValue(linkedHashMap, next);
            int index2 = this.f5181b.getIndex(next);
            if (index2 == -1) {
                linkedHashMap.remove(next);
                it = it2;
            } else {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ = itemProvider.m431getAndMeasurejy6DScQ(index2, SpanRange.m433constructorimpl(bVar3.f142a, bVar3.f143b));
                int placeablesCount4 = lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ.getPlaceablesCount();
                int i30 = 0;
                boolean z10 = false;
                while (i30 < placeablesCount4) {
                    Iterator it3 = it2;
                    Object parentData4 = lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ.getParentData(i30);
                    LazyLayoutAnimateItemModifierNode lazyLayoutAnimateItemModifierNode2 = parentData4 instanceof LazyLayoutAnimateItemModifierNode ? (LazyLayoutAnimateItemModifierNode) parentData4 : null;
                    if (lazyLayoutAnimateItemModifierNode2 != null && lazyLayoutAnimateItemModifierNode2.isAnimationInProgress()) {
                        z10 = true;
                    }
                    i30++;
                    it2 = it3;
                }
                it = it2;
                if (!z10 && index2 == lazyLayoutKeyIndexMap.getIndex(next)) {
                    linkedHashMap.remove(next);
                } else if (index2 < this.f5182c) {
                    arrayList4.add(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ);
                } else {
                    arrayList3.add(lazyStaggeredGridMeasuredItemM431getAndMeasurejy6DScQ);
                }
            }
            it2 = it;
        }
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                f.sortWith(arrayList4, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator2 = this.f5191p0;
                        return e.compareValues(Integer.valueOf(lazyStaggeredGridItemPlacementAnimator2.f5181b.getIndex(((LazyStaggeredGridMeasuredItem) t11).getKey())), Integer.valueOf(lazyStaggeredGridItemPlacementAnimator2.f5181b.getIndex(((LazyStaggeredGridMeasuredItem) t10).getKey())));
                    }
                });
            }
            int size5 = arrayList4.size();
            int i31 = 0;
            while (i31 < size5) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem6 = (LazyStaggeredGridMeasuredItem) arrayList4.get(i31);
                int lane4 = lazyStaggeredGridMeasuredItem6.getLane();
                iArr[lane4] = lazyStaggeredGridMeasuredItem6.getMainAxisSize() + iArr[lane4];
                int i32 = i25;
                lazyStaggeredGridMeasuredItem6.position(0 - iArr[lazyStaggeredGridMeasuredItem6.getLane()], ((b) q.getValue(linkedHashMap, lazyStaggeredGridMeasuredItem6.getKey())).f144c, i32);
                positionedItems.add(lazyStaggeredGridMeasuredItem6);
                b(lazyStaggeredGridMeasuredItem6);
                i31++;
                i25 = i32;
            }
            i10 = i25;
            i11 = 0;
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        } else {
            i10 = i25;
            i11 = 0;
        }
        if (!arrayList3.isEmpty()) {
            if (arrayList3.size() > 1) {
                f.sortWith(arrayList3, new Comparator() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemPlacementAnimator$onMeasured$$inlined$sortBy$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        LazyStaggeredGridItemPlacementAnimator lazyStaggeredGridItemPlacementAnimator2 = this.f5189p0;
                        return e.compareValues(Integer.valueOf(lazyStaggeredGridItemPlacementAnimator2.f5181b.getIndex(((LazyStaggeredGridMeasuredItem) t10).getKey())), Integer.valueOf(lazyStaggeredGridItemPlacementAnimator2.f5181b.getIndex(((LazyStaggeredGridMeasuredItem) t11).getKey())));
                    }
                });
            }
            int size6 = arrayList3.size();
            while (i11 < size6) {
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem7 = (LazyStaggeredGridMeasuredItem) arrayList3.get(i11);
                int i33 = iArr[lazyStaggeredGridMeasuredItem7.getLane()] + i10;
                int lane5 = lazyStaggeredGridMeasuredItem7.getLane();
                iArr[lane5] = lazyStaggeredGridMeasuredItem7.getMainAxisSize() + iArr[lane5];
                lazyStaggeredGridMeasuredItem7.position(i33, ((b) q.getValue(linkedHashMap, lazyStaggeredGridMeasuredItem7.getKey())).f144c, i10);
                positionedItems.add(lazyStaggeredGridMeasuredItem7);
                b(lazyStaggeredGridMeasuredItem7);
                i11++;
            }
        }
        arrayList2.clear();
        arrayList.clear();
        arrayList4.clear();
        arrayList3.clear();
        linkedHashSet2.clear();
    }

    public final void reset() {
        this.f5180a.clear();
        this.f5181b = LazyLayoutKeyIndexMap.INSTANCE;
        this.f5182c = -1;
    }
}
