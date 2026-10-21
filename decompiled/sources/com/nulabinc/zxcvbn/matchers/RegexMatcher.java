package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class RegexMatcher extends BaseMatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f63719b;

    static {
        HashMap map = new HashMap();
        f63719b = map;
        map.put("recent_year", "19\\d\\d|200\\d|201\\d|202\\d");
    }

    public RegexMatcher(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : f63719b.entrySet()) {
            String str = (String) entry.getKey();
            Matcher matcher = Pattern.compile((String) entry.getValue()).matcher(charSequence);
            while (matcher.find()) {
                WipeableString wipeableString = new WipeableString(matcher.group());
                arrayList.add(MatchFactory.createRegexMatch(matcher.start(), (wipeableString.length() + matcher.start()) - 1, wipeableString, str, matcher));
            }
        }
        return sorted(arrayList);
    }
}
