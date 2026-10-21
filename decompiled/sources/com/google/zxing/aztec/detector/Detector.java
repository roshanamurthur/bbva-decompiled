package com.google.zxing.aztec.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.GridSampler;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.common.detector.WhiteRectangleDetector;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public final class Detector {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f49682g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f49683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f49684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49688f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49690b;

        public a(int i10, int i11) {
            this.f49689a = i10;
            this.f49690b = i11;
        }

        public final ResultPoint a() {
            return new ResultPoint(this.f49689a, this.f49690b);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(this.f49689a);
            sb2.append(' ');
            return androidx.activity.a.d(sb2, this.f49690b, Typography.greater);
        }
    }

    public Detector(BitMatrix bitMatrix) {
        this.f49683a = bitMatrix;
    }

    public static ResultPoint[] a(ResultPoint[] resultPointArr, int i10, int i11) {
        float f6 = i11 / (i10 * 2.0f);
        float x4 = resultPointArr[0].getX() - resultPointArr[2].getX();
        float y7 = resultPointArr[0].getY() - resultPointArr[2].getY();
        float x6 = (resultPointArr[2].getX() + resultPointArr[0].getX()) / 2.0f;
        float y10 = (resultPointArr[2].getY() + resultPointArr[0].getY()) / 2.0f;
        float f10 = x4 * f6;
        float f11 = y7 * f6;
        ResultPoint resultPoint = new ResultPoint(x6 + f10, y10 + f11);
        ResultPoint resultPoint2 = new ResultPoint(x6 - f10, y10 - f11);
        float x7 = resultPointArr[1].getX() - resultPointArr[3].getX();
        float y11 = resultPointArr[1].getY() - resultPointArr[3].getY();
        float x10 = (resultPointArr[3].getX() + resultPointArr[1].getX()) / 2.0f;
        float y12 = (resultPointArr[3].getY() + resultPointArr[1].getY()) / 2.0f;
        float f12 = x7 * f6;
        float f13 = f6 * y11;
        return new ResultPoint[]{resultPoint, new ResultPoint(x10 + f12, y12 + f13), resultPoint2, new ResultPoint(x10 - f12, y12 - f13)};
    }

    public final int b(a aVar, a aVar2) {
        int i10 = aVar.f49689a;
        int i11 = aVar.f49690b;
        int i12 = aVar2.f49689a;
        int i13 = aVar2.f49690b;
        float fDistance = MathUtils.distance(i10, i11, i12, i13);
        float f6 = (i12 - i10) / fDistance;
        float f10 = (i13 - i11) / fDistance;
        float f11 = i10;
        float f12 = i11;
        BitMatrix bitMatrix = this.f49683a;
        boolean z10 = bitMatrix.get(i10, i11);
        int iCeil = (int) Math.ceil(fDistance);
        int i14 = 0;
        for (int i15 = 0; i15 < iCeil; i15++) {
            f11 += f6;
            f12 += f10;
            if (bitMatrix.get(MathUtils.round(f11), MathUtils.round(f12)) != z10) {
                i14++;
            }
        }
        float f13 = i14 / fDistance;
        if (f13 <= 0.1f || f13 >= 0.9f) {
            return (f13 <= 0.1f) == z10 ? 1 : -1;
        }
        return 0;
    }

    public final int c() {
        if (this.f49684b) {
            return (this.f49685c * 4) + 11;
        }
        int i10 = this.f49685c;
        if (i10 <= 4) {
            return (i10 * 4) + 15;
        }
        return ((((i10 - 4) / 8) + 1) * 2) + (i10 * 4) + 15;
    }

    public final a d(a aVar, boolean z10, int i10, int i11) {
        BitMatrix bitMatrix;
        int i12 = aVar.f49689a + i10;
        int i13 = aVar.f49690b;
        while (true) {
            i13 += i11;
            boolean zE = e(i12, i13);
            bitMatrix = this.f49683a;
            if (!zE || bitMatrix.get(i12, i13) != z10) {
                break;
            }
            i12 += i10;
        }
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        while (e(i14, i15) && bitMatrix.get(i14, i15) == z10) {
            i14 += i10;
        }
        int i16 = i14 - i10;
        while (e(i16, i15) && bitMatrix.get(i16, i15) == z10) {
            i15 += i11;
        }
        return new a(i16, i15 - i11);
    }

    public AztecDetectorResult detect() throws NotFoundException {
        return detect(false);
    }

    public final boolean e(int i10, int i11) {
        if (i10 < 0) {
            return false;
        }
        BitMatrix bitMatrix = this.f49683a;
        return i10 < bitMatrix.getWidth() && i11 > 0 && i11 < bitMatrix.getHeight();
    }

    public final boolean f(ResultPoint resultPoint) {
        return e(MathUtils.round(resultPoint.getX()), MathUtils.round(resultPoint.getY()));
    }

    public final int g(ResultPoint resultPoint, ResultPoint resultPoint2, int i10) {
        float fDistance = MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
        float f6 = fDistance / i10;
        float x4 = resultPoint.getX();
        float y7 = resultPoint.getY();
        float x6 = ((resultPoint2.getX() - resultPoint.getX()) * f6) / fDistance;
        float y10 = ((resultPoint2.getY() - resultPoint.getY()) * f6) / fDistance;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f10 = i12;
            if (this.f49683a.get(MathUtils.round((f10 * x6) + x4), MathUtils.round((f10 * y10) + y7))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public AztecDetectorResult detect(boolean z10) throws NotFoundException {
        ResultPoint resultPointA;
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        int iRound;
        int iRound2;
        ResultPoint resultPointA2;
        ResultPoint resultPoint4;
        ResultPoint resultPoint5;
        ResultPoint resultPoint6;
        a aVar;
        boolean z11;
        a aVar2;
        a aVar3;
        a aVar4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        int i16;
        BitMatrix bitMatrix = this.f49683a;
        int i17 = -1;
        int i18 = 2;
        int i19 = 1;
        try {
            try {
                ResultPoint[] resultPointArrDetect = new WhiteRectangleDetector(bitMatrix).detect();
                resultPoint2 = resultPointArrDetect[0];
                resultPoint3 = resultPointArrDetect[1];
                resultPoint = resultPointArrDetect[2];
                resultPointA = resultPointArrDetect[3];
                while (true) {
                    int i20 = this.f49687e;
                    i10 = aVar4.f49689a;
                    int i21 = aVar4.f49690b;
                    i11 = aVar.f49689a;
                    i12 = aVar.f49690b;
                    if (i20 < 9) {
                        a aVarD = d(aVar, z11, i19, i17);
                        a aVarD2 = d(aVar2, z11, i19, i19);
                        a aVarD3 = d(aVar3, z11, i17, i19);
                        a aVarD4 = d(aVar4, z11, i17, i17);
                        if (this.f49687e > i18) {
                            int i22 = aVarD4.f49689a;
                            int i23 = aVarD4.f49690b;
                            int i24 = aVarD.f49689a;
                            int i25 = aVarD.f49690b;
                            double dDistance = (MathUtils.distance(i22, i23, i24, i25) * this.f49687e) / (MathUtils.distance(i10, i21, i11, i12) * (this.f49687e + 2));
                            if (dDistance >= 0.75d && dDistance <= 1.25d) {
                                a aVar5 = new a(i24 - 3, i25 + 3);
                                i13 = i21;
                                a aVar6 = new a(aVarD2.f49689a - 3, aVarD2.f49690b - 3);
                                a aVar7 = new a(aVarD3.f49689a + 3, aVarD3.f49690b - 3);
                                a aVar8 = new a(i22 + 3, i23 + 3);
                                int iB = b(aVar8, aVar5);
                                if (iB == 0 || b(aVar5, aVar6) != iB || b(aVar6, aVar7) != iB || b(aVar7, aVar8) != iB) {
                                    break;
                                }
                            }
                        }
                        z11 = !z11;
                        this.f49687e++;
                        aVar3 = aVarD3;
                        aVar = aVarD;
                        aVar4 = aVarD4;
                        aVar2 = aVarD2;
                        i17 = -1;
                        i18 = 2;
                        i19 = 1;
                    }
                    i13 = i21;
                    break;
                }
            } catch (NotFoundException unused) {
                int width = bitMatrix.getWidth() / 2;
                int height = bitMatrix.getHeight() / 2;
                int i26 = width + 7;
                int i27 = height - 7;
                ResultPoint resultPointA3 = d(new a(i26, i27), false, 1, -1).a();
                int i28 = height + 7;
                ResultPoint resultPointA4 = d(new a(i26, i28), false, 1, 1).a();
                int i29 = width - 7;
                ResultPoint resultPointA5 = d(new a(i29, i28), false, -1, 1).a();
                resultPointA = d(new a(i29, i27), false, -1, -1).a();
                resultPoint = resultPointA5;
                resultPoint2 = resultPointA3;
                resultPoint3 = resultPointA4;
            }
            ResultPoint[] resultPointArrDetect2 = new WhiteRectangleDetector(bitMatrix, 15, iRound, iRound2).detect();
            resultPoint5 = resultPointArrDetect2[0];
            resultPoint4 = resultPointArrDetect2[1];
            resultPointA2 = resultPointArrDetect2[2];
            resultPoint6 = resultPointArrDetect2[3];
        } catch (NotFoundException unused2) {
            int i30 = iRound + 7;
            int i31 = iRound2 - 7;
            ResultPoint resultPointA6 = d(new a(i30, i31), false, 1, -1).a();
            int i32 = iRound2 + 7;
            ResultPoint resultPointA7 = d(new a(i30, i32), false, 1, 1).a();
            int i33 = iRound - 7;
            resultPointA2 = d(new a(i33, i32), false, -1, 1).a();
            ResultPoint resultPointA8 = d(new a(i33, i31), false, -1, -1).a();
            resultPoint4 = resultPointA7;
            resultPoint5 = resultPointA6;
            resultPoint6 = resultPointA8;
        }
        iRound = MathUtils.round((resultPoint.getX() + (resultPoint3.getX() + (resultPointA.getX() + resultPoint2.getX()))) / 4.0f);
        iRound2 = MathUtils.round((resultPoint.getY() + (resultPoint3.getY() + (resultPointA.getY() + resultPoint2.getY()))) / 4.0f);
        aVar = new a(MathUtils.round((resultPointA2.getX() + (resultPoint4.getX() + (resultPoint6.getX() + resultPoint5.getX()))) / 4.0f), MathUtils.round((resultPointA2.getY() + (resultPoint4.getY() + (resultPoint6.getY() + resultPoint5.getY()))) / 4.0f));
        this.f49687e = 1;
        z11 = true;
        aVar2 = aVar;
        aVar3 = aVar2;
        aVar4 = aVar3;
        int i34 = this.f49687e;
        if (i34 != 5 && i34 != 7) {
            throw NotFoundException.getNotFoundInstance();
        }
        this.f49684b = i34 == 5;
        ResultPoint[] resultPointArr = {new ResultPoint(i11 + 0.5f, i12 - 0.5f), new ResultPoint(aVar2.f49689a + 0.5f, aVar2.f49690b + 0.5f), new ResultPoint(aVar3.f49689a - 0.5f, aVar3.f49690b + 0.5f), new ResultPoint(i10 - 0.5f, i13 - 0.5f)};
        int i35 = this.f49687e * 2;
        ResultPoint[] resultPointArrA = a(resultPointArr, i35 - 3, i35);
        if (z10) {
            ResultPoint resultPoint7 = resultPointArrA[0];
            resultPointArrA[0] = resultPointArrA[2];
            resultPointArrA[2] = resultPoint7;
        }
        if (!f(resultPointArrA[0]) || !f(resultPointArrA[1]) || !f(resultPointArrA[2]) || !f(resultPointArrA[3])) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i36 = this.f49687e * 2;
        int[] iArr = {g(resultPointArrA[0], resultPointArrA[1], i36), g(resultPointArrA[1], resultPointArrA[2], i36), g(resultPointArrA[2], resultPointArrA[3], i36), g(resultPointArrA[3], resultPointArrA[0], i36)};
        int i37 = 0;
        for (int i38 = 0; i38 < 4; i38++) {
            int i39 = iArr[i38];
            i37 = (i37 << 3) + ((i39 >> (i36 - 2)) << 1) + (i39 & 1);
        }
        int i40 = ((i37 & 1) << 11) + (i37 >> 1);
        for (int i41 = 0; i41 < 4; i41++) {
            if (Integer.bitCount(f49682g[i41] ^ i40) <= 2) {
                this.f49688f = i41;
                long j11 = 0;
                for (int i42 = 0; i42 < 4; i42++) {
                    int i43 = iArr[(this.f49688f + i42) % 4];
                    if (this.f49684b) {
                        j10 = j11 << 7;
                        i16 = (i43 >> 1) & 127;
                    } else {
                        j10 = j11 << 10;
                        i16 = ((i43 >> 2) & 992) + ((i43 >> 1) & 31);
                    }
                    j11 = j10 + ((long) i16);
                }
                if (this.f49684b) {
                    i15 = 7;
                    i14 = 2;
                } else {
                    i14 = 4;
                    i15 = 10;
                }
                int i44 = i15 - i14;
                int[] iArr2 = new int[i15];
                for (int i45 = i15 - 1; i45 >= 0; i45--) {
                    iArr2[i45] = ((int) j11) & 15;
                    j11 >>= 4;
                }
                try {
                    new ReedSolomonDecoder(GenericGF.AZTEC_PARAM).decode(iArr2, i44);
                    int i46 = 0;
                    for (int i47 = 0; i47 < i14; i47++) {
                        i46 = (i46 << 4) + iArr2[i47];
                    }
                    if (this.f49684b) {
                        this.f49685c = (i46 >> 6) + 1;
                        this.f49686d = (i46 & 63) + 1;
                    } else {
                        this.f49685c = (i46 >> 11) + 1;
                        this.f49686d = (i46 & 2047) + 1;
                    }
                    BitMatrix bitMatrix2 = this.f49683a;
                    int i48 = this.f49688f;
                    ResultPoint resultPoint8 = resultPointArrA[i48 % 4];
                    ResultPoint resultPoint9 = resultPointArrA[(i48 + 1) % 4];
                    ResultPoint resultPoint10 = resultPointArrA[(i48 + 2) % 4];
                    ResultPoint resultPoint11 = resultPointArrA[(i48 + 3) % 4];
                    GridSampler gridSampler = GridSampler.getInstance();
                    int iC = c();
                    float f6 = iC / 2.0f;
                    float f10 = this.f49687e;
                    float f11 = f6 - f10;
                    float f12 = f6 + f10;
                    return new AztecDetectorResult(gridSampler.sampleGrid(bitMatrix2, iC, iC, f11, f11, f12, f11, f12, f12, f11, f12, resultPoint8.getX(), resultPoint8.getY(), resultPoint9.getX(), resultPoint9.getY(), resultPoint10.getX(), resultPoint10.getY(), resultPoint11.getX(), resultPoint11.getY()), a(resultPointArrA, this.f49687e * 2, c()), this.f49684b, this.f49686d, this.f49685c);
                } catch (ReedSolomonException unused3) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
