package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Detector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f50003a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f50004b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f50005c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f50006d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(boolean z10, BitMatrix bitMatrix) {
        int y7;
        float y10;
        ArrayList<ResultPoint[]> arrayList = new ArrayList();
        int iMax = 0;
        int x4 = 0;
        loop0: while (true) {
            int i10 = x4;
            while (iMax < bitMatrix.getHeight()) {
                int height = bitMatrix.getHeight();
                int width = bitMatrix.getWidth();
                ResultPoint[] resultPointArr = new ResultPoint[8];
                ResultPoint[] resultPointArrC = c(bitMatrix, height, width, iMax, x4, f50005c);
                int[] iArr = f50003a;
                for (int i11 = 0; i11 < 4; i11++) {
                    resultPointArr[iArr[i11]] = resultPointArrC[i11];
                }
                ResultPoint resultPoint = resultPointArr[4];
                if (resultPoint != null) {
                    x4 = (int) resultPoint.getX();
                    y7 = (int) resultPointArr[4].getY();
                } else {
                    y7 = iMax;
                }
                ResultPoint[] resultPointArrC2 = c(bitMatrix, height, width, y7, x4, f50006d);
                int[] iArr2 = f50004b;
                for (int i12 = 0; i12 < 4; i12++) {
                    resultPointArr[iArr2[i12]] = resultPointArrC2[i12];
                }
                if (resultPointArr[0] == null && resultPointArr[3] == null) {
                    if (i10 == 0) {
                        break;
                    }
                    for (ResultPoint[] resultPointArr2 : arrayList) {
                        ResultPoint resultPoint2 = resultPointArr2[1];
                        if (resultPoint2 != null) {
                            iMax = (int) Math.max(iMax, resultPoint2.getY());
                        }
                        ResultPoint resultPoint3 = resultPointArr2[3];
                        if (resultPoint3 != null) {
                            iMax = Math.max(iMax, (int) resultPoint3.getY());
                        }
                    }
                    iMax += 5;
                    x4 = 0;
                } else {
                    arrayList.add(resultPointArr);
                    if (!z10) {
                        break loop0;
                    }
                    ResultPoint resultPoint4 = resultPointArr[2];
                    if (resultPoint4 != null) {
                        x4 = (int) resultPoint4.getX();
                        y10 = resultPointArr[2].getY();
                    } else {
                        x4 = (int) resultPointArr[4].getX();
                        y10 = resultPointArr[4].getY();
                    }
                    iMax = (int) y10;
                    i10 = 1;
                }
            }
            break loop0;
        }
        return arrayList;
    }

    public static int[] b(BitMatrix bitMatrix, int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i13 = 0;
        while (bitMatrix.get(i10, i11) && i10 > 0) {
            int i14 = i13 + 1;
            if (i13 >= 3) {
                break;
            }
            i10--;
            i13 = i14;
        }
        int length = iArr.length;
        int i15 = i10;
        int i16 = 0;
        boolean z10 = false;
        while (i10 < i12) {
            if (bitMatrix.get(i10, i11) != z10) {
                iArr2[i16] = iArr2[i16] + 1;
            } else {
                if (i16 != length - 1) {
                    i16++;
                } else {
                    if (d(iArr2, iArr) < 0.42f) {
                        return new int[]{i15, i10};
                    }
                    i15 += iArr2[0] + iArr2[1];
                    int i17 = i16 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i17);
                    iArr2[i17] = 0;
                    iArr2[i16] = 0;
                    i16--;
                }
                iArr2[i16] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i16 != length - 1 || d(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i15, i10 - 1};
    }

    public static ResultPoint[] c(BitMatrix bitMatrix, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = new int[iArr.length];
        int i14 = i12;
        while (true) {
            if (i14 >= i10) {
                z10 = false;
                break;
            }
            int[] iArrB = b(bitMatrix, i13, i14, i11, iArr, iArr2);
            if (iArrB != null) {
                int i15 = i14;
                int[] iArr3 = iArrB;
                while (i15 > 0) {
                    int i16 = i15 - 1;
                    int[] iArrB2 = b(bitMatrix, i13, i16, i11, iArr, iArr2);
                    if (iArrB2 == null) {
                        break;
                    }
                    iArr3 = iArrB2;
                    i15 = i16;
                }
                float f6 = i15;
                resultPointArr[0] = new ResultPoint(iArr3[0], f6);
                resultPointArr[1] = new ResultPoint(iArr3[1], f6);
                z10 = true;
                i14 = i15;
                break;
            }
            i14 += 5;
        }
        int i17 = i14 + 1;
        if (z10) {
            int[] iArr4 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i18 = i17;
            int i19 = 0;
            while (i18 < i10) {
                int[] iArrB3 = b(bitMatrix, iArr4[0], i18, i11, iArr, iArr2);
                if (iArrB3 != null && Math.abs(iArr4[0] - iArrB3[0]) < 5 && Math.abs(iArr4[1] - iArrB3[1]) < 5) {
                    iArr4 = iArrB3;
                    i19 = 0;
                } else {
                    if (i19 > 25) {
                        break;
                    }
                    i19++;
                }
                i18++;
            }
            i17 = i18 - (i19 + 1);
            float f10 = i17;
            resultPointArr[2] = new ResultPoint(iArr4[0], f10);
            resultPointArr[3] = new ResultPoint(iArr4[1], f10);
        }
        if (i17 - i14 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f6 = i10;
        float f10 = f6 / i11;
        float f11 = 0.8f * f10;
        float f12 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f13 = iArr2[i13] * f10;
            float f14 = i14;
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f6;
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z10) throws NotFoundException {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        ArrayList arrayListA = a(z10, blackMatrix);
        if (arrayListA.isEmpty()) {
            blackMatrix = blackMatrix.m5297clone();
            blackMatrix.rotate180();
            arrayListA = a(z10, blackMatrix);
        }
        return new PDF417DetectorResult(blackMatrix, arrayListA);
    }
}
