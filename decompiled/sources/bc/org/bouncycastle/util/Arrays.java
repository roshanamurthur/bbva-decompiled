package bc.org.bouncycastle.util;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class Arrays {

    public static class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T[] f25190p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f25191q0 = 0;

        public a(T[] tArr) {
            this.f25190p0 = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25191q0 < this.f25190p0.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i10 = this.f25191q0;
            T[] tArr = this.f25190p0;
            if (i10 != tArr.length) {
                this.f25191q0 = i10 + 1;
                return tArr[i10];
            }
            throw new NoSuchElementException("Out of elements: " + this.f25191q0);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static int a(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0) {
            return i12;
        }
        StringBuffer stringBuffer = new StringBuffer(i10);
        stringBuffer.append(" > ");
        stringBuffer.append(i11);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static byte[] append(byte[] bArr, byte b10) {
        if (bArr == null) {
            return new byte[]{b10};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b10;
        return bArr2;
    }

    public static boolean areEqual(boolean[] zArr, boolean[] zArr2) {
        if (zArr == zArr2) {
            return true;
        }
        if (zArr == null || zArr2 == null || zArr.length != zArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != zArr.length; i10++) {
            if (zArr[i10] != zArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int compareUnsigned(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = bArr2[i10] & 255;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        return bArr.length > bArr2.length ? 1 : 0;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr2 != null ? clone(bArr2) : clone(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean constantTimeAreEqual(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr.length != bArr2.length) {
            return !constantTimeAreEqual(bArr, bArr);
        }
        int i10 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    public static boolean contains(short[] sArr, short s4) {
        for (short s7 : sArr) {
            if (s7 == s4) {
                return true;
            }
        }
        return false;
    }

    public static byte[] copyOf(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        if (i10 < bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, i10);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        return bArr2;
    }

    public static byte[] copyOfRange(byte[] bArr, int i10, int i11) {
        int iA = a(i10, i11);
        byte[] bArr2 = new byte[iA];
        if (bArr.length - i10 < iA) {
            System.arraycopy(bArr, i10, bArr2, 0, bArr.length - i10);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, iA);
        }
        return bArr2;
    }

    public static void fill(byte[] bArr, byte b10) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = b10;
        }
    }

    public static int hashCode(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ bArr[length];
        }
    }

    public static byte[] prepend(byte[] bArr, byte b10) {
        if (bArr == null) {
            return new byte[]{b10};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b10;
        return bArr2;
    }

    public static byte[] reverse(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i10];
            i10++;
        }
    }

    public static char[] clone(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static boolean contains(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static void fill(char[] cArr, char c10) {
        for (int i10 = 0; i10 < cArr.length; i10++) {
            cArr[i10] = c10;
        }
    }

    public static int hashCode(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            i12 = (i12 * 257) ^ bArr[i10 + i11];
        }
    }

    public static boolean areEqual(char[] cArr, char[] cArr2) {
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != cArr.length; i10++) {
            if (cArr[i10] != cArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ cArr[length];
        }
    }

    public static int[] reverse(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i10 = 0;
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i10];
            i10++;
        }
    }

    public static short[] append(short[] sArr, short s4) {
        if (sArr == null) {
            return new short[]{s4};
        }
        int length = sArr.length;
        short[] sArr2 = new short[length + 1];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        sArr2[length] = s4;
        return sArr2;
    }

    public static byte[] clone(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 != null && bArr2.length == bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            return bArr2;
        }
        return clone(bArr);
    }

    public static char[] copyOf(char[] cArr, int i10) {
        char[] cArr2 = new char[i10];
        if (i10 < cArr.length) {
            System.arraycopy(cArr, 0, cArr2, 0, i10);
        } else {
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        }
        return cArr2;
    }

    public static void fill(long[] jArr, long j10) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            jArr[i10] = j10;
        }
    }

    public static short[] prepend(short[] sArr, short s4) {
        if (sArr == null) {
            return new short[]{s4};
        }
        int length = sArr.length;
        short[] sArr2 = new short[length + 1];
        System.arraycopy(sArr, 0, sArr2, 1, length);
        sArr2[0] = s4;
        return sArr2;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            if (bArr == null) {
                return concatenate(bArr2, bArr3);
            }
            if (bArr2 == null) {
                return concatenate(bArr, bArr3);
            }
            return concatenate(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static int[] copyOfRange(int[] iArr, int i10, int i11) {
        int iA = a(i10, i11);
        int[] iArr2 = new int[iA];
        if (iArr.length - i10 < iA) {
            System.arraycopy(iArr, i10, iArr2, 0, iArr.length - i10);
        } else {
            System.arraycopy(iArr, i10, iArr2, 0, iA);
        }
        return iArr2;
    }

    public static int hashCode(int[][] iArr) {
        int iHashCode = 0;
        for (int i10 = 0; i10 != iArr.length; i10++) {
            iHashCode = (iHashCode * 257) + hashCode(iArr[i10]);
        }
        return iHashCode;
    }

    public static boolean areEqual(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static void fill(short[] sArr, short s4) {
        for (int i10 = 0; i10 < sArr.length; i10++) {
            sArr[i10] = s4;
        }
    }

    public static byte[][] clone(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][] bArr2 = new byte[length][];
        for (int i10 = 0; i10 != length; i10++) {
            bArr2[i10] = clone(bArr[i10]);
        }
        return bArr2;
    }

    public static int hashCode(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ iArr[length];
        }
    }

    public static int[] append(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[]{i10};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i10;
        return iArr2;
    }

    public static int[] copyOf(int[] iArr, int i10) {
        int[] iArr2 = new int[i10];
        if (i10 < iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, i10);
        } else {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
        return iArr2;
    }

    public static void fill(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = i10;
        }
    }

    public static int[] prepend(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[]{i10};
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 1];
        System.arraycopy(iArr, 0, iArr2, 1, length);
        iArr2[0] = i10;
        return iArr2;
    }

    public static boolean areEqual(short[] sArr, short[] sArr2) {
        if (sArr == sArr2) {
            return true;
        }
        if (sArr == null || sArr2 == null || sArr.length != sArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != sArr.length; i10++) {
            if (sArr[i10] != sArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static byte[][][] clone(byte[][][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][][] bArr2 = new byte[length][][];
        for (int i10 = 0; i10 != length; i10++) {
            bArr2[i10] = clone(bArr[i10]);
        }
        return bArr2;
    }

    public static int hashCode(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            i12 = (i12 * 257) ^ iArr[i10 + i11];
        }
    }

    public static long[] copyOfRange(long[] jArr, int i10, int i11) {
        int iA = a(i10, i11);
        long[] jArr2 = new long[iA];
        if (jArr.length - i10 < iA) {
            System.arraycopy(jArr, i10, jArr2, 0, jArr.length - i10);
        } else {
            System.arraycopy(jArr, i10, jArr2, 0, iA);
        }
        return jArr2;
    }

    public static int hashCode(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int length = jArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            long j10 = jArr[length];
            i10 = (((i10 * 257) ^ ((int) j10)) * 257) ^ ((int) (j10 >>> 32));
        }
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean areEqual(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != iArr.length; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr != null && bArr2 != null && bArr3 != null && bArr4 != null) {
            byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
            System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
            System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
            System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
            System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
            return bArr5;
        }
        if (bArr4 == null) {
            return concatenate(bArr, bArr2, bArr3);
        }
        if (bArr3 == null) {
            return concatenate(bArr, bArr2, bArr4);
        }
        if (bArr2 == null) {
            return concatenate(bArr, bArr3, bArr4);
        }
        return concatenate(bArr2, bArr3, bArr4);
    }

    public static long[] copyOf(long[] jArr, int i10) {
        long[] jArr2 = new long[i10];
        if (i10 < jArr.length) {
            System.arraycopy(jArr, 0, jArr2, 0, i10);
        } else {
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        }
        return jArr2;
    }

    public static int hashCode(long[] jArr, int i10, int i11) {
        if (jArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            long j10 = jArr[i10 + i11];
            i12 = (((i12 * 257) ^ ((int) j10)) * 257) ^ ((int) (j10 >>> 32));
        }
    }

    public static String[] append(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static int hashCode(short[][][] sArr) {
        int iHashCode = 0;
        for (int i10 = 0; i10 != sArr.length; i10++) {
            iHashCode = (iHashCode * 257) + hashCode(sArr[i10]);
        }
        return iHashCode;
    }

    public static boolean areEqual(long[] jArr, long[] jArr2) {
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != jArr.length; i10++) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static long[] clone(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 != null && jArr2.length == jArr.length) {
            System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
            return jArr2;
        }
        return clone(jArr);
    }

    public static BigInteger[] copyOfRange(BigInteger[] bigIntegerArr, int i10, int i11) {
        int iA = a(i10, i11);
        BigInteger[] bigIntegerArr2 = new BigInteger[iA];
        if (bigIntegerArr.length - i10 < iA) {
            System.arraycopy(bigIntegerArr, i10, bigIntegerArr2, 0, bigIntegerArr.length - i10);
        } else {
            System.arraycopy(bigIntegerArr, i10, bigIntegerArr2, 0, iA);
        }
        return bigIntegerArr2;
    }

    public static int hashCode(short[][] sArr) {
        int iHashCode = 0;
        for (int i10 = 0; i10 != sArr.length; i10++) {
            iHashCode = (iHashCode * 257) + hashCode(sArr[i10]);
        }
        return iHashCode;
    }

    public static BigInteger[] copyOf(BigInteger[] bigIntegerArr, int i10) {
        BigInteger[] bigIntegerArr2 = new BigInteger[i10];
        if (i10 < bigIntegerArr.length) {
            System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, i10);
        } else {
            System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, bigIntegerArr.length);
        }
        return bigIntegerArr2;
    }

    public static int hashCode(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * 257) ^ (sArr[length] & 255);
        }
    }

    public static boolean areEqual(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != objArr.length; i10++) {
            Object obj = objArr[i10];
            Object obj2 = objArr2[i10];
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static short[] clone(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public static int hashCode(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ objArr[length].hashCode();
        }
    }

    public static BigInteger[] clone(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null) {
            return null;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, bigIntegerArr.length);
        return bigIntegerArr2;
    }

    public static byte[] concatenate(byte[][] bArr) {
        int length = 0;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            length += bArr[i10].length;
        }
        byte[] bArr2 = new byte[length];
        int length2 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            byte[] bArr3 = bArr[i11];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr[i11].length;
        }
        return bArr2;
    }

    public static int[] concatenate(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return clone(iArr2);
        }
        if (iArr2 == null) {
            return clone(iArr);
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }
}
