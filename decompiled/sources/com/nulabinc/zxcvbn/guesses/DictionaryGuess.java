package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import com.nulabinc.zxcvbn.matchers.Match;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class DictionaryGuess extends BaseGuess {
    public static final Pattern START_UPPER = Pattern.compile("^[A-Z][^A-Z]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f63656b = Pattern.compile("^[^A-Z]+[A-Z]$");
    public static final Pattern ALL_UPPER = Pattern.compile("^[^a-z]+$");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f63657c = Pattern.compile("^[^A-Z]+$");

    public DictionaryGuess(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Guess
    public double exec(Match match) {
        match.baseGuesses = Double.valueOf(match.rank);
        return match.rank * uppercaseVariations(match) * l33tVariations(match) * (match.reversed ? 2 : 1);
    }

    public int l33tVariations(Match match) {
        if (!match.l33t) {
            return 1;
        }
        int i10 = 1;
        for (Map.Entry<Character, Character> entry : match.sub.entrySet()) {
            Character key = entry.getKey();
            Character value = entry.getValue();
            int iNCk = 0;
            int i11 = 0;
            int i12 = 0;
            for (char c10 : WipeableString.lowerCase(match.token).charArray()) {
                if (c10 == key.charValue()) {
                    i11++;
                }
                if (c10 == value.charValue()) {
                    i12++;
                }
            }
            if (i11 == 0 || i12 == 0) {
                i10 *= 2;
            } else {
                int iMin = Math.min(i12, i11);
                for (int i13 = 1; i13 <= iMin; i13++) {
                    iNCk += BaseGuess.nCk(i12 + i11, i13);
                }
                i10 *= iNCk;
            }
        }
        return i10;
    }

    public int uppercaseVariations(Match match) {
        CharSequence charSequence = match.token;
        WipeableString wipeableStringLowerCase = WipeableString.lowerCase(charSequence);
        int iNCk = 0;
        if (f63657c.matcher(charSequence).find(0) || wipeableStringLowerCase.equals(charSequence)) {
            return 1;
        }
        Pattern[] patternArr = {START_UPPER, f63656b, ALL_UPPER};
        for (int i10 = 0; i10 < 3; i10++) {
            if (patternArr[i10].matcher(charSequence).find()) {
                return 2;
            }
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < charSequence.length(); i13++) {
            i11 += Character.isLowerCase(charSequence.charAt(i13)) ? 1 : 0;
            i12 += Character.isUpperCase(charSequence.charAt(i13)) ? 1 : 0;
        }
        for (int i14 = 1; i14 <= Math.min(i12, i11); i14++) {
            iNCk += BaseGuess.nCk(i12 + i11, i14);
        }
        wipeableStringLowerCase.wipe();
        return iNCk;
    }
}
