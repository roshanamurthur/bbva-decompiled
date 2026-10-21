package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedMapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101¢\u0006\u0004\b3\u00104J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0012H\u0016R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R,\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R&\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'0&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00065"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/AbstractMutableMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", PutCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", RemoveCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", ClearCommand.ID, "", "<set-?>", "q0", "Ljava/lang/Object;", "getFirstKey$runtime_release", "()Ljava/lang/Object;", "firstKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "s0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "hashMapBuilder", "", "getSize", "()I", "size", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;", "map", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMap;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentOrderedMapBuilder<K, V> extends AbstractMutableMap<K, V> implements PersistentMap.Builder<K, V> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public PersistentOrderedMap<K, V> f14986p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object firstKey;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Object f14988r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PersistentHashMapBuilder<K, LinkedValue<V>> hashMapBuilder;

    public PersistentOrderedMapBuilder(@NotNull PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.f14986p0 = persistentOrderedMap;
        this.firstKey = persistentOrderedMap.getFirstKey();
        this.f14988r0 = this.f14986p0.getLastKey();
        this.hashMapBuilder = this.f14986p0.getHashMap$runtime_release().builder2();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder
    @NotNull
    /* JADX INFO: renamed from: build */
    public PersistentMap<K, V> build2() {
        PersistentOrderedMap<K, V> persistentOrderedMap;
        PersistentHashMap<K, LinkedValue<V>> persistentHashMapBuild2 = this.hashMapBuilder.build2();
        if (persistentHashMapBuild2 == this.f14986p0.getHashMap$runtime_release()) {
            CommonFunctionsKt.m2164assert(this.firstKey == this.f14986p0.getFirstKey());
            CommonFunctionsKt.m2164assert(this.f14988r0 == this.f14986p0.getLastKey());
            persistentOrderedMap = this.f14986p0;
        } else {
            persistentOrderedMap = new PersistentOrderedMap<>(this.firstKey, this.f14988r0, persistentHashMapBuild2);
        }
        this.f14986p0 = persistentOrderedMap;
        return persistentOrderedMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstKey = endOfChain;
        this.f14988r0 = endOfChain;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.hashMapBuilder.containsKey(key);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(Object key) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(key);
        if (linkedValue != null) {
            return linkedValue.getValue();
        }
        return null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new PersistentOrderedMapBuilderEntries(this);
    }

    @Nullable
    /* JADX INFO: renamed from: getFirstKey$runtime_release, reason: from getter */
    public final Object getFirstKey() {
        return this.firstKey;
    }

    @NotNull
    public final PersistentHashMapBuilder<K, LinkedValue<V>> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new PersistentOrderedMapBuilderKeys(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Collection<V> getValues() {
        return new PersistentOrderedMapBuilderValues(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(K key, V value) {
        PersistentHashMapBuilder<K, LinkedValue<V>> persistentHashMapBuilder = this.hashMapBuilder;
        LinkedValue<V> linkedValue = persistentHashMapBuilder.get(key);
        if (linkedValue != null) {
            if (linkedValue.getValue() == value) {
                return value;
            }
            persistentHashMapBuilder.put(key, linkedValue.withValue(value));
            return linkedValue.getValue();
        }
        if (isEmpty()) {
            this.firstKey = key;
            this.f14988r0 = key;
            persistentHashMapBuilder.put(key, new LinkedValue<>(value));
            return null;
        }
        Object obj = this.f14988r0;
        LinkedValue<V> linkedValue2 = persistentHashMapBuilder.get((K) obj);
        Intrinsics.checkNotNull(linkedValue2);
        LinkedValue<V> linkedValue3 = linkedValue2;
        CommonFunctionsKt.m2164assert(!linkedValue3.getHasNext());
        persistentHashMapBuilder.put((K) obj, linkedValue3.withNext(key));
        persistentHashMapBuilder.put(key, new LinkedValue<>(value, obj));
        this.f14988r0 = key;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(Object key) {
        PersistentHashMapBuilder<K, LinkedValue<V>> persistentHashMapBuilder = this.hashMapBuilder;
        LinkedValue<V> linkedValueRemove = persistentHashMapBuilder.remove((K) key);
        if (linkedValueRemove == null) {
            return null;
        }
        if (linkedValueRemove.getHasPrevious()) {
            LinkedValue<V> linkedValue = persistentHashMapBuilder.get(linkedValueRemove.getPrevious());
            Intrinsics.checkNotNull(linkedValue);
            persistentHashMapBuilder.put((K) linkedValueRemove.getPrevious(), linkedValue.withNext(linkedValueRemove.getNext()));
        } else {
            this.firstKey = linkedValueRemove.getNext();
        }
        if (linkedValueRemove.getHasNext()) {
            LinkedValue<V> linkedValue2 = persistentHashMapBuilder.get(linkedValueRemove.getNext());
            Intrinsics.checkNotNull(linkedValue2);
            persistentHashMapBuilder.put((K) linkedValueRemove.getNext(), linkedValue2.withPrevious(linkedValueRemove.getPrevious()));
        } else {
            this.f14988r0 = linkedValueRemove.getPrevious();
        }
        return linkedValueRemove.getValue();
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        LinkedValue<V> linkedValue = this.hashMapBuilder.get(key);
        if (linkedValue == null || !Intrinsics.areEqual(linkedValue.getValue(), value)) {
            return false;
        }
        remove(key);
        return true;
    }
}
