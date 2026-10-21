package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019\u0012\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0005\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007H\u0096\u0002J\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\u0006R2\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b0\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "", "currentKey", "()Ljava/lang/Object;", "", "hasNext", "next", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "p0", "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "getPath", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "path", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "pathLastIndex", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public abstract class PersistentHashMapBaseIterator<K, V, T> implements Iterator<T>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrieNodeBaseIterator<K, V, T>[] path;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int pathLastIndex;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f14931r0 = true;

    public PersistentHashMapBaseIterator(@NotNull TrieNode<K, V> trieNode, @NotNull TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].reset(trieNode.getBuffer(), trieNode.entryCount$runtime_release() * 2);
        this.pathLastIndex = 0;
        a();
    }

    public final void a() {
        int i10 = this.pathLastIndex;
        TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr = this.path;
        if (trieNodeBaseIteratorArr[i10].hasNextKey()) {
            return;
        }
        for (int i11 = this.pathLastIndex; -1 < i11; i11--) {
            int iB = b(i11);
            if (iB == -1 && trieNodeBaseIteratorArr[i11].hasNextNode()) {
                trieNodeBaseIteratorArr[i11].moveToNextNode();
                iB = b(i11);
            }
            if (iB != -1) {
                this.pathLastIndex = iB;
                return;
            }
            if (i11 > 0) {
                trieNodeBaseIteratorArr[i11 - 1].moveToNextNode();
            }
            trieNodeBaseIteratorArr[i11].reset(TrieNode.INSTANCE.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.f14931r0 = false;
    }

    public final int b(int i10) {
        TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr = this.path;
        if (trieNodeBaseIteratorArr[i10].hasNextKey()) {
            return i10;
        }
        if (!trieNodeBaseIteratorArr[i10].hasNextNode()) {
            return -1;
        }
        TrieNode<? extends K, ? extends V> trieNodeCurrentNode = trieNodeBaseIteratorArr[i10].currentNode();
        if (i10 == 6) {
            trieNodeBaseIteratorArr[i10 + 1].reset(trieNodeCurrentNode.getBuffer(), trieNodeCurrentNode.getBuffer().length);
        } else {
            trieNodeBaseIteratorArr[i10 + 1].reset(trieNodeCurrentNode.getBuffer(), trieNodeCurrentNode.entryCount$runtime_release() * 2);
        }
        return b(i10 + 1);
    }

    public final K currentKey() {
        if (hasNext()) {
            return this.path[this.pathLastIndex].currentKey();
        }
        throw new NoSuchElementException();
    }

    @NotNull
    public final TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.path;
    }

    public final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14931r0;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T next = this.path[this.pathLastIndex].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i10) {
        this.pathLastIndex = i10;
    }
}
