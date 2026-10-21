package com.nulabinc.zxcvbn.matchers;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.Guess;
import com.nulabinc.zxcvbn.Scoring;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class DateMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f63664d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f63665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pattern f63666c;

    public class a extends ArrayList<Integer[]> {
    }

    public class b extends ArrayList<Integer[]> {
    }

    public class c extends ArrayList<Integer[]> {
    }

    public class d extends ArrayList<Integer[]> {
    }

    public class e extends ArrayList<Integer[]> {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63668b;

        public f(int i10, int i11) {
            this.f63667a = i10;
            this.f63668b = i11;
        }
    }

    public static class g extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63669c;

        public g(int i10, int i11, int i12) {
            super(i10, i11);
            this.f63669c = i12;
        }
    }

    static {
        HashMap map = new HashMap();
        f63664d = map;
        a aVar = new a();
        aVar.add(new Integer[]{1, 2});
        aVar.add(new Integer[]{2, 3});
        map.put(4, aVar);
        b bVar = new b();
        bVar.add(new Integer[]{1, 3});
        bVar.add(new Integer[]{2, 3});
        map.put(5, bVar);
        c cVar = new c();
        cVar.add(new Integer[]{1, 2});
        cVar.add(new Integer[]{2, 4});
        cVar.add(new Integer[]{4, 5});
        map.put(6, cVar);
        d dVar = new d();
        dVar.add(new Integer[]{1, 3});
        dVar.add(new Integer[]{2, 3});
        dVar.add(new Integer[]{4, 5});
        dVar.add(new Integer[]{4, 6});
        map.put(7, dVar);
        e eVar = new e();
        eVar.add(new Integer[]{2, 4});
        eVar.add(new Integer[]{4, 6});
        map.put(8, eVar);
    }

    public DateMatcher(Context context) {
        super(context);
        this.f63665b = Pattern.compile("^\\d{4,8}$");
        this.f63666c = Pattern.compile("^(\\d{1,4})([\\s/\\\\_.-])(\\d{1,2})\\2(\\d{1,4})$");
    }

    public static f a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        ArrayList<List> arrayList2 = new ArrayList();
        arrayList2.add(list);
        arrayList2.add(arrayList);
        for (List list2 : arrayList2) {
            int iIntValue = ((Integer) list2.get(0)).intValue();
            int iIntValue2 = ((Integer) list2.get(1)).intValue();
            if (1 <= iIntValue && iIntValue <= 31 && 1 <= iIntValue2 && iIntValue2 <= 12) {
                return new f(iIntValue, iIntValue2);
            }
        }
        return null;
    }

    public static g b(ArrayList arrayList) {
        if (((Integer) arrayList.get(1)).intValue() <= 31 && ((Integer) arrayList.get(1)).intValue() > 0) {
            Iterator it = arrayList.iterator();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if ((99 < iIntValue && iIntValue < 1000) || iIntValue > 2050) {
                    return null;
                }
                if (iIntValue > 31) {
                    i10++;
                }
                if (iIntValue > 12) {
                    i11++;
                }
                if (iIntValue <= 0) {
                    i12++;
                }
            }
            if (i10 < 2 && i11 != 3 && i12 < 2) {
                HashMap map = new HashMap();
                map.put(arrayList.get(2), arrayList.subList(0, 2));
                map.put(arrayList.get(0), arrayList.subList(1, 3));
                for (Map.Entry entry : map.entrySet()) {
                    int iIntValue2 = ((Integer) entry.getKey()).intValue();
                    List list = (List) entry.getValue();
                    if (1000 <= iIntValue2 && iIntValue2 <= 2050) {
                        f fVarA = a(list);
                        if (fVarA != null) {
                            return new g(fVarA.f63667a, fVarA.f63668b, iIntValue2);
                        }
                        return null;
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int iIntValue3 = ((Integer) entry2.getKey()).intValue();
                    f fVarA2 = a((List) entry2.getValue());
                    if (fVarA2 != null) {
                        if (iIntValue3 <= 99) {
                            iIntValue3 = iIntValue3 > 50 ? iIntValue3 + ReturnCode.ERR_REPOSITORY : iIntValue3 + Guess.REFERENCE_YEAR;
                        }
                        return new g(fVarA2.f63667a, fVarA2.f63668b, iIntValue3);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        ArrayList<Match> arrayList = new ArrayList();
        for (int i10 = 0; i10 <= charSequence.length() - 4; i10++) {
            int i11 = i10 + 3;
            while (i11 <= i10 + 7 && i11 < charSequence.length()) {
                int i12 = i11 + 1;
                WipeableString wipeableStringCopy = WipeableString.copy(charSequence, i10, i12);
                if (this.f63665b.matcher(wipeableStringCopy).find()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Integer[] numArr : (ArrayList) f63664d.get(Integer.valueOf(wipeableStringCopy.length()))) {
                        int iIntValue = numArr[0].intValue();
                        int iIntValue2 = numArr[1].intValue();
                        ArrayList arrayList3 = new ArrayList();
                        try {
                            arrayList3.add(Integer.valueOf(WipeableString.parseInt(wipeableStringCopy.subSequence(0, iIntValue))));
                            arrayList3.add(Integer.valueOf(WipeableString.parseInt(wipeableStringCopy.subSequence(iIntValue, iIntValue2))));
                            arrayList3.add(Integer.valueOf(WipeableString.parseInt(wipeableStringCopy.subSequence(iIntValue2, wipeableStringCopy.length()))));
                            g gVarB = b(arrayList3);
                            if (gVarB != null) {
                                arrayList2.add(gVarB);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        wipeableStringCopy.wipe();
                    } else {
                        g gVar = (g) arrayList2.get(0);
                        int iAbs = Math.abs(((g) arrayList2.get(0)).f63669c - Scoring.REFERENCE_YEAR);
                        for (g gVar2 : arrayList2.subList(1, arrayList2.size())) {
                            int iAbs2 = Math.abs(gVar2.f63669c - Scoring.REFERENCE_YEAR);
                            if (iAbs2 < iAbs) {
                                gVar = gVar2;
                                iAbs = iAbs2;
                            }
                        }
                        arrayList.add(MatchFactory.createDateMatch(i10, i11, wipeableStringCopy, "", gVar.f63669c, gVar.f63668b, gVar.f63667a));
                    }
                } else {
                    wipeableStringCopy.wipe();
                }
                i11 = i12;
            }
        }
        for (int i13 = 0; i13 <= charSequence.length() - 6; i13++) {
            int i14 = i13 + 5;
            while (true) {
                int i15 = i14;
                if (i15 > i13 + 9 || i15 >= charSequence.length()) {
                    break;
                }
                i14 = i15 + 1;
                WipeableString wipeableStringCopy2 = WipeableString.copy(charSequence, i13, i14);
                Matcher matcher = this.f63666c.matcher(wipeableStringCopy2);
                if (matcher.find()) {
                    ArrayList arrayList4 = new ArrayList();
                    try {
                        arrayList4.add(Integer.valueOf(WipeableString.parseInt(matcher.group(1))));
                        arrayList4.add(Integer.valueOf(WipeableString.parseInt(matcher.group(3))));
                        arrayList4.add(Integer.valueOf(WipeableString.parseInt(matcher.group(4))));
                        g gVarB2 = b(arrayList4);
                        if (gVarB2 == null) {
                            wipeableStringCopy2.wipe();
                        } else {
                            arrayList.add(MatchFactory.createDateMatch(i13, i15, wipeableStringCopy2, matcher.group(2), gVarB2.f63669c, gVarB2.f63668b, gVarB2.f63667a));
                        }
                    } catch (NumberFormatException unused2) {
                        wipeableStringCopy2.wipe();
                    }
                } else {
                    wipeableStringCopy2.wipe();
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Match match : arrayList) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList5.add(match);
                    break;
                }
                Match match2 = (Match) it.next();
                if (!match.equals(match2) && match2.f63691i <= match.f63691i && match2.f63692j >= match.f63692j) {
                    break;
                }
            }
        }
        return sorted(arrayList5);
    }
}
