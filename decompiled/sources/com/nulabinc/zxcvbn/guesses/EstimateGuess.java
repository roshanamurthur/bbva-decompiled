package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.Guess;
import com.nulabinc.zxcvbn.Pattern;
import com.nulabinc.zxcvbn.Scoring;
import com.nulabinc.zxcvbn.matchers.Match;

/* JADX INFO: loaded from: classes11.dex */
public class EstimateGuess extends BaseGuess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f63658b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63659a;

        static {
            int[] iArr = new int[Pattern.values().length];
            f63659a = iArr;
            try {
                iArr[Pattern.Bruteforce.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63659a[Pattern.Dictionary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63659a[Pattern.Spatial.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63659a[Pattern.Repeat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63659a[Pattern.Sequence.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63659a[Pattern.Regex.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63659a[Pattern.Date.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public EstimateGuess(Context context, CharSequence charSequence) {
        super(context);
        this.f63658b = charSequence;
    }

    @Override // com.nulabinc.zxcvbn.Guess
    public double exec(Match match) {
        Guess bruteforceGuess;
        Double d2 = match.guesses;
        if (d2 != null) {
            return d2.doubleValue();
        }
        int i10 = 1;
        if (match.tokenLength() < this.f63658b.length()) {
            i10 = match.tokenLength() == 1 ? 10 : 50;
        }
        switch (a.f63659a[match.pattern.ordinal()]) {
            case 1:
                bruteforceGuess = new BruteforceGuess(getContext());
                break;
            case 2:
                bruteforceGuess = new DictionaryGuess(getContext());
                break;
            case 3:
                bruteforceGuess = new SpatialGuess(getContext());
                break;
            case 4:
                bruteforceGuess = new RepeatGuess(getContext());
                break;
            case 5:
                bruteforceGuess = new SequenceGuess(getContext());
                break;
            case 6:
                bruteforceGuess = new RegexGuess(getContext());
                break;
            case 7:
                bruteforceGuess = new DateGuess(getContext());
                break;
            default:
                bruteforceGuess = null;
                break;
        }
        Double dValueOf = Double.valueOf(Math.max(bruteforceGuess != null ? bruteforceGuess.exec(match) : 0.0d, i10));
        match.guesses = dValueOf;
        match.guessesLog10 = Double.valueOf(Scoring.log10(dValueOf.doubleValue()));
        return match.guesses.doubleValue();
    }
}
