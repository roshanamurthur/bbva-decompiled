package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import ie.l0;
import ie.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class TemperatureCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hct f44432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Hct f44433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f44434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<Hct> f44435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap f44436e;

    public TemperatureCache() {
        throw new UnsupportedOperationException();
    }

    public static boolean e(double d2, double d3, double d7) {
        if (d3 < d7) {
            return d3 <= d2 && d2 <= d7;
        }
        return d3 <= d2 || d2 <= d7;
    }

    public static double rawTemperature(Hct hct) {
        double[] dArrLabFromArgb = ColorUtils.labFromArgb(hct.toInt());
        return (Math.cos(Math.toRadians(MathUtils.sanitizeDegreesDouble(MathUtils.sanitizeDegreesDouble(Math.toDegrees(Math.atan2(dArrLabFromArgb[2], dArrLabFromArgb[1]))) - 50.0d))) * (Math.pow(Math.hypot(dArrLabFromArgb[1], dArrLabFromArgb[2]), 1.07d) * 0.02d)) - 0.5d;
    }

    public final List<Hct> a() {
        List<Hct> list = this.f44435d;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (double d2 = 0.0d; d2 <= 360.0d; d2 += 1.0d) {
            Hct hct = this.f44432a;
            arrayList.add(Hct.from(d2, hct.getChroma(), hct.getTone()));
        }
        List<Hct> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        this.f44435d = listUnmodifiableList;
        return listUnmodifiableList;
    }

    public final List<Hct> b() {
        ArrayList arrayList = this.f44434c;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(a());
        arrayList2.add(this.f44432a);
        Collections.sort(arrayList2, Comparator.comparing(new l0(this, 3), new w0()));
        this.f44434c = arrayList2;
        return arrayList2;
    }

    public final Map<Hct, Double> c() {
        HashMap map = this.f44436e;
        if (map != null) {
            return map;
        }
        ArrayList<Hct> arrayList = new ArrayList(a());
        arrayList.add(this.f44432a);
        HashMap map2 = new HashMap();
        for (Hct hct : arrayList) {
            map2.put(hct, Double.valueOf(rawTemperature(hct)));
        }
        this.f44436e = map2;
        return map2;
    }

    public final Hct d() {
        return b().get(b().size() - 1);
    }

    public List<Hct> getAnalogousColors() {
        return getAnalogousColors(5, 12);
    }

    public Hct getComplement() {
        Hct hct = this.f44433b;
        if (hct != null) {
            return hct;
        }
        double hue = b().get(0).getHue();
        double dDoubleValue = ((Double) ((HashMap) c()).get(b().get(0))).doubleValue();
        double hue2 = d().getHue();
        double dDoubleValue2 = ((Double) ((HashMap) c()).get(d())).doubleValue() - dDoubleValue;
        Hct hct2 = this.f44432a;
        boolean zE = e(hct2.getHue(), hue, hue2);
        double d2 = zE ? hue2 : hue;
        if (!zE) {
            hue = hue2;
        }
        Hct hct3 = a().get((int) Math.round(hct2.getHue()));
        double d3 = 1.0d;
        double relativeTemperature = 1.0d - getRelativeTemperature(hct2);
        double d7 = 1000.0d;
        for (double d10 = 0.0d; d10 <= 360.0d; d10 += 1.0d) {
            double dSanitizeDegreesDouble = MathUtils.sanitizeDegreesDouble((d3 * d10) + d2);
            if (e(dSanitizeDegreesDouble, d2, hue)) {
                Hct hct4 = a().get((int) Math.round(dSanitizeDegreesDouble));
                double dAbs = Math.abs(relativeTemperature - ((((Double) ((HashMap) c()).get(hct4)).doubleValue() - dDoubleValue) / dDoubleValue2));
                if (dAbs < d7) {
                    hct3 = hct4;
                    d7 = dAbs;
                }
            }
            d3 = 1.0d;
        }
        this.f44433b = hct3;
        return hct3;
    }

    public double getRelativeTemperature(Hct hct) {
        double dDoubleValue = ((Double) ((HashMap) c()).get(d())).doubleValue() - ((Double) ((HashMap) c()).get(b().get(0))).doubleValue();
        double dDoubleValue2 = ((Double) ((HashMap) c()).get(hct)).doubleValue() - ((Double) ((HashMap) c()).get(b().get(0))).doubleValue();
        if (dDoubleValue == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue2 / dDoubleValue;
    }

    public List<Hct> getAnalogousColors(int i10, int i11) {
        Hct hct = this.f44432a;
        int iRound = (int) Math.round(hct.getHue());
        Hct hct2 = a().get(iRound);
        double relativeTemperature = getRelativeTemperature(hct2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(hct2);
        int i12 = 0;
        double dAbs = 0.0d;
        while (i12 < 360) {
            double relativeTemperature2 = getRelativeTemperature(a().get(MathUtils.sanitizeDegreesInt(iRound + i12)));
            dAbs += Math.abs(relativeTemperature2 - relativeTemperature);
            i12++;
            relativeTemperature = relativeTemperature2;
        }
        double d2 = dAbs / ((double) i11);
        double relativeTemperature3 = getRelativeTemperature(hct2);
        double dAbs2 = 0.0d;
        int i13 = 1;
        while (arrayList.size() < i11) {
            Hct hct3 = a().get(MathUtils.sanitizeDegreesInt(iRound + i13));
            double relativeTemperature4 = getRelativeTemperature(hct3);
            dAbs2 += Math.abs(relativeTemperature4 - relativeTemperature3);
            boolean z10 = dAbs2 >= ((double) arrayList.size()) * d2;
            int i14 = 1;
            while (z10 && arrayList.size() < i11) {
                arrayList.add(hct3);
                int i15 = iRound;
                z10 = dAbs2 >= ((double) (arrayList.size() + i14)) * d2;
                i14++;
                iRound = i15;
            }
            int i16 = iRound;
            i13++;
            if (i13 > 360) {
                while (arrayList.size() < i11) {
                    arrayList.add(hct3);
                }
                break;
            }
            iRound = i16;
            relativeTemperature3 = relativeTemperature4;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(hct);
        int iFloor = (int) Math.floor((((double) i10) - 1.0d) / 2.0d);
        for (int i17 = 1; i17 < iFloor + 1; i17++) {
            int size = 0 - i17;
            while (size < 0) {
                size += arrayList.size();
            }
            if (size >= arrayList.size()) {
                size %= arrayList.size();
            }
            arrayList2.add(0, (Hct) arrayList.get(size));
        }
        int i18 = i10 - iFloor;
        for (int i19 = 1; i19 < i18; i19++) {
            int size2 = i19;
            while (size2 < 0) {
                size2 += arrayList.size();
            }
            if (size2 >= arrayList.size()) {
                size2 %= arrayList.size();
            }
            arrayList2.add((Hct) arrayList.get(size2));
        }
        return arrayList2;
    }

    public TemperatureCache(Hct hct) {
        this.f44432a = hct;
    }
}
