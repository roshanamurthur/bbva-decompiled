package kotlin.collections;

import bk.h;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ReversedListReadOnly<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<T> f79494p0;

    /* JADX INFO: renamed from: kotlin.collections.ReversedListReadOnly$listIterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ReversedViews.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u000f\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0006J\b\u0010\n\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"kotlin/collections/ReversedListReadOnly$listIterator$1", "", "", "hasNext", "hasPrevious", "next", "()Ljava/lang/Object;", "", "nextIndex", "previous", "previousIndex", "p0", "Ljava/util/ListIterator;", "getDelegateIterator", "()Ljava/util/ListIterator;", "delegateIterator", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class AnonymousClass1 implements ListIterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ListIterator<T> delegateIterator;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ReversedListReadOnly<T> f79496q0;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ReversedListReadOnly<? extends T> reversedListReadOnly, int i10) {
            this.f79496q0 = reversedListReadOnly;
            this.delegateIterator = reversedListReadOnly.f79494p0.listIterator(h.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedListReadOnly, i10));
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
            return h.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f79496q0, this.delegateIterator.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.delegateIterator.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return h.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f79496q0, this.delegateIterator.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReversedListReadOnly(@NotNull List<? extends T> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f79494p0 = delegate;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i10) {
        return this.f79494p0.get(h.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i10));
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public int getF79490r0() {
        return this.f79494p0.size();
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i10) {
        return new AnonymousClass1(this, i10);
    }
}
