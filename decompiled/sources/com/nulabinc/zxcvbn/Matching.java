package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Match;
import com.nulabinc.zxcvbn.matchers.OmnibusMatcher;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Matching {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63633a;
    protected final Map<String, Map<String, Integer>> rankedDictionaries;

    public Matching(Context context, List<String> list) {
        this.f63633a = context;
        LinkedHashMap linkedHashMap = new LinkedHashMap(context.getDictionaryMap());
        linkedHashMap.put("user_inputs", new Dictionary("user_inputs", list));
        HashMap map = new HashMap();
        for (Dictionary dictionary : linkedHashMap.values()) {
            map.put(dictionary.getName(), dictionary.getRankedDictionary());
        }
        this.rankedDictionaries = map;
    }

    public List<Match> omnimatch(CharSequence charSequence) {
        return new OmnibusMatcher(this.f63633a, this.rankedDictionaries).execute(charSequence);
    }
}
