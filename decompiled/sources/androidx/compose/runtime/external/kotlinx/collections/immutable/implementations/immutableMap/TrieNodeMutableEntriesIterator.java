package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeMutableEntriesIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "", "next", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;", "parentIterator", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderEntriesIterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class TrieNodeMutableEntriesIterator<K, V> extends TrieNodeBaseIterator<K, V, Map.Entry<K, V>> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final PersistentHashMapBuilderEntriesIterator<K, V> f14958s0;

    public TrieNodeMutableEntriesIterator(@NotNull PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator) {
        this.f14958s0 = persistentHashMapBuilderEntriesIterator;
    }

    @Override // java.util.Iterator
    @NotNull
    public Map.Entry<K, V> next() {
        CommonFunctionsKt.m2164assert(hasNextKey());
        setIndex(getIndex() + 2);
        return new a(this.f14958s0, getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
