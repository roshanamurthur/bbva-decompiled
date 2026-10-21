package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u001e\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "next", "()Ljava/lang/Object;", "", RemoveCommand.ID, "key", "newValue", "setValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "path", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends PersistentHashMapBaseIterator<K, V, T> implements KMutableIterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final PersistentHashMapBuilder<K, V> f14938s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public K f14939t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f14940u0;
    public int v0;

    public PersistentHashMapBuilderBaseIterator(@NotNull PersistentHashMapBuilder<K, V> persistentHashMapBuilder, @NotNull TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime_release(), trieNodeBaseIteratorArr);
        this.f14938s0 = persistentHashMapBuilder;
        this.v0 = persistentHashMapBuilder.getModCount();
    }

    public final void c(int i10, TrieNode<?, ?> trieNode, K k10, int i11) {
        int i12 = i11 * 5;
        if (i12 > 30) {
            getPath()[i11].reset(trieNode.getBuffer(), trieNode.getBuffer().length, 0);
            while (!Intrinsics.areEqual(getPath()[i11].currentKey(), k10)) {
                getPath()[i11].moveToNextKey();
            }
            setPathLastIndex(i11);
            return;
        }
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i10, i12);
        if (trieNode.hasEntryAt$runtime_release(iIndexSegment)) {
            getPath()[i11].reset(trieNode.getBuffer(), trieNode.entryCount$runtime_release() * 2, trieNode.entryKeyIndex$runtime_release(iIndexSegment));
            setPathLastIndex(i11);
        } else {
            int iNodeIndex$runtime_release = trieNode.nodeIndex$runtime_release(iIndexSegment);
            TrieNode<?, ?> trieNodeNodeAtIndex$runtime_release = trieNode.nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            getPath()[i11].reset(trieNode.getBuffer(), trieNode.entryCount$runtime_release() * 2, iNodeIndex$runtime_release);
            c(i10, trieNodeNodeAtIndex$runtime_release, k10, i11 + 1);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        if (this.f14938s0.getModCount() != this.v0) {
            throw new ConcurrentModificationException();
        }
        this.f14939t0 = currentKey();
        this.f14940u0 = true;
        return (T) super.next();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        if (!this.f14940u0) {
            throw new IllegalStateException();
        }
        boolean zHasNext = getF14931r0();
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder = this.f14938s0;
        if (zHasNext) {
            K kCurrentKey = currentKey();
            TypeIntrinsics.asMutableMap(persistentHashMapBuilder).remove(this.f14939t0);
            c(kCurrentKey != null ? kCurrentKey.hashCode() : 0, persistentHashMapBuilder.getNode$runtime_release(), kCurrentKey, 0);
        } else {
            TypeIntrinsics.asMutableMap(persistentHashMapBuilder).remove(this.f14939t0);
        }
        this.f14939t0 = null;
        this.f14940u0 = false;
        this.v0 = persistentHashMapBuilder.getModCount();
    }

    public final void setValue(K key, V newValue) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder = this.f14938s0;
        if (persistentHashMapBuilder.containsKey(key)) {
            if (getF14931r0()) {
                K kCurrentKey = currentKey();
                persistentHashMapBuilder.put(key, newValue);
                c(kCurrentKey != null ? kCurrentKey.hashCode() : 0, persistentHashMapBuilder.getNode$runtime_release(), kCurrentKey, 0);
            } else {
                persistentHashMapBuilder.put(key, newValue);
            }
            this.v0 = persistentHashMapBuilder.getModCount();
        }
    }
}
