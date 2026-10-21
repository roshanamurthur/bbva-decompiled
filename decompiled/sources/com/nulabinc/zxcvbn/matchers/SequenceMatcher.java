package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class SequenceMatcher extends BaseMatcher {
    public SequenceMatcher(Context context) {
        super(context);
    }

    public static Match a(CharSequence charSequence, int i10, int i11, Integer num) {
        String str;
        if ((i11 - i10 <= 1 && (num == null || Math.abs(num.intValue()) != 1)) || Math.abs(num.intValue()) <= 0 || Math.abs(num.intValue()) > 5) {
            return null;
        }
        WipeableString wipeableStringCopy = WipeableString.copy(charSequence, i10, i11 + 1);
        int i12 = 26;
        if (Pattern.compile("^[a-z]+$").matcher(wipeableStringCopy).find()) {
            str = "lower";
        } else if (Pattern.compile("^[A-Z]+$").matcher(wipeableStringCopy).find()) {
            str = "upper";
        } else if (Pattern.compile("^\\d+$").matcher(wipeableStringCopy).find()) {
            str = "digits";
            i12 = 10;
        } else {
            str = "unicode";
        }
        return MatchFactory.createSequenceMatch(i10, i11, wipeableStringCopy, str, i12, num.intValue() > 0);
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence != null && charSequence.length() != 1) {
            WipeableString wipeableString = new WipeableString(charSequence);
            int i10 = 0;
            Integer numValueOf = null;
            for (int i11 = 1; i11 < charSequence.length(); i11++) {
                int i12 = i11 - 1;
                int iCodePointAt = wipeableString.codePointAt(i11) - wipeableString.codePointAt(i12);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(iCodePointAt);
                }
                if (iCodePointAt != numValueOf.intValue()) {
                    Match matchA = a(charSequence, i10, i12, numValueOf);
                    if (matchA != null) {
                        arrayList.add(matchA);
                    }
                    numValueOf = Integer.valueOf(iCodePointAt);
                    i10 = i12;
                }
            }
            wipeableString.wipe();
            Match matchA2 = a(charSequence, i10, charSequence.length() - 1, numValueOf);
            if (matchA2 != null) {
                arrayList.add(matchA2);
            }
        }
        return arrayList;
    }
}
