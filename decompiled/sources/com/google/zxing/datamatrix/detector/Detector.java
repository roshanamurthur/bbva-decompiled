package com.google.zxing.datamatrix.detector;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Detector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f49878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WhiteRectangleDetector f49879b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ResultPoint f49880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResultPoint f49881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49882c;

        public a(ResultPoint resultPoint, ResultPoint resultPoint2, int i10) {
            this.f49880a = resultPoint;
            this.f49881b = resultPoint2;
            this.f49882c = i10;
        }

        public final String toString() {
            return this.f49880a + "/" + this.f49881b + JsonPointer.SEPARATOR + this.f49882c;
        }
    }

    public static final class b implements Serializable, Comparator<a> {
        @Override // java.util.Comparator
        public final int compare(a aVar, a aVar2) {
            return aVar.f49882c - aVar2.f49882c;
        }
    }

    public Detector(BitMatrix bitMatrix) throws NotFoundException {
        this.f49878a = bitMatrix;
        this.f49879b = new WhiteRectangleDetector(bitMatrix);
    }

    public static int a(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.round(ResultPoint.distance(resultPoint, resultPoint2));
    }

    public static void b(HashMap map, ResultPoint resultPoint) {
        Integer num = (Integer) map.get(resultPoint);
        map.put(resultPoint, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public static BitMatrix d(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i10, int i11) throws NotFoundException {
        float f6 = i10 - 0.5f;
        float f10 = i11 - 0.5f;
        return GridSampler.getInstance().sampleGrid(bitMatrix, i10, i11, 0.5f, 0.5f, f6, 0.5f, f6, f10, 0.5f, f10, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    public final boolean c(ResultPoint resultPoint) {
        if (resultPoint.getX() < 0.0f) {
            return false;
        }
        float x4 = resultPoint.getX();
        BitMatrix bitMatrix = this.f49878a;
        return x4 < ((float) bitMatrix.getWidth()) && resultPoint.getY() > 0.0f && resultPoint.getY() < ((float) bitMatrix.getHeight());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x023a  */
    public DetectorResult detect() throws NotFoundException {
        BitMatrix bitMatrixD;
        ResultPoint[] resultPointArrDetect = this.f49879b.detect();
        ResultPoint resultPoint = resultPointArrDetect[0];
        ResultPoint resultPoint2 = resultPointArrDetect[1];
        ResultPoint resultPoint3 = resultPointArrDetect[2];
        ResultPoint resultPoint4 = resultPointArrDetect[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(e(resultPoint, resultPoint2));
        arrayList.add(e(resultPoint, resultPoint3));
        arrayList.add(e(resultPoint2, resultPoint4));
        arrayList.add(e(resultPoint3, resultPoint4));
        Collections.sort(arrayList, new b());
        a aVar = (a) arrayList.get(0);
        a aVar2 = (a) arrayList.get(1);
        HashMap map = new HashMap();
        b(map, aVar.f49880a);
        b(map, aVar.f49881b);
        b(map, aVar2.f49880a);
        b(map, aVar2.f49881b);
        ResultPoint resultPoint5 = null;
        ResultPoint resultPoint6 = null;
        ResultPoint resultPoint7 = null;
        for (Map.Entry entry : map.entrySet()) {
            ResultPoint resultPoint8 = (ResultPoint) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                resultPoint6 = resultPoint8;
            } else if (resultPoint5 == null) {
                resultPoint5 = resultPoint8;
            } else {
                resultPoint7 = resultPoint8;
            }
        }
        if (resultPoint5 == null || resultPoint6 == null || resultPoint7 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint[] resultPointArr = {resultPoint5, resultPoint6, resultPoint7};
        ResultPoint.orderBestPatterns(resultPointArr);
        ResultPoint resultPoint9 = resultPointArr[0];
        ResultPoint resultPoint10 = resultPointArr[1];
        ResultPoint resultPoint11 = resultPointArr[2];
        if (map.containsKey(resultPoint)) {
            resultPoint = map.containsKey(resultPoint2) ? !map.containsKey(resultPoint3) ? resultPoint3 : resultPoint4 : resultPoint2;
        }
        a aVarE = e(resultPoint11, resultPoint);
        a aVarE2 = e(resultPoint9, resultPoint);
        int i10 = aVarE.f49882c;
        if ((i10 & 1) == 1) {
            i10++;
        }
        int i11 = i10 + 2;
        int i12 = aVarE2.f49882c;
        if ((i12 & 1) == 1) {
            i12++;
        }
        int i13 = i12 + 2;
        if (i11 * 4 >= i13 * 7 || i13 * 4 >= i11 * 7) {
            float fA = a(resultPoint10, resultPoint9) / i11;
            float fA2 = a(resultPoint11, resultPoint);
            ResultPoint resultPoint12 = new ResultPoint((((resultPoint.getX() - resultPoint11.getX()) / fA2) * fA) + resultPoint.getX(), (fA * ((resultPoint.getY() - resultPoint11.getY()) / fA2)) + resultPoint.getY());
            float fA3 = a(resultPoint10, resultPoint11) / i13;
            float fA4 = a(resultPoint9, resultPoint);
            ResultPoint resultPoint13 = new ResultPoint((((resultPoint.getX() - resultPoint9.getX()) / fA4) * fA3) + resultPoint.getX(), (fA3 * ((resultPoint.getY() - resultPoint9.getY()) / fA4)) + resultPoint.getY());
            if (c(resultPoint12)) {
                if (c(resultPoint13) && Math.abs(i13 - e(resultPoint9, resultPoint12).f49882c) + Math.abs(i11 - e(resultPoint11, resultPoint12).f49882c) > Math.abs(i13 - e(resultPoint9, resultPoint13).f49882c) + Math.abs(i11 - e(resultPoint11, resultPoint13).f49882c)) {
                    resultPoint12 = resultPoint13;
                }
            } else if (c(resultPoint13)) {
                resultPoint12 = resultPoint13;
            } else {
                resultPoint12 = null;
            }
            if (resultPoint12 != null) {
                resultPoint = resultPoint12;
            }
            a aVarE3 = e(resultPoint11, resultPoint);
            a aVarE4 = e(resultPoint9, resultPoint);
            int i14 = aVarE3.f49882c;
            if ((i14 & 1) == 1) {
                i14++;
            }
            int i15 = i14;
            int i16 = aVarE4.f49882c;
            if ((i16 & 1) == 1) {
                i16++;
            }
            bitMatrixD = d(this.f49878a, resultPoint11, resultPoint10, resultPoint9, resultPoint, i15, i16);
        } else {
            float fMin = Math.min(i13, i11);
            float fA5 = a(resultPoint10, resultPoint9) / fMin;
            float fA6 = a(resultPoint11, resultPoint);
            ResultPoint resultPoint14 = new ResultPoint((((resultPoint.getX() - resultPoint11.getX()) / fA6) * fA5) + resultPoint.getX(), (fA5 * ((resultPoint.getY() - resultPoint11.getY()) / fA6)) + resultPoint.getY());
            float fA7 = a(resultPoint10, resultPoint11) / fMin;
            float fA8 = a(resultPoint9, resultPoint);
            ResultPoint resultPoint15 = new ResultPoint((((resultPoint.getX() - resultPoint9.getX()) / fA8) * fA7) + resultPoint.getX(), (fA7 * ((resultPoint.getY() - resultPoint9.getY()) / fA8)) + resultPoint.getY());
            if (c(resultPoint14)) {
                if (!c(resultPoint15) || Math.abs(e(resultPoint11, resultPoint14).f49882c - e(resultPoint9, resultPoint14).f49882c) <= Math.abs(e(resultPoint11, resultPoint15).f49882c - e(resultPoint9, resultPoint15).f49882c)) {
                    resultPoint15 = resultPoint14;
                }
            } else if (!c(resultPoint15)) {
                resultPoint15 = null;
            }
            if (resultPoint15 != null) {
                resultPoint = resultPoint15;
            }
            int iMax = Math.max(e(resultPoint11, resultPoint).f49882c, e(resultPoint9, resultPoint).f49882c);
            int i17 = iMax + 1;
            int i18 = (i17 & 1) == 1 ? iMax + 2 : i17;
            bitMatrixD = d(this.f49878a, resultPoint11, resultPoint10, resultPoint9, resultPoint, i18, i18);
        }
        return new DetectorResult(bitMatrixD, new ResultPoint[]{resultPoint11, resultPoint10, resultPoint9, resultPoint});
    }

    public final a e(ResultPoint resultPoint, ResultPoint resultPoint2) {
        int x4 = (int) resultPoint.getX();
        int y7 = (int) resultPoint.getY();
        int x6 = (int) resultPoint2.getX();
        int y10 = (int) resultPoint2.getY();
        int i10 = 0;
        boolean z10 = Math.abs(y10 - y7) > Math.abs(x6 - x4);
        if (z10) {
            y7 = x4;
            x4 = y7;
            y10 = x6;
            x6 = y10;
        }
        int iAbs = Math.abs(x6 - x4);
        int iAbs2 = Math.abs(y10 - y7);
        int i11 = (-iAbs) / 2;
        int i12 = y7 < y10 ? 1 : -1;
        int i13 = x4 >= x6 ? -1 : 1;
        int i14 = z10 ? y7 : x4;
        int i15 = z10 ? x4 : y7;
        BitMatrix bitMatrix = this.f49878a;
        boolean z11 = bitMatrix.get(i14, i15);
        while (x4 != x6) {
            boolean z12 = bitMatrix.get(z10 ? y7 : x4, z10 ? x4 : y7);
            if (z12 != z11) {
                i10++;
                z11 = z12;
            }
            i11 += iAbs2;
            if (i11 > 0) {
                if (y7 == y10) {
                    break;
                }
                y7 += i12;
                i11 -= iAbs;
            }
            x4 += i13;
        }
        return new a(resultPoint, resultPoint2, i10);
    }
}
