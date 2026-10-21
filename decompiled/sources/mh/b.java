package mh;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import com.google.zxing.qrcode.encoder.QRCode;

/* JADX INFO: compiled from: MatrixUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f83474a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[][] f83475b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f83476c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f83477d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Code duplicated, block: B:89:0x0244  */
    public static void a(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, int i10, ByteMatrix byteMatrix) throws WriterException {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        byteMatrix.clear((byte) -1);
        int i14 = 0;
        int length = f83474a[0].length;
        d(0, 0, byteMatrix);
        d(byteMatrix.getWidth() - length, 0, byteMatrix);
        d(0, byteMatrix.getWidth() - length, byteMatrix);
        c(0, 7, byteMatrix);
        c(byteMatrix.getWidth() - 8, 7, byteMatrix);
        c(0, byteMatrix.getWidth() - 8, byteMatrix);
        e(7, 0, byteMatrix);
        e(byteMatrix.getHeight() - 8, 0, byteMatrix);
        e(7, byteMatrix.getHeight() - 7, byteMatrix);
        if (byteMatrix.get(8, byteMatrix.getHeight() - 8) == 0) {
            throw new WriterException();
        }
        byteMatrix.set(8, byteMatrix.getHeight() - 8, 1);
        if (version.getVersionNumber() >= 2) {
            int[] iArr = f83476c[version.getVersionNumber() - 1];
            int length2 = iArr.length;
            int i15 = 0;
            while (i15 < length2) {
                int i16 = iArr[i15];
                if (i16 >= 0) {
                    int length3 = iArr.length;
                    int i17 = i14;
                    while (i17 < length3) {
                        int i18 = iArr[i17];
                        if (i18 >= 0 && f(byteMatrix.get(i18, i16))) {
                            int i19 = i18 - 2;
                            int i20 = i16 - 2;
                            int i21 = i14;
                            while (i21 < 5) {
                                int[] iArr2 = f83475b[i21];
                                for (int i22 = i14; i22 < 5; i22++) {
                                    byteMatrix.set(i19 + i22, i20 + i21, iArr2[i22]);
                                }
                                i21++;
                                i14 = 0;
                            }
                        }
                        i17++;
                        i14 = 0;
                    }
                }
                i15++;
                i14 = 0;
            }
        }
        int i23 = 8;
        while (i23 < byteMatrix.getWidth() - 8) {
            int i24 = i23 + 1;
            int i25 = i24 % 2;
            if (f(byteMatrix.get(i23, 6))) {
                byteMatrix.set(i23, 6, i25);
            }
            if (f(byteMatrix.get(6, i23))) {
                byteMatrix.set(6, i23, i25);
            }
            i23 = i24;
        }
        BitArray bitArray2 = new BitArray();
        if (!QRCode.isValidMaskPattern(i10)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (errorCorrectionLevel.getBits() << 3) | i10;
        bitArray2.appendBits(bits, 5);
        bitArray2.appendBits(b(bits, 1335), 10);
        BitArray bitArray3 = new BitArray();
        bitArray3.appendBits(21522, 15);
        bitArray2.xor(bitArray3);
        if (bitArray2.getSize() != 15) {
            throw new WriterException("should not happen but we got: " + bitArray2.getSize());
        }
        for (int i26 = 0; i26 < bitArray2.getSize(); i26++) {
            boolean z12 = bitArray2.get((bitArray2.getSize() - 1) - i26);
            int[] iArr3 = f83477d[i26];
            byteMatrix.set(iArr3[0], iArr3[1], z12);
            if (i26 < 8) {
                byteMatrix.set((byteMatrix.getWidth() - i26) - 1, 8, z12);
            } else {
                byteMatrix.set(8, (i26 - 8) + (byteMatrix.getHeight() - 7), z12);
            }
        }
        if (version.getVersionNumber() >= 7) {
            BitArray bitArray4 = new BitArray();
            bitArray4.appendBits(version.getVersionNumber(), 6);
            bitArray4.appendBits(b(version.getVersionNumber(), 7973), 12);
            if (bitArray4.getSize() != 18) {
                throw new WriterException("should not happen but we got: " + bitArray4.getSize());
            }
            int i27 = 17;
            for (int i28 = 0; i28 < 6; i28++) {
                for (int i29 = 0; i29 < 3; i29++) {
                    boolean z13 = bitArray4.get(i27);
                    i27--;
                    byteMatrix.set(i28, (byteMatrix.getHeight() - 11) + i29, z13);
                    byteMatrix.set((byteMatrix.getHeight() - 11) + i29, i28, z13);
                }
            }
        }
        int width = byteMatrix.getWidth() - 1;
        int height = byteMatrix.getHeight() - 1;
        int i30 = 0;
        int i31 = -1;
        while (width > 0) {
            if (width == 6) {
                width--;
            }
            while (height >= 0 && height < byteMatrix.getHeight()) {
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = width - i32;
                    if (f(byteMatrix.get(i33, height))) {
                        if (i30 < bitArray.getSize()) {
                            z10 = bitArray.get(i30);
                            i30++;
                        } else {
                            z10 = false;
                        }
                        if (i10 != -1) {
                            switch (i10) {
                                case 0:
                                    i11 = (height + i33) & 1;
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                case 1:
                                    i11 = height & 1;
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                case 2:
                                    i11 = i33 % 3;
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                case 3:
                                    i11 = (height + i33) % 3;
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                case 4:
                                    i11 = ((i33 / 3) + (height / 2)) & 1;
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                case 5:
                                    int i34 = height * i33;
                                    i11 = (i34 % 3) + (i34 & 1);
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                case 6:
                                    z11 = true;
                                    int i35 = height * i33;
                                    i12 = i35 & 1;
                                    i13 = i35 % 3;
                                    i11 = (i13 + i12) & 1;
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                case 7:
                                    i13 = (height * i33) % 3;
                                    z11 = true;
                                    i12 = (height + i33) & 1;
                                    i11 = (i13 + i12) & 1;
                                    if (i11 == 0) {
                                        z10 = !z10;
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i10)));
                            }
                        }
                        byteMatrix.set(i33, height, z10);
                    }
                }
                height += i31;
            }
            i31 = -i31;
            height += i31;
            width -= 2;
        }
        if (i30 == bitArray.getSize()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i30 + JsonPointer.SEPARATOR + bitArray.getSize());
    }

    public static int b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
        int i12 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i10 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i12) {
            iNumberOfLeadingZeros2 ^= i11 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i12);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void c(int i10, int i11, ByteMatrix byteMatrix) throws WriterException {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!f(byteMatrix.get(i13, i11))) {
                throw new WriterException();
            }
            byteMatrix.set(i13, i11, 0);
        }
    }

    public static void d(int i10, int i11, ByteMatrix byteMatrix) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f83474a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                byteMatrix.set(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void e(int i10, int i11, ByteMatrix byteMatrix) throws WriterException {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!f(byteMatrix.get(i10, i13))) {
                throw new WriterException();
            }
            byteMatrix.set(i10, i13, 0);
        }
    }

    public static boolean f(int i10) {
        return i10 == -1;
    }
}
