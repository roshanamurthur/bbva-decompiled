package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import com.nulabinc.zxcvbn.matchers.Match;

/* JADX INFO: loaded from: classes11.dex */
public class SpatialGuess extends BaseGuess {
    public SpatialGuess(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Guess
    public double exec(Match match) {
        int i10;
        double d2;
        Keyboard keyboard = getContext().getKeyboardMap().get(match.graph);
        int startingPositions = keyboard.getStartingPositions();
        double averageDegree = keyboard.getAverageDegree();
        int i11 = match.tokenLength();
        int i12 = match.turns;
        double dPow = 0.0d;
        int i13 = 2;
        while (true) {
            i10 = 1;
            if (i13 > i11) {
                break;
            }
            int i14 = i13 - 1;
            int iMin = Math.min(i12, i14);
            while (i10 <= iMin) {
                dPow += Math.pow(averageDegree, i10) * ((double) (BaseGuess.nCk(i14, i10 - 1) * startingPositions));
                i10++;
            }
            i13++;
        }
        if (match.shiftedCount.intValue() <= 0) {
            return dPow;
        }
        int iIntValue = match.shiftedCount.intValue();
        int iIntValue2 = match.tokenLength() - match.shiftedCount.intValue();
        if (iIntValue2 == 0) {
            d2 = 2.0d;
        } else {
            int iNCk = 0;
            while (i10 <= Math.min(iIntValue, iIntValue2)) {
                iNCk += BaseGuess.nCk(iIntValue + iIntValue2, i10);
                i10++;
            }
            d2 = iNCk;
        }
        return dPow * d2;
    }
}
