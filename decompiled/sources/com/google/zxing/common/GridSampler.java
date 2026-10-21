package com.google.zxing.common;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class GridSampler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static GridSampler f49830a = new DefaultGridSampler();

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:55:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    public static void checkAndNudgePoints(BitMatrix bitMatrix, float[] fArr) throws NotFoundException {
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        boolean z10 = true;
        for (int i10 = 0; i10 < fArr.length && z10; i10 += 2) {
            int i11 = (int) fArr[i10];
            int i12 = i10 + 1;
            int i13 = (int) fArr[i12];
            if (i11 < -1 || i11 > width || i13 < -1 || i13 > height) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i11 == -1) {
                fArr[i10] = 0.0f;
            } else {
                if (i11 == width) {
                    fArr[i10] = width - 1;
                } else {
                    z10 = false;
                }
                if (i13 == -1) {
                    fArr[i12] = 0.0f;
                } else {
                    if (i13 == height) {
                        fArr[i12] = height - 1;
                    }
                }
                z10 = true;
            }
            z10 = true;
            if (i13 == -1) {
                fArr[i12] = 0.0f;
            } else {
                if (i13 == height) {
                    fArr[i12] = height - 1;
                }
            }
            z10 = true;
        }
        boolean z11 = true;
        for (int length = fArr.length - 2; length >= 0 && z11; length -= 2) {
            int i14 = (int) fArr[length];
            int i15 = length + 1;
            int i16 = (int) fArr[i15];
            if (i14 < -1 || i14 > width || i16 < -1 || i16 > height) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (i14 == -1) {
                fArr[length] = 0.0f;
            } else {
                if (i14 == width) {
                    fArr[length] = width - 1;
                } else {
                    z11 = false;
                }
                if (i16 == -1) {
                    fArr[i15] = 0.0f;
                } else {
                    if (i16 == height) {
                        fArr[i15] = height - 1;
                    }
                }
                z11 = true;
            }
            z11 = true;
            if (i16 == -1) {
                fArr[i15] = 0.0f;
            } else {
                if (i16 == height) {
                    fArr[i15] = height - 1;
                }
            }
            z11 = true;
        }
    }

    public static GridSampler getInstance() {
        return f49830a;
    }

    public static void setGridSampler(GridSampler gridSampler) {
        f49830a = gridSampler;
    }

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i10, int i11, float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) throws NotFoundException;

    public abstract BitMatrix sampleGrid(BitMatrix bitMatrix, int i10, int i11, PerspectiveTransform perspectiveTransform) throws NotFoundException;
}
