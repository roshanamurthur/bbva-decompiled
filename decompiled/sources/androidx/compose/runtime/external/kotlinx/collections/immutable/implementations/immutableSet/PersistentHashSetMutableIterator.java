package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentHashSetMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "next", "()Ljava/lang/Object;", "", RemoveCommand.ID, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentHashSetMutableIterator<E> extends PersistentHashSetIterator<E> implements KMutableIterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final PersistentHashSetBuilder<E> f14970s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public E f14971t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f14972u0;
    public int v0;

    public PersistentHashSetMutableIterator(@NotNull PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime_release());
        this.f14970s0 = persistentHashSetBuilder;
        this.v0 = persistentHashSetBuilder.getModCount();
    }

    public final void c(int i10, TrieNode<?> trieNode, E e5, int i11) {
        if (trieNode.getBitmap() == 0) {
            int iIndexOf = ArraysKt___ArraysKt.indexOf((E[]) trieNode.getBuffer(), e5);
            CommonFunctionsKt.m2164assert(iIndexOf != -1);
            getPath().get(i11).reset(trieNode.getBuffer(), iIndexOf);
            setPathLastIndex(i11);
            return;
        }
        int iIndexOfCellAt$runtime_release = trieNode.indexOfCellAt$runtime_release(1 << TrieNodeKt.indexSegment(i10, i11 * 5));
        getPath().get(i11).reset(trieNode.getBuffer(), iIndexOfCellAt$runtime_release);
        Object obj = trieNode.getBuffer()[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            c(i10, (TrieNode) obj, e5, i11 + 1);
        } else {
            setPathLastIndex(i11);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public E next() {
        if (this.f14970s0.getModCount() != this.v0) {
            throw new ConcurrentModificationException();
        }
        E e5 = (E) super.next();
        this.f14971t0 = e5;
        this.f14972u0 = true;
        return e5;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public void remove() {
        if (!this.f14972u0) {
            throw new IllegalStateException();
        }
        boolean f14969r0 = getF14969r0();
        PersistentHashSetBuilder<E> persistentHashSetBuilder = this.f14970s0;
        if (f14969r0) {
            E eCurrentElement = currentElement();
            TypeIntrinsics.asMutableCollection(persistentHashSetBuilder).remove(this.f14971t0);
            c(eCurrentElement != null ? eCurrentElement.hashCode() : 0, persistentHashSetBuilder.getNode$runtime_release(), eCurrentElement, 0);
        } else {
            TypeIntrinsics.asMutableCollection(persistentHashSetBuilder).remove(this.f14971t0);
        }
        this.f14971t0 = null;
        this.f14972u0 = false;
        this.v0 = persistentHashSetBuilder.getModCount();
    }
}
