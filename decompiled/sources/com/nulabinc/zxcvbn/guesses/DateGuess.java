package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.matchers.Match;

/* JADX INFO: loaded from: classes11.dex */
public class DateGuess extends BaseGuess {
    public DateGuess(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Guess
    public double exec(Match match) {
        double dMax = ((double) Math.max(Math.abs(match.year - 2000), 20)) * 365.0d;
        String str = match.separator;
        return (str == null || str.isEmpty()) ? dMax : dMax * 4.0d;
    }
}
