package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TonalPalette {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f44437a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hct f44438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f44440d;

    public TonalPalette(double d2, double d3, Hct hct) {
        this.f44439c = d2;
        this.f44440d = d3;
        this.f44438b = hct;
    }

    public static TonalPalette fromHct(Hct hct) {
        return new TonalPalette(hct.getHue(), hct.getChroma(), hct);
    }

    public static TonalPalette fromHueAndChroma(double d2, double d3) {
        Hct hctFrom = Hct.from(d2, d3, 50.0d);
        Hct hct = hctFrom;
        double dAbs = Math.abs(hctFrom.getChroma() - d3);
        for (double d7 = 1.0d; d7 < 50.0d && Math.round(d3) != Math.round(hct.getChroma()); d7 += 1.0d) {
            Hct hctFrom2 = Hct.from(d2, d3, 50.0d + d7);
            double dAbs2 = Math.abs(hctFrom2.getChroma() - d3);
            if (dAbs2 < dAbs) {
                hct = hctFrom2;
                dAbs = dAbs2;
            }
            Hct hctFrom3 = Hct.from(d2, d3, 50.0d - d7);
            double dAbs3 = Math.abs(hctFrom3.getChroma() - d3);
            if (dAbs3 < dAbs) {
                hct = hctFrom3;
                dAbs = dAbs3;
            }
        }
        return new TonalPalette(d2, d3, hct);
    }

    public static TonalPalette fromInt(int i10) {
        return fromHct(Hct.fromInt(i10));
    }

    public double getChroma() {
        return this.f44440d;
    }

    public Hct getHct(double d2) {
        return Hct.from(this.f44439c, this.f44440d, d2);
    }

    public double getHue() {
        return this.f44439c;
    }

    public Hct getKeyColor() {
        return this.f44438b;
    }

    public int tone(int i10) {
        HashMap map = this.f44437a;
        Integer numValueOf = (Integer) map.get(Integer.valueOf(i10));
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(Hct.from(this.f44439c, this.f44440d, i10).toInt());
            map.put(Integer.valueOf(i10), numValueOf);
        }
        return numValueOf.intValue();
    }
}
