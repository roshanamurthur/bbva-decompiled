package androidx.compose.runtime.snapshots;

import androidx.collection.h;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;
import s0.k;

/* JADX INFO: compiled from: SnapshotStateMap.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,372:1\n1855#2,2:373\n1726#2,3:419\n96#3,2:375\n140#3,5:377\n145#3:383\n133#3:384\n146#3,5:386\n98#3,7:391\n151#3,2:398\n137#3:400\n153#3,6:406\n161#3,3:415\n105#3:418\n89#4:382\n2420#5:385\n2313#5,2:401\n1843#5:403\n2315#5,2:404\n2317#5,3:412\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n239#1:373,2\n249#1:419,3\n246#1:375,2\n246#1:377,5\n246#1:383\n246#1:384\n246#1:386,5\n246#1:391,7\n246#1:398,2\n246#1:400\n246#1:406,6\n246#1:415,3\n246#1:418\n246#1:382\n246#1:385\n246#1:401,2\n246#1:403\n246#1:404,2\n246#1:412,3\n*E\n"})
public final class b<K, V> extends g<K, V, K> {
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
        return this.f93125p0.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f93125p0.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        SnapshotStateMap<K, V> snapshotStateMap = this.f93125p0;
        return new k(snapshotStateMap, ((ImmutableSet) snapshotStateMap.getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f93125p0.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (this.f93125p0.remove(it.next()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> collection) {
        PersistentMap<K, V> map$runtime_release;
        int modification;
        boolean z10;
        Snapshot current;
        Set set = CollectionsKt___CollectionsKt.toSet(collection);
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
            Iterator<Map.Entry<K, V>> it = snapshotStateMap.entrySet().iterator();
            while (true) {
                z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (!set.contains(next.getKey())) {
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
