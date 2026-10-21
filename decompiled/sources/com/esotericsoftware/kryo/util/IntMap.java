package com.esotericsoftware.kryo.util;

import androidx.appcompat.widget.g0;
import com.esotericsoftware.kryo.KryoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
public class IntMap<V> implements Iterable<Entry<V>> {
    boolean hasZeroValue;
    int[] keyTable;
    private final float loadFactor;
    protected int mask;
    protected int shift;
    public int size;
    private int threshold;
    V[] valueTable;
    V zeroValue;

    public static class Entries<V> extends a<V> implements Iterable<Entry<V>>, Iterator<Entry<V>> {
        private final Entry<V> entry;

        public Entries(IntMap intMap) {
            super(intMap);
            this.entry = new Entry<>();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.valid) {
                return this.hasNext;
            }
            throw new KryoException("#iterator() cannot be used nested.");
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        @Override // java.util.Iterator
        public Entry<V> next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            if (!this.valid) {
                throw new KryoException("#iterator() cannot be used nested.");
            }
            IntMap<V> intMap = this.map;
            int[] iArr = intMap.keyTable;
            int i10 = this.nextIndex;
            if (i10 == -1) {
                Entry<V> entry = this.entry;
                entry.key = 0;
                entry.value = intMap.zeroValue;
            } else {
                Entry<V> entry2 = this.entry;
                entry2.key = iArr[i10];
                entry2.value = intMap.valueTable[i10];
            }
            this.currentIndex = i10;
            findNextIndex();
            return this.entry;
        }

        @Override // java.lang.Iterable
        public Iterator<Entry<V>> iterator() {
            return this;
        }
    }

    public static class Entry<V> {
        public int key;

        @Null
        public V value;

        public String toString() {
            return this.key + "=" + this.value;
        }
    }

    public static class a<V> {
        private static final int INDEX_ILLEGAL = -2;
        static final int INDEX_ZERO = -1;
        int currentIndex;
        public boolean hasNext;
        final IntMap<V> map;
        int nextIndex;
        boolean valid = true;

        public a(IntMap<V> intMap) {
            this.map = intMap;
            reset();
        }

        public void findNextIndex() {
            int i10;
            int[] iArr = this.map.keyTable;
            int length = iArr.length;
            do {
                i10 = this.nextIndex + 1;
                this.nextIndex = i10;
                if (i10 >= length) {
                    this.hasNext = false;
                    return;
                }
            } while (iArr[i10] == 0);
            this.hasNext = true;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        /* JADX WARN: Code duplicated, block: B:17:0x003e  */
        /* JADX WARN: Code duplicated, block: B:20:0x0050  */
        /* JADX WARN: Code duplicated, block: B:22:0x0038 A[EDGE_INSN: B:22:0x0038->B:15:0x0038 BREAK  A[LOOP:0: B:9:0x001b->B:14:0x0035], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x0035 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x000f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0011  */
        public void remove() {
            int[] iArr;
            V[] vArr;
            int i10;
            int i11;
            int i12;
            int i13;
            int iPlace;
            int i14 = this.currentIndex;
            if (i14 == -1) {
                IntMap<V> intMap = this.map;
                if (intMap.hasZeroValue) {
                    intMap.hasZeroValue = false;
                } else {
                    if (i14 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    IntMap<V> intMap2 = this.map;
                    iArr = intMap2.keyTable;
                    vArr = intMap2.valueTable;
                    i10 = intMap2.mask;
                    i11 = i14 + 1;
                    while (true) {
                        i12 = i11 & i10;
                        i13 = iArr[i12];
                        if (i13 != 0) {
                            break;
                        }
                        iPlace = this.map.place(i13);
                        if (((i12 - iPlace) & i10) > ((i14 - iPlace) & i10)) {
                            iArr[i14] = i13;
                            vArr[i14] = vArr[i12];
                            i14 = i12;
                        }
                        i11 = i12 + 1;
                    }
                    iArr[i14] = 0;
                    if (i14 != this.currentIndex) {
                        this.nextIndex--;
                    }
                }
            } else {
                if (i14 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                IntMap<V> intMap3 = this.map;
                iArr = intMap3.keyTable;
                vArr = intMap3.valueTable;
                i10 = intMap3.mask;
                i11 = i14 + 1;
                while (true) {
                    i12 = i11 & i10;
                    i13 = iArr[i12];
                    if (i13 != 0) {
                        break;
                        break;
                    }
                    iPlace = this.map.place(i13);
                    if (((i12 - iPlace) & i10) > ((i14 - iPlace) & i10)) {
                        iArr[i14] = i13;
                        vArr[i14] = vArr[i12];
                        i14 = i12;
                    }
                    i11 = i12 + 1;
                }
                iArr[i14] = 0;
                if (i14 != this.currentIndex) {
                    this.nextIndex--;
                }
            }
            this.currentIndex = -2;
            this.map.size--;
        }

        public void reset() {
            this.currentIndex = -2;
            this.nextIndex = -1;
            if (this.map.hasZeroValue) {
                this.hasNext = true;
            } else {
                findNextIndex();
            }
        }
    }

    public IntMap() {
        this(51, 0.8f);
    }

    private int locateKey(int i10) {
        int[] iArr = this.keyTable;
        int iPlace = place(i10);
        while (true) {
            int i11 = iArr[iPlace];
            if (i11 == 0) {
                return -(iPlace + 1);
            }
            if (i11 == i10) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    private void putResize(int i10, @Null V v3) {
        int[] iArr = this.keyTable;
        int iPlace = place(i10);
        while (iArr[iPlace] != 0) {
            iPlace = (iPlace + 1) & this.mask;
        }
        iArr[iPlace] = i10;
        this.valueTable[iPlace] = v3;
    }

    private void resize(int i10) {
        int length = this.keyTable.length;
        this.threshold = (int) (i10 * this.loadFactor);
        int i11 = i10 - 1;
        this.mask = i11;
        this.shift = Long.numberOfLeadingZeros(i11);
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        this.keyTable = new int[i10];
        this.valueTable = (V[]) new Object[i10];
        if (this.size > 0) {
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = iArr[i12];
                if (i13 != 0) {
                    putResize(i13, vArr[i12]);
                }
            }
        }
    }

    public void clear(int i10) {
        int iTableSize = ObjectMap.tableSize(i10, this.loadFactor);
        if (this.keyTable.length <= iTableSize) {
            clear();
            return;
        }
        this.size = 0;
        this.hasZeroValue = false;
        this.zeroValue = null;
        resize(iTableSize);
    }

    public boolean containsKey(int i10) {
        if (i10 == 0) {
            return this.hasZeroValue;
        }
        return locateKey(i10) >= 0;
    }

    public boolean containsValue(@Null Object obj, boolean z10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (this.hasZeroValue && this.zeroValue == null) {
                return true;
            }
            int[] iArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                if (iArr[length] != 0 && vArr[length] == null) {
                    return true;
                }
            }
            return false;
        }
        if (z10) {
            if (obj == this.zeroValue) {
                return true;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return true;
                }
            }
            return false;
        }
        if (this.hasZeroValue && obj.equals(this.zeroValue)) {
            return true;
        }
        for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
            if (obj.equals(vArr[length3])) {
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

    public Entries<V> entries() {
        return new Entries<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntMap)) {
            return false;
        }
        IntMap intMap = (IntMap) obj;
        if (intMap.size != this.size) {
            return false;
        }
        boolean z10 = intMap.hasZeroValue;
        boolean z11 = this.hasZeroValue;
        if (z10 != z11) {
            return false;
        }
        if (z11) {
            V v3 = intMap.zeroValue;
            if (v3 == null) {
                if (this.zeroValue != null) {
                    return false;
                }
            } else if (!v3.equals(this.zeroValue)) {
                return false;
            }
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                V v6 = vArr[i10];
                if (v6 == null) {
                    if (intMap.get(i11, ObjectMap.dummy) != null) {
                        return false;
                    }
                } else if (!v6.equals(intMap.get(i11))) {
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
        if (!(obj instanceof IntMap)) {
            return false;
        }
        IntMap intMap = (IntMap) obj;
        if (intMap.size != this.size) {
            return false;
        }
        boolean z10 = intMap.hasZeroValue;
        boolean z11 = this.hasZeroValue;
        if (z10 != z11) {
            return false;
        }
        if (z11 && this.zeroValue != intMap.zeroValue) {
            return false;
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0 && vArr[i10] != intMap.get(i11, ObjectMap.dummy)) {
                return false;
            }
        }
        return true;
    }

    public int findKey(@Null Object obj, boolean z10, int i10) {
        V[] vArr = this.valueTable;
        if (obj == null) {
            if (this.hasZeroValue && this.zeroValue == null) {
                return 0;
            }
            int[] iArr = this.keyTable;
            for (int length = vArr.length - 1; length >= 0; length--) {
                int i11 = iArr[length];
                if (i11 != 0 && vArr[length] == null) {
                    return i11;
                }
            }
        } else if (z10) {
            if (obj == this.zeroValue) {
                return 0;
            }
            for (int length2 = vArr.length - 1; length2 >= 0; length2--) {
                if (vArr[length2] == obj) {
                    return this.keyTable[length2];
                }
            }
        } else {
            if (this.hasZeroValue && obj.equals(this.zeroValue)) {
                return 0;
            }
            for (int length3 = vArr.length - 1; length3 >= 0; length3--) {
                if (obj.equals(vArr[length3])) {
                    return this.keyTable[length3];
                }
            }
        }
        return i10;
    }

    public V get(int i10) {
        if (i10 == 0) {
            if (this.hasZeroValue) {
                return this.zeroValue;
            }
            return null;
        }
        int iLocateKey = locateKey(i10);
        if (iLocateKey >= 0) {
            return this.valueTable[iLocateKey];
        }
        return null;
    }

    public int hashCode() {
        V v3;
        int iHashCode = this.size;
        if (this.hasZeroValue && (v3 = this.zeroValue) != null) {
            iHashCode += v3.hashCode();
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                int i12 = (i11 * 31) + iHashCode;
                V v6 = vArr[i10];
                iHashCode = v6 != null ? v6.hashCode() + i12 : i12;
            }
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Entry<V>> iterator() {
        return entries();
    }

    public Keys keys() {
        return new Keys(this);
    }

    public boolean notEmpty() {
        return this.size > 0;
    }

    public int place(int i10) {
        return (int) ((((long) i10) * (-7046029254386353131L)) >>> this.shift);
    }

    @Null
    public V put(int i10, @Null V v3) {
        if (i10 == 0) {
            V v6 = this.zeroValue;
            this.zeroValue = v3;
            if (!this.hasZeroValue) {
                this.hasZeroValue = true;
                this.size++;
            }
            return v6;
        }
        int iLocateKey = locateKey(i10);
        if (iLocateKey >= 0) {
            V[] vArr = this.valueTable;
            V v10 = vArr[iLocateKey];
            vArr[iLocateKey] = v3;
            return v10;
        }
        int i11 = -(iLocateKey + 1);
        int[] iArr = this.keyTable;
        iArr[i11] = i10;
        this.valueTable[i11] = v3;
        int i12 = this.size + 1;
        this.size = i12;
        if (i12 < this.threshold) {
            return null;
        }
        resize(iArr.length << 1);
        return null;
    }

    public void putAll(IntMap<? extends V> intMap) {
        ensureCapacity(intMap.size);
        if (intMap.hasZeroValue) {
            put(0, intMap.zeroValue);
        }
        int[] iArr = intMap.keyTable;
        V[] vArr = intMap.valueTable;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            if (i11 != 0) {
                put(i11, vArr[i10]);
            }
        }
    }

    @Null
    public V remove(int i10) {
        if (i10 == 0) {
            if (!this.hasZeroValue) {
                return null;
            }
            this.hasZeroValue = false;
            V v3 = this.zeroValue;
            this.zeroValue = null;
            this.size--;
            return v3;
        }
        int iLocateKey = locateKey(i10);
        if (iLocateKey < 0) {
            return null;
        }
        int[] iArr = this.keyTable;
        V[] vArr = this.valueTable;
        V v6 = vArr[iLocateKey];
        int i11 = this.mask;
        int i12 = iLocateKey + 1;
        while (true) {
            int i13 = i12 & i11;
            int i14 = iArr[i13];
            if (i14 == 0) {
                iArr[iLocateKey] = 0;
                this.size--;
                return v6;
            }
            int iPlace = place(i14);
            if (((i13 - iPlace) & i11) > ((iLocateKey - iPlace) & i11)) {
                iArr[iLocateKey] = i14;
                vArr[iLocateKey] = vArr[i13];
                iLocateKey = i13;
            }
            i12 = i13 + 1;
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

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[EDGE_INSN: B:21:0x0048->B:15:0x003e BREAK  A[LOOP:0: B:9:0x0029->B:13:0x0031]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.size
            if (r0 != 0) goto L7
            java.lang.String r0 = "[]"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r7.keyTable
            V[] r2 = r7.valueTable
            int r3 = r1.length
            boolean r4 = r7.hasZeroValue
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            V r4 = r7.zeroValue
            r0.append(r4)
            goto L3f
        L29:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L3e
            r3 = r1[r4]
            if (r3 != 0) goto L33
            r3 = r4
            goto L29
        L33:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
        L3e:
            r3 = r4
        L3f:
            int r4 = r3 + (-1)
            if (r3 <= 0) goto L59
            r3 = r1[r4]
            if (r3 != 0) goto L48
            goto L3e
        L48:
            java.lang.String r6 = ", "
            r0.append(r6)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r4]
            r0.append(r3)
            goto L3e
        L59:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.kryo.util.IntMap.toString():java.lang.String");
    }

    public Values<V> values() {
        return new Values<>(this);
    }

    public IntMap(int i10) {
        this(i10, 0.8f);
    }

    public static class Keys extends a {
        public Keys(IntMap intMap) {
            super(intMap);
        }

        public int next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            int i10 = this.nextIndex;
            int i11 = i10 == -1 ? 0 : this.map.keyTable[i10];
            this.currentIndex = i10;
            findNextIndex();
            return i11;
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.a
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
    }

    public IntMap(int i10, float f6) {
        if (f6 > 0.0f && f6 < 1.0f) {
            this.loadFactor = f6;
            int iTableSize = ObjectMap.tableSize(i10, f6);
            this.threshold = (int) (iTableSize * f6);
            int i11 = iTableSize - 1;
            this.mask = i11;
            this.shift = Long.numberOfLeadingZeros(i11);
            this.keyTable = new int[iTableSize];
            this.valueTable = (V[]) new Object[iTableSize];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f6);
    }

    public V get(int i10, @Null V v3) {
        if (i10 == 0) {
            return this.hasZeroValue ? this.zeroValue : v3;
        }
        int iLocateKey = locateKey(i10);
        return iLocateKey >= 0 ? this.valueTable[iLocateKey] : v3;
    }

    public void clear() {
        if (this.size == 0) {
            return;
        }
        this.size = 0;
        Arrays.fill(this.keyTable, 0);
        Arrays.fill(this.valueTable, (Object) null);
        this.zeroValue = null;
        this.hasZeroValue = false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntMap(IntMap<? extends V> intMap) {
        float length = intMap.keyTable.length;
        float f6 = intMap.loadFactor;
        this((int) (length * f6), f6);
        int[] iArr = intMap.keyTable;
        System.arraycopy(iArr, 0, this.keyTable, 0, iArr.length);
        Object[] objArr = intMap.valueTable;
        System.arraycopy(objArr, 0, this.valueTable, 0, objArr.length);
        this.size = intMap.size;
        this.zeroValue = intMap.zeroValue;
        this.hasZeroValue = intMap.hasZeroValue;
    }

    public static class Values<V> extends a<V> implements Iterable<V>, Iterator<V> {
        public Values(IntMap<V> intMap) {
            super(intMap);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        @Null
        public V next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            int i10 = this.nextIndex;
            V v3 = i10 == -1 ? this.map.zeroValue : this.map.valueTable[i10];
            this.currentIndex = i10;
            findNextIndex();
            return v3;
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.a, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.esotericsoftware.kryo.util.IntMap.a
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }

        public ArrayList<V> toList() {
            ArrayList<V> arrayList = new ArrayList<>(this.map.size);
            while (this.hasNext) {
                arrayList.add(next());
            }
            return arrayList;
        }

        @Override // java.lang.Iterable
        public Iterator<V> iterator() {
            return this;
        }
    }
}
