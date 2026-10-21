package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes12.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LazyStringList f81418p0;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ListIterator<String> f81419p0;

        public a(UnmodifiableLazyStringList unmodifiableLazyStringList, int i10) {
            this.f81419p0 = unmodifiableLazyStringList.f81418p0.listIterator(i10);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f81419p0.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f81419p0.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f81419p0.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f81419p0.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
            return this.f81419p0.next();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.f81419p0.previous();
        }

        @Override // java.util.ListIterator
        public void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterator<String> f81420p0;

        public b(UnmodifiableLazyStringList unmodifiableLazyStringList) {
            this.f81420p0 = unmodifiableLazyStringList.f81418p0.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f81420p0.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.f81420p0.next();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f81418p0 = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public ByteString getByteString(int i10) {
        return this.f81418p0.getByteString(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.f81418p0.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f81418p0.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        return this.f81418p0.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }
}
