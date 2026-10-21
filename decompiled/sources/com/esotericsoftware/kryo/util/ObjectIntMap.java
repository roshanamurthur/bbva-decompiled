package com.esotericsoftware.kryo.util;

import androidx.appcompat.widget.g0;
import com.esotericsoftware.kryo.KryoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class ObjectIntMap<K> implements Iterable<Entry<K>> {
    K[] keyTable;
    float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    int threshold;
    int[] valueTable;

    public static class Entries<K> extends a<K> implements Iterable<Entry<K>>, Iterator<Entry<K>> {
        Entry<K> entry;

        public Entries(ObjectIntMap<K> objectIntMap) {
            super(objectIntMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new KryoException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Entries<K> iterator() {
            return this;
        }

        @Override // com.esotericsoftware.kryo.util.ObjectIntMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.ObjectIntMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<K> next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new KryoException("#iterator() cannot be used nested.");
            }
            ObjectIntMap<K> objectIntMap = this.map;
            K[] kArr = objectIntMap.keyTable;
            Entry<K> entry = this.entry;
            int i10 = this.nextIndex;
            entry.key = kArr[i10];
            entry.value = objectIntMap.valueTable[i10];
            this.currentIndex = i10;
            findNextIndex();
            return this.entry;
        }
    }

    public static class Entry<K> {
        public K key;
        public int value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class Keys<K> extends a<K> implements Iterable<K>, Iterator<K> {
        public Keys(ObjectIntMap<K> objectIntMap) {
            super(objectIntMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new KryoException("#iterator() cannot be used nested.");
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
            if (!this.valid) {
                throw new KryoException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.map.keyTable;
            int i10 = this.nextIndex;
            K k10 = kArr[i10];
            this.currentIndex = i10;
            findNextIndex();
            return k10;
        }

        @Override // com.esotericsoftware.kryo.util.ObjectIntMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.ObjectIntMap.a
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

    public static class a<K> {
        int currentIndex;
        public boolean hasNext;
        final ObjectIntMap<K> map;
        int nextIndex;
        boolean valid = true;

        public a(ObjectIntMap<K> objectIntMap) {
            this.map = objectIntMap;
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
            ObjectIntMap<K> objectIntMap = this.map;
            K[] kArr = objectIntMap.keyTable;
            int[] iArr = objectIntMap.valueTable;
            int i11 = objectIntMap.mask;
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
                    iArr[i10] = iArr[i13];
                    i10 = i13;
                }
                i12 = i13 + 1;
            }
            kArr[i10] = null;
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

    public ObjectIntMap() {
        this(51, 0.8f);
    }

    private void putResize(K k10, int i10) {
        K[] kArr = this.keyTable;
        int iPlace = place(k10);
        while (kArr[iPlace] != null) {
            iPlace = (iPlace + 1) & this.mask;
        }
        kArr[iPlace] = k10;
        this.valueTable[iPlace] = i10;
    }

    public void clear(int i10) {
        int iTableSize = ObjectMap.tableSize(i10, this.loadFactor);
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

    public boolean containsValue(int i10) {
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (kArr[length] != null && iArr[length] == i10) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int i10) {
        int iTableSize = ObjectMap.tableSize(this.size + i10, this.loadFactor);
        if (this.keyTable.length < iTableSize) {
            resize(iTableSize);
        }
    }

    public Entries<K> entries() {
        return new Entries<>(this);
    }

    public boolean equals(Object obj) {
        int i10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ObjectIntMap)) {
            return false;
        }
        ObjectIntMap objectIntMap = (ObjectIntMap) obj;
        if (objectIntMap.size != this.size) {
            return false;
        }
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int length = kArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            K k10 = kArr[i11];
            if (k10 != null && (((i10 = objectIntMap.get(k10, 0)) == 0 && !objectIntMap.containsKey(k10)) || i10 != iArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Null
    public K findKey(int i10) {
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        for (int length = iArr.length - 1; length >= 0; length--) {
            K k10 = kArr[length];
            if (k10 != null && iArr[length] == i10) {
                return k10;
            }
        }
        return null;
    }

    public int get(K k10, int i10) {
        int iLocateKey = locateKey(k10);
        return iLocateKey < 0 ? i10 : this.valueTable[iLocateKey];
    }

    public int getAndIncrement(K k10, int i10, int i11) {
        int iLocateKey = locateKey(k10);
        if (iLocateKey >= 0) {
            int[] iArr = this.valueTable;
            int i12 = iArr[iLocateKey];
            iArr[iLocateKey] = i11 + i12;
            return i12;
        }
        int i13 = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i13] = k10;
        this.valueTable[i13] = i11 + i10;
        int i14 = this.size + 1;
        this.size = i14;
        if (i14 >= this.threshold) {
            resize(kArr.length << 1);
        }
        return i10;
    }

    public int hashCode() {
        int iHashCode = this.size;
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int length = kArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            K k10 = kArr[i10];
            if (k10 != null) {
                iHashCode = k10.hashCode() + iArr[i10] + iHashCode;
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

    public void put(K k10, int i10) {
        int iLocateKey = locateKey(k10);
        if (iLocateKey >= 0) {
            this.valueTable[iLocateKey] = i10;
            return;
        }
        int i11 = -(iLocateKey + 1);
        K[] kArr = this.keyTable;
        kArr[i11] = k10;
        this.valueTable[i11] = i10;
        int i12 = this.size + 1;
        this.size = i12;
        if (i12 >= this.threshold) {
            resize(kArr.length << 1);
        }
    }

    public void putAll(ObjectIntMap<? extends K> objectIntMap) {
        ensureCapacity(objectIntMap.size);
        K[] kArr = objectIntMap.keyTable;
        int[] iArr = objectIntMap.valueTable;
        int length = kArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            K k10 = kArr[i10];
            if (k10 != null) {
                put(k10, iArr[i10]);
            }
        }
    }

    public int remove(K k10, int i10) {
        int iLocateKey = locateKey(k10);
        if (iLocateKey < 0) {
            return i10;
        }
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int i11 = iArr[iLocateKey];
        int i12 = this.mask;
        int i13 = iLocateKey + 1;
        while (true) {
            int i14 = i13 & i12;
            K k11 = kArr[i14];
            if (k11 == null) {
                kArr[iLocateKey] = null;
                this.size--;
                return i11;
            }
            int iPlace = place(k11);
            if (((i14 - iPlace) & i12) > ((iLocateKey - iPlace) & i12)) {
                kArr[iLocateKey] = k11;
                iArr[iLocateKey] = iArr[i14];
                iLocateKey = i14;
            }
            i13 = i14 + 1;
        }
    }

    public final void resize(int i10) {
        int length = this.keyTable.length;
        this.threshold = (int) (i10 * this.loadFactor);
        int i11 = i10 - 1;
        this.mask = i11;
        this.shift = Long.numberOfLeadingZeros(i11);
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        this.keyTable = (K[]) new Object[i10];
        this.valueTable = new int[i10];
        if (this.size > 0) {
            for (int i12 = 0; i12 < length; i12++) {
                K k10 = kArr[i12];
                if (k10 != null) {
                    putResize(k10, iArr[i12]);
                }
            }
        }
    }

    public void shrink(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("maximumCapacity must be >= 0: ", i10));
        }
        int iTableSize = ObjectMap.tableSize(i10, this.loadFactor);
        if (this.keyTable.length > iTableSize) {
            resize(iTableSize);
        }
    }

    public String toString(String str) {
        return toString(str, false);
    }

    public Values values() {
        return new Values(this);
    }

    public ObjectIntMap(int i10) {
        this(i10, 0.8f);
    }

    @Override // java.lang.Iterable
    public Entries<K> iterator() {
        return entries();
    }

    public String toString() {
        return toString(", ", true);
    }

    public static class Values extends a<Object> {
        public Values(ObjectIntMap<?> objectIntMap) {
            super(objectIntMap);
        }

        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new KryoException("#iterator() cannot be used nested.");
        }

        public int next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new KryoException("#iterator() cannot be used nested.");
            }
            int[] iArr = this.map.valueTable;
            int i10 = this.nextIndex;
            int i11 = iArr[i10];
            this.currentIndex = i10;
            findNextIndex();
            return i11;
        }

        @Override // com.esotericsoftware.kryo.util.ObjectIntMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.ObjectIntMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public IntArray toArray() {
            IntArray intArray = new IntArray(true, this.map.size);
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }

        public IntArray toArray(IntArray intArray) {
            while (this.hasNext) {
                intArray.add(next());
            }
            return intArray;
        }

        public Values iterator() {
            return this;
        }
    }

    public ObjectIntMap(int i10, float f6) {
        if (f6 > 0.0f && f6 < 1.0f) {
            this.loadFactor = f6;
            int iTableSize = ObjectMap.tableSize(i10, f6);
            this.threshold = (int) (iTableSize * f6);
            int i11 = iTableSize - 1;
            this.mask = i11;
            this.shift = Long.numberOfLeadingZeros(i11);
            this.keyTable = (K[]) new Object[iTableSize];
            this.valueTable = new int[iTableSize];
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
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int length = kArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                K k10 = kArr[i10];
                if (k10 != null) {
                    sb2.append(k10);
                    sb2.append('=');
                    sb2.append(iArr[i10]);
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
            K k11 = kArr[i11];
            if (k11 != null) {
                sb2.append(str);
                sb2.append(k11);
                sb2.append('=');
                sb2.append(iArr[i11]);
            }
            i10 = i11;
        }
        if (z10) {
            sb2.append(AbstractJsonLexerKt.END_OBJ);
        }
        return sb2.toString();
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, (Object) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ObjectIntMap(ObjectIntMap<? extends K> objectIntMap) {
        float length = objectIntMap.keyTable.length;
        float f6 = objectIntMap.loadFactor;
        this((int) (length * f6), f6);
        Object[] objArr = objectIntMap.keyTable;
        System.arraycopy(objArr, 0, this.keyTable, 0, objArr.length);
        int[] iArr = objectIntMap.valueTable;
        System.arraycopy(iArr, 0, this.valueTable, 0, iArr.length);
        this.size = objectIntMap.size;
    }
}
