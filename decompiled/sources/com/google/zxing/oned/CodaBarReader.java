package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class CodaBarReader extends OneDReader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f49906d = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f49907e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f49908f = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f49909a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f49910b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49911c = 0;

    public static boolean b(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int c(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f49911c) {
            return -1;
        }
        int[] iArr = this.f49910b;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f49907e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i11;
        int[] iArr;
        Arrays.fill(this.f49910b, 0);
        this.f49911c = 0;
        int nextUnset = bitArray.getNextUnset(0);
        int size = bitArray.getSize();
        if (nextUnset >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i12 = 0;
        boolean z10 = true;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z10) {
                i12++;
            } else {
                int[] iArr2 = this.f49910b;
                int i13 = this.f49911c;
                iArr2[i13] = i12;
                int i14 = i13 + 1;
                this.f49911c = i14;
                if (i14 >= iArr2.length) {
                    int[] iArr3 = new int[i14 << 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i14);
                    this.f49910b = iArr3;
                }
                z10 = !z10;
                i12 = 1;
            }
            nextUnset++;
        }
        int[] iArr4 = this.f49910b;
        int i15 = this.f49911c;
        iArr4[i15] = i12;
        int i16 = i15 + 1;
        this.f49911c = i16;
        if (i16 >= iArr4.length) {
            int[] iArr5 = new int[i16 << 1];
            System.arraycopy(iArr4, 0, iArr5, 0, i16);
            this.f49910b = iArr5;
        }
        int i17 = 1;
        while (i17 < this.f49911c) {
            int iC = c(i17);
            if (iC != -1) {
                char[] cArr = f49906d;
                char c10 = cArr[iC];
                char[] cArr2 = f49908f;
                if (b(cArr2, c10)) {
                    int i18 = 0;
                    for (int i19 = i17; i19 < i17 + 7; i19++) {
                        i18 += this.f49910b[i19];
                    }
                    if (i17 == 1 || this.f49910b[i17 - 1] >= i18 / 2) {
                        StringBuilder sb2 = this.f49909a;
                        sb2.setLength(0);
                        int i20 = i17;
                        while (true) {
                            int iC2 = c(i20);
                            if (iC2 == -1) {
                                throw NotFoundException.getNotFoundInstance();
                            }
                            sb2.append((char) iC2);
                            i11 = i20 + 8;
                            if ((sb2.length() > 1 && b(cArr2, cArr[iC2])) || i11 >= this.f49911c) {
                                break;
                            }
                            i20 = i11;
                        }
                        int i21 = i20 + 7;
                        int i22 = this.f49910b[i21];
                        int i23 = 0;
                        for (int i24 = -8; i24 < -1; i24++) {
                            i23 += this.f49910b[i11 + i24];
                        }
                        if (i11 < this.f49911c && i22 < i23 / 2) {
                            throw NotFoundException.getNotFoundInstance();
                        }
                        int[] iArr6 = {0, 0, 0, 0};
                        int[] iArr7 = {0, 0, 0, 0};
                        int length = sb2.length() - 1;
                        int i25 = i17;
                        int i26 = 0;
                        while (true) {
                            char cCharAt = sb2.charAt(i26);
                            iArr = f49907e;
                            int i27 = iArr[cCharAt];
                            for (int i28 = 6; i28 >= 0; i28--) {
                                int i29 = (i28 & 1) + ((i27 & 1) << 1);
                                iArr6[i29] = iArr6[i29] + this.f49910b[i25 + i28];
                                iArr7[i29] = iArr7[i29] + 1;
                                i27 >>= 1;
                            }
                            if (i26 >= length) {
                                break;
                            }
                            i25 += 8;
                            i26++;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i30 = 0;
                        for (int i31 = 2; i30 < i31; i31 = 2) {
                            fArr2[i30] = 0.0f;
                            int i32 = i30 + 2;
                            float f6 = iArr6[i30] / iArr7[i30];
                            float f10 = iArr6[i32];
                            int[] iArr8 = iArr6;
                            float f11 = iArr7[i32];
                            float f12 = ((f10 / f11) + f6) / 2.0f;
                            fArr2[i32] = f12;
                            fArr[i30] = f12;
                            fArr[i32] = ((f10 * 2.0f) + 1.5f) / f11;
                            i30++;
                            iArr6 = iArr8;
                        }
                        int i33 = i17;
                        int i34 = 0;
                        loop8: while (true) {
                            int i35 = iArr[sb2.charAt(i34)];
                            for (int i36 = 6; i36 >= 0; i36--) {
                                int i37 = (i36 & 1) + ((i35 & 1) << 1);
                                float f13 = this.f49910b[i33 + i36];
                                if (f13 < fArr2[i37] || f13 > fArr[i37]) {
                                    break loop8;
                                }
                                i35 >>= 1;
                            }
                            if (i34 >= length) {
                                for (int i38 = 0; i38 < sb2.length(); i38++) {
                                    sb2.setCharAt(i38, cArr[sb2.charAt(i38)]);
                                }
                                if (!b(cArr2, sb2.charAt(0))) {
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                if (!b(cArr2, sb2.charAt(sb2.length() - 1))) {
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                if (sb2.length() <= 3) {
                                    throw NotFoundException.getNotFoundInstance();
                                }
                                if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
                                    sb2.deleteCharAt(sb2.length() - 1);
                                    sb2.deleteCharAt(0);
                                }
                                int i39 = 0;
                                for (int i40 = 0; i40 < i17; i40++) {
                                    i39 += this.f49910b[i40];
                                }
                                float f14 = i39;
                                while (i17 < i21) {
                                    i39 += this.f49910b[i17];
                                    i17++;
                                }
                                float f15 = i10;
                                return new Result(sb2.toString(), null, new ResultPoint[]{new ResultPoint(f14, f15), new ResultPoint(i39, f15)}, BarcodeFormat.CODABAR);
                            }
                            i33 += 8;
                            i34++;
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
            }
            i17 += 2;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
