package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.Matching;
import com.nulabinc.zxcvbn.Scoring;
import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.WipeableString;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public class RepeatMatcher extends BaseMatcher {
    public RepeatMatcher(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Matcher
    public List<Match> execute(CharSequence charSequence) {
        String strGroup;
        ArrayList arrayList = new ArrayList();
        Pattern patternCompile = Pattern.compile("(.+)\\1+");
        Pattern patternCompile2 = Pattern.compile("(.+?)\\1+");
        Pattern patternCompile3 = Pattern.compile("^(.+?)\\1+$");
        int length = charSequence.length();
        Scoring scoring = new Scoring(getContext());
        int i10 = 0;
        while (i10 < length) {
            Matcher matcher = patternCompile.matcher(charSequence);
            Matcher matcher2 = patternCompile2.matcher(charSequence);
            matcher.region(i10, length);
            matcher2.region(i10, length);
            if (!matcher.find()) {
                break;
            }
            if (matcher.group(0).length() > (matcher2.find() ? matcher2.group(0).length() : 0)) {
                Matcher matcher3 = patternCompile3.matcher(matcher.group(0));
                strGroup = matcher3.find() ? matcher3.group(1) : matcher.group(0);
            } else {
                strGroup = matcher2.group(1);
                matcher = matcher2;
            }
            int iStart = matcher.start(0);
            int length2 = matcher.group(0).length() + matcher.start(0);
            Strength strengthMostGuessableMatchSequence = scoring.mostGuessableMatchSequence(strGroup, new Matching(getContext(), new ArrayList()).omnimatch(strGroup));
            List<Match> sequence = strengthMostGuessableMatchSequence.getSequence();
            double guesses = strengthMostGuessableMatchSequence.getGuesses();
            WipeableString wipeableString = new WipeableString(strGroup);
            arrayList.add(MatchFactory.createRepeatMatch(iStart, length2 - 1, matcher.group(0), wipeableString, guesses, sequence, matcher.group(0).length() / wipeableString.length()));
            i10 = length2;
        }
        return arrayList;
    }
}
