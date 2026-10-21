package kotlin.collections;

import bk.h;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReversedList<T> extends AbstractMutableList<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<T> f79491p0;

    /* JADX INFO: renamed from: kotlin.collections.ReversedList$listIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ReversedViews.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0006J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0016J\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"kotlin/collections/ReversedList$listIterator$1", "", "", "hasNext", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "previous", "previousIndex", "element", "", "add", "(Ljava/lang/Object;)V", RemoveCommand.ID, SetCommand.ID, "p0", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ListIterator<T> delegateIterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ReversedList<T> f79493q0;

        public AnonymousClass1(ReversedList<T> reversedList, int i10) {
            this.f79493q0 = reversedList;
            this.delegateIterator = reversedList.f79491p0.listIterator(h.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedList, i10));
        }

        @Override // java.util.ListIterator
        public void add(T element) {
            ListIterator<T> listIterator = this.delegateIterator;
            listIterator.add(element);
            listIterator.previous();
        }

        @NotNull
        public final ListIterator<T> getDelegateIterator() {
            return this.delegateIterator;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.delegateIterator.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.delegateIterator.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.delegateIterator.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return h.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f79493q0, this.delegateIterator.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return h.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f79493q0, this.delegateIterator.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.delegateIterator.remove();
        }

        @Override // java.util.ListIterator
        public void set(T element) {
            this.delegateIterator.set(element);
        }
    }

    public ReversedList(@NotNull List<T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f79491p0 = delegate;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i10, T t10) {
        this.f79491p0.add(h.reversePositionIndex$CollectionsKt__ReversedViewsKt(this, i10), t10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f79491p0.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f79491p0.get(h.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i10));
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f79491p0.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int i10) {
        return this.f79491p0.remove(h.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i10));
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int i10, T t10) {
        return this.f79491p0.set(h.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i10), t10);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        return new AnonymousClass1(this, i10);
    }
}
