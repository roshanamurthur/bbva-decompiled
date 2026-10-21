package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class DictionaryMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f63675b;

    public DictionaryMatcher(Context context, Map<String, Map<String, Integer>> map) {
        super(context);
        if (map == null) {
            this.f63675b = new HashMap();
        } else {
            this.f63675b = map;
        }
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int length = charSequence.length();
        WipeableString wipeableStringLowerCase = WipeableString.lowerCase(charSequence);
        for (Map.Entry<String, Map<String, Integer>> entry : this.f63675b.entrySet()) {
            String key = entry.getKey();
            Map<String, Integer> value = entry.getValue();
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    String string = wipeableStringLowerCase.subSequence(i10, i12).toString();
                    if (value.containsKey(string)) {
                        arrayList.add(MatchFactory.createDictionaryMatch(i10, i11, WipeableString.copy(charSequence, i10, i12), string, value.get(string).intValue(), key));
                    }
                    i11 = i12;
                }
            }
        }
        wipeableStringLowerCase.wipe();
        return sorted(arrayList);
    }
}
