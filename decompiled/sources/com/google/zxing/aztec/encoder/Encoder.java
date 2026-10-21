package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

/* JADX INFO: loaded from: classes10.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f49696a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void a(BitMatrix bitMatrix, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    bitMatrix.set(i14, i13);
                    bitMatrix.set(i14, i15);
                    bitMatrix.set(i13, i14);
                    bitMatrix.set(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        bitMatrix.set(i16, i16);
        int i17 = i16 + 1;
        bitMatrix.set(i17, i16);
        bitMatrix.set(i16, i17);
        int i18 = i10 + i11;
        bitMatrix.set(i18, i16);
        bitMatrix.set(i18, i17);
        bitMatrix.set(i18, i18 - 1);
    }

    public static BitArray b(int i10, int i11, BitArray bitArray) {
        GenericGF genericGF;
        int size = bitArray.getSize() / i11;
        if (i11 == 4) {
            genericGF = GenericGF.AZTEC_PARAM;
        } else if (i11 == 6) {
            genericGF = GenericGF.AZTEC_DATA_6;
        } else if (i11 == 8) {
            genericGF = GenericGF.AZTEC_DATA_8;
        } else if (i11 == 10) {
            genericGF = GenericGF.AZTEC_DATA_10;
        } else {
            if (i11 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i11)));
            }
            genericGF = GenericGF.AZTEC_DATA_12;
        }
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(genericGF);
        int i12 = i10 / i11;
        int[] iArr = new int[i12];
        int size2 = bitArray.getSize() / i11;
        for (int i13 = 0; i13 < size2; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 |= bitArray.get((i13 * i11) + i15) ? 1 << ((i11 - i15) - 1) : 0;
            }
            iArr[i13] = i14;
        }
        reedSolomonEncoder.encode(iArr, i12 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i10 % i11);
        for (int i16 = 0; i16 < i12; i16++) {
            bitArray2.appendBits(iArr[i16], i11);
        }
        return bitArray2;
    }

    public static BitArray c(int i10, BitArray bitArray) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < size) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= size || bitArray.get(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 == i11) {
                bitArray2.appendBits(i16, i10);
            } else {
                if (i16 == 0) {
                    bitArray2.appendBits(i13 | 1, i10);
                } else {
                    bitArray2.appendBits(i13, i10);
                }
                i12 += i10;
            }
            i12--;
            i12 += i10;
        }
        return bitArray2;
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AztecCode encode(byte[] bArr, int i10, int i11) {
        int i12;
        BitArray bitArrayC;
        int i13;
        boolean z10;
        int iAbs;
        BitArray bitArrayB;
        int i14;
        boolean z11;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr).encode();
        int size = ((bitArrayEncode.getSize() * i10) / 100) + 11;
        int size2 = bitArrayEncode.getSize() + size;
        int[] iArr = f49696a;
        int i15 = 32;
        int i16 = 0;
        int i17 = 1;
        if (i11 != 0) {
            z11 = i11 < 0;
            iAbs = Math.abs(i11);
            if (iAbs > (z11 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
            }
            i12 = ((z11 ? 88 : 112) + (iAbs << 4)) * iAbs;
            i13 = iArr[iAbs];
            int i18 = i12 - (i12 % i13);
            bitArrayC = c(i13, bitArrayEncode);
            z10 = z11;
            if (bitArrayC.getSize() + size > i18) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z11 && bitArrayC.getSize() > (i13 << 6)) {
                z10 = z11;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            BitArray bitArrayC2 = null;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (i19 > i15) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                int i21 = i19 <= 3 ? i17 : i16;
                int i22 = i21 != 0 ? i19 + 1 : i19;
                i12 = ((i21 != 0 ? 88 : 112) + (i22 << 4)) * i22;
                if (size2 <= i12) {
                    if (bitArrayC2 == null || i20 != iArr[i22]) {
                        int i23 = iArr[i22];
                        bitArrayC2 = c(i23, bitArrayEncode);
                        i20 = i23;
                    }
                    int i24 = i12 - (i12 % i20);
                    if ((i21 == 0 || bitArrayC2.getSize() <= (i20 << 6)) && bitArrayC2.getSize() + size <= i24) {
                        bitArrayC = bitArrayC2;
                        i13 = i20;
                        z10 = i21;
                        iAbs = i22;
                        break;
                    }
                }
                i19++;
                i17 = i17;
                i15 = 32;
                i16 = 0;
            }
        }
        z10 = z11;
        BitArray bitArrayB2 = b(i12, i13, bitArrayC);
        int size3 = bitArrayC.getSize() / i13;
        BitArray bitArray = new BitArray();
        int i25 = 2;
        if (z10 != 0) {
            bitArray.appendBits(iAbs - 1, 2);
            bitArray.appendBits(size3 - 1, 6);
            bitArrayB = b(28, 4, bitArray);
        } else {
            bitArray.appendBits(iAbs - 1, 5);
            bitArray.appendBits(size3 - 1, 11);
            bitArrayB = b(40, 4, bitArray);
        }
        int i26 = (z10 == 0 ? 14 : 11) + (iAbs << 2);
        int[] iArr2 = new int[i26];
        if (z10 != 0) {
            for (int i27 = 0; i27 < i26; i27++) {
                iArr2[i27] = i27;
            }
            i14 = i26;
        } else {
            int i28 = i26 / 2;
            i14 = (((i28 - 1) / 15) * 2) + i26 + 1;
            int i29 = i14 / 2;
            for (int i30 = 0; i30 < i28; i30++) {
                int i31 = (i30 / 15) + i30;
                iArr2[(i28 - i30) - i17] = (i29 - i31) - 1;
                iArr2[i28 + i30] = i31 + i29 + i17;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i14);
        int i32 = 0;
        int i33 = 0;
        while (i32 < iAbs) {
            int i34 = ((iAbs - i32) << i25) + (z10 != 0 ? 9 : 12);
            int i35 = 0;
            while (i35 < i34) {
                int i36 = i35 << 1;
                int i37 = 0;
                while (i37 < i25) {
                    if (bitArrayB2.get(i33 + i36 + i37)) {
                        int i38 = i32 << 1;
                        bitMatrix.set(iArr2[i38 + i37], iArr2[i38 + i35]);
                    }
                    if (bitArrayB2.get((i34 << 1) + i33 + i36 + i37)) {
                        int i39 = i32 << 1;
                        bitMatrix.set(iArr2[i39 + i35], iArr2[((i26 - 1) - i39) - i37]);
                    }
                    if (bitArrayB2.get((i34 << 2) + i33 + i36 + i37)) {
                        int i40 = (i26 - 1) - (i32 << 1);
                        bitMatrix.set(iArr2[i40 - i37], iArr2[i40 - i35]);
                    }
                    if (bitArrayB2.get((i34 * 6) + i33 + i36 + i37)) {
                        int i41 = i32 << 1;
                        bitMatrix.set(iArr2[((i26 - 1) - i41) - i35], iArr2[i41 + i37]);
                    }
                    i37++;
                    i25 = 2;
                }
                i35++;
                i25 = 2;
            }
            i33 += i34 << 3;
            i32++;
            i25 = 2;
        }
        int i42 = i14 / 2;
        if (z10 != 0) {
            for (int i43 = 0; i43 < 7; i43++) {
                int i44 = (i42 - 3) + i43;
                if (bitArrayB.get(i43)) {
                    bitMatrix.set(i44, i42 - 5);
                }
                if (bitArrayB.get(i43 + 7)) {
                    bitMatrix.set(i42 + 5, i44);
                }
                if (bitArrayB.get(20 - i43)) {
                    bitMatrix.set(i44, i42 + 5);
                }
                if (bitArrayB.get(27 - i43)) {
                    bitMatrix.set(i42 - 5, i44);
                }
            }
        } else {
            for (int i45 = 0; i45 < 10; i45++) {
                int i46 = (i45 / 5) + (i42 - 5) + i45;
                if (bitArrayB.get(i45)) {
                    bitMatrix.set(i46, i42 - 7);
                }
                if (bitArrayB.get(i45 + 10)) {
                    bitMatrix.set(i42 + 7, i46);
                }
                if (bitArrayB.get(29 - i45)) {
                    bitMatrix.set(i46, i42 + 7);
                }
                if (bitArrayB.get(39 - i45)) {
                    bitMatrix.set(i42 - 7, i46);
                }
            }
        }
        if (z10 != 0) {
            a(bitMatrix, i42, 5);
        } else {
            a(bitMatrix, i42, 7);
            int i47 = 0;
            int i48 = 0;
            while (i47 < (i26 / 2) - 1) {
                for (int i49 = i42 & 1; i49 < i14; i49 += 2) {
                    int i50 = i42 - i48;
                    bitMatrix.set(i50, i49);
                    int i51 = i42 + i48;
                    bitMatrix.set(i51, i49);
                    bitMatrix.set(i49, i50);
                    bitMatrix.set(i49, i51);
                }
                i47 += 15;
                i48 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z10);
        aztecCode.setSize(i14);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }
}
