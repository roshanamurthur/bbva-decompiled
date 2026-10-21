package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.guesses.DictionaryGuess;
import com.nulabinc.zxcvbn.matchers.Match;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

/* JADX INFO: loaded from: classes11.dex */
public class Zxcvbn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63652a;

    public Zxcvbn() {
        try {
            this.f63652a = a.a();
        } catch (IOException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public Matching createMatching(List<String> list) {
        return new Matching(this.f63652a, list);
    }

    public Strength measure(CharSequence charSequence) {
        return measure(charSequence, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.nulabinc.zxcvbn.Zxcvbn] */
    public Strength measure(CharSequence charSequence, List<String> list) {
        ?? EmptyList;
        Feedback feedback;
        Feedback feedback2;
        if (charSequence == null) {
            throw new IllegalArgumentException("Password is null.");
        }
        if (list == null || list.isEmpty()) {
            EmptyList = Collections.emptyList();
        } else {
            EmptyList = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                EmptyList.add(it.next().toLowerCase());
            }
        }
        long jNanoTime = System.nanoTime();
        Strength strengthMostGuessableMatchSequence = new Scoring(this.f63652a).mostGuessableMatchSequence(charSequence, createMatching(EmptyList).omnimatch(charSequence));
        strengthMostGuessableMatchSequence.setCalcTime(System.nanoTime() - jNanoTime);
        AttackTimes attackTimesEstimateAttackTimes = TimeEstimates.estimateAttackTimes(strengthMostGuessableMatchSequence.getGuesses());
        strengthMostGuessableMatchSequence.setCrackTimeSeconds(attackTimesEstimateAttackTimes.getCrackTimeSeconds());
        strengthMostGuessableMatchSequence.setCrackTimesDisplay(attackTimesEstimateAttackTimes.getCrackTimesDisplay());
        strengthMostGuessableMatchSequence.setScore(attackTimesEstimateAttackTimes.getScore());
        int score = strengthMostGuessableMatchSequence.getScore();
        List<Match> sequence = strengthMostGuessableMatchSequence.getSequence();
        ResourceBundle.Control control = Feedback.f63627c;
        String str = null;
        if (sequence.size() == 0) {
            feedback2 = new Feedback(null, Feedback.DEFAULT_SUGGESTIONS_USE_FEW_WORDS, Feedback.DEFAULT_SUGGESTIONS_NO_NEED_SYMBOLS);
        } else if (score <= 2) {
            Match match = sequence.get(0);
            if (sequence.size() > 1) {
                for (Match match2 : sequence.subList(1, sequence.size())) {
                    if (match2.tokenLength() > match.tokenLength()) {
                        match = match2;
                    }
                }
            }
            boolean z10 = sequence.size() == 1;
            switch (Feedback.a.f63630a[match.pattern.ordinal()]) {
                case 1:
                    if (StandardDictionaries.PASSWORDS.equals(match.dictionaryName)) {
                        if (z10 && !match.l33t && !match.reversed) {
                            int i10 = match.rank;
                            str = i10 <= 10 ? Feedback.DICTIONARY_WARNING_PASSWORDS_TOP10 : i10 <= 100 ? Feedback.DICTIONARY_WARNING_PASSWORDS_TOP100 : Feedback.DICTIONARY_WARNING_PASSWORDS_VERY_COMMON;
                        } else if (match.guessesLog10.doubleValue() <= 4.0d) {
                            str = Feedback.DICTIONARY_WARNING_PASSWORDS_SIMILAR;
                        }
                    } else if (StandardDictionaries.ENGLISH_WIKIPEDIA.equals(match.dictionaryName)) {
                        if (z10) {
                            str = Feedback.DICTIONARY_WARNING_ENGLISH_WIKIPEDIA_ITSELF;
                        }
                    } else if (Arrays.asList(StandardDictionaries.SURNAMES, StandardDictionaries.MALE_NAMES, StandardDictionaries.FEMALE_NAMES).contains(match.dictionaryName)) {
                        str = z10 ? Feedback.DICTIONARY_WARNING_ETC_NAMES_THEMSELVES : Feedback.DICTIONARY_WARNING_ETC_NAMES_COMMON;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Feedback.EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD);
                    CharSequence charSequence2 = match.token;
                    WipeableString wipeableStringLowerCase = WipeableString.lowerCase(charSequence2);
                    if (DictionaryGuess.START_UPPER.matcher(charSequence2).find()) {
                        arrayList.add(Feedback.DICTIONARY_SUGGESTIONS_CAPITALIZATION);
                    } else if (DictionaryGuess.ALL_UPPER.matcher(charSequence2).find() && !wipeableStringLowerCase.equals(charSequence2)) {
                        arrayList.add(Feedback.DICTIONARY_SUGGESTIONS_ALL_UPPERCASE);
                    }
                    if (match.reversed && match.tokenLength() >= 4) {
                        arrayList.add(Feedback.DICTIONARY_SUGGESTIONS_REVERSED);
                    }
                    if (match.l33t) {
                        arrayList.add(Feedback.DICTIONARY_SUGGESTIONS_L33T);
                    }
                    wipeableStringLowerCase.wipe();
                    feedback = new Feedback(str, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    feedback2 = feedback;
                    break;
                case 2:
                    feedback2 = new Feedback(match.turns == 1 ? Feedback.SPATIAL_WARNING_STRAIGHT_ROWS_OF_KEYS : Feedback.SPATIAL_WARNING_SHORT_KEYBOARD_PATTERNS, Feedback.EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD, Feedback.SPATIAL_SUGGESTIONS_USE_LONGER_KEYBOARD_PATTERN);
                    break;
                case 3:
                    feedback2 = new Feedback(match.baseToken.length() == 1 ? Feedback.REPEAT_WARNING_LIKE_AAA : Feedback.REPEAT_WARNING_LIKE_ABCABCABC, Feedback.EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD, Feedback.REPEAT_SUGGESTIONS_AVOID_REPEATED_WORDS);
                    break;
                case 4:
                    feedback = new Feedback(Feedback.SEQUENCE_WARNING_LIKE_ABCOR6543, Feedback.EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD, Feedback.SEQUENCE_SUGGESTIONS_AVOID_SEQUENCES);
                    feedback2 = feedback;
                    break;
                case 5:
                    feedback2 = new Feedback("recent_year".equals(match.regexName) ? Feedback.REGEX_WARNING_RECENT_YEARS : null, Feedback.EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD, Feedback.REGEX_SUGGESTIONS_AVOID_RECENT_YEARS);
                    break;
                case 6:
                    feedback = new Feedback(Feedback.DATE_WARNING_DATES, Feedback.EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD, Feedback.DATE_SUGGESTIONS_AVOID_DATES);
                    feedback2 = feedback;
                    break;
                default:
                    feedback2 = new Feedback(null, Feedback.EXTRA_SUGGESTIONS_ADD_ANOTHER_WORD);
                    break;
            }
        } else {
            feedback2 = new Feedback(null, new String[0]);
        }
        strengthMostGuessableMatchSequence.setFeedback(feedback2);
        return strengthMostGuessableMatchSequence;
    }

    public Zxcvbn(Context context) {
        this.f63652a = context;
    }
}
