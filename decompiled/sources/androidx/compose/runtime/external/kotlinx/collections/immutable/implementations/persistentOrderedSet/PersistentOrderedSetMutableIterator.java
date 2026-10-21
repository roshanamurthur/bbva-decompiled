package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentOrderedSetMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "next", "()Ljava/lang/Object;", "", RemoveCommand.ID, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentOrderedSetMutableIterator<E> extends PersistentOrderedSetIterator<E> implements KMutableIterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final PersistentOrderedSetBuilder<E> f15024s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public E f15025t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f15026u0;
    public int v0;

    public PersistentOrderedSetMutableIterator(@NotNull PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder) {
        super(persistentOrderedSetBuilder.getFirstElement(), persistentOrderedSetBuilder.getHashMapBuilder$runtime_release());
        this.f15024s0 = persistentOrderedSetBuilder;
        this.v0 = persistentOrderedSetBuilder.getHashMapBuilder$runtime_release().getModCount();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public E next() {
        if (this.f15024s0.getHashMapBuilder$runtime_release().getModCount() != this.v0) {
            throw new ConcurrentModificationException();
        }
        E e5 = (E) super.next();
        this.f15025t0 = e5;
        this.f15026u0 = true;
        return e5;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public void remove() {
        if (!this.f15026u0) {
            throw new IllegalStateException();
        }
        E e5 = this.f15025t0;
        PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder = this.f15024s0;
        TypeIntrinsics.asMutableCollection(persistentOrderedSetBuilder).remove(e5);
        this.f15025t0 = null;
        this.f15026u0 = false;
        this.v0 = persistentOrderedSetBuilder.getHashMapBuilder$runtime_release().getModCount();
        setIndex$runtime_release(getIndex() - 1);
    }
}
