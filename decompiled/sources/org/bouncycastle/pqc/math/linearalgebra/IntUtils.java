package org.bouncycastle.pqc.math.linearalgebra;

import androidx.appcompat.widget.a;
import androidx.camera.core.impl.utils.c;

/* JADX INFO: loaded from: classes13.dex */
public final class IntUtils {
    public static int[] clone(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z10 = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z10 &= iArr[length] == iArr2[length];
        }
        return z10;
    }

    public static void fill(int[] iArr, int i10) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = i10;
        }
    }

    public static void quicksort(int[] iArr) {
        quicksort(iArr, 0, iArr.length - 1);
    }

    public static int[] subArray(int[] iArr, int i10, int i11) {
        int i12 = i11 - i10;
        int[] iArr2 = new int[i12];
        System.arraycopy(iArr, i10, iArr2, 0, i12);
        return iArr2;
    }

    public static String toHexString(int[] iArr) {
        return ByteUtils.toHexString(BigEndianConversions.toByteArray(iArr));
    }

    public static String toString(int[] iArr) {
        String strC = "";
        for (int i10 : iArr) {
            strC = a.c(c.d(strC), i10, " ");
        }
        return strC;
    }

    public static void quicksort(int[] iArr, int i10, int i11) {
        if (i11 > i10) {
            int i12 = iArr[i11];
            iArr[i11] = i12;
            iArr[i11] = i12;
            int i13 = i10;
            int i14 = i13;
            while (i13 < i11) {
                int i15 = iArr[i13];
                if (i15 <= i12) {
                    int i16 = iArr[i14];
                    iArr[i14] = i15;
                    iArr[i13] = i16;
                    i14++;
                }
                i13++;
            }
            int i17 = iArr[i14];
            iArr[i14] = iArr[i11];
            iArr[i11] = i17;
            quicksort(iArr, i10, i14 - 1);
            quicksort(iArr, i14 + 1, i11);
        }
    }
}
