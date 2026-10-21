package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.matchers.Match;

/* JADX INFO: loaded from: classes11.dex */
public class BruteforceGuess extends BaseGuess {
    public BruteforceGuess(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Guess
    public double exec(Match match) {
        double dPow = Math.pow(10.0d, match.tokenLength());
        if (Double.isInfinite(dPow)) {
            dPow = Double.MAX_VALUE;
        }
        return Math.max(dPow, match.tokenLength() == 1 ? 11.0d : 51.0d);
    }
}
