package com.nulabinc.zxcvbn.guesses;

import ad.e;
import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import com.nulabinc.zxcvbn.matchers.Match;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class RegexGuess extends BaseGuess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f63660b;

    static {
        HashMap map = new HashMap();
        f63660b = map;
        map.put("alpha_lower", 26);
        map.put("alpha_upper", 26);
        map.put("alpha", 52);
        map.put("alphanumeric", 62);
        e.f(10, map, "digits", 33, "symbols");
    }

    public RegexGuess(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Guess
    public double exec(Match match) {
        int i10;
        HashMap map = f63660b;
        if (map.containsKey(match.regexName)) {
            return Math.pow(((Integer) map.get(match.regexName)).intValue(), match.tokenLength());
        }
        if (!"recent_year".equals(match.regexName)) {
            return 0.0d;
        }
        try {
            i10 = WipeableString.parseInt(match.token);
        } catch (NumberFormatException unused) {
            i10 = 0;
        }
        return Math.max(Math.abs(i10 - 2000), 20.0d);
    }
}
