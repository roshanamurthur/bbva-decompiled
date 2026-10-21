package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ReverseDictionaryMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f63720b;

    public ReverseDictionaryMatcher(Context context, Map<String, Map<String, Integer>> map) {
        super(context);
        if (map == null) {
            this.f63720b = new HashMap();
        } else {
            this.f63720b = map;
        }
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        WipeableString wipeableStringReversed = WipeableString.reversed(charSequence);
        ArrayList arrayList = new ArrayList();
        for (Match match : new DictionaryMatcher(getContext(), this.f63720b).execute(wipeableStringReversed)) {
            arrayList.add(MatchFactory.createReversedDictionaryMatch((charSequence.length() - 1) - match.f63692j, (charSequence.length() - 1) - match.f63691i, WipeableString.reversed(match.token), match.matchedWord, match.rank, match.dictionaryName));
        }
        return sorted(arrayList);
    }
}
