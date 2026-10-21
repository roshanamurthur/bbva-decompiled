package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: loaded from: classes10.dex */
public final class WhiteRectangleDetector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f49844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49850g;

    public WhiteRectangleDetector(BitMatrix bitMatrix) throws NotFoundException {
        this(bitMatrix, 10, bitMatrix.getWidth() / 2, bitMatrix.getHeight() / 2);
    }

    public final boolean a(int i10, int i11, int i12, boolean z10) {
        BitMatrix bitMatrix = this.f49844a;
        if (z10) {
            while (i10 <= i11) {
                if (bitMatrix.get(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (bitMatrix.get(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final ResultPoint b(float f6, float f10, float f11, float f12) {
        int iRound = MathUtils.round(MathUtils.distance(f6, f10, f11, f12));
        float f13 = iRound;
        float f14 = (f11 - f6) / f13;
        float f15 = (f12 - f10) / f13;
        for (int i10 = 0; i10 < iRound; i10++) {
            float f16 = i10;
            int iRound2 = MathUtils.round((f16 * f14) + f6);
            int iRound3 = MathUtils.round((f16 * f15) + f10);
            if (this.f49844a.get(iRound2, iRound3)) {
                return new ResultPoint(iRound2, iRound3);
            }
        }
        return null;
    }

    public ResultPoint[] detect() throws NotFoundException {
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f49847d;
        int i13 = this.f49848e;
        int i14 = this.f49850g;
        int i15 = this.f49849f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = true;
        while (true) {
            i10 = this.f49846c;
            if (!z16) {
                z10 = false;
                break;
            }
            boolean z17 = false;
            boolean zA = true;
            while (true) {
                if ((!zA && z11) || i13 >= i10) {
                    break;
                }
                zA = a(i14, i15, i13, false);
                if (zA) {
                    i13++;
                    z11 = true;
                    z17 = true;
                } else if (!z11) {
                    i13++;
                }
            }
            if (i13 < i10) {
                boolean zA2 = true;
                while (true) {
                    i11 = this.f49845b;
                    if ((!zA2 && z12) || i15 >= i11) {
                        break;
                    }
                    zA2 = a(i12, i13, i15, true);
                    if (zA2) {
                        i15++;
                        z12 = true;
                        z17 = true;
                    } else if (!z12) {
                        i15++;
                    }
                }
                if (i15 < i11) {
                    boolean zA3 = true;
                    while (true) {
                        if ((!zA3 && z13) || i12 < 0) {
                            break;
                        }
                        zA3 = a(i14, i15, i12, false);
                        if (zA3) {
                            i12--;
                            z13 = true;
                            z17 = true;
                        } else if (!z13) {
                            i12--;
                        }
                    }
                    if (i12 >= 0) {
                        z16 = z17;
                        boolean zA4 = true;
                        while (true) {
                            if ((!zA4 && z15) || i14 < 0) {
                                break;
                            }
                            zA4 = a(i12, i13, i14, true);
                            if (zA4) {
                                i14--;
                                z16 = true;
                                z15 = true;
                            } else if (!z15) {
                                i14--;
                            }
                        }
                        if (i14 >= 0) {
                            if (z16) {
                                z14 = true;
                            }
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10 || !z14) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i16 = i13 - i12;
        ResultPoint resultPointB = null;
        ResultPoint resultPointB2 = null;
        for (int i17 = 1; resultPointB2 == null && i17 < i16; i17++) {
            resultPointB2 = b(i12, i15 - i17, i12 + i17, i15);
        }
        if (resultPointB2 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPointB3 = null;
        for (int i18 = 1; resultPointB3 == null && i18 < i16; i18++) {
            resultPointB3 = b(i12, i14 + i18, i12 + i18, i14);
        }
        if (resultPointB3 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        ResultPoint resultPointB4 = null;
        for (int i19 = 1; resultPointB4 == null && i19 < i16; i19++) {
            resultPointB4 = b(i13, i14 + i19, i13 - i19, i14);
        }
        if (resultPointB4 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        for (int i20 = 1; resultPointB == null && i20 < i16; i20++) {
            resultPointB = b(i13, i15 - i20, i13 - i20, i15);
        }
        if (resultPointB == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float x4 = resultPointB.getX();
        float y7 = resultPointB.getY();
        float x6 = resultPointB2.getX();
        float y10 = resultPointB2.getY();
        float x7 = resultPointB4.getX();
        float y11 = resultPointB4.getY();
        float x10 = resultPointB3.getX();
        float y12 = resultPointB3.getY();
        return x4 < ((float) i10) / 2.0f ? new ResultPoint[]{new ResultPoint(x10 - 1.0f, y12 + 1.0f), new ResultPoint(x6 + 1.0f, y10 + 1.0f), new ResultPoint(x7 - 1.0f, y11 - 1.0f), new ResultPoint(x4 + 1.0f, y7 - 1.0f)} : new ResultPoint[]{new ResultPoint(x10 + 1.0f, y12 + 1.0f), new ResultPoint(x6 + 1.0f, y10 - 1.0f), new ResultPoint(x7 - 1.0f, y11 + 1.0f), new ResultPoint(x4 - 1.0f, y7 - 1.0f)};
    }

    public WhiteRectangleDetector(BitMatrix bitMatrix, int i10, int i11, int i12) throws NotFoundException {
        this.f49844a = bitMatrix;
        int height = bitMatrix.getHeight();
        this.f49845b = height;
        int width = bitMatrix.getWidth();
        this.f49846c = width;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f49847d = i14;
        int i15 = i11 + i13;
        this.f49848e = i15;
        int i16 = i12 - i13;
        this.f49850g = i16;
        int i17 = i12 + i13;
        this.f49849f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= height || i15 >= width) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
