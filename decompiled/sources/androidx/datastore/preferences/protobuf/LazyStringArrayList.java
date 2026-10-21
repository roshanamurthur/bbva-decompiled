package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class LazyStringArrayList extends androidx.datastore.preferences.protobuf.a<String> implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f20964q0;

    public static class a extends AbstractList<byte[]> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final LazyStringArrayList f20965p0;

        public a(LazyStringArrayList lazyStringArrayList) {
            this.f20965p0 = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, Object obj) {
            LazyStringArrayList.a(this.f20965p0, i10, (byte[]) obj);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            return this.f20965p0.getByteArray(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i10) {
            String strRemove = this.f20965p0.remove(i10);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.c(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            LazyStringArrayList lazyStringArrayList = this.f20965p0;
            lazyStringArrayList.ensureIsMutable();
            Object obj2 = lazyStringArrayList.f20964q0.set(i10, (byte[]) obj);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.c(obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f20965p0.size();
        }
    }

    public static class b extends AbstractList<ByteString> implements RandomAccess {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final LazyStringArrayList f20966p0;

        public b(LazyStringArrayList lazyStringArrayList) {
            this.f20966p0 = lazyStringArrayList;
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i10, Object obj) {
            LazyStringArrayList.b(this.f20966p0, i10, (ByteString) obj);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i10) {
            return this.f20966p0.getByteString(i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object remove(int i10) {
            String strRemove = this.f20966p0.remove(i10);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.d(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i10, Object obj) {
            LazyStringList lazyStringList = LazyStringArrayList.EMPTY;
            LazyStringArrayList lazyStringArrayList = this.f20966p0;
            lazyStringArrayList.ensureIsMutable();
            Object obj2 = lazyStringArrayList.f20964q0.set(i10, (ByteString) obj);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.d(obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f20966p0.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList();
        lazyStringArrayList.makeImmutable();
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    public static void a(LazyStringArrayList lazyStringArrayList, int i10, byte[] bArr) {
        lazyStringArrayList.ensureIsMutable();
        lazyStringArrayList.f20964q0.add(i10, bArr);
        ((AbstractList) lazyStringArrayList).modCount++;
    }

    public static void b(LazyStringArrayList lazyStringArrayList, int i10, ByteString byteString) {
        lazyStringArrayList.ensureIsMutable();
        lazyStringArrayList.f20964q0.add(i10, byteString);
        ((AbstractList) lazyStringArrayList).modCount++;
    }

    public static byte[] c(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return obj instanceof String ? Internal.toByteArray((String) obj) : ((ByteString) obj).toByteArray();
    }

    public static ByteString d(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean zAddAll = this.f20964q0.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        ensureIsMutable();
        boolean zAddAll = this.f20964q0.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new a(this);
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.f20964q0.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i10) {
        ArrayList arrayList = this.f20964q0;
        Object obj = arrayList.get(i10);
        byte[] bArrC = c(obj);
        if (bArrC != obj) {
            arrayList.set(i10, bArrC);
        }
        return bArrC;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int i10) {
        ArrayList arrayList = this.f20964q0;
        Object obj = arrayList.get(i10);
        ByteString byteStringD = d(obj);
        if (byteStringD != obj) {
            arrayList.set(i10, byteStringD);
        }
        return byteStringD;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int i10) {
        return this.f20964q0.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.f20964q0);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.a, androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            boolean z10 = obj instanceof byte[];
            ArrayList arrayList = this.f20964q0;
            if (z10) {
                byte[] bArr = (byte[]) obj;
                arrayList.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                arrayList.add(obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20964q0.size();
    }

    public LazyStringArrayList(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public void add(int i10, String str) {
        ensureIsMutable();
        this.f20964q0.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f20964q0.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        ArrayList arrayList = this.f20964q0;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                arrayList.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf9 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            arrayList.set(i10, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.ProtobufList
    public LazyStringArrayList mutableCopyWithCapacity(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f20964q0);
        return new LazyStringArrayList((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public String set(int i10, String str) {
        ensureIsMutable();
        Object obj = this.f20964q0.set(i10, str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : Internal.toStringUtf8((byte[]) obj);
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f20964q0 = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    @Override // androidx.datastore.preferences.protobuf.a, java.util.AbstractList, java.util.List
    public String remove(int i10) {
        ensureIsMutable();
        Object objRemove = this.f20964q0.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof ByteString) {
            return ((ByteString) objRemove).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString) {
        ensureIsMutable();
        this.f20964q0.add(byteString);
        ((AbstractList) this).modCount++;
    }

    public LazyStringArrayList(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    public LazyStringArrayList(ArrayList<Object> arrayList) {
        this.f20964q0 = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.f20964q0.add(bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i10, ByteString byteString) {
        ensureIsMutable();
        this.f20964q0.set(i10, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i10, byte[] bArr) {
        ensureIsMutable();
        this.f20964q0.set(i10, bArr);
    }
}
