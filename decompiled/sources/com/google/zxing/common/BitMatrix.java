package com.google.zxing.common;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class BitMatrix implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f49808p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f49809q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f49810r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int[] f49811s0;

    public BitMatrix(int i10) {
        this(i10, i10);
    }

    public static BitMatrix parse(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        BitMatrix bitMatrix = new BitMatrix(length2, length);
        for (int i10 = 0; i10 < length; i10++) {
            boolean[] zArr2 = zArr[i10];
            for (int i11 = 0; i11 < length2; i11++) {
                if (zArr2[i11]) {
                    bitMatrix.set(i11, i10);
                }
            }
        }
        return bitMatrix;
    }

    public final String a(String str, String str2, String str3) {
        int i10 = this.f49808p0;
        int i11 = this.f49809q0;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sb2.append(get(i13, i12) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void clear() {
        int[] iArr = this.f49811s0;
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.f49808p0 == bitMatrix.f49808p0 && this.f49809q0 == bitMatrix.f49809q0 && this.f49810r0 == bitMatrix.f49810r0 && Arrays.equals(this.f49811s0, bitMatrix.f49811s0);
    }

    public void flip(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f49810r0);
        int[] iArr = this.f49811s0;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean get(int i10, int i11) {
        return ((this.f49811s0[(i10 / 32) + (i11 * this.f49810r0)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] getBottomRightOnBit() {
        int[] iArr = this.f49811s0;
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f49810r0;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = iArr[length];
        int i14 = 31;
        while ((i13 >>> i14) == 0) {
            i14--;
        }
        return new int[]{i12 + i14, i11};
    }

    public int[] getEnclosingRectangle() {
        int i10 = this.f49808p0;
        int i11 = this.f49809q0;
        int i12 = -1;
        int i13 = i11;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            while (true) {
                int i17 = this.f49810r0;
                if (i16 < i17) {
                    int i18 = this.f49811s0[(i17 * i15) + i16];
                    if (i18 != 0) {
                        if (i15 < i13) {
                            i13 = i15;
                        }
                        if (i15 > i14) {
                            i14 = i15;
                        }
                        int i19 = i16 << 5;
                        if (i19 < i10) {
                            int i20 = 0;
                            while ((i18 << (31 - i20)) == 0) {
                                i20++;
                            }
                            int i21 = i20 + i19;
                            if (i21 < i10) {
                                i10 = i21;
                            }
                        }
                        if (i19 + 31 > i12) {
                            int i22 = 31;
                            while ((i18 >>> i22) == 0) {
                                i22--;
                            }
                            int i23 = i19 + i22;
                            if (i23 > i12) {
                                i12 = i23;
                            }
                        }
                    }
                    i16++;
                }
            }
        }
        if (i12 < i10 || i14 < i13) {
            return null;
        }
        return new int[]{i10, i13, (i12 - i10) + 1, (i14 - i13) + 1};
    }

    public int getHeight() {
        return this.f49809q0;
    }

    public BitArray getRow(int i10, BitArray bitArray) {
        int i11 = this.f49808p0;
        if (bitArray == null || bitArray.getSize() < i11) {
            bitArray = new BitArray(i11);
        } else {
            bitArray.clear();
        }
        int i12 = this.f49810r0;
        int i13 = i10 * i12;
        for (int i14 = 0; i14 < i12; i14++) {
            bitArray.setBulk(i14 << 5, this.f49811s0[i13 + i14]);
        }
        return bitArray;
    }

    public int getRowSize() {
        return this.f49810r0;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = this.f49811s0;
            if (i11 >= iArr.length || iArr[i11] != 0) {
                break;
            }
            i11++;
        }
        if (i11 == iArr.length) {
            return null;
        }
        int i12 = this.f49810r0;
        int i13 = i11 / i12;
        int i14 = (i11 % i12) << 5;
        while ((iArr[i11] << (31 - i10)) == 0) {
            i10++;
        }
        return new int[]{i14 + i10, i13};
    }

    public int getWidth() {
        return this.f49808p0;
    }

    public int hashCode() {
        int i10 = this.f49808p0;
        return Arrays.hashCode(this.f49811s0) + (((((((i10 * 31) + i10) * 31) + this.f49809q0) * 31) + this.f49810r0) * 31);
    }

    public void rotate180() {
        int width = getWidth();
        int height = getHeight();
        BitArray bitArray = new BitArray(width);
        BitArray bitArray2 = new BitArray(width);
        for (int i10 = 0; i10 < (height + 1) / 2; i10++) {
            bitArray = getRow(i10, bitArray);
            int i11 = (height - 1) - i10;
            bitArray2 = getRow(i11, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            setRow(i10, bitArray2);
            setRow(i11, bitArray);
        }
    }

    public void set(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f49810r0);
        int[] iArr = this.f49811s0;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void setRegion(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f49809q0 || i14 > this.f49808p0) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f49810r0 * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int i18 = (i17 / 32) + i16;
                int[] iArr = this.f49811s0;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public void setRow(int i10, BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int i11 = this.f49810r0;
        System.arraycopy(bitArray2, 0, this.f49811s0, i10 * i11, i11);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f49810r0);
        int[] iArr = this.f49811s0;
        iArr[i12] = (~(1 << (i10 & 31))) & iArr[i12];
    }

    public void xor(BitMatrix bitMatrix) {
        int width = bitMatrix.getWidth();
        int i10 = this.f49808p0;
        if (i10 == width) {
            int height = bitMatrix.getHeight();
            int i11 = this.f49809q0;
            if (i11 == height) {
                int rowSize = bitMatrix.getRowSize();
                int i12 = this.f49810r0;
                if (i12 == rowSize) {
                    BitArray bitArray = new BitArray(i10);
                    for (int i13 = 0; i13 < i11; i13++) {
                        int i14 = i13 * i12;
                        int[] bitArray2 = bitMatrix.getRow(i13, bitArray).getBitArray();
                        for (int i15 = 0; i15 < i12; i15++) {
                            int i16 = i14 + i15;
                            int[] iArr = this.f49811s0;
                            iArr[i16] = iArr[i16] ^ bitArray2[i15];
                        }
                    }
                    return;
                }
            }
        }
        throw new IllegalArgumentException("input matrix dimensions do not match");
    }

    public BitMatrix(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f49808p0 = i10;
        this.f49809q0 = i11;
        int i12 = (i10 + 31) / 32;
        this.f49810r0 = i12;
        this.f49811s0 = new int[i12 * i11];
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitMatrix m5297clone() {
        return new BitMatrix(this.f49808p0, this.f49809q0, this.f49810r0, (int[]) this.f49811s0.clone());
    }

    public String toString(String str, String str2) {
        return a(str, str2, RootService.LINE_BREAK);
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return a(str, str2, str3);
    }

    public static BitMatrix parse(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i10 = -1;
            int length = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (length < str.length()) {
                if (str.charAt(length) == '\n' || str.charAt(length) == '\r') {
                    if (i11 > i12) {
                        if (i10 == -1) {
                            i10 = i11 - i12;
                        } else if (i11 - i12 != i10) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i13++;
                        i12 = i11;
                    }
                    length++;
                } else {
                    if (str.substring(length, str2.length() + length).equals(str2)) {
                        length += str2.length();
                        zArr[i11] = true;
                    } else if (str.substring(length, str3.length() + length).equals(str3)) {
                        length += str3.length();
                        zArr[i11] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(length));
                    }
                    i11++;
                }
            }
            if (i11 > i12) {
                if (i10 == -1) {
                    i10 = i11 - i12;
                } else if (i11 - i12 != i10) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i13++;
            }
            BitMatrix bitMatrix = new BitMatrix(i10, i13);
            for (int i14 = 0; i14 < i11; i14++) {
                if (zArr[i14]) {
                    bitMatrix.set(i14 % i10, i14 / i10);
                }
            }
            return bitMatrix;
        }
        throw new IllegalArgumentException();
    }

    public BitMatrix(int i10, int i11, int i12, int[] iArr) {
        this.f49808p0 = i10;
        this.f49809q0 = i11;
        this.f49810r0 = i12;
        this.f49811s0 = iArr;
    }
}
