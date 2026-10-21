package com.google.android.play.core.review.model;

import ai.a;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f46230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f46231b;

    static {
        HashMap map = new HashMap();
        f46230a = map;
        HashMap map2 = new HashMap();
        f46231b = map2;
        Integer numH = a.h(map, -1, "The Play Store app is either not installed or not the official version.", -2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(numH, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String zza(int i10) {
        HashMap map = f46230a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f46231b.get(numValueOf)) + ")";
    }
}
