package org.bouncycastle.math.raw;

import java.util.Random;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Mod {
    public static int a(int[] iArr, int[] iArr2, int i10, int[] iArr3, int i11) {
        int i12;
        int length = iArr.length;
        int i13 = 0;
        while (true) {
            i12 = iArr2[0];
            if (i12 != 0) {
                break;
            }
            Nat.shiftDownWord(i10, iArr2, 0);
            i13 += 32;
        }
        int i14 = 0;
        while ((i12 & 1) == 0) {
            i12 >>>= 1;
            i14++;
        }
        if (i14 > 0) {
            Nat.shiftDownBits(i10, iArr2, i14, 0);
            i13 += i14;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            if ((iArr3[0] & 1) != 0) {
                i11 = (i11 < 0 ? Nat.addTo(length, iArr, iArr3) : Nat.subFrom(length, iArr, iArr3)) + i11;
            }
            Nat.shiftDownBit(length, iArr3, i11);
        }
        return i11;
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.add(length, iArr2, iArr3, iArr4) != 0) {
            Nat.subFrom(length, iArr, iArr4);
        }
    }

    public static int inverse32(int i10) {
        int i11 = (2 - (i10 * i10)) * i10;
        int i12 = (2 - (i10 * i11)) * i11;
        int i13 = (2 - (i10 * i12)) * i12;
        return (2 - (i10 * i13)) * i13;
    }

    public static void invert(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (Nat.isZero(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        if (Nat.isOne(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrCopy = Nat.copy(length, iArr2);
        int[] iArrCreate = Nat.create(length);
        iArrCreate[0] = 1;
        int iA = (1 & iArrCopy[0]) == 0 ? a(iArr, iArrCopy, length, iArrCreate, 0) : 0;
        if (Nat.isOne(length, iArrCopy)) {
            if (iA < 0) {
                Nat.add(iArr.length, iArrCreate, iArr, iArr3);
                return;
            } else {
                System.arraycopy(iArrCreate, 0, iArr3, 0, iArr.length);
                return;
            }
        }
        int[] iArrCopy2 = Nat.copy(length, iArr);
        int[] iArrCreate2 = Nat.create(length);
        int i10 = length;
        int iA2 = 0;
        while (true) {
            int i11 = i10 - 1;
            if (iArrCopy[i11] == 0 && iArrCopy2[i11] == 0) {
                i10--;
            } else if (Nat.gte(i10, iArrCopy, iArrCopy2)) {
                Nat.subFrom(i10, iArrCopy2, iArrCopy);
                iA = a(iArr, iArrCopy, i10, iArrCreate, (Nat.subFrom(length, iArrCreate2, iArrCreate) - iA2) + iA);
                if (Nat.isOne(i10, iArrCopy)) {
                    if (iA < 0) {
                        Nat.add(iArr.length, iArrCreate, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArrCreate, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            } else {
                Nat.subFrom(i10, iArrCopy, iArrCopy2);
                iA2 = a(iArr, iArrCopy2, i10, iArrCreate2, (Nat.subFrom(length, iArrCreate, iArrCreate2) - iA) + iA2);
                if (Nat.isOne(i10, iArrCopy2)) {
                    if (iA2 < 0) {
                        Nat.add(iArr.length, iArrCreate2, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArrCreate2, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            }
        }
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrCreate = Nat.create(length);
        int i10 = length - 1;
        int i11 = iArr[i10];
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        do {
            for (int i17 = 0; i17 != length; i17++) {
                iArrCreate[i17] = random.nextInt();
            }
            iArrCreate[i10] = iArrCreate[i10] & i16;
        } while (Nat.gte(length, iArrCreate, iArr));
        return iArrCreate;
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (Nat.sub(length, iArr2, iArr3, iArr4) != 0) {
            Nat.addTo(length, iArr, iArr4);
        }
    }
}
