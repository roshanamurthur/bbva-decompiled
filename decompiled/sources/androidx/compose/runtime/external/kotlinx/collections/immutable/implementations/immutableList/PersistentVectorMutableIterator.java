package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistentVectorMutableIterator.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH\u0016J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "previous", "()Ljava/lang/Object;", "next", "element", "", "add", "(Ljava/lang/Object;)V", RemoveCommand.ID, SetCommand.ID, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class PersistentVectorMutableIterator<T> extends AbstractListIterator<T> implements KMutableListIterator {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final PersistentVectorBuilder<T> f14914r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f14915s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public TrieIterator<? extends T> f14916t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f14917u0;

    public PersistentVectorMutableIterator(@NotNull PersistentVectorBuilder<T> persistentVectorBuilder, int i10) {
        super(i10, persistentVectorBuilder.size());
        this.f14914r0 = persistentVectorBuilder;
        this.f14915s0 = persistentVectorBuilder.getModCount$runtime_release();
        this.f14917u0 = -1;
        b();
    }

    public final void a() {
        if (this.f14915s0 != this.f14914r0.getModCount$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void add(T element) {
        a();
        int index = getIndex();
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f14914r0;
        persistentVectorBuilder.add(index, element);
        setIndex(getIndex() + 1);
        setSize(persistentVectorBuilder.size());
        this.f14915s0 = persistentVectorBuilder.getModCount$runtime_release();
        this.f14917u0 = -1;
        b();
    }

    public final void b() {
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f14914r0;
        Object[] root$runtime_release = persistentVectorBuilder.getRoot();
        if (root$runtime_release == null) {
            this.f14916t0 = null;
            return;
        }
        int iRootSize = UtilsKt.rootSize(persistentVectorBuilder.size());
        int iCoerceAtMost = c.coerceAtMost(getIndex(), iRootSize);
        int rootShift$runtime_release = (persistentVectorBuilder.getRootShift() / 5) + 1;
        TrieIterator<? extends T> trieIterator = this.f14916t0;
        if (trieIterator == null) {
            this.f14916t0 = new TrieIterator<>(root$runtime_release, iCoerceAtMost, iRootSize, rootShift$runtime_release);
        } else {
            Intrinsics.checkNotNull(trieIterator);
            trieIterator.reset$runtime_release(root$runtime_release, iCoerceAtMost, iRootSize, rootShift$runtime_release);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        a();
        checkHasNext$runtime_release();
        this.f14917u0 = getIndex();
        TrieIterator<? extends T> trieIterator = this.f14916t0;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f14914r0;
        if (trieIterator == null) {
            Object[] tail$runtime_release = persistentVectorBuilder.getTail();
            int index = getIndex();
            setIndex(index + 1);
            return (T) tail$runtime_release[index];
        }
        if (trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return trieIterator.next();
        }
        Object[] tail$runtime_release2 = persistentVectorBuilder.getTail();
        int index2 = getIndex();
        setIndex(index2 + 1);
        return (T) tail$runtime_release2[index2 - trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        a();
        checkHasPrevious$runtime_release();
        this.f14917u0 = getIndex() - 1;
        TrieIterator<? extends T> trieIterator = this.f14916t0;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f14914r0;
        if (trieIterator == null) {
            Object[] tail$runtime_release = persistentVectorBuilder.getTail();
            setIndex(getIndex() - 1);
            return (T) tail$runtime_release[getIndex()];
        }
        if (getIndex() <= trieIterator.getSize()) {
            setIndex(getIndex() - 1);
            return trieIterator.previous();
        }
        Object[] tail$runtime_release2 = persistentVectorBuilder.getTail();
        setIndex(getIndex() - 1);
        return (T) tail$runtime_release2[getIndex() - trieIterator.getSize()];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public void remove() {
        a();
        int i10 = this.f14917u0;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f14914r0;
        persistentVectorBuilder.remove(i10);
        if (this.f14917u0 < getIndex()) {
            setIndex(this.f14917u0);
        }
        setSize(persistentVectorBuilder.size());
        this.f14915s0 = persistentVectorBuilder.getModCount$runtime_release();
        this.f14917u0 = -1;
        b();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public void set(T element) {
        a();
        int i10 = this.f14917u0;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f14914r0;
        persistentVectorBuilder.set(i10, element);
        this.f14915s0 = persistentVectorBuilder.getModCount$runtime_release();
        b();
    }
}
