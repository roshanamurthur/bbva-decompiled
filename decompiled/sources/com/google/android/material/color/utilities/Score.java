package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Score {

    public static class a implements Comparator<b> {
        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            return Double.compare(bVar2.f44431b, bVar.f44431b);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Hct f44430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f44431b;

        public b(Hct hct, double d2) {
            this.f44430a = hct;
            this.f44431b = d2;
        }
    }

    public static List<Integer> score(Map<Integer, Integer> map) {
        return score(map, 4, -12417548, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i10) {
        return score(map, i10, -12417548, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i10, int i11) {
        return score(map, i10, i11, true);
    }

    public static List<Integer> score(Map<Integer, Integer> map, int i10, int i11, boolean z10) {
        ArrayList<Hct> arrayList = new ArrayList();
        int[] iArr = new int[360];
        double d2 = 0.0d;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Hct hctFromInt = Hct.fromInt(entry.getKey().intValue());
            arrayList.add(hctFromInt);
            int iFloor = (int) Math.floor(hctFromInt.getHue());
            int iIntValue = entry.getValue().intValue();
            iArr[iFloor] = iArr[iFloor] + iIntValue;
            d2 += (double) iIntValue;
        }
        double[] dArr = new double[360];
        for (int i12 = 0; i12 < 360; i12++) {
            double d3 = ((double) iArr[i12]) / d2;
            for (int i13 = i12 - 14; i13 < i12 + 16; i13++) {
                int iSanitizeDegreesInt = MathUtils.sanitizeDegreesInt(i13);
                dArr[iSanitizeDegreesInt] = dArr[iSanitizeDegreesInt] + d3;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Hct hct : arrayList) {
            double d7 = dArr[MathUtils.sanitizeDegreesInt((int) Math.round(hct.getHue()))];
            if (!z10 || (hct.getChroma() >= 5.0d && d7 > 0.01d)) {
                arrayList2.add(new b(hct, ((hct.getChroma() - 48.0d) * (hct.getChroma() < 48.0d ? 0.1d : 0.3d)) + (d7 * 100.0d * 0.7d)));
            }
        }
        Collections.sort(arrayList2, new a());
        ArrayList arrayList3 = new ArrayList();
        for (int i14 = 90; i14 >= 15; i14--) {
            arrayList3.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Hct hct2 = ((b) it.next()).f44430a;
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        arrayList3.add(hct2);
                        break;
                    }
                } while (MathUtils.differenceDegrees(hct2.getHue(), ((Hct) it2.next()).getHue()) >= i14);
                if (arrayList3.size() >= i10) {
                    break;
                }
            }
            if (arrayList3.size() >= i10) {
                break;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList3.isEmpty()) {
            arrayList4.add(Integer.valueOf(i11));
            return arrayList4;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Integer.valueOf(((Hct) it3.next()).toInt()));
        }
        return arrayList4;
    }
}
