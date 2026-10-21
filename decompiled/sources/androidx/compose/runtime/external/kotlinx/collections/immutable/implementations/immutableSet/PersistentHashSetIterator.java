package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PersistentHashSetIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0007\u0010\u0006R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", ExifInterface.LONGITUDE_EAST, "", "", "hasNext", "next", "()Ljava/lang/Object;", "currentElement", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "p0", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "path", "", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "pathLastIndex", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public class PersistentHashSetIterator<E> implements Iterator<E>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<TrieNodeIterator<E>> path;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int pathLastIndex;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f14969r0;

    public PersistentHashSetIterator(@NotNull TrieNode<E> trieNode) {
        List<TrieNodeIterator<E>> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new TrieNodeIterator());
        this.path = listMutableListOf;
        this.f14969r0 = true;
        TrieNodeIterator.reset$default(listMutableListOf.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        a();
    }

    public final void a() {
        int i10 = this.pathLastIndex;
        List<TrieNodeIterator<E>> list = this.path;
        if (list.get(i10).hasNextElement()) {
            return;
        }
        for (int i11 = this.pathLastIndex; -1 < i11; i11--) {
            int iB = b(i11);
            if (iB == -1 && list.get(i11).hasNextCell()) {
                list.get(i11).moveToNextCell();
                iB = b(i11);
            }
            if (iB != -1) {
                this.pathLastIndex = iB;
                return;
            }
            if (i11 > 0) {
                list.get(i11 - 1).moveToNextCell();
            }
            list.get(i11).reset(TrieNode.INSTANCE.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.f14969r0 = false;
    }

    public final int b(int i10) {
        List<TrieNodeIterator<E>> list = this.path;
        if (list.get(i10).hasNextElement()) {
            return i10;
        }
        if (!list.get(i10).hasNextNode()) {
            return -1;
        }
        TrieNode<? extends E> trieNodeCurrentNode = list.get(i10).currentNode();
        int i11 = i10 + 1;
        if (i11 == list.size()) {
            list.add(new TrieNodeIterator<>());
        }
        TrieNodeIterator.reset$default(list.get(i11), trieNodeCurrentNode.getBuffer(), 0, 2, null);
        return b(i11);
    }

    public final E currentElement() {
        CommonFunctionsKt.m2164assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    @NotNull
    public final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    public final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14969r0;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.f14969r0) {
            throw new NoSuchElementException();
        }
        E eNextElement = this.path.get(this.pathLastIndex).nextElement();
        a();
        return eNextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i10) {
        this.pathLastIndex = i10;
    }
}
