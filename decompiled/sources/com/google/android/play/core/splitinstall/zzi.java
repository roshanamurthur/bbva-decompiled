package com.google.android.play.core.splitinstall;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46363a = new HashMap();

    public final zzi zza(String str, String str2, String str3) {
        HashMap map = this.f46363a;
        if (!map.containsKey(str2)) {
            map.put(str2, new HashMap());
        }
        ((Map) map.get(str2)).put(str, str3);
        return this;
    }

    public final zzk zzb() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f46363a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new zzk(Collections.unmodifiableMap(map));
    }
}
