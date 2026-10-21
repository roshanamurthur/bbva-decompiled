package com.esotericsoftware.kryo.util;

import androidx.appcompat.widget.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ObjectMap<K, V> implements Iterable<Entry<K, V>> {
    static final Object dummy = new Object();
    K[] keyTable;
    float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    int threshold;
    V[] valueTable;

    public static class Entries<K, V> extends a<K, V, Entry<K, V>> {
        Entry<K, V> entry;

        public Entries(ObjectMap<K, V> objectMap) {
            super(objectMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.lang.Iterable
        public Entries<K, V> iterator() {
            return this;
        }

        @Override // com.esotericsoftware.kryo.util.ObjectMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.ObjectMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<K, V> next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            ObjectMap<K, V> objectMap = this.map;
            K[] kArr = objectMap.keyTable;
            Entry<K, V> entry = this.entry;
            int i10 = this.nextIndex;
            entry.key = kArr[i10];
            entry.value = objectMap.valueTable[i10];
            this.currentIndex = i10;
            findNextIndex();
            return this.entry;
        }
    }

    public static class Entry<K, V> {
        public K key;

        @Null
        public V value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class Keys<K> extends a<K, Object, K> {
        public Keys(ObjectMap<K, ?> objectMap) {
            super(objectMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.lang.Iterable
        public Keys<K> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            K[] kArr = this.map.keyTable;
            int i10 = this.nextIndex;
            K k10 = kArr[i10];
            this.currentIndex = i10;
            findNextIndex();
            return k10;
        }

        @Override // com.esotericsoftware.kryo.util.ObjectMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.ObjectMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<K> toList() {
            return (ArrayList) toList(new ArrayList(this.map.size));
        }

        public <T extends List<K>> T toList(T t10) {
            while (this.hasNext) {
                t10.add(next());
            }
            return t10;
        }
    }

    public static class Values<V> extends a<Object, V, V> {
        public Values(ObjectMap<?, V> objectMap) {
            super(objectMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.lang.Iterable
        public Values<V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        @Null
        public V next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            V[] vArr = this.map.valueTable;
            int i10 = this.nextIndex;
            V v3 = vArr[i10];
            this.currentIndex = i10;
            findNextIndex();
            return v3;
        }

        @Override // com.esotericsoftware.kryo.util.ObjectMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.ObjectMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<V> toList() {
            return (ArrayList) toList(new ArrayList(this.map.size));
        }

        public <T extends List<V>> T toList(T t10) {
            while (this.hasNext) {
                t10.add(next());
            }
            return t10;
        }
    }

    public static abstract class a<K, V, I> implements Iterable<I>, Iterator<I> {
        int currentIndex;
        public boolean hasNext;
        final ObjectMap<K, V> map;
        int nextIndex;
        boolean valid = true;

        public a(ObjectMap<K, V> objectMap) {
            this.map = objectMap;
            reset();
        }

        public void findNextIndex() {
            int i10;
            K[] kArr = this.map.keyTable;
            int length = kArr.length;
            do {
                i10 = this.nextIndex + 1;
                this.nextIndex = i10;
                if (i10 >= length) {
                    this.hasNext = false;
                    return;
                }
            } while (kArr[i10] == null);
            this.hasNext = true;
        }

        public void remove() {
            int i10 = this.currentIndex;
            if (i10 < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ObjectMap<K, V> objectMap = this.map;
            K[] kArr = objectMap.keyTable;
            V[] vArr = objectMap.valueTable;
            int i11 = objectMap.mask;
            int i12 = i10 + 1;
            while (true) {
                int i13 = i12 & i11;
                K k10 = kArr[i13];
                if (k10 == null) {
                    break;
                }
                int iPlace = this.map.place(k10);
                if (((i13 - iPlace) & i11) > ((i10 - iPlace) & i11)) {
                    kArr[i10] = k10;
                    vArr[i10] = vArr[i13];
                    i10 = i13;
                }
                i12 = i13 + 1;
            }
            kArr[i10] = null;
            vArr[i10] = null;
            this.map.size--;
            if (i10 != this.currentIndex) {
                this.nextIndex--;
            }
            this.currentIndex = -1;
        }

        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = -1;
            findNextIndex();
        }
    }

    public ObjectMap() {
        this(51, 0.8f);
    }

    public static int nextPowerOfTwo(int i10) {
        if (i10 == 0) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >> 1);
        int i13 = i12 | (i12 >> 2);
        int i14 = i13 | (i13 >> 4);
        int i15 = i14 | (i14 >> 8);
        return (i15 | (i15 >> 16)) + 1;
    }

    private void putResize(K k10, @Null V v3) {
        K[] kArr = this.keyTable;
        int iPlace = place(k10);
        while (kArr[iPlace] != null) {
            iPlace = (iPlace + 1) & this.mask;
        }
        kArr[iPlace] = k10;
        this.valueTable[iPlace] = v3;
    }

    public static int tableSize(int i10, float f6) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("capacity must be >= 0: ", i10));
        }
        int iNextPowerOfTwo = nextPowerOfTwo(Math.max(2, (int) Math.ceil(i10 / f6)));
        if (iNextPowerOfTwo <= 1073741824) {
            return iNextPowerOfTwo;
        }
        throw new IllegalArgumentException(g0.c("The required capacity is too large: ", i10));
    }

    public void clear(int i10) {
        int iTableSize = tableSize(i10, this.loadFactor);
        if (this.keyTable.length <= iTableSize) {
            clear();
        } else {
            this.size = 0;
            resize(iTableSize);
        }
    }

    public boolean containsKey(K k10) {
        return locateKey(k10) >= 0;
    }

    public boolean containsValue(@Null Object obj, boolean z10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            K[] kArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                if (kArr[length] != null && vArr[length] == null) {
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return true;
                }
            }
            return false;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int i10) {
        int iTableSize = tableSize(this.size + i10, this.loadFactor);
        if (this.keyTable.length < iTableSize) {
            resize(iTableSize);
        }
    }

    public Entries<K, V> entries() {
        return new Entries<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectMap)) {
            return false;
        }
        ObjectMap objectMap = (ObjectMap) obj;
        if (objectMap.size != this.size) {
            return false;
        }
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = kArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            K k10 = kArr[i10];
            if (k10 != null) {
                V v3 = vArr[i10];
                if (v3 == null) {
                    if (objectMap.get(k10, dummy) != null) {
                        return false;
                    }
                } else if (!v3.equals(objectMap.get(k10))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equalsIdentity(@Null Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectMap)) {
            return false;
        }
        ObjectMap objectMap = (ObjectMap) obj;
        if (objectMap.size != this.size) {
            return false;
        }
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = kArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            K k10 = kArr[i10];
            if (k10 != null && vArr[i10] != objectMap.get(k10, dummy)) {
                return false;
            }
        }
        return true;
    }

    @Null
    public K findKey(@Null Object obj, boolean z10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            K[] kArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                K k10 = kArr[length];
                if (k10 != null && vArr[length] == null) {
                    return k10;
                }
            }
            return null;
        }
        if (z10) {
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return this.keyTable[length2];
                }
            }
            return null;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
                return this.keyTable[length3];
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Null
    public <T extends K> V get(T t10) {
        int iLocateKey = locateKey(t10);
        if (iLocateKey < 0) {
            return null;
        }
        return this.valueTable[iLocateKey];
    }

    public int hashCode() {
        int iHashCode = this.size;
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = kArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            K k10 = kArr[i10];
            if (k10 != null) {
                int iHashCode2 = k10.hashCode() + iHashCode;
                V v3 = vArr[i10];
                iHashCode = v3 != null ? v3.hashCode() + iHashCode2 : iHashCode2;
            }
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Keys<K> keys() {
        return new Keys<>(this);
    }

    public int locateKey(K k10) {
        if (k10 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.keyTable;
        int iPlace = place(k10);
        while (true) {
            K k11 = kArr[iPlace];
            if (k11 == null) {
                return -(iPlace + 1);
            }
            if (k11.equals(k10)) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int place(K k10) {
        return (int) ((((long) k10.hashCode()) * (-7046029254386353131L)) >>> this.shift);
    }

    @Null
    public V put(K k10, @Null V v3) {
        int iLocateKey = locateKey(k10);
        if (iLocateKey >= 0) {
            V[] vArr = this.valueTable;
            V v6 = vArr[iLocateKey];
            vArr[iLocateKey] = v3;
            return v6;
        }
        int i10 = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i10] = k10;
        this.valueTable[i10] = v3;
        int i11 = this.size + 1;
        this.size = i11;
        if (i11 < this.threshold) {
            return null;
        }
        resize(kArr.length << 1);
        return null;
    }

    public void putAll(ObjectMap<? extends K, ? extends V> objectMap) {
        ensureCapacity(objectMap.size);
        K[] kArr = objectMap.keyTable;
        V[] vArr = objectMap.valueTable;
        int length = kArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            K k10 = kArr[i10];
            if (k10 != null) {
                put(k10, vArr[i10]);
            }
        }
    }

    @Null
    public V remove(K k10) {
        int iLocateKey = locateKey(k10);
        if (iLocateKey < 0) {
            return null;
        }
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        V v3 = vArr[iLocateKey];
        int i10 = this.mask;
        int i11 = iLocateKey + 1;
        while (true) {
            int i12 = i11 & i10;
            K k11 = kArr[i12];
            if (k11 == null) {
                kArr[iLocateKey] = null;
                vArr[iLocateKey] = null;
                this.size--;
                return v3;
            }
            int iPlace = place(k11);
            if (((i12 - iPlace) & i10) > ((iLocateKey - iPlace) & i10)) {
                kArr[iLocateKey] = k11;
                vArr[iLocateKey] = vArr[i12];
                iLocateKey = i12;
            }
            i11 = i12 + 1;
        }
    }

    public final void resize(int i10) {
        int length = this.keyTable.length;
        this.threshold = (int) (i10 * this.loadFactor);
        int i11 = i10 - 1;
        this.mask = i11;
        this.shift = Long.numberOfLeadingZeros(i11);
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        this.keyTable = (K[]) new Object[i10];
        this.valueTable = (V[]) new Object[i10];
        if (this.size > 0) {
            for (int i12 = 0; i12 < length; i12++) {
                K k10 = kArr[i12];
                if (k10 != null) {
                    putResize(k10, vArr[i12]);
                }
            }
        }
    }

    public void shrink(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("maximumCapacity must be >= 0: ", i10));
        }
        int iTableSize = tableSize(i10, this.loadFactor);
        if (this.keyTable.length > iTableSize) {
            resize(iTableSize);
        }
    }

    public String toString(String str) {
        return toString(str, false);
    }

    public Values<V> values() {
        return new Values<>(this);
    }

    public ObjectMap(int i10) {
        this(i10, 0.8f);
    }

    @Override // java.lang.Iterable
    public Entries<K, V> iterator() {
        return entries();
    }

    public String toString() {
        return toString(", ", true);
    }

    public ObjectMap(int i10, float f6) {
        if (f6 > 0.0f && f6 < 1.0f) {
            this.loadFactor = f6;
            int iTableSize = tableSize(i10, f6);
            this.threshold = (int) (iTableSize * f6);
            int i11 = iTableSize - 1;
            this.mask = i11;
            this.shift = Long.numberOfLeadingZeros(i11);
            this.keyTable = (K[]) new Object[iTableSize];
            this.valueTable = (V[]) new Object[iTableSize];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f6);
    }

    private String toString(String str, boolean z10) {
        int i10;
        if (this.size == 0) {
            return z10 ? "{}" : "";
        }
        StringBuilder sb2 = new StringBuilder(32);
        if (z10) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        }
        Object[] objArr = this.keyTable;
        Object[] objArr2 = this.valueTable;
        int length = objArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                Object obj = objArr[i10];
                if (obj != null) {
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb2.append(obj);
                    sb2.append('=');
                    Object obj2 = objArr2[i10];
                    if (obj2 == this) {
                        obj2 = "(this)";
                    }
                    sb2.append(obj2);
                    break;
                }
                length = i10;
            } else {
                break;
            }
        }
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            Object obj3 = objArr[i11];
            if (obj3 != null) {
                sb2.append(str);
                if (obj3 == this) {
                    obj3 = "(this)";
                }
                sb2.append(obj3);
                sb2.append('=');
                Object obj4 = objArr2[i11];
                if (obj4 == this) {
                    obj4 = "(this)";
                }
                sb2.append(obj4);
            }
            i10 = i11;
        }
        if (z10) {
            sb2.append(AbstractJsonLexerKt.END_OBJ);
        }
        return sb2.toString();
    }

    public V get(K k10, @Null V v3) {
        int iLocateKey = locateKey(k10);
        return iLocateKey < 0 ? v3 : this.valueTable[iLocateKey];
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, (Object) null);
        Arrays.fill(this.valueTable, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectMap(ObjectMap<? extends K, ? extends V> objectMap) {
        float length = objectMap.keyTable.length;
        float f6 = objectMap.loadFactor;
        this((int) (length * f6), f6);
        Object[] objArr = objectMap.keyTable;
        System.arraycopy(objArr, 0, this.keyTable, 0, objArr.length);
        Object[] objArr2 = objectMap.valueTable;
        System.arraycopy(objArr2, 0, this.valueTable, 0, objArr2.length);
        this.size = objectMap.size;
    }
}
