package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.matchers.Match;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes11.dex */
public class SequenceGuess extends BaseGuess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Character> f63661b = Arrays.asList('a', 'A', 'z', Character.valueOf(Matrix.MATRIX_TYPE_ZERO), '0', '1', '9');

    public SequenceGuess(Context context) {
        super(context);
    }

    @Override // com.nulabinc.zxcvbn.Guess
    public double exec(Match match) {
        double d2;
        char cCharAt = match.token.charAt(0);
        if (f63661b.contains(Character.valueOf(cCharAt))) {
            d2 = 4.0d;
        } else {
            d2 = Pattern.compile("\\d").matcher(String.valueOf(cCharAt)).find() ? 10.0d : 26.0d;
        }
        if (!match.ascending) {
            d2 *= 2.0d;
        }
        return d2 * ((double) match.tokenLength());
    }
}
