package com.google.android.play.core.install.model;

import ai.a;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.play:app-update@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f46126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f46127b;

    static {
        HashMap map = new HashMap();
        f46126a = map;
        HashMap map2 = new HashMap();
        f46127b = map2;
        Integer numH = a.h(map, -2, "An unknown error occurred.", -3, "The API is not available on this device.");
        Integer numH2 = a.h(map, -4, "The request that was sent by the app is malformed.", -5, "The install is unavailable to this user or device.");
        Integer numH3 = a.h(map, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", -7, "The install/update has not been (fully) downloaded yet.");
        Integer numH4 = a.h(map, -8, "The install is already in progress and there is no UI flow to resume.", -9, "The Play Store app is either not installed or not the official version.");
        Integer numH5 = a.h(map, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", -100, "An internal error happened in the Play Store.");
        map2.put(-2, "ERROR_UNKNOWN");
        map2.put(numH, "ERROR_API_NOT_AVAILABLE");
        map2.put(-4, "ERROR_INVALID_REQUEST");
        map2.put(numH2, "ERROR_INSTALL_UNAVAILABLE");
        map2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        map2.put(numH3, "ERROR_DOWNLOAD_NOT_PRESENT");
        map2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        map2.put(numH5, "ERROR_INTERNAL_ERROR");
        map2.put(numH4, "ERROR_PLAY_STORE_NOT_FOUND");
        map2.put(-10, "ERROR_APP_NOT_OWNED");
        map2.put(numH5, "ERROR_INTERNAL_ERROR");
    }

    public static String zza(@InstallErrorCode int i10) {
        HashMap map = f46126a;
        Integer numValueOf = Integer.valueOf(i10);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        HashMap map2 = f46127b;
        if (!map2.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) map2.get(numValueOf)) + ")";
    }
}
