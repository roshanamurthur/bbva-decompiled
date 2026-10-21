package com.google.android.material.math;

/* JADX INFO: loaded from: classes10.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    public static float dist(float f6, float f10, float f11, float f12) {
        return (float) Math.hypot(f11 - f6, f12 - f10);
    }

    public static float distanceToFurthestCorner(float f6, float f10, float f11, float f12, float f13, float f14) {
        float fDist = dist(f6, f10, f11, f12);
        float fDist2 = dist(f6, f10, f13, f12);
        float fDist3 = dist(f6, f10, f13, f14);
        float fDist4 = dist(f6, f10, f11, f14);
        if (fDist > fDist2 && fDist > fDist3 && fDist > fDist4) {
            return fDist;
        }
        if (fDist2 <= fDist3 || fDist2 <= fDist4) {
            return fDist3 > fDist4 ? fDist3 : fDist4;
        }
        return fDist2;
    }

    public static float floorMod(float f6, int i10) {
        float f10 = i10;
        int i11 = (int) (f6 / f10);
        if (Math.signum(f6) * f10 < 0.0f && i11 * i10 != f6) {
            i11--;
        }
        return f6 - (i11 * i10);
    }

    public static boolean geq(float f6, float f10, float f11) {
        return f6 + f11 >= f10;
    }

    public static float lerp(float f6, float f10, float f11) {
        return (f11 * f10) + ((1.0f - f11) * f6);
    }

    public static int floorMod(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }
}
