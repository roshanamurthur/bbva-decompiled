package com.nulabinc.zxcvbn.guesses;

import com.nulabinc.zxcvbn.Context;
import com.nulabinc.zxcvbn.Guess;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseGuess implements Guess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f63655a;

    public BaseGuess(Context context) {
        this.f63655a = context;
    }

    public static int nCk(int i10, int i11) {
        if (i11 > i10) {
            return 0;
        }
        if (i11 == 0) {
            return 1;
        }
        int i12 = 1;
        for (int i13 = 1; i13 <= i11; i13++) {
            i12 = (i12 * i10) / i13;
            i10--;
        }
        return i12;
    }

    public Context getContext() {
        return this.f63655a;
    }
}
