package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DynamicScheme {
    public final double contrastLevel;
    public final TonalPalette errorPalette = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    public final boolean isDark;
    public final TonalPalette neutralPalette;
    public final TonalPalette neutralVariantPalette;
    public final TonalPalette primaryPalette;
    public final TonalPalette secondaryPalette;
    public final int sourceColorArgb;
    public final Hct sourceColorHct;
    public final TonalPalette tertiaryPalette;
    public final Variant variant;

    public DynamicScheme(Hct hct, Variant variant, boolean z10, double d2, TonalPalette tonalPalette, TonalPalette tonalPalette2, TonalPalette tonalPalette3, TonalPalette tonalPalette4, TonalPalette tonalPalette5) {
        this.sourceColorArgb = hct.toInt();
        this.sourceColorHct = hct;
        this.variant = variant;
        this.isDark = z10;
        this.contrastLevel = d2;
        this.primaryPalette = tonalPalette;
        this.secondaryPalette = tonalPalette2;
        this.tertiaryPalette = tonalPalette3;
        this.neutralPalette = tonalPalette4;
        this.neutralVariantPalette = tonalPalette5;
    }

    public static double getRotatedHue(Hct hct, double[] dArr, double[] dArr2) {
        double hue = hct.getHue();
        int i10 = 0;
        if (dArr2.length == 1) {
            return MathUtils.sanitizeDegreesDouble(hue + dArr2[0]);
        }
        int length = dArr.length;
        while (i10 <= length - 2) {
            double d2 = dArr[i10];
            int i11 = i10 + 1;
            double d3 = dArr[i11];
            if (d2 < hue && hue < d3) {
                return MathUtils.sanitizeDegreesDouble(hue + dArr2[i10]);
            }
            i10 = i11;
        }
        return hue;
    }
}
