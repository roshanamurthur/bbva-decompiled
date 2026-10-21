package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Dictionary;
import com.nulabinc.zxcvbn.matchers.Keyboard;
import java.io.IOException;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: StandardContext.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static Context a() throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Dictionary dictionary : StandardDictionaries.loadAllDictionaries()) {
            linkedHashMap.put(dictionary.getName(), dictionary);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Keyboard keyboard : StandardKeyboards.loadAllKeyboards()) {
            linkedHashMap2.put(keyboard.getName(), keyboard);
        }
        return new Context(linkedHashMap, linkedHashMap2);
    }
}
