package com.google.crypto.tink.shaded.protobuf;

import com.veridas.Veridas;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class Internal {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f47106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f47107b;

    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z10);

        boolean getBoolean(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        ProtobufList<Boolean> mutableCopyWithCapacity(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Boolean> mutableCopyWithCapacity2(int i10);

        boolean setBoolean(int i10, boolean z10);
    }

    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d2);

        double getDouble(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        ProtobufList<Double> mutableCopyWithCapacity(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Double> mutableCopyWithCapacity2(int i10);

        double setDouble(int i10, double d2);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i10);
    }

    public interface EnumVerifier {
        boolean isInRange(int i10);
    }

    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f6);

        float getFloat(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        ProtobufList<Float> mutableCopyWithCapacity(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Float> mutableCopyWithCapacity2(int i10);

        float setFloat(int i10, float f6);
    }

    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i10);

        int getInt(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        ProtobufList<Integer> mutableCopyWithCapacity(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Integer> mutableCopyWithCapacity2(int i10);

        int setInt(int i10, int i11);
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final List<F> f47108p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Converter<F, T> f47109q0;

        public interface Converter<F, T> {
            T convert(F f6);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter) {
            this.f47108p0 = list;
            this.f47109q0 = converter;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i10) {
            return this.f47109q0.convert(this.f47108p0.get(i10));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f47108p0.size();
        }
    }

    public interface LongList extends ProtobufList<Long> {
        void addLong(long j10);

        long getLong(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        ProtobufList<Long> mutableCopyWithCapacity(int i10);

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
        /* JADX INFO: renamed from: mutableCopyWithCapacity, reason: avoid collision after fix types in other method */
        /* bridge */ /* synthetic */ ProtobufList<Long> mutableCopyWithCapacity2(int i10);

        long setLong(int i10, long j10);
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Map<K, RealValue> f47110p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Converter<RealValue, V> f47111q0;

        public interface Converter<A, B> {
            A doBackward(B b10);

            B doForward(A a10);
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        public class a<T> implements Converter<Integer, T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EnumLiteMap f47112a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnumLite f47113b;

            public a(EnumLiteMap enumLiteMap, EnumLite enumLite) {
                this.f47112a = enumLiteMap;
                this.f47113b = enumLite;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter
            public final Integer doBackward(Object obj) {
                return Integer.valueOf(((EnumLite) obj).getNumber());
            }

            @Override // com.google.crypto.tink.shaded.protobuf.Internal.MapAdapter.Converter
            public final Object doForward(Integer num) {
                EnumLite enumLiteFindValueByNumber = this.f47112a.findValueByNumber(num.intValue());
                return enumLiteFindValueByNumber == null ? this.f47113b : enumLiteFindValueByNumber;
            }
        }

        public class b implements Map.Entry<K, V> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Map.Entry<K, RealValue> f47114p0;

            public b(Map.Entry<K, RealValue> entry) {
                this.f47114p0 = entry;
            }

            @Override // java.util.Map.Entry
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    return this.f47114p0.getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public final K getKey() {
                return this.f47114p0.getKey();
            }

            @Override // java.util.Map.Entry
            public final V getValue() {
                return (V) MapAdapter.this.f47111q0.doForward(this.f47114p0.getValue());
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                return this.f47114p0.hashCode();
            }

            @Override // java.util.Map.Entry
            public final V setValue(V v3) {
                MapAdapter mapAdapter = MapAdapter.this;
                RealValue value = this.f47114p0.setValue(mapAdapter.f47111q0.doBackward(v3));
                if (value == null) {
                    return null;
                }
                return mapAdapter.f47111q0.doForward(value);
            }
        }

        public class c implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Iterator<Map.Entry<K, RealValue>> f47116p0;

            public c(Iterator<Map.Entry<K, RealValue>> it) {
                this.f47116p0 = it;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.f47116p0.hasNext();
            }

            @Override // java.util.Iterator
            public final Object next() {
                return new b(this.f47116p0.next());
            }

            @Override // java.util.Iterator
            public final void remove() {
                this.f47116p0.remove();
            }
        }

        public class d extends AbstractSet<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final Set<Map.Entry<K, RealValue>> f47118p0;

            public d(Set<Map.Entry<K, RealValue>> set) {
                this.f47118p0 = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                return new c(this.f47118p0.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.f47118p0.size();
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.f47110p0 = map;
            this.f47111q0 = converter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(EnumLiteMap<T> enumLiteMap, T t10) {
            return new a(enumLiteMap, t10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new d(this.f47110p0.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.f47110p0.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f47111q0.doForward(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, V v3) {
            Converter<RealValue, V> converter = this.f47111q0;
            RealValue realvaluePut = this.f47110p0.put(k10, converter.doBackward(v3));
            if (realvaluePut == null) {
                return null;
            }
            return converter.doForward(realvaluePut);
        }
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i10);
    }

    static {
        Charset.forName(Veridas.US_ASCII);
        f47106a = Charset.forName("UTF-8");
        f47107b = Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(bArr);
    }

    public static int a(int i10, int i11, byte[] bArr, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(f47107b);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(f47107b));
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferDuplicate.capacity());
        byteBufferAllocate.put(byteBufferDuplicate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
        try {
            java.lang.reflect.Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e5) {
            throw new RuntimeException(androidx.datastore.preferences.protobuf.q.c("Failed to get default instance for ", cls), e5);
        }
    }

    public static int hashBoolean(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + hashCode(it.next());
        }
        return iHashCode;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int iHashCodeByteBuffer = 1;
        while (it.hasNext()) {
            iHashCodeByteBuffer = (iHashCodeByteBuffer * 31) + hashCodeByteBuffer(it.next());
        }
        return iHashCodeByteBuffer;
    }

    public static int hashEnum(EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        Iterator<? extends EnumLite> it = list.iterator();
        int iHashEnum = 1;
        while (it.hasNext()) {
            iHashEnum = (iHashEnum * 31) + hashEnum(it.next());
        }
        return iHashEnum;
    }

    public static int hashLong(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(f47107b), f47106a);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(f47106a);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, f47106a);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        y0.b bVar = y0.f47315a;
        return y0.f47315a.g(0, bArr, 0, bArr.length) == 0;
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!equalsByteBuffer(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, 0, bArr, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int iA = a(byteBuffer.capacity(), byteBuffer.arrayOffset(), byteBuffer.array(), byteBuffer.capacity());
            if (iA == 0) {
                return 1;
            }
            return iA;
        }
        int iCapacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[iCapacity];
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.clear();
        int iCapacity2 = byteBuffer.capacity();
        while (byteBufferDuplicate.remaining() > 0) {
            int iRemaining = byteBufferDuplicate.remaining() <= iCapacity ? byteBufferDuplicate.remaining() : iCapacity;
            byteBufferDuplicate.get(bArr, 0, iRemaining);
            iCapacity2 = a(iCapacity2, 0, bArr, iRemaining);
        }
        if (iCapacity2 == 0) {
            return 1;
        }
        return iCapacity2;
    }
}
