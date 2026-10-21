package s0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateListKt;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n1#2:498\n*E\n"})
public final class h<T> implements ListIterator<T>, KMutableListIterator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<T> f93126p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f93127q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f93128r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f93129s0;

    public h(@NotNull SnapshotStateList<T> snapshotStateList, int i10) {
        this.f93126p0 = snapshotStateList;
        this.f93127q0 = i10 - 1;
        this.f93129s0 = snapshotStateList.getStructure$runtime_release();
    }

    public final void a() {
        if (this.f93126p0.getStructure$runtime_release() != this.f93129s0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t10) {
        a();
        int i10 = this.f93127q0 + 1;
        SnapshotStateList<T> snapshotStateList = this.f93126p0;
        snapshotStateList.add(i10, t10);
        this.f93128r0 = -1;
        this.f93127q0++;
        this.f93129s0 = snapshotStateList.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f93127q0 < this.f93126p0.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f93127q0 >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i10 = this.f93127q0 + 1;
        this.f93128r0 = i10;
        SnapshotStateList<T> snapshotStateList = this.f93126p0;
        SnapshotStateListKt.access$validateRange(i10, snapshotStateList.size());
        T t10 = snapshotStateList.get(i10);
        this.f93127q0 = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f93127q0 + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        int i10 = this.f93127q0;
        SnapshotStateList<T> snapshotStateList = this.f93126p0;
        SnapshotStateListKt.access$validateRange(i10, snapshotStateList.size());
        int i11 = this.f93127q0;
        this.f93128r0 = i11;
        T t10 = snapshotStateList.get(i11);
        this.f93127q0--;
        return t10;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f93127q0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i10 = this.f93127q0;
        SnapshotStateList<T> snapshotStateList = this.f93126p0;
        snapshotStateList.remove(i10);
        this.f93127q0--;
        this.f93128r0 = -1;
        this.f93129s0 = snapshotStateList.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public final void set(T t10) {
        a();
        int i10 = this.f93128r0;
        if (i10 < 0) {
            SnapshotStateListKt.access$invalidIteratorSet();
            throw new KotlinNothingValueException();
        }
        SnapshotStateList<T> snapshotStateList = this.f93126p0;
        snapshotStateList.set(i10, t10);
        this.f93129s0 = snapshotStateList.getStructure$runtime_release();
    }
}
