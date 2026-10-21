package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.Matcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class OmnibusMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f63718b;

    public OmnibusMatcher(Context context, Map<String, Map<String, Integer>> map) {
        super(context);
        if (map == null) {
            this.f63718b = new HashMap();
        } else {
            this.f63718b = map;
        }
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        Context context = getContext();
        Map<String, Map<String, Integer>> map = this.f63718b;
        arrayList.add(new DictionaryMatcher(context, map));
        arrayList.add(new ReverseDictionaryMatcher(getContext(), map));
        arrayList.add(new L33tMatcher(getContext(), map));
        arrayList.add(new SpatialMatcher(getContext()));
        arrayList.add(new RepeatMatcher(getContext()));
        arrayList.add(new SequenceMatcher(getContext()));
        arrayList.add(new RegexMatcher(getContext()));
        arrayList.add(new DateMatcher(getContext()));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((Matcher) it.next()).execute(charSequence));
        }
        return sorted(arrayList2);
    }
}
