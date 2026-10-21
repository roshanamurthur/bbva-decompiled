package com.esotericsoftware.kryo.util;

/* JADX INFO: loaded from: classes9.dex */
public class IdentityObjectIntMap<K> extends ObjectIntMap<K> {
    public IdentityObjectIntMap() {
    }

    @Override // com.esotericsoftware.kryo.util.ObjectIntMap
    public int hashCode() {
        int iIdentityHashCode = this.size;
        K[] kArr = this.keyTable;
        int[] iArr = this.valueTable;
        int length = kArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            K k10 = kArr[i10];
            if (k10 != null) {
                iIdentityHashCode = System.identityHashCode(k10) + iArr[i10] + iIdentityHashCode;
            }
        }
        return iIdentityHashCode;
    }

    @Override // com.esotericsoftware.kryo.util.ObjectIntMap
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
            if (k11 == k10) {
                return iPlace;
            }
            iPlace = (iPlace + 1) & this.mask;
        }
    }

    @Override // com.esotericsoftware.kryo.util.ObjectIntMap
    public int place(K k10) {
        return (int) ((((long) System.identityHashCode(k10)) * (-7046029254386353131L)) >>> this.shift);
    }

    public IdentityObjectIntMap(int i10) {
        super(i10);
    }

    public IdentityObjectIntMap(int i10, float f6) {
        super(i10, f6);
    }

    public IdentityObjectIntMap(IdentityObjectIntMap<K> identityObjectIntMap) {
        super(identityObjectIntMap);
    }
}
