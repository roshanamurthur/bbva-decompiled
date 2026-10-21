package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class ITFReader extends OneDReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f49930b = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f49931c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f49932d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f49933e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49934a = -1;

    public static int b(int[] iArr) throws NotFoundException {
        float f6 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < 20; i11++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, f49933e[i11], 0.5f);
            if (fPatternMatchVariance < f6) {
                i10 = i11;
                f6 = fPatternMatchVariance;
            } else if (fPatternMatchVariance == f6) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] c(BitArray bitArray, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < size) {
            if (bitArray.get(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i10};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void d(int i10, BitArray bitArray) throws NotFoundException {
        int i11 = this.f49934a * 10;
        if (i11 >= i10) {
            i11 = i10;
        }
        for (int i12 = i10 - 1; i11 > 0 && i12 >= 0 && !bitArray.get(i12); i12--) {
            i11--;
        }
        if (i11 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        int[] iArrC;
        int[] iArr;
        int length;
        int length2;
        int i11;
        int i12;
        boolean z10;
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet == size) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] iArrC2 = c(bitArray, nextSet, f49931c);
        int i13 = iArrC2[1];
        int i14 = iArrC2[0];
        this.f49934a = (i13 - i14) / 4;
        d(i14, bitArray);
        int[][] iArr2 = f49932d;
        bitArray.reverse();
        try {
            int size2 = bitArray.getSize();
            int nextSet2 = bitArray.getNextSet(0);
            if (nextSet2 == size2) {
                throw NotFoundException.getNotFoundInstance();
            }
            try {
                iArrC = c(bitArray, nextSet2, iArr2[0]);
                while (true) {
                    if (i11 >= length2) {
                        z10 = false;
                        break;
                    }
                    int i15 = iArr[i11];
                    if (length == i15) {
                        z10 = true;
                        break;
                    }
                    if (i15 > i12) {
                        i12 = i15;
                    }
                    i11++;
                }
            } catch (NotFoundException unused) {
                iArrC = c(bitArray, nextSet2, iArr2[1]);
            }
            d(iArrC[0], bitArray);
            int i16 = iArrC[0];
            iArrC[0] = bitArray.getSize() - iArrC[1];
            iArrC[1] = bitArray.getSize() - i16;
            bitArray.reverse();
            StringBuilder sb2 = new StringBuilder(20);
            int i17 = iArrC2[1];
            int i18 = iArrC[0];
            int[] iArr3 = new int[10];
            int[] iArr4 = new int[5];
            int[] iArr5 = new int[5];
            while (i17 < i18) {
                OneDReader.recordPattern(bitArray, i17, iArr3);
                for (int i19 = 0; i19 < 5; i19++) {
                    int i20 = i19 * 2;
                    iArr4[i19] = iArr3[i20];
                    iArr5[i19] = iArr3[i20 + 1];
                }
                sb2.append((char) (b(iArr4) + 48));
                sb2.append((char) (b(iArr5) + 48));
                for (int i21 = 0; i21 < 10; i21++) {
                    i17 += iArr3[i21];
                }
            }
            String string = sb2.toString();
            iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
            if (iArr == null) {
                iArr = f49930b;
            }
            length = string.length();
            length2 = iArr.length;
            i11 = 0;
            i12 = 0;
            if ((z10 || length <= i12) && !z10) {
                throw FormatException.getFormatInstance();
            }
            float f6 = i10;
            return new Result(string, null, new ResultPoint[]{new ResultPoint(iArrC2[1], f6), new ResultPoint(iArrC[0], f6)}, BarcodeFormat.ITF);
        } catch (Throwable th2) {
            bitArray.reverse();
            throw th2;
        }
    }
}
