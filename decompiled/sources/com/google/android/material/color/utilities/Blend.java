package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Blend {
    public static int cam16Ucs(int i10, int i11, double d2) {
        Cam16 cam16FromInt = Cam16.fromInt(i10);
        Cam16 cam16FromInt2 = Cam16.fromInt(i11);
        double jstar = cam16FromInt.getJstar();
        double astar = cam16FromInt.getAstar();
        double bstar = cam16FromInt.getBstar();
        return Cam16.fromUcs(((cam16FromInt2.getJstar() - jstar) * d2) + jstar, ((cam16FromInt2.getAstar() - astar) * d2) + astar, ((cam16FromInt2.getBstar() - bstar) * d2) + bstar).toInt();
    }

    public static int harmonize(int i10, int i11) {
        Hct hctFromInt = Hct.fromInt(i10);
        Hct hctFromInt2 = Hct.fromInt(i11);
        double dMin = Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5d, 15.0d);
        return Hct.from(MathUtils.sanitizeDegreesDouble((MathUtils.rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()) * dMin) + hctFromInt.getHue()), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int hctHue(int i10, int i11, double d2) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i10, i11, d2)).getHue(), Cam16.fromInt(i10).getChroma(), ColorUtils.lstarFromArgb(i10)).toInt();
    }
}
