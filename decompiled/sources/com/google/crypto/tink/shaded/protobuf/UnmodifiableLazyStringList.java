package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LazyStringList f47173p0;

    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ListIterator<String> f47174p0;

        public a(UnmodifiableLazyStringList unmodifiableLazyStringList, int i10) {
            this.f47174p0 = unmodifiableLazyStringList.f47173p0.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f47174p0.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f47174p0.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f47174p0.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f47174p0.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f47174p0.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f47174p0.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Iterator<String> f47175p0;

        public b(UnmodifiableLazyStringList unmodifiableLazyStringList) {
            this.f47175p0 = unmodifiableLazyStringList.f47173p0.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f47175p0.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f47175p0.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f47173p0 = lazyStringList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.f47173p0.asByteArrayList());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return Collections.unmodifiableList(this.f47173p0.asByteStringList());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public byte[] getByteArray(int i10) {
        return this.f47173p0.getByteArray(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public ByteString getByteString(int i10) {
        return this.f47173p0.getByteString(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public Object getRaw(int i10) {
        return this.f47173p0.getRaw(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.f47173p0.getUnderlyingElements();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int i10, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f47173p0.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        return this.f47173p0.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public void set(int i10, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }
}
