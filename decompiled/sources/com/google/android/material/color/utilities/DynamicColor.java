package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import ie.a;
import ie.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DynamicColor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<DynamicScheme, Hct> f44371a;
    public final Function<DynamicScheme, DynamicColor> background;
    public final ContrastCurve contrastCurve;
    public final boolean isBackground;
    public final String name;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, TonalPalette> palette;
    public final Function<DynamicScheme, DynamicColor> secondBackground;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaPair> toneDeltaPair;

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z10, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5) {
        this.f44371a = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z10;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = null;
    }

    public static double enableLightForeground(double d2) {
        if (!tonePrefersLightForeground(d2) || toneAllowsLightForeground(d2)) {
            return d2;
        }
        return 49.0d;
    }

    public static double foregroundTone(double d2, double d3) {
        double dLighterUnsafe = Contrast.lighterUnsafe(d2, d3);
        double dDarkerUnsafe = Contrast.darkerUnsafe(d2, d3);
        double dRatioOfTones = Contrast.ratioOfTones(dLighterUnsafe, d2);
        double dRatioOfTones2 = Contrast.ratioOfTones(dDarkerUnsafe, d2);
        if (tonePrefersLightForeground(d2)) {
            return (dRatioOfTones >= d3 || dRatioOfTones >= dRatioOfTones2 || ((Math.abs(dRatioOfTones - dRatioOfTones2) > 0.1d ? 1 : (Math.abs(dRatioOfTones - dRatioOfTones2) == 0.1d ? 0 : -1)) < 0 && (dRatioOfTones > d3 ? 1 : (dRatioOfTones == d3 ? 0 : -1)) < 0 && (dRatioOfTones2 > d3 ? 1 : (dRatioOfTones2 == d3 ? 0 : -1)) < 0)) ? dLighterUnsafe : dDarkerUnsafe;
        }
        return (dRatioOfTones2 >= d3 || dRatioOfTones2 >= dRatioOfTones) ? dDarkerUnsafe : dLighterUnsafe;
    }

    @NonNull
    public static DynamicColor fromArgb(@NonNull String str, int i10) {
        return fromPalette(str, new o(TonalPalette.fromInt(i10), 2), new a(Hct.fromInt(i10), 0));
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2) {
        return new DynamicColor(str, function, function2, false, null, null, null, null);
    }

    public static boolean toneAllowsLightForeground(double d2) {
        return Math.round(d2) <= 49;
    }

    public static boolean tonePrefersLightForeground(double d2) {
        return Math.round(d2) < 60;
    }

    public int getArgb(@NonNull DynamicScheme dynamicScheme) {
        int i10 = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i10;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(((Double) function.apply(dynamicScheme)).doubleValue() * 255.0d)) << 24) | (i10 & ViewCompat.MEASURED_SIZE_MASK);
    }

    @NonNull
    public Hct getHct(@NonNull DynamicScheme dynamicScheme) {
        HashMap<DynamicScheme, Hct> map = this.f44371a;
        Hct hct = map.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct hct2 = ((TonalPalette) this.palette.apply(dynamicScheme)).getHct(getTone(dynamicScheme));
        if (map.size() > 4) {
            map.clear();
        }
        map.put(dynamicScheme, hct2);
        return hct2;
    }

    public double getTone(@NonNull DynamicScheme dynamicScheme) {
        double d2;
        double dMin;
        boolean z10 = dynamicScheme.contrastLevel < 0.0d;
        Function<DynamicScheme, ToneDeltaPair> function = this.toneDeltaPair;
        if (function == null) {
            double dDoubleValue = ((Double) this.tone.apply(dynamicScheme)).doubleValue();
            Function<DynamicScheme, DynamicColor> function2 = this.background;
            if (function2 == null) {
                return dDoubleValue;
            }
            double tone = ((DynamicColor) function2.apply(dynamicScheme)).getTone(dynamicScheme);
            double contrast = this.contrastCurve.getContrast(dynamicScheme.contrastLevel);
            if (Contrast.ratioOfTones(tone, dDoubleValue) < contrast) {
                dDoubleValue = foregroundTone(tone, contrast);
            }
            if (z10) {
                dDoubleValue = foregroundTone(tone, contrast);
            }
            if (!this.isBackground || 50.0d > dDoubleValue || dDoubleValue >= 60.0d) {
                d2 = dDoubleValue;
            } else {
                d2 = Contrast.ratioOfTones(49.0d, tone) >= contrast ? 49.0d : 60.0d;
            }
            if (this.secondBackground == null) {
                return d2;
            }
            double tone2 = ((DynamicColor) this.background.apply(dynamicScheme)).getTone(dynamicScheme);
            double tone3 = ((DynamicColor) this.secondBackground.apply(dynamicScheme)).getTone(dynamicScheme);
            double dMax = Math.max(tone2, tone3);
            double dMin2 = Math.min(tone2, tone3);
            if (Contrast.ratioOfTones(dMax, d2) >= contrast && Contrast.ratioOfTones(dMin2, d2) >= contrast) {
                return d2;
            }
            double dLighter = Contrast.lighter(dMax, contrast);
            double dDarker = Contrast.darker(dMin2, contrast);
            ArrayList arrayList = new ArrayList();
            if (dLighter != -1.0d) {
                arrayList.add(Double.valueOf(dLighter));
            }
            if (dDarker != -1.0d) {
                arrayList.add(Double.valueOf(dDarker));
            }
            if (tonePrefersLightForeground(tone2) || tonePrefersLightForeground(tone3)) {
                if (dLighter == -1.0d) {
                    return 100.0d;
                }
                return dLighter;
            }
            if (arrayList.size() == 1) {
                return ((Double) arrayList.get(0)).doubleValue();
            }
            if (dDarker == -1.0d) {
                return 0.0d;
            }
            return dDarker;
        }
        ToneDeltaPair toneDeltaPair = (ToneDeltaPair) function.apply(dynamicScheme);
        DynamicColor roleA = toneDeltaPair.getRoleA();
        DynamicColor roleB = toneDeltaPair.getRoleB();
        double delta = toneDeltaPair.getDelta();
        TonePolarity polarity = toneDeltaPair.getPolarity();
        boolean stayTogether = toneDeltaPair.getStayTogether();
        double tone4 = ((DynamicColor) this.background.apply(dynamicScheme)).getTone(dynamicScheme);
        boolean z11 = polarity == TonePolarity.NEARER || (polarity == TonePolarity.LIGHTER && !dynamicScheme.isDark) || (polarity == TonePolarity.DARKER && dynamicScheme.isDark);
        DynamicColor dynamicColor = z11 ? roleA : roleB;
        DynamicColor dynamicColor2 = z11 ? roleB : roleA;
        boolean zEquals = this.name.equals(dynamicColor.name);
        double d3 = dynamicScheme.isDark ? 1.0d : -1.0d;
        double contrast2 = dynamicColor.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        double contrast3 = dynamicColor2.contrastCurve.getContrast(dynamicScheme.contrastLevel);
        double dDoubleValue2 = ((Double) dynamicColor.tone.apply(dynamicScheme)).doubleValue();
        if (Contrast.ratioOfTones(tone4, dDoubleValue2) < contrast2) {
            dDoubleValue2 = foregroundTone(tone4, contrast2);
        }
        double dClampDouble = dDoubleValue2;
        double dDoubleValue3 = ((Double) dynamicColor2.tone.apply(dynamicScheme)).doubleValue();
        if (Contrast.ratioOfTones(tone4, dDoubleValue3) < contrast3) {
            dDoubleValue3 = foregroundTone(tone4, contrast3);
        }
        if (z10) {
            dClampDouble = foregroundTone(tone4, contrast2);
            dDoubleValue3 = foregroundTone(tone4, contrast3);
        }
        if ((dDoubleValue3 - dClampDouble) * d3 < delta) {
            double d7 = delta * d3;
            dDoubleValue3 = MathUtils.clampDouble(0.0d, 100.0d, dClampDouble + d7);
            if ((dDoubleValue3 - dClampDouble) * d3 < delta) {
                dClampDouble = MathUtils.clampDouble(0.0d, 100.0d, dDoubleValue3 - d7);
            }
        }
        if (50.0d > dClampDouble || dClampDouble >= 60.0d) {
            if (50.0d > dDoubleValue3 || dDoubleValue3 >= 60.0d) {
                dMin = dDoubleValue3;
            } else if (!stayTogether) {
                dMin = d3 > 0.0d ? 60.0d : 49.0d;
            } else if (d3 > 0.0d) {
                dMin = Math.max(dDoubleValue3, (delta * d3) + 60.0d);
                dClampDouble = 60.0d;
            } else {
                dMin = Math.min(dDoubleValue3, (delta * d3) + 49.0d);
                dClampDouble = 49.0d;
            }
        } else if (d3 > 0.0d) {
            dClampDouble = 60.0d;
            dMin = Math.max(dDoubleValue3, (delta * d3) + 60.0d);
        } else {
            dMin = Math.min(dDoubleValue3, (delta * d3) + 49.0d);
            dClampDouble = 49.0d;
        }
        return zEquals ? dClampDouble : dMin;
    }

    @NonNull
    public static DynamicColor fromPalette(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z10) {
        return new DynamicColor(str, function, function2, z10, null, null, null, null);
    }

    public DynamicColor(@NonNull String str, @NonNull Function<DynamicScheme, TonalPalette> function, @NonNull Function<DynamicScheme, Double> function2, boolean z10, @Nullable Function<DynamicScheme, DynamicColor> function3, @Nullable Function<DynamicScheme, DynamicColor> function4, @Nullable ContrastCurve contrastCurve, @Nullable Function<DynamicScheme, ToneDeltaPair> function5, @Nullable Function<DynamicScheme, Double> function6) {
        this.f44371a = new HashMap<>();
        this.name = str;
        this.palette = function;
        this.tone = function2;
        this.isBackground = z10;
        this.background = function3;
        this.secondBackground = function4;
        this.contrastCurve = contrastCurve;
        this.toneDeltaPair = function5;
        this.opacity = function6;
    }
}
