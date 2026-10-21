package androidx.compose.runtime.snapshots;

import androidx.camera.core.processing.f;
import androidx.collection.h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;
import s0.i;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,372:1\n1179#2,2:373\n1253#2,4:375\n1726#2,3:423\n96#3,2:379\n140#3,5:381\n145#3:387\n133#3:388\n146#3,5:390\n98#3,7:395\n151#3,2:402\n137#3:404\n153#3,6:410\n161#3,3:419\n105#3:422\n89#4:386\n2420#5:389\n2313#5,2:405\n1843#5:407\n2315#5,2:408\n2317#5,3:416\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n221#1:373,2\n221#1:375,4\n228#1:423,3\n222#1:379,2\n222#1:381,5\n222#1:387\n222#1:388\n222#1:390,5\n222#1:395,7\n222#1:402,2\n222#1:404\n222#1:410,6\n222#1:419,3\n222#1:422\n222#1:386\n222#1:389\n222#1:405,2\n222#1:407\n222#1:408,2\n222#1:416,3\n*E\n"})
public final class a<K, V> extends g<K, V, Map.Entry<K, V>> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw h.f();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw h.f();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!TypeIntrinsics.isMutableMapEntry(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return Intrinsics.areEqual(this.f93125p0.get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        SnapshotStateMap<K, V> snapshotStateMap = this.f93125p0;
        return new i(snapshotStateMap, ((ImmutableSet) snapshotStateMap.getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return this.f93125p0.remove(((Map.Entry) obj).getKey()) != null;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (this.f93125p0.remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        boolean z10;
        Snapshot current;
        Collection<? extends Object> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(collection2, 10, 16));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = TuplesKt.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        SnapshotStateMap<K, V> snapshotStateMap = this.f93125p0;
        boolean z11 = false;
        do {
            synchronized (SnapshotStateMapKt.f15316a) {
                StateRecord firstStateRecord = snapshotStateMap.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map$runtime_release);
            PersistentMap.Builder<K, V> builderBuilder2 = map$runtime_release.builder2();
            Iterator<Map.Entry<K, V>> it2 = snapshotStateMap.entrySet().iterator();
            while (true) {
                z10 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it2.next();
                if (!linkedHashMap.containsKey(next.getKey()) || !Intrinsics.areEqual(linkedHashMap.get(next.getKey()), next.getValue())) {
                    builderBuilder2.remove(next.getKey());
                    z11 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            PersistentMap<K, V> persistentMapBuild2 = builderBuilder2.build2();
            if (Intrinsics.areEqual(persistentMapBuild2, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = snapshotStateMap.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord3 = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, snapshotStateMap, current);
                synchronized (SnapshotStateMapKt.f15316a) {
                    if (stateMapStateRecord3.getModification() == modification) {
                        stateMapStateRecord3.setMap$runtime_release(persistentMapBuild2);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, snapshotStateMap);
        } while (!z10);
        return z11;
    }
}
