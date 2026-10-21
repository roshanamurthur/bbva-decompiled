package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.guesses.EstimateGuess;
import com.nulabinc.zxcvbn.matchers.Match;
import com.nulabinc.zxcvbn.matchers.MatchFactory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Scoring {
    public static final long JS_NUMBER_MAX = 9007199254740991L;
    public static final int MIN_GUESSES_BEFORE_GROWING_SEQUENCE = 10000;
    public static final int REFERENCE_YEAR = Calendar.getInstance().get(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63634a;

    public class a implements Comparator<Match> {
        @Override // java.util.Comparator
        public final int compare(Match match, Match match2) {
            return match.f63691i - match2.f63691i;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f63635a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f63636b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f63637c = new ArrayList();

        public b(int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                this.f63635a.add(new HashMap());
                this.f63636b.add(new HashMap());
                this.f63637c.add(new HashMap());
            }
        }
    }

    public Scoring(Context context) {
        this.f63634a = context;
    }

    public static double log10(double d2) {
        return Math.log(d2) / Math.log(10.0d);
    }

    public final void a(CharSequence charSequence, Match match, int i10, b bVar, boolean z10) {
        double d2;
        int i11 = match.f63692j;
        double dExec = new EstimateGuess(this.f63634a, charSequence).exec(match);
        ArrayList arrayList = bVar.f63636b;
        if (i10 > 1) {
            dExec *= ((Double) ((Map) arrayList.get(match.f63691i - 1)).get(Integer.valueOf(i10 - 1))).doubleValue();
        }
        if (Double.isInfinite(dExec)) {
            dExec = Double.MAX_VALUE;
        }
        long j10 = 1;
        if (i10 >= 2) {
            if (i10 > 19) {
                j10 = 9007199254740991L;
            } else {
                for (int i12 = 2; i12 <= i10; i12++) {
                    j10 *= (long) i12;
                }
            }
        }
        double d3 = j10 * dExec;
        if (Double.isInfinite(d3)) {
            d3 = Double.MAX_VALUE;
        }
        if (z10) {
            d2 = d3;
        } else {
            double dPow = Math.pow(10000.0d, i10 - 1) + d3;
            d2 = Double.isInfinite(dPow) ? Double.MAX_VALUE : dPow;
        }
        ArrayList arrayList2 = bVar.f63637c;
        for (Map.Entry entry : ((Map) arrayList2.get(i11)).entrySet()) {
            if (((Integer) entry.getKey()).intValue() <= i10 && ((Double) entry.getValue()).doubleValue() <= d2) {
                return;
            }
        }
        ((Map) arrayList2.get(i11)).put(Integer.valueOf(i10), Double.valueOf(d2));
        ((Map) bVar.f63635a.get(i11)).put(Integer.valueOf(i10), match);
        ((Map) arrayList.get(i11)).put(Integer.valueOf(i10), Double.valueOf(dExec));
    }

    public Context getContext() {
        return this.f63634a;
    }

    public Strength mostGuessableMatchSequence(CharSequence charSequence, List<Match> list) {
        return mostGuessableMatchSequence(charSequence, list, false);
    }

    public Strength mostGuessableMatchSequence(CharSequence charSequence, List<Match> list, boolean z10) {
        ArrayList arrayList;
        int length = charSequence.length();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < length; i10++) {
            arrayList2.add(new ArrayList());
        }
        for (Match match : list) {
            ((List) arrayList2.get(match.f63692j)).add(match);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Collections.sort((List) it.next(), new a());
        }
        b bVar = new b(length);
        int i11 = 0;
        while (true) {
            arrayList = bVar.f63635a;
            if (i11 >= length) {
                break;
            }
            for (Match match2 : (List) arrayList2.get(i11)) {
                int i12 = match2.f63691i;
                if (i12 > 0) {
                    Iterator it2 = ((Map) arrayList.get(i12 - 1)).entrySet().iterator();
                    while (it2.hasNext()) {
                        a(charSequence, match2, ((Integer) ((Map.Entry) it2.next()).getKey()).intValue() + 1, bVar, z10);
                    }
                } else {
                    a(charSequence, match2, 1, bVar, z10);
                }
            }
            int i13 = i11 + 1;
            a(charSequence, MatchFactory.createBruteforceMatch(0, i11, charSequence.subSequence(0, i13)), 1, bVar, z10);
            for (int i14 = 1; i14 <= i11; i14++) {
                Match matchCreateBruteforceMatch = MatchFactory.createBruteforceMatch(i14, i11, charSequence.subSequence(i14, i13));
                for (Map.Entry entry : ((Map) arrayList.get(i14 - 1)).entrySet()) {
                    int iIntValue = ((Integer) entry.getKey()).intValue();
                    if (((Match) entry.getValue()).pattern != Pattern.Bruteforce) {
                        a(charSequence, matchCreateBruteforceMatch, iIntValue + 1, bVar, z10);
                    }
                }
            }
            i11 = i13;
        }
        ArrayList arrayList3 = new ArrayList();
        int i15 = length - 1;
        ArrayList arrayList4 = bVar.f63637c;
        if (i15 >= 0) {
            Double dValueOf = Double.valueOf(Double.POSITIVE_INFINITY);
            int iIntValue2 = 0;
            for (Map.Entry entry2 : ((Map) arrayList4.get(i15)).entrySet()) {
                if (((Double) entry2.getValue()).doubleValue() < dValueOf.doubleValue()) {
                    iIntValue2 = ((Integer) entry2.getKey()).intValue();
                    dValueOf = (Double) entry2.getValue();
                }
            }
            int i16 = i15;
            while (i16 >= 0) {
                Match match3 = (Match) ((Map) arrayList.get(i16)).get(Integer.valueOf(iIntValue2));
                arrayList3.add(0, match3);
                i16 = match3.f63691i - 1;
                iIntValue2--;
            }
        }
        double dDoubleValue = charSequence.length() == 0 ? 1.0d : ((Double) ((Map) arrayList4.get(i15)).get(Integer.valueOf(arrayList3.size()))).doubleValue();
        Strength strength = new Strength();
        strength.setPassword(charSequence);
        strength.setGuesses(dDoubleValue);
        strength.setGuessesLog10(log10(dDoubleValue));
        strength.setSequence(arrayList3);
        return strength;
    }
}
