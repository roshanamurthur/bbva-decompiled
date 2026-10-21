package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.Matcher;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseMatcher implements Matcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63663a;

    public class a implements Comparator<Match> {
        @Override // java.util.Comparator
        public final int compare(Match match, Match match2) {
            Match match3 = match;
            Match match4 = match2;
            int i10 = match3.f63691i - match4.f63691i;
            return i10 != 0 ? i10 : match3.f63692j - match4.f63692j;
        }
    }

    public BaseMatcher(Context context) {
        this.f63663a = context;
    }

    public List<Match> extend(List<Match> list, List<Match> list2) {
        list.addAll(list2);
        return list;
    }

    public Context getContext() {
        return this.f63663a;
    }

    public List<Match> sorted(List<Match> list) {
        Collections.sort(list, new a());
        return list;
    }

    public CharSequence translate(CharSequence charSequence, Map<Character, Character> map) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (map.containsKey(Character.valueOf(cCharAt))) {
                cCharAt = map.get(Character.valueOf(cCharAt)).charValue();
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append(((Character) it.next()).charValue());
        }
        WipeableString wipeableString = new WipeableString(sb2);
        WipeableString.wipeIfPossible(sb2);
        return wipeableString;
    }
}
