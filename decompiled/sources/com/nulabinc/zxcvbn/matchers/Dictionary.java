package com.nulabinc.zxcvbn.matchers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Dictionary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f63671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f63672c;

    public Dictionary(String str, List<String> list) {
        this.f63670a = str;
        this.f63671b = list;
        HashMap map = new HashMap();
        Iterator<String> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            map.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        this.f63672c = map;
    }

    public List<String> getFrequencies() {
        return this.f63671b;
    }

    public String getName() {
        return this.f63670a;
    }

    public Map<String, Integer> getRankedDictionary() {
        return this.f63672c;
    }
}
