package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Context {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, Dictionary> f63625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Keyboard> f63626b;

    public Context(Map<String, Dictionary> map, Map<String, Keyboard> map2) {
        this.f63625a = map;
        this.f63626b = map2;
    }

    public Map<String, Dictionary> getDictionaryMap() {
        return Collections.unmodifiableMap(this.f63625a);
    }

    public Map<String, Keyboard> getKeyboardMap() {
        return Collections.unmodifiableMap(this.f63626b);
    }
}
