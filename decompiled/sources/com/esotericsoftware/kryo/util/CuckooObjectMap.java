package com.esotericsoftware.kryo.util;

import androidx.appcompat.widget.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class CuckooObjectMap<K, V> {
    private static final int PRIME2 = -1105259343;
    private static final int PRIME3 = -1262997959;
    private static final int PRIME4 = -825114047;
    static Random random = new Random();
    int capacity;
    private int hashShift;
    private boolean isBigTable;
    K[] keyTable;
    private float loadFactor;
    private int mask;
    private int pushIterations;
    public int size;
    private int stashCapacity;
    int stashSize;
    private int threshold;
    V[] valueTable;

    public static class Entries<K, V> extends a<K, V> implements Iterable<Entry<K, V>>, Iterator<Entry<K, V>> {
        Entry<K, V> entry;

        public Entries(CuckooObjectMap<K, V> cuckooObjectMap) {
            super(cuckooObjectMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // com.esotericsoftware.kryo.util.CuckooObjectMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.CuckooObjectMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<K, V> next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            CuckooObjectMap<K, V> cuckooObjectMap = this.map;
            K[] kArr = cuckooObjectMap.keyTable;
            Entry<K, V> entry = this.entry;
            int i10 = this.nextIndex;
            entry.key = kArr[i10];
            entry.value = cuckooObjectMap.valueTable[i10];
            this.currentIndex = i10;
            advance();
            return this.entry;
        }

        @Override // java.lang.Iterable
        public Iterator<Entry<K, V>> iterator() {
            return this;
        }
    }

    public static class Entry<K, V> {
        public K key;
        public V value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class a<K, V> {
        int currentIndex;
        public boolean hasNext;
        final CuckooObjectMap<K, V> map;
        int nextIndex;

        public a(CuckooObjectMap<K, V> cuckooObjectMap) {
            this.map = cuckooObjectMap;
            reset();
        }

        public void advance() {
            int i10;
            this.hasNext = false;
            CuckooObjectMap<K, V> cuckooObjectMap = this.map;
            K[] kArr = cuckooObjectMap.keyTable;
            int i11 = cuckooObjectMap.capacity + cuckooObjectMap.stashSize;
            do {
                i10 = this.nextIndex + 1;
                this.nextIndex = i10;
                if (i10 >= i11) {
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
            CuckooObjectMap<K, V> cuckooObjectMap = this.map;
            if (i10 >= cuckooObjectMap.capacity) {
                cuckooObjectMap.removeStashIndex(i10);
                this.nextIndex = this.currentIndex - 1;
                advance();
            } else {
                cuckooObjectMap.keyTable[i10] = null;
                cuckooObjectMap.valueTable[i10] = null;
            }
            this.currentIndex = -1;
            this.map.size--;
        }

        public void reset() {
            this.currentIndex = -1;
            this.nextIndex = -1;
            advance();
        }
    }

    public CuckooObjectMap() {
        this(32, 0.8f);
    }

    private boolean containsKeyStash(K k10) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private V getStash(K k10) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return this.valueTable[i10];
            }
            i10++;
        }
        return null;
    }

    private int hash2(int i10) {
        int i11 = i10 * PRIME2;
        return (i11 ^ (i11 >>> this.hashShift)) & this.mask;
    }

    private int hash3(int i10) {
        int i11 = i10 * PRIME3;
        return (i11 ^ (i11 >>> this.hashShift)) & this.mask;
    }

    private int hash4(int i10) {
        int i11 = i10 * PRIME4;
        return (i11 ^ (i11 >>> this.hashShift)) & this.mask;
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

    private void push(K k10, V v3, int i10, K k11, int i11, K k12, int i12, K k13, int i13, K k14) {
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i14 = this.mask;
        boolean z10 = this.isBigTable;
        int i15 = this.pushIterations;
        int i16 = z10 ? 4 : 3;
        V v6 = v3;
        int i17 = i10;
        int i18 = i11;
        K k15 = k12;
        int i19 = i12;
        K k16 = k13;
        int i20 = i13;
        K k17 = k14;
        int i21 = 0;
        K k18 = k10;
        K k19 = k11;
        while (true) {
            int iNextInt = random.nextInt(i16);
            int i22 = i16;
            if (iNextInt == 0) {
                V v10 = vArr[i17];
                kArr[i17] = k18;
                vArr[i17] = v6;
                k18 = k19;
                v6 = v10;
            } else if (iNextInt == 1) {
                V v11 = vArr[i18];
                kArr[i18] = k18;
                vArr[i18] = v6;
                v6 = v11;
                k18 = k15;
            } else if (iNextInt != 2) {
                V v12 = vArr[i20];
                kArr[i20] = k18;
                vArr[i20] = v6;
                v6 = v12;
                k18 = k17;
            } else {
                V v13 = vArr[i19];
                kArr[i19] = k18;
                vArr[i19] = v6;
                v6 = v13;
                k18 = k16;
            }
            int iHashCode = k18.hashCode();
            int i23 = iHashCode & i14;
            K k20 = kArr[i23];
            if (k20 == null) {
                kArr[i23] = k18;
                vArr[i23] = v6;
                int i24 = this.size;
                this.size = i24 + 1;
                if (i24 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            int iHash2 = hash2(iHashCode);
            K k21 = kArr[iHash2];
            if (k21 == null) {
                kArr[iHash2] = k18;
                vArr[iHash2] = v6;
                int i25 = this.size;
                this.size = i25 + 1;
                if (i25 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            int iHash3 = hash3(iHashCode);
            K k22 = kArr[iHash3];
            if (k22 == null) {
                kArr[iHash3] = k18;
                vArr[iHash3] = v6;
                int i26 = this.size;
                this.size = i26 + 1;
                if (i26 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            if (z10) {
                int iHash4 = hash4(iHashCode);
                K k23 = kArr[iHash4];
                if (k23 == null) {
                    kArr[iHash4] = k18;
                    vArr[iHash4] = v6;
                    int i27 = this.size;
                    this.size = i27 + 1;
                    if (i27 >= this.threshold) {
                        resize(this.capacity << 1);
                        return;
                    }
                    return;
                }
                k17 = k23;
                i20 = iHash4;
            }
            int i28 = i21 + 1;
            if (i28 == i15) {
                putStash(k18, v6);
                return;
            }
            i21 = i28;
            i17 = i23;
            k19 = k20;
            i18 = iHash2;
            k15 = k21;
            i19 = iHash3;
            i16 = i22;
            k16 = k22;
        }
    }

    private void putResize(K k10, V v3) {
        int i10;
        K k11;
        int iHashCode = k10.hashCode();
        int i11 = iHashCode & this.mask;
        K[] kArr = this.keyTable;
        K k12 = kArr[i11];
        if (k12 == null) {
            kArr[i11] = k10;
            this.valueTable[i11] = v3;
            int i12 = this.size;
            this.size = i12 + 1;
            if (i12 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int iHash2 = hash2(iHashCode);
        K[] kArr2 = this.keyTable;
        K k13 = kArr2[iHash2];
        if (k13 == null) {
            kArr2[iHash2] = k10;
            this.valueTable[iHash2] = v3;
            int i13 = this.size;
            this.size = i13 + 1;
            if (i13 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        int iHash3 = hash3(iHashCode);
        K[] kArr3 = this.keyTable;
        K k14 = kArr3[iHash3];
        if (k14 == null) {
            kArr3[iHash3] = k10;
            this.valueTable[iHash3] = v3;
            int i14 = this.size;
            this.size = i14 + 1;
            if (i14 >= this.threshold) {
                resize(this.capacity << 1);
                return;
            }
            return;
        }
        if (this.isBigTable) {
            int iHash4 = hash4(iHashCode);
            K[] kArr4 = this.keyTable;
            K k15 = kArr4[iHash4];
            if (k15 == null) {
                kArr4[iHash4] = k10;
                this.valueTable[iHash4] = v3;
                int i15 = this.size;
                this.size = i15 + 1;
                if (i15 >= this.threshold) {
                    resize(this.capacity << 1);
                    return;
                }
                return;
            }
            i10 = iHash4;
            k11 = k15;
        } else {
            i10 = -1;
            k11 = null;
        }
        push(k10, v3, i11, k12, iHash2, k13, iHash3, k14, i10, k11);
    }

    private void putStash(K k10, V v3) {
        int i10 = this.stashSize;
        if (i10 == this.stashCapacity) {
            resize(this.capacity << 1);
            put_internal(k10, v3);
            return;
        }
        int i11 = this.capacity + i10;
        this.keyTable[i11] = k10;
        this.valueTable[i11] = v3;
        this.stashSize = i10 + 1;
        this.size++;
    }

    private V put_internal(K k10, V v3) {
        int i10;
        Object obj;
        Object[] objArr = this.keyTable;
        int i11 = this.mask;
        boolean z10 = this.isBigTable;
        int iHashCode = k10.hashCode();
        int i12 = iHashCode & i11;
        K k11 = objArr[i12];
        if (k10.equals(k11)) {
            V[] vArr = this.valueTable;
            V v6 = vArr[i12];
            vArr[i12] = v3;
            return v6;
        }
        int iHash2 = hash2(iHashCode);
        K k12 = objArr[iHash2];
        if (k10.equals(k12)) {
            V[] vArr2 = this.valueTable;
            V v10 = vArr2[iHash2];
            vArr2[iHash2] = v3;
            return v10;
        }
        int iHash3 = hash3(iHashCode);
        K k13 = objArr[iHash3];
        if (k10.equals(k13)) {
            V[] vArr3 = this.valueTable;
            V v11 = vArr3[iHash3];
            vArr3[iHash3] = v3;
            return v11;
        }
        if (z10) {
            int iHash4 = hash4(iHashCode);
            Object obj2 = objArr[iHash4];
            if (k10.equals(obj2)) {
                V[] vArr4 = this.valueTable;
                V v12 = vArr4[iHash4];
                vArr4[iHash4] = v3;
                return v12;
            }
            i10 = iHash4;
            obj = obj2;
        } else {
            i10 = -1;
            obj = null;
        }
        int i13 = this.capacity;
        int i14 = this.stashSize + i13;
        while (i13 < i14) {
            if (k10.equals(objArr[i13])) {
                V[] vArr5 = this.valueTable;
                V v13 = vArr5[i13];
                vArr5[i13] = v3;
                return v13;
            }
            i13++;
        }
        if (k11 == null) {
            objArr[i12] = k10;
            this.valueTable[i12] = v3;
            int i15 = this.size;
            this.size = i15 + 1;
            if (i15 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        }
        if (k12 == null) {
            objArr[iHash2] = k10;
            this.valueTable[iHash2] = v3;
            int i16 = this.size;
            this.size = i16 + 1;
            if (i16 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        }
        if (k13 == null) {
            objArr[iHash3] = k10;
            this.valueTable[iHash3] = v3;
            int i17 = this.size;
            this.size = i17 + 1;
            if (i17 >= this.threshold) {
                resize(this.capacity << 1);
            }
            return null;
        }
        if (!z10 || obj != null) {
            push(k10, v3, i12, k11, iHash2, k12, iHash3, k13, i10, obj);
            return null;
        }
        objArr[i10] = k10;
        this.valueTable[i10] = v3;
        int i18 = this.size;
        this.size = i18 + 1;
        if (i18 >= this.threshold) {
            resize(this.capacity << 1);
        }
        return null;
    }

    private void resize(int i10) {
        int i11 = this.capacity + this.stashSize;
        this.capacity = i10;
        this.threshold = (int) (i10 * this.loadFactor);
        this.mask = i10 - 1;
        this.hashShift = 31 - Integer.numberOfTrailingZeros(i10);
        double d2 = i10;
        this.stashCapacity = Math.max(3, ((int) Math.ceil(Math.log(d2))) * 2);
        this.pushIterations = Math.max(Math.min(i10, 8), ((int) Math.sqrt(d2)) / 8);
        this.isBigTable = (this.capacity >>> 16) != 0;
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i12 = this.stashCapacity;
        this.keyTable = (K[]) new Object[i10 + i12];
        this.valueTable = (V[]) new Object[i10 + i12];
        int i13 = this.size;
        this.size = 0;
        this.stashSize = 0;
        if (i13 > 0) {
            for (int i14 = 0; i14 < i11; i14++) {
                K k10 = kArr[i14];
                if (k10 != null) {
                    putResize(k10, vArr[i14]);
                }
            }
        }
    }

    public void clear(int i10) {
        if (this.capacity <= i10) {
            clear();
        } else {
            this.size = 0;
            resize(i10);
        }
    }

    public boolean containsKey(K k10) {
        int iHashCode = k10.hashCode();
        if (k10.equals(this.keyTable[this.mask & iHashCode])) {
            return true;
        }
        if (k10.equals(this.keyTable[hash2(iHashCode)])) {
            return true;
        }
        if (k10.equals(this.keyTable[hash3(iHashCode)])) {
            return true;
        }
        if (!this.isBigTable) {
            return containsKeyStash(k10);
        }
        if (k10.equals(this.keyTable[hash4(iHashCode)])) {
            return true;
        }
        return containsKeyStash(k10);
    }

    public boolean containsValue(Object obj, boolean z10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            K[] kArr = this.keyTable;
            int i10 = this.capacity + this.stashSize;
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return false;
                }
                if (kArr[i11] != null && vArr[i11] == null) {
                    return true;
                }
                i10 = i11;
            }
        } else if (z10) {
            int i12 = this.capacity + this.stashSize;
            while (true) {
                int i13 = i12 - 1;
                if (i12 <= 0) {
                    return false;
                }
                if (vArr[i13] == obj) {
                    return true;
                }
                i12 = i13;
            }
        } else {
            int i14 = this.capacity + this.stashSize;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    return false;
                }
                if (obj.equals(vArr[i15])) {
                    return true;
                }
                i14 = i15;
            }
        }
    }

    public void ensureCapacity(int i10) {
        int i11 = this.size + i10;
        if (i11 >= this.threshold) {
            resize(nextPowerOfTwo((int) (i11 / this.loadFactor)));
        }
    }

    public Entries<K, V> entries() {
        return new Entries<>(this);
    }

    public K findKey(Object obj, boolean z10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            K[] kArr = this.keyTable;
            int i10 = this.capacity + this.stashSize;
            while (true) {
                int i11 = i10 - 1;
                if (i10 <= 0) {
                    return null;
                }
                K k10 = kArr[i11];
                if (k10 != null && vArr[i11] == null) {
                    return k10;
                }
                i10 = i11;
            }
        } else if (z10) {
            int i12 = this.capacity + this.stashSize;
            while (true) {
                int i13 = i12 - 1;
                if (i12 <= 0) {
                    return null;
                }
                if (vArr[i13] == obj) {
                    return this.keyTable[i13];
                }
                i12 = i13;
            }
        } else {
            int i14 = this.capacity + this.stashSize;
            while (true) {
                int i15 = i14 - 1;
                if (i14 <= 0) {
                    return null;
                }
                if (obj.equals(vArr[i15])) {
                    return this.keyTable[i15];
                }
                i14 = i15;
            }
        }
    }

    public V get(K k10) {
        int iHashCode = k10.hashCode();
        int iHash2 = this.mask & iHashCode;
        if (!k10.equals(this.keyTable[iHash2])) {
            iHash2 = hash2(iHashCode);
            if (!k10.equals(this.keyTable[iHash2])) {
                iHash2 = hash3(iHashCode);
                if (!k10.equals(this.keyTable[iHash2])) {
                    if (!this.isBigTable) {
                        return getStash(k10);
                    }
                    iHash2 = hash4(iHashCode);
                    if (!k10.equals(this.keyTable[iHash2])) {
                        return getStash(k10);
                    }
                }
            }
        }
        return this.valueTable[iHash2];
    }

    public Keys<K> keys() {
        return new Keys<>(this);
    }

    public V put(K k10, V v3) {
        if (k10 != null) {
            return put_internal(k10, v3);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    public void putAll(CuckooObjectMap<K, V> cuckooObjectMap) {
        ensureCapacity(cuckooObjectMap.size);
        for (Entry<K, V> entry : cuckooObjectMap.entries()) {
            put(entry.key, entry.value);
        }
    }

    public V remove(K k10) {
        int iHashCode = k10.hashCode();
        int i10 = this.mask & iHashCode;
        if (k10.equals(this.keyTable[i10])) {
            this.keyTable[i10] = null;
            V[] vArr = this.valueTable;
            V v3 = vArr[i10];
            vArr[i10] = null;
            this.size--;
            return v3;
        }
        int iHash2 = hash2(iHashCode);
        if (k10.equals(this.keyTable[iHash2])) {
            this.keyTable[iHash2] = null;
            V[] vArr2 = this.valueTable;
            V v6 = vArr2[iHash2];
            vArr2[iHash2] = null;
            this.size--;
            return v6;
        }
        int iHash3 = hash3(iHashCode);
        if (k10.equals(this.keyTable[iHash3])) {
            this.keyTable[iHash3] = null;
            V[] vArr3 = this.valueTable;
            V v10 = vArr3[iHash3];
            vArr3[iHash3] = null;
            this.size--;
            return v10;
        }
        if (this.isBigTable) {
            int iHash4 = hash4(iHashCode);
            if (k10.equals(this.keyTable[iHash4])) {
                this.keyTable[iHash4] = null;
                V[] vArr4 = this.valueTable;
                V v11 = vArr4[iHash4];
                vArr4[iHash4] = null;
                this.size--;
                return v11;
            }
        }
        return removeStash(k10);
    }

    public V removeStash(K k10) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                V v3 = this.valueTable[i10];
                removeStashIndex(i10);
                this.size--;
                return v3;
            }
            i10++;
        }
        return null;
    }

    public void removeStashIndex(int i10) {
        int i11 = this.stashSize - 1;
        this.stashSize = i11;
        int i12 = this.capacity + i11;
        if (i10 >= i12) {
            this.valueTable[i10] = null;
            return;
        }
        K[] kArr = this.keyTable;
        kArr[i10] = kArr[i12];
        V[] vArr = this.valueTable;
        vArr[i10] = vArr[i12];
        vArr[i12] = null;
    }

    public void shrink(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("maximumCapacity must be >= 0: ", i10));
        }
        int i11 = this.size;
        if (i11 > i10) {
            i10 = i11;
        }
        if (this.capacity <= i10) {
            return;
        }
        resize(nextPowerOfTwo(i10));
    }

    public String toString() {
        int i10;
        if (this.size == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = kArr.length;
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                K k10 = kArr[i10];
                if (k10 != null) {
                    sb2.append(k10);
                    sb2.append('=');
                    sb2.append(vArr[i10]);
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
                sb2.append(AbstractJsonLexerKt.END_OBJ);
                return sb2.toString();
            }
            K k11 = kArr[i11];
            if (k11 != null) {
                sb2.append(", ");
                sb2.append(k11);
                sb2.append('=');
                sb2.append(vArr[i11]);
            }
            i10 = i11;
        }
    }

    public Values<V> values() {
        return new Values<>(this);
    }

    public CuckooObjectMap(int i10) {
        this(i10, 0.8f);
    }

    public static class Values<V> extends a<Object, V> implements Iterable<V>, Iterator<V> {
        public Values(CuckooObjectMap<?, V> cuckooObjectMap) {
            super(cuckooObjectMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            V[] vArr = this.map.valueTable;
            int i10 = this.nextIndex;
            V v3 = vArr[i10];
            this.currentIndex = i10;
            advance();
            return v3;
        }

        @Override // com.esotericsoftware.kryo.util.CuckooObjectMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.CuckooObjectMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<V> toArray() {
            ArrayList<V> arrayList = new ArrayList<>(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }

        public void toArray(ArrayList<V> arrayList) {
            while (this.hasNext) {
                arrayList.add(next());
            }
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }

    public CuckooObjectMap(int i10, float f6) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("initialCapacity must be >= 0: ", i10));
        }
        if (i10 <= 1073741824) {
            int iNextPowerOfTwo = nextPowerOfTwo(i10);
            this.capacity = iNextPowerOfTwo;
            if (f6 > 0.0f) {
                this.loadFactor = f6;
                this.isBigTable = (iNextPowerOfTwo >>> 16) != 0;
                this.threshold = (int) (iNextPowerOfTwo * f6);
                this.mask = iNextPowerOfTwo - 1;
                this.hashShift = 31 - Integer.numberOfTrailingZeros(iNextPowerOfTwo);
                this.stashCapacity = Math.max(3, ((int) Math.ceil(Math.log(this.capacity))) * 2);
                this.pushIterations = Math.max(Math.min(this.capacity, 8), ((int) Math.sqrt(this.capacity)) / 8);
                K[] kArr = (K[]) new Object[this.capacity + this.stashCapacity];
                this.keyTable = kArr;
                this.valueTable = (V[]) new Object[kArr.length];
                return;
            }
            throw new IllegalArgumentException("loadFactor must be > 0: " + f6);
        }
        throw new IllegalArgumentException(g0.c("initialCapacity is too large: ", i10));
    }

    private V getStash(K k10, V v3) {
        K[] kArr = this.keyTable;
        int i10 = this.capacity;
        int i11 = this.stashSize + i10;
        while (i10 < i11) {
            if (k10.equals(kArr[i10])) {
                return this.valueTable[i10];
            }
            i10++;
        }
        return v3;
    }

    public void clear() {
        K[] kArr = this.keyTable;
        V[] vArr = this.valueTable;
        int i10 = this.capacity + this.stashSize;
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                kArr[i11] = null;
                vArr[i11] = null;
                i10 = i11;
            } else {
                this.size = 0;
                this.stashSize = 0;
                return;
            }
        }
    }

    public V get(K k10, V v3) {
        int iHashCode = k10.hashCode();
        int iHash2 = this.mask & iHashCode;
        if (!k10.equals(this.keyTable[iHash2])) {
            iHash2 = hash2(iHashCode);
            if (!k10.equals(this.keyTable[iHash2])) {
                iHash2 = hash3(iHashCode);
                if (!k10.equals(this.keyTable[iHash2])) {
                    if (this.isBigTable) {
                        iHash2 = hash4(iHashCode);
                        if (!k10.equals(this.keyTable[iHash2])) {
                            return getStash(k10, v3);
                        }
                    } else {
                        return getStash(k10, v3);
                    }
                }
            }
        }
        return this.valueTable[iHash2];
    }

    public static class Keys<K> extends a<K, Object> implements Iterable<K>, Iterator<K> {
        public Keys(CuckooObjectMap<K, ?> cuckooObjectMap) {
            super(cuckooObjectMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
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
            advance();
            return k10;
        }

        @Override // com.esotericsoftware.kryo.util.CuckooObjectMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.CuckooObjectMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<K> toArray() {
            ArrayList<K> arrayList = new ArrayList<>(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }

        @Override // java.lang.Iterable
        public Iterator<K> iterator() {
            return this;
        }
    }

    public CuckooObjectMap(CuckooObjectMap<? extends K, ? extends V> cuckooObjectMap) {
        this(cuckooObjectMap.capacity, cuckooObjectMap.loadFactor);
        this.stashSize = cuckooObjectMap.stashSize;
        Object[] objArr = cuckooObjectMap.keyTable;
        System.arraycopy(objArr, 0, this.keyTable, 0, objArr.length);
        Object[] objArr2 = cuckooObjectMap.valueTable;
        System.arraycopy(objArr2, 0, this.valueTable, 0, objArr2.length);
        this.size = cuckooObjectMap.size;
    }
}
