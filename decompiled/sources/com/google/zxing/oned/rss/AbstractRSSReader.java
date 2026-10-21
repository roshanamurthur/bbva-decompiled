package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractRSSReader extends OneDReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f49954b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f49957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f49958f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f49953a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f49955c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f49956d = new float[4];

    public AbstractRSSReader() {
        int[] iArr = new int[8];
        this.f49954b = iArr;
        this.f49957e = new int[iArr.length / 2];
        this.f49958f = new int[iArr.length / 2];
    }

    @Deprecated
    public static int count(int[] iArr) {
        return MathUtils.sum(iArr);
    }

    public static void decrement(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f6 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f10 = fArr[i11];
            if (f10 < f6) {
                i10 = i11;
                f6 = f10;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    public static void increment(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f6 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            float f10 = fArr[i11];
            if (f10 > f6) {
                i10 = i11;
                f6 = f10;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    public static boolean isFinderPattern(int[] iArr) {
        int i10 = iArr[0] + iArr[1];
        float f6 = i10 / ((iArr[2] + i10) + iArr[3]);
        if (f6 >= 0.7916667f && f6 <= 0.89285713f) {
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            for (int i13 : iArr) {
                if (i13 > i12) {
                    i12 = i13;
                }
                if (i13 < i11) {
                    i11 = i13;
                }
            }
            if (i12 < i11 * 10) {
                return true;
            }
        }
        return false;
    }

    public static int parseFinderValue(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (OneDReader.patternMatchVariance(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final int[] getDataCharacterCounters() {
        return this.f49954b;
    }

    public final int[] getDecodeFinderCounters() {
        return this.f49953a;
    }

    public final int[] getEvenCounts() {
        return this.f49958f;
    }

    public final float[] getEvenRoundingErrors() {
        return this.f49956d;
    }

    public final int[] getOddCounts() {
        return this.f49957e;
    }

    public final float[] getOddRoundingErrors() {
        return this.f49955c;
    }
}
