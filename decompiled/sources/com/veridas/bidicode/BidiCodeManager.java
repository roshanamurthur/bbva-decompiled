package com.veridas.bidicode;

import android.graphics.Bitmap;
import bk.g;
import com.veridas.bidicode.BidiCodeManager;
import com.veridas.bidicode.dependencies.BidiCodeFinder;
import com.veridas.bidicode.dependencies.BidiCodeLogger;
import com.veridas.bidicode.dependencies.IBidiCodePlacementsProvider;
import com.veridas.bidicode.entities.BidiCodeInfo;
import com.veridas.bidicode.entities.BidiCodePlacement;
import com.veridas.bidicode.entities.RawBidiCode;
import com.veridas.lib.entities.resources.bidicode.BidiType;
import dk.e;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BidiCodeManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B+\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J$\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004J4\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/veridas/bidicode/BidiCodeManager;", "", "", "waitUntilLastSearchCompletes", "", "Lcom/veridas/bidicode/entities/BidiCodeInfo;", "getFoundCodes", "", "side", "getAllCodesReadOrNotForCurrentSide", "waitUntilLastSearchCompletesAndGetFoundCodes", "Landroid/graphics/Bitmap;", "bitmap", "", "documents", "searchBidiCodesInBitmapFrame", "Ljava/nio/ByteBuffer;", "yuvData", "dataWidth", "dataHeight", "searchBidiCodesInFrame", "", "areAllCodesFoundForAllDocuments", "areAllCodesFoundForAtLeastOneDocument", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "getToBeFoundBidiCodeTypesForSide$common_image_processing_release", "(Ljava/util/List;I)Ljava/util/List;", "getToBeFoundBidiCodeTypesForSide", "Lcom/veridas/bidicode/dependencies/BidiCodeFinder;", "bidiCodeFinder", "Lcom/veridas/bidicode/dependencies/IBidiCodePlacementsProvider;", "bidiCodePlacementsProvider", "Lcom/veridas/bidicode/dependencies/BidiCodeLogger;", "bidiCodeLogger", "Lcom/veridas/bidicode/IBidiCodeManagerDelegate;", "delegate", "<init>", "(Lcom/veridas/bidicode/dependencies/BidiCodeFinder;Lcom/veridas/bidicode/dependencies/IBidiCodePlacementsProvider;Lcom/veridas/bidicode/dependencies/BidiCodeLogger;Lcom/veridas/bidicode/IBidiCodeManagerDelegate;)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBidiCodeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BidiCodeManager.kt\ncom/veridas/bidicode/BidiCodeManager\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n76#2:369\n96#2,2:370\n98#2,3:375\n76#2:378\n96#2,2:379\n98#2,3:384\n125#2:393\n152#2,2:394\n154#2:399\n215#2:444\n216#2:448\n766#3:372\n857#3,2:373\n766#3:381\n857#3,2:382\n1855#3:387\n1549#3:388\n1620#3,3:389\n1856#3:392\n766#3:396\n857#3,2:397\n1789#3,2:400\n1549#3:402\n1620#3,3:403\n766#3:406\n857#3,2:407\n1549#3:409\n1620#3,3:410\n1855#3:413\n766#3:414\n857#3,2:415\n766#3:417\n857#3,2:418\n1856#3:420\n1791#3:421\n1789#3,2:422\n1549#3:424\n1620#3,3:425\n766#3:428\n857#3,2:429\n1549#3:431\n1620#3,3:432\n1855#3:435\n766#3:436\n857#3,2:437\n766#3:439\n857#3,2:440\n1856#3:442\n1791#3:443\n766#3:445\n857#3,2:446\n1549#3:449\n1620#3,3:450\n1045#3:453\n1855#3:454\n1549#3:455\n1620#3,3:456\n1856#3:459\n*S KotlinDebug\n*F\n+ 1 BidiCodeManager.kt\ncom/veridas/bidicode/BidiCodeManager\n*L\n61#1:369\n61#1:370,2\n61#1:375,3\n69#1:378\n69#1:379,2\n69#1:384,3\n235#1:393\n235#1:394,2\n235#1:399\n334#1:444\n334#1:448\n62#1:372\n62#1:373,2\n70#1:381\n70#1:382,2\n84#1:387\n86#1:388\n86#1:389,3\n84#1:392\n242#1:396\n242#1:397,2\n272#1:400,2\n276#1:402\n276#1:403,3\n280#1:406\n280#1:407,2\n282#1:409\n282#1:410,3\n283#1:413\n284#1:414\n284#1:415,2\n287#1:417\n287#1:418,2\n283#1:420\n272#1:421\n304#1:422,2\n308#1:424\n308#1:425,3\n312#1:428\n312#1:429,2\n314#1:431\n314#1:432,3\n315#1:435\n316#1:436\n316#1:437,2\n319#1:439\n319#1:440,2\n315#1:442\n304#1:443\n336#1:445\n336#1:446,2\n342#1:449\n342#1:450,3\n344#1:453\n354#1:454\n356#1:455\n356#1:456,3\n354#1:459\n*E\n"})
public final class BidiCodeManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int OBVERSE = 0;
    public static final int REVERSE = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final BidiCodeFinder f66545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IBidiCodePlacementsProvider f66546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final BidiCodeLogger f66547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IBidiCodeManagerDelegate f66548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f66549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f66550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Future<List<BidiCodeInfo>> f66551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Pair<Integer, ? extends List<String>> f66552h;

    /* JADX INFO: compiled from: BidiCodeManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/veridas/bidicode/BidiCodeManager$Companion;", "", "()V", "OBVERSE", "", "REVERSE", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BidiCodeManager(@NotNull BidiCodeFinder bidiCodeFinder, @NotNull IBidiCodePlacementsProvider bidiCodePlacementsProvider, @Nullable BidiCodeLogger bidiCodeLogger, @NotNull IBidiCodeManagerDelegate delegate) {
        Intrinsics.checkNotNullParameter(bidiCodeFinder, "bidiCodeFinder");
        Intrinsics.checkNotNullParameter(bidiCodePlacementsProvider, "bidiCodePlacementsProvider");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f66545a = bidiCodeFinder;
        this.f66546b = bidiCodePlacementsProvider;
        this.f66547c = bidiCodeLogger;
        this.f66548d = delegate;
        this.f66549e = new LinkedHashMap();
        this.f66550f = Executors.newSingleThreadExecutor();
        if (bidiCodeLogger != null) {
            bidiCodeLogger.log("BCM -> instance creation");
        }
    }

    public static List c(LinkedHashMap linkedHashMap, int i10) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                BidiCodeInfo bidiCodeInfo = (BidiCodeInfo) obj;
                if (bidiCodeInfo.getPlacement().getSide() == i10 && !bidiCodeInfo.isRead()) {
                    arrayList.add(obj);
                }
            }
            linkedHashSet.addAll(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(BidiType.INSTANCE.getCodeTypeFrom(((BidiCodeInfo) it2.next()).getPlacement().getType()));
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.veridas.bidicode.BidiCodeManager$getToBeFoundBidiCodeTypesForSide$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Integer.valueOf(((BidiType) t10).ordinal()), Integer.valueOf(((BidiType) t11).ordinal()));
            }
        });
    }

    public final boolean a(LinkedHashMap linkedHashMap, int i10) {
        boolean z10 = true;
        for (String str : linkedHashMap.keySet()) {
            boolean z11 = false;
            if (z10) {
                List<BidiCodeInfo> foundCodes = getFoundCodes();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(foundCodes, 10));
                Iterator<T> it = foundCodes.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((BidiCodeInfo) it.next()).getPlacement().getType()));
                }
                List listSorted = CollectionsKt___CollectionsKt.sorted(arrayList);
                Object obj = linkedHashMap.get(str);
                Intrinsics.checkNotNull(obj);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((BidiCodeInfo) obj2).getPlacement().getSide() == i10) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((BidiCodeInfo) it2.next()).getPlacement().getType()));
                }
                List listSorted2 = CollectionsKt___CollectionsKt.sorted(arrayList3);
                Iterator it3 = listSorted2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z11 = true;
                        break;
                    }
                    int iIntValue = ((Number) it3.next()).intValue();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listSorted2) {
                        if (((Number) obj3).intValue() == iIntValue) {
                            arrayList4.add(obj3);
                        }
                    }
                    int size = arrayList4.size();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : listSorted) {
                        if (((Number) obj4).intValue() == iIntValue) {
                            arrayList5.add(obj4);
                        }
                    }
                    int size2 = arrayList5.size();
                    if (size != size2 && size > size2) {
                        break;
                    }
                }
            }
            z10 = z11;
        }
        return z10;
    }

    public final boolean areAllCodesFoundForAllDocuments() {
        Pair<Integer, ? extends List<String>> pair = this.f66552h;
        if (pair == null) {
            return false;
        }
        return a(this.f66549e, pair.getFirst().intValue());
    }

    public final boolean areAllCodesFoundForAtLeastOneDocument() {
        Pair<Integer, ? extends List<String>> pair = this.f66552h;
        if (pair == null) {
            return false;
        }
        int iIntValue = pair.getFirst().intValue();
        LinkedHashMap linkedHashMap = this.f66549e;
        while (true) {
            boolean z10 = false;
            for (String str : linkedHashMap.keySet()) {
                if (!z10) {
                    List<BidiCodeInfo> foundCodes = getFoundCodes();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(foundCodes, 10));
                    Iterator<T> it = foundCodes.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((BidiCodeInfo) it.next()).getPlacement().getType()));
                    }
                    List listSorted = CollectionsKt___CollectionsKt.sorted(arrayList);
                    Object obj = linkedHashMap.get(str);
                    Intrinsics.checkNotNull(obj);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (((BidiCodeInfo) obj2).getPlacement().getSide() == iIntValue) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(((BidiCodeInfo) it2.next()).getPlacement().getType()));
                    }
                    List listSorted2 = CollectionsKt___CollectionsKt.sorted(arrayList3);
                    Iterator it3 = listSorted2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            int iIntValue2 = ((Number) it3.next()).intValue();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : listSorted2) {
                                if (((Number) obj3).intValue() == iIntValue2) {
                                    arrayList4.add(obj3);
                                }
                            }
                            int size = arrayList4.size();
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj4 : listSorted) {
                                if (((Number) obj4).intValue() == iIntValue2) {
                                    arrayList5.add(obj4);
                                }
                            }
                            int size2 = arrayList5.size();
                            if (size == size2 || size <= size2) {
                            }
                        } else {
                            continue;
                        }
                    }
                }
                z10 = true;
            }
            return z10;
        }
    }

    public final void b(List<String> list) {
        LinkedHashMap linkedHashMap = this.f66549e;
        linkedHashMap.clear();
        Map<String, List<BidiCodePlacement>> placementsForDocuments = this.f66546b.getPlacementsForDocuments(list);
        for (String str : placementsForDocuments.keySet()) {
            List<BidiCodePlacement> list2 = placementsForDocuments.get(str);
            if (list2 != null) {
                List<BidiCodePlacement> list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BidiCodeInfo((BidiCodePlacement) it.next(), null, false, 6, null));
                }
                linkedHashMap.put(str, arrayList);
            }
        }
    }

    public final boolean d(int i10, List<String> list) {
        Future<List<BidiCodeInfo>> future = this.f66551g;
        if ((future != null && !future.isDone()) || list.isEmpty()) {
            return false;
        }
        Pair<Integer, ? extends List<String>> pair = this.f66552h;
        LinkedHashMap linkedHashMap = this.f66549e;
        BidiCodeLogger bidiCodeLogger = this.f66547c;
        if (pair == null) {
            this.f66552h = new Pair<>(Integer.valueOf(i10), list);
            b(list);
            if (bidiCodeLogger != null) {
                bidiCodeLogger.log("BCM -> First Config " + this.f66552h);
            }
            if (bidiCodeLogger != null) {
                bidiCodeLogger.log(linkedHashMap.toString());
            }
        } else if (!Intrinsics.areEqual(pair, new Pair(Integer.valueOf(i10), list))) {
            this.f66552h = new Pair<>(Integer.valueOf(i10), list);
            b(list);
            if (bidiCodeLogger != null) {
                bidiCodeLogger.log("BCM -> Config Changed " + this.f66552h);
            }
            if (bidiCodeLogger != null) {
                bidiCodeLogger.log(linkedHashMap.toString());
            }
        } else if (bidiCodeLogger != null) {
            bidiCodeLogger.log("BCM -> BidiCodeManager -> Config Reused " + this.f66552h);
        }
        return (linkedHashMap.isEmpty() || a(linkedHashMap, i10)) ? false : true;
    }

    public final ArrayList e(int i10, List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RawBidiCode rawBidiCode = (RawBidiCode) it.next();
            LinkedHashMap linkedHashMap = this.f66549e;
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                List list2 = (List) ((Map.Entry) it2.next()).getValue();
                Iterator it3 = list2.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!Intrinsics.areEqual(((BidiCodeInfo) next).getData(), rawBidiCode.getData()));
                BidiCodeInfo bidiCodeInfo = (BidiCodeInfo) next;
                if (bidiCodeInfo == null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list2) {
                        BidiCodeInfo bidiCodeInfo2 = (BidiCodeInfo) obj;
                        if (!Intrinsics.areEqual(bidiCodeInfo2, bidiCodeInfo) && bidiCodeInfo2.getPlacement().getType() == rawBidiCode.getType().ordinal() && bidiCodeInfo2.getPlacement().getSide() == i10 && !bidiCodeInfo2.isRead()) {
                            arrayList3.add(obj);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        BidiCodeInfo bidiCodeInfo3 = (BidiCodeInfo) CollectionsKt___CollectionsKt.first((List) arrayList3);
                        bidiCodeInfo3.setRead(true);
                        String data = rawBidiCode.getData();
                        Intrinsics.checkNotNull(data);
                        bidiCodeInfo3.setData(data);
                        arrayList.add(bidiCodeInfo3);
                        this.f66548d.bidiRegionFound(bidiCodeInfo3.getPlacement().getRegion());
                    }
                }
                arrayList2.add(Unit.INSTANCE);
            }
            BidiCodeLogger bidiCodeLogger = this.f66547c;
            if (bidiCodeLogger != null) {
                bidiCodeLogger.log("BCM -> method: parseReadCodesAddToFoundOnesAndSendRegion Bidis found: " + rawBidiCode);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<BidiCodeInfo> getAllCodesReadOrNotForCurrentSide(int side) {
        LinkedHashMap linkedHashMap = this.f66549e;
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((BidiCodeInfo) obj).getPlacement().getSide() == side) {
                    arrayList2.add(obj);
                }
            }
            g.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    @NotNull
    public final List<BidiCodeInfo> getFoundCodes() {
        LinkedHashMap linkedHashMap = this.f66549e;
        BidiCodeLogger bidiCodeLogger = this.f66547c;
        if (bidiCodeLogger != null) {
            bidiCodeLogger.log("BCM -> getFoundCodes " + linkedHashMap);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            List list = (List) ((Map.Entry) it.next()).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((BidiCodeInfo) obj).isRead()) {
                    arrayList2.add(obj);
                }
            }
            g.addAll(arrayList, arrayList2);
        }
        return CollectionsKt___CollectionsKt.distinct(arrayList);
    }

    @NotNull
    public final List<BidiType> getToBeFoundBidiCodeTypesForSide$common_image_processing_release(@NotNull List<String> documents, int side) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f66549e;
        if (linkedHashMap2.isEmpty()) {
            Map<String, List<BidiCodePlacement>> placementsForDocuments = this.f66546b.getPlacementsForDocuments(documents);
            for (String str : placementsForDocuments.keySet()) {
                List<BidiCodePlacement> list = placementsForDocuments.get(str);
                if (list != null) {
                    List<BidiCodePlacement> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new BidiCodeInfo((BidiCodePlacement) it.next(), null, false, 6, null));
                    }
                    linkedHashMap.put(str, arrayList);
                }
            }
        } else {
            linkedHashMap = linkedHashMap2;
        }
        return c(linkedHashMap, side);
    }

    public final void searchBidiCodesInBitmapFrame(@NotNull final Bitmap bitmap, final int side, @NotNull List<String> documents) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(documents, "documents");
        if (d(side, documents)) {
            this.f66551g = this.f66550f.submit(new Callable() { // from class: ui.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BidiCodeManager.Companion companion = BidiCodeManager.INSTANCE;
                    BidiCodeManager this$0 = this.f93861p0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Bitmap bitmap2 = bitmap;
                    Intrinsics.checkNotNullParameter(bitmap2, "$bitmap");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LinkedHashMap linkedHashMap = this$0.f66549e;
                    int i10 = side;
                    List<? extends BidiType> listC = BidiCodeManager.c(linkedHashMap, i10);
                    List<RawBidiCode> listEmptyList = listC.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : this$0.f66545a.search(bitmap2, listC);
                    Intrinsics.checkNotNull(listEmptyList);
                    ArrayList arrayListE = this$0.e(i10, listEmptyList);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    BidiCodeLogger bidiCodeLogger = this$0.f66547c;
                    if (bidiCodeLogger != null) {
                        bidiCodeLogger.log("BCM -> after parseReadCodesAddToFoundOnesAndSendRegion Bidi search took " + jCurrentTimeMillis2 + " ms");
                    }
                    return arrayListE;
                }
            });
        }
    }

    public final void searchBidiCodesInFrame(@NotNull final ByteBuffer yuvData, final int dataWidth, final int dataHeight, final int side, @NotNull List<String> documents) {
        Intrinsics.checkNotNullParameter(yuvData, "yuvData");
        Intrinsics.checkNotNullParameter(documents, "documents");
        if (d(side, documents)) {
            this.f66551g = this.f66550f.submit(new Callable() { // from class: ui.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List<RawBidiCode> listSearch;
                    BidiCodeManager.Companion companion = BidiCodeManager.INSTANCE;
                    BidiCodeManager this$0 = this.f93864p0;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    ByteBuffer yuvData2 = yuvData;
                    Intrinsics.checkNotNullParameter(yuvData2, "$yuvData");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LinkedHashMap linkedHashMap = this$0.f66549e;
                    int i10 = side;
                    List<? extends BidiType> listC = BidiCodeManager.c(linkedHashMap, i10);
                    if (listC.isEmpty()) {
                        listSearch = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listSearch = this$0.f66545a.search(yuvData2, dataWidth, dataHeight, listC);
                        if (listSearch == null) {
                            listSearch = CollectionsKt__CollectionsKt.emptyList();
                        }
                    }
                    ArrayList arrayListE = this$0.e(i10, listSearch);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    BidiCodeLogger bidiCodeLogger = this$0.f66547c;
                    if (bidiCodeLogger != null) {
                        bidiCodeLogger.log("BCM -> Bidi search took " + jCurrentTimeMillis2 + " ms");
                    }
                    return arrayListE;
                }
            });
        }
    }

    public final void waitUntilLastSearchCompletes() throws ExecutionException, InterruptedException {
        Future<List<BidiCodeInfo>> future = this.f66551g;
        if (future != null) {
            future.get();
        }
    }

    @NotNull
    public final List<BidiCodeInfo> waitUntilLastSearchCompletesAndGetFoundCodes() throws ExecutionException, InterruptedException {
        Future<List<BidiCodeInfo>> future = this.f66551g;
        if (future != null) {
            future.get();
        }
        return getFoundCodes();
    }

    public /* synthetic */ BidiCodeManager(BidiCodeFinder bidiCodeFinder, IBidiCodePlacementsProvider iBidiCodePlacementsProvider, BidiCodeLogger bidiCodeLogger, IBidiCodeManagerDelegate iBidiCodeManagerDelegate, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bidiCodeFinder, iBidiCodePlacementsProvider, (i10 & 4) != 0 ? null : bidiCodeLogger, iBidiCodeManagerDelegate);
    }
}
