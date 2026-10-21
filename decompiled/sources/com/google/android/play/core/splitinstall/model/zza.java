package com.google.android.play.core.splitinstall.model;

import ai.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f46324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f46325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f46326c;

    static {
        HashMap map = new HashMap();
        f46324a = map;
        HashMap map2 = new HashMap();
        f46325b = map2;
        Integer numH = a.h(map, -1, "Too many sessions are running for current app, existing sessions must be resolved first.", -2, "A requested module is not available (to this user/device, for the installed apk).");
        Integer numH2 = a.h(map, -3, "Request is otherwise invalid.", -4, "Requested session is not found.");
        Integer numH3 = a.h(map, -5, "Split Install API is not available.", -6, "Network error: unable to obtain split details.");
        Integer numH4 = a.h(map, -7, "Download not permitted under current device circumstances (e.g. in background).", -8, "Requested session contains modules from an existing active session and also new modules.");
        Integer numH5 = a.h(map, -9, "Service handling split install has died.", -10, "Install failed due to insufficient storage.");
        Integer numH6 = a.h(map, -11, "Signature verification error when invoking SplitCompat.", -12, "Error in SplitCompat emulation.");
        Integer numH7 = a.h(map, -13, "Error in copying files for SplitCompat.", -14, "The Play Store app is either not installed or not the official version.");
        Integer numH8 = a.h(map, -15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -16, "The download is too large to start over the current connection.");
        map.put(-100, "Unknown error processing split install.");
        map2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        map2.put(numH, "MODULE_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(numH2, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(numH3, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(numH4, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        map2.put(-9, "SERVICE_DIED");
        map2.put(numH5, "INSUFFICIENT_STORAGE");
        map2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        map2.put(numH6, "SPLITCOMPAT_EMULATION_ERROR");
        map2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        map2.put(numH7, "PLAY_STORE_NOT_FOUND");
        map2.put(-15, "APP_NOT_OWNED");
        map2.put(numH8, "DOWNLOAD_TOO_LARGE");
        map2.put(-100, "INTERNAL_ERROR");
        f46326c = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            f46326c.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }

    @SplitInstallErrorCode
    public static int zza(String str) {
        Integer num = (Integer) f46326c.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" is unknown error."));
    }

    public static String zzb(@SplitInstallErrorCode int i10) {
        HashMap map = f46324a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        HashMap map2 = f46325b;
        if (!map2.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#" + ((String) map2.get(numValueOf)) + ")";
    }
}
