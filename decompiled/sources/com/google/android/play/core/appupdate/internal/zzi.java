package com.google.android.play.core.appupdate.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f46065a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f46065a = new HashMap();
        new zzm("PlayCoreVersion");
    }

    public static synchronized Map zza(String str) {
        HashMap map;
        try {
            map = f46065a;
            if (!map.containsKey("app_update")) {
                HashMap map2 = new HashMap();
                map2.put("java", 11004);
                map.put("app_update", map2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) map.get("app_update");
    }
}
