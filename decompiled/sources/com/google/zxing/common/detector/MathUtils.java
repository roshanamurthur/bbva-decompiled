package com.google.zxing.common.detector;

/* JADX INFO: loaded from: classes10.dex */
public final class MathUtils {
    public static float distance(float f6, float f10, float f11, float f12) {
        float f13 = f6 - f11;
        float f14 = f10 - f12;
        return (float) Math.sqrt((f14 * f14) + (f13 * f13));
    }

    public static int round(float f6) {
        return (int) (f6 + (f6 < 0.0f ? -0.5f : 0.5f));
    }

    public static int sum(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    public static float distance(int i10, int i11, int i12, int i13) {
        int i14 = i10 - i12;
        int i15 = i11 - i13;
        return (float) Math.sqrt((i15 * i15) + (i14 * i14));
    }
}
