package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Match;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface Matcher {
    List<Match> execute(CharSequence charSequence);
}
