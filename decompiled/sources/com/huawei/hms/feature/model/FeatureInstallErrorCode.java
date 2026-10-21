package com.huawei.hms.feature.model;

import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class FeatureInstallErrorCode {
    public static final int ACCESS_DENIED = -7;
    public static final int ACTIVE_SESSIONS_LIMIT_EXCEEDED = -1;
    public static final int API_NOT_AVAILABLE = -5;
    public static final HashMap<Integer, String> ERROR_INFO = new a();
    public static final int INCOMPATIBLE_WITH_EXISTING_SESSION = -8;
    public static final int INSTALL_APKS_FAILED = 904;
    public static final int INSUFFICIENT_STORAGE = -10;
    public static final int INTERNAL_ERROR = -100;
    public static final int INVALID_REQUEST = -3;
    public static final int MODULE_UNAVAILABLE = -2;
    public static final int NETWORK_ERROR = -6;
    public static final int NOT_SIGN_AGREEMENT = 901;
    public static final int NO_ERROR = 0;
    public static final int NO_INSTALL_PERMISSION = 903;
    public static final int REQUIRE_INSTALL_CONFIRM = 902;
    public static final int SERVICE_DIED = -9;
    public static final int SESSION_NOT_FOUND = -4;
    public static final int SPLITCOMPAT_COPY_ERROR = -13;
    public static final int SPLITCOMPAT_EMULATION_ERROR = -12;
    public static final int SPLITCOMPAT_VERIFICATION_ERROR = -11;

    public class a extends HashMap<Integer, String> {
        public a() {
            put(0, "Success!");
            put(-1, "Too many feature sessions in progress.");
            put(-2, "The feature module is unavailable.");
            put(-3, "Invalid request.");
            put(-4, "The session is not found.");
            put(-5, "The install api is not available.");
            put(-6, "Network error, cannot get feature info.");
            put(-7, "Access denied.");
            put(-8, "Incompatible with existing session.");
            put(-9, "The service is dead.");
            put(-10, "Insufficient storage.");
            put(-11, "The feature signature verified failed.");
            put(-12, "Emulation install failed.");
            put(-13, "Emulation install copy error.");
            put(-100, "Internal error.");
            put(901, "Didn't sign the agreement.");
            put(902, "Require install confirm.");
            put(903, "No install permission.");
            put(904, "Install feature apk failed.");
        }
    }
}
