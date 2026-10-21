package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import bk.g;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 -*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001-B/\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\tJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020!0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", ExifInterface.LONGITUDE_EAST, "Lkotlin/collections/AbstractSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "", "elements", "addAll", RemoveCommand.ID, "removeAll", "Lkotlin/Function1;", "predicate", "retainAll", ClearCommand.ID, "", "iterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "builder", "", "p0", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "firstElement", "q0", "getLastElement$runtime_release", "lastElement", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "r0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "getHashMap$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;", "hashMap", "", "getSize", "()I", "size", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMap;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPersistentOrderedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n1#1,109:1\n31#2:110\n31#2:111\n31#2:112\n31#2:113\n*S KotlinDebug\n*F\n+ 1 PersistentOrderedSet.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet\n*L\n56#1:110\n81#1:111\n85#1:112\n89#1:113\n*E\n"})
public final class PersistentOrderedSet<E> extends AbstractSet<E> implements PersistentSet<E> {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final PersistentOrderedSet f15013s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object firstElement;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object lastElement;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PersistentHashMap<E, Links> hashMap;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0001\u0010\bH\u0000¢\u0006\u0002\b\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "", "emptyOf", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", ExifInterface.LONGITUDE_EAST, "emptyOf$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <E> PersistentSet<E> emptyOf$runtime_release() {
            return PersistentOrderedSet.f15013s0;
        }
    }

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        f15013s0 = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.INSTANCE.emptyOf$runtime_release());
    }

    public PersistentOrderedSet(@Nullable Object obj, @Nullable Object obj2, @NotNull PersistentHashMap<E, Links> persistentHashMap) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Nullable
    /* JADX INFO: renamed from: getFirstElement$runtime_release, reason: from getter */
    public final Object getFirstElement() {
        return this.firstElement;
    }

    @NotNull
    public final PersistentHashMap<E, Links> getHashMap$runtime_release() {
        return this.hashMap;
    }

    @Nullable
    /* JADX INFO: renamed from: getLastElement$runtime_release, reason: from getter */
    public final Object getLastElement() {
        return this.lastElement;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractSet, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new PersistentOrderedSetIterator(this.firstElement, this.hashMap);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> add(E element) {
        PersistentHashMap<E, Links> persistentHashMap = this.hashMap;
        if (persistentHashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(element, element, persistentHashMap.put(element, new Links()));
        }
        Object obj = this.lastElement;
        Links links = persistentHashMap.get((E) obj);
        Intrinsics.checkNotNull(links);
        return new PersistentOrderedSet(this.firstElement, element, persistentHashMap.put((E) obj, links.withNext(element)).put(element, new Links(obj)));
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> addAll(@NotNull Collection<? extends E> elements) {
        PersistentSet.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet.Builder<E> builder() {
        return new PersistentOrderedSetBuilder(this);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> clear() {
        return INSTANCE.emptyOf$runtime_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> remove(E element) {
        PersistentHashMap<E, Links> persistentHashMap = this.hashMap;
        Links links = persistentHashMap.get(element);
        if (links == null) {
            return this;
        }
        PersistentHashMap persistentHashMapRemove = persistentHashMap.remove(element);
        if (links.getHasPrevious()) {
            V v3 = persistentHashMapRemove.get(links.getPrevious());
            Intrinsics.checkNotNull(v3);
            persistentHashMapRemove = persistentHashMapRemove.put(links.getPrevious(), ((Links) v3).withNext(links.getNext()));
        }
        if (links.getHasNext()) {
            V v6 = persistentHashMapRemove.get(links.getNext());
            Intrinsics.checkNotNull(v6);
            persistentHashMapRemove = persistentHashMapRemove.put(links.getNext(), ((Links) v6).withPrevious(links.getPrevious()));
        }
        return new PersistentOrderedSet(!links.getHasPrevious() ? links.getNext() : this.firstElement, !links.getHasNext() ? links.getPrevious() : this.lastElement, persistentHashMapRemove);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> retainAll(@NotNull Collection<? extends E> elements) {
        PersistentSet.Builder<E> builder = builder();
        builder.retainAll(elements);
        return builder.build();
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> removeAll(@NotNull Collection<? extends E> elements) {
        PersistentSet.Builder<E> builder = builder();
        builder.removeAll(elements);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @NotNull
    public PersistentSet<E> removeAll(@NotNull Function1<? super E, Boolean> predicate) {
        PersistentSet.Builder<E> builder = builder();
        g.removeAll(builder, predicate);
        return builder.build();
    }
}
