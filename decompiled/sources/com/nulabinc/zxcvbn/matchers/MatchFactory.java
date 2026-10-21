package com.nulabinc.zxcvbn.matchers;

import com.nulabinc.zxcvbn.Pattern;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes11.dex */
public class MatchFactory {
    public static Match createBruteforceMatch(int i10, int i11, CharSequence charSequence) {
        return new Match.Builder(Pattern.Bruteforce, i10, i11, charSequence).build();
    }

    public static Match createDateMatch(int i10, int i11, CharSequence charSequence, String str, int i12, int i13, int i14) {
        return new Match.Builder(Pattern.Date, i10, i11, charSequence).separator(str).year(i12).month(i13).day(i14).build();
    }

    public static Match createDictionaryL33tMatch(int i10, int i11, CharSequence charSequence, CharSequence charSequence2, int i12, String str, boolean z10, Map<Character, Character> map, String str2) {
        return new Match.Builder(Pattern.Dictionary, i10, i11, charSequence).matchedWord(charSequence2).rank(i12).dictionaryName(str).reversed(z10).sub(map).subDisplay(str2).l33t(true).build();
    }

    public static Match createDictionaryMatch(int i10, int i11, CharSequence charSequence, CharSequence charSequence2, int i12, String str) {
        return new Match.Builder(Pattern.Dictionary, i10, i11, charSequence).matchedWord(charSequence2).rank(i12).dictionaryName(str).reversed(false).l33t(false).build();
    }

    public static Match createRegexMatch(int i10, int i11, CharSequence charSequence, String str, Matcher matcher) {
        return new Match.Builder(Pattern.Regex, i10, i11, charSequence).regexName(str).regexMatch(matcher).build();
    }

    public static Match createRepeatMatch(int i10, int i11, CharSequence charSequence, CharSequence charSequence2, double d2, List<Match> list, int i12) {
        return new Match.Builder(Pattern.Repeat, i10, i11, charSequence).baseToken(charSequence2).baseGuesses(d2).baseMatches(list).repeatCount(i12).build();
    }

    public static Match createReversedDictionaryMatch(int i10, int i11, CharSequence charSequence, CharSequence charSequence2, int i12, String str) {
        return new Match.Builder(Pattern.Dictionary, i10, i11, charSequence).matchedWord(charSequence2).rank(i12).dictionaryName(str).reversed(true).l33t(false).build();
    }

    public static Match createSequenceMatch(int i10, int i11, CharSequence charSequence, String str, int i12, boolean z10) {
        return new Match.Builder(Pattern.Sequence, i10, i11, charSequence).sequenceName(str).sequenceSpace(i12).ascending(z10).build();
    }

    public static Match createSpatialMatch(int i10, int i11, CharSequence charSequence, String str, int i12, int i13) {
        return new Match.Builder(Pattern.Spatial, i10, i11, charSequence).graph(str).turns(i12).shiftedCount(i13).build();
    }
}
