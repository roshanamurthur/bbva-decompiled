package com.huawei.hms.feature.install.featureinfo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, String>> f50405a = new HashMap();

    public final b a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, Map<String, String>> entry : this.f50405a.entrySet()) {
            map.put(entry.getKey(), Collections.unmodifiableMap(new HashMap(entry.getValue())));
        }
        return new b(Collections.unmodifiableMap(map));
    }

    public final c a(String str, String str2, String str3) {
        if (!this.f50405a.containsKey(str2)) {
            this.f50405a.put(str2, new HashMap());
        }
        this.f50405a.get(str2).put(str, str3);
        return this;
    }
}
