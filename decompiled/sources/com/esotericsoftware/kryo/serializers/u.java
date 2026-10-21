package com.esotericsoftware.kryo.serializers;

import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.function.Function;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40049a;

    public /* synthetic */ u(int i10) {
        this.f40049a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f40049a) {
            case 0:
                return Integer.valueOf(((RecordSerializer.a) obj).f40039c);
            case 1:
                return ((DynamicScheme) obj).secondaryPalette;
            case 2:
                return Double.valueOf(((DynamicScheme) obj).primaryPalette.getKeyColor().getTone());
            case 3:
                return ((DynamicScheme) obj).neutralVariantPalette;
            case 4:
                return Double.valueOf(((DynamicScheme) obj).isDark ? 0.2d : 0.12d);
            case 5:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                double d2 = dynamicScheme.isDark ? 30.0d : 90.0d;
                if (MaterialDynamicColors.b(dynamicScheme)) {
                    return Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
                }
                if (!MaterialDynamicColors.a(dynamicScheme)) {
                    return Double.valueOf(d2);
                }
                double hue = dynamicScheme.secondaryPalette.getHue();
                double chroma = dynamicScheme.secondaryPalette.getChroma();
                boolean z10 = !dynamicScheme.isDark;
                Hct hctFrom = Hct.from(hue, chroma, d2);
                if (hctFrom.getChroma() < chroma) {
                    Hct hct = hctFrom;
                    double chroma2 = hctFrom.getChroma();
                    while (hct.getChroma() < chroma) {
                        d2 += z10 ? -1.0d : 1.0d;
                        double d3 = hue;
                        double d7 = hue;
                        double d10 = chroma2;
                        Hct hctFrom2 = Hct.from(d3, chroma, d2);
                        if (d10 <= hctFrom2.getChroma() && Math.abs(hctFrom2.getChroma() - chroma) >= 0.4d) {
                            if (Math.abs(hctFrom2.getChroma() - chroma) < Math.abs(hct.getChroma() - chroma)) {
                                hct = hctFrom2;
                            }
                            chroma2 = Math.max(d10, hctFrom2.getChroma());
                            hue = d7;
                        }
                    }
                }
                return Double.valueOf(MaterialDynamicColors.c(dynamicScheme.secondaryPalette.getHct(d2), dynamicScheme));
            default:
                return ((DynamicScheme) obj).errorPalette;
        }
    }
}
