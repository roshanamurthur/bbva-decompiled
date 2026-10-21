package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedSetBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "add", RemoveCommand.ID, "", ClearCommand.ID, "", "iterator", "", "q0", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "setFirstElement$runtime_release", "(Ljava/lang/Object;)V", "firstElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "s0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHashMapBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "hashMapBuilder", "", "getSize", "()I", "size", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", SetCommand.ID, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentOrderedSetBuilder<E> extends AbstractMutableSet<E> implements PersistentSet.Builder<E> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public PersistentOrderedSet<E> f15017p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object firstElement;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Object f15019r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PersistentHashMapBuilder<E, Links> hashMapBuilder;

    public PersistentOrderedSetBuilder(@NotNull PersistentOrderedSet<E> persistentOrderedSet) {
        this.f15017p0 = persistentOrderedSet;
        this.firstElement = persistentOrderedSet.getFirstElement();
        this.f15019r0 = this.f15017p0.getLastElement();
        this.hashMapBuilder = this.f15017p0.getHashMap$runtime_release().builder2();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E element) {
        PersistentHashMapBuilder<E, Links> persistentHashMapBuilder = this.hashMapBuilder;
        if (persistentHashMapBuilder.containsKey(element)) {
            return false;
        }
        if (isEmpty()) {
            this.firstElement = element;
            this.f15019r0 = element;
            persistentHashMapBuilder.put(element, new Links());
            return true;
        }
        Links links = persistentHashMapBuilder.get(this.f15019r0);
        Intrinsics.checkNotNull(links);
        persistentHashMapBuilder.put((E) this.f15019r0, links.withNext(element));
        persistentHashMapBuilder.put(element, new Links(this.f15019r0));
        this.f15019r0 = element;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.hashMapBuilder.clear();
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this.firstElement = endOfChain;
        this.f15019r0 = endOfChain;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return this.hashMapBuilder.containsKey(element);
    }

    @Nullable
    /* JADX INFO: renamed from: getFirstElement$runtime_release, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    @NotNull
    public final PersistentHashMapBuilder<E, Links> getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        PersistentHashMapBuilder<E, Links> persistentHashMapBuilder = this.hashMapBuilder;
        Links linksRemove = persistentHashMapBuilder.remove((E) element);
        if (linksRemove == null) {
            return false;
        }
        if (linksRemove.getHasPrevious()) {
            Links links = persistentHashMapBuilder.get(linksRemove.getPrevious());
            Intrinsics.checkNotNull(links);
            persistentHashMapBuilder.put((E) linksRemove.getPrevious(), links.withNext(linksRemove.getNext()));
        } else {
            this.firstElement = linksRemove.getNext();
        }
        if (!linksRemove.getHasNext()) {
            this.f15019r0 = linksRemove.getPrevious();
            return true;
        }
        Links links2 = persistentHashMapBuilder.get(linksRemove.getNext());
        Intrinsics.checkNotNull(links2);
        persistentHashMapBuilder.put((E) linksRemove.getNext(), links2.withPrevious(linksRemove.getPrevious()));
        return true;
    }

    public final void setFirstElement$runtime_release(@Nullable Object obj) {
        this.firstElement = obj;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentSet<E> build() {
        PersistentOrderedSet<E> persistentOrderedSet;
        PersistentHashMap<E, Links> persistentHashMapBuild2 = this.hashMapBuilder.build2();
        if (persistentHashMapBuild2 == this.f15017p0.getHashMap$runtime_release()) {
            CommonFunctionsKt.m2164assert(this.firstElement == this.f15017p0.getFirstElement());
            CommonFunctionsKt.m2164assert(this.f15019r0 == this.f15017p0.getLastElement());
            persistentOrderedSet = this.f15017p0;
        } else {
            persistentOrderedSet = new PersistentOrderedSet<>(this.firstElement, this.f15019r0, persistentHashMapBuild2);
        }
        this.f15017p0 = persistentOrderedSet;
        return persistentOrderedSet;
    }
}
