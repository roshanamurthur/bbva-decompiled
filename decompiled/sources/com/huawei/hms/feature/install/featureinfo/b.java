package com.huawei.hms.feature.install.featureinfo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, String>> f50404a;

    public b(Map<String, Map<String, String>> map) {
        this.f50404a = map;
    }

    public final Map<String, Set<String>> a(Collection<String> collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        for (String str : this.f50404a.keySet()) {
            if (this.f50404a.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry<String, String> entry : this.f50404a.get(str).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add(entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.emptySet();
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }
}
