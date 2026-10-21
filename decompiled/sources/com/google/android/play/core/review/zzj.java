package com.google.android.play.core.review;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f46242a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f46242a = new HashMap();
        new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");
    }

    public static Bundle zza() {
        Bundle bundle = new Bundle();
        Map mapZzb = zzb();
        bundle.putInt("playcore_version_code", ((Integer) mapZzb.get("java")).intValue());
        if (mapZzb.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) mapZzb.get("native")).intValue());
        }
        if (mapZzb.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) mapZzb.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map zzb() {
        HashMap map;
        map = f46242a;
        map.put("java", 11004);
        return map;
    }
}
