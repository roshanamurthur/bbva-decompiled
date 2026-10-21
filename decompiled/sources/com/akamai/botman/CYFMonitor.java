package com.akamai.botman;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"Registered"})
public class CYFMonitor {
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = 15;
    public static final int WARN = 5;

    public interface CYFSDKInitCallback {
        void onSDKInitFailure(String str);

        void onSDKInitSuccess();
    }

    public interface ChallengeActionCallback {
        void onChallengeActionCancel();

        void onChallengeActionFailure(String str);

        void onChallengeActionSuccess();
    }

    public static HashMap<Integer, String> collectTestData() {
        return com.cyberfend.cyfsecurity.CYFMonitor.collectTestData();
    }

    public static synchronized void configureChallengeAction(Application application, String str) {
        if (str != null) {
            if (str.length() > 0) {
                ae.a().a(application, str);
            }
        }
    }

    public static synchronized void enableBackground() {
        com.cyberfend.cyfsecurity.CYFMonitor.enableBackground();
    }

    public static synchronized String getSensorData() {
        return com.cyberfend.cyfsecurity.CYFMonitor.getSensorData();
    }

    @Deprecated
    public static synchronized void initialize(Application application) {
        com.cyberfend.cyfsecurity.CYFMonitor.initialize(application);
    }

    public static synchronized void initializeSDK(Application application, String str) {
        com.cyberfend.cyfsecurity.CYFMonitor.initializeSDK(application, str);
    }

    public static synchronized void initializeSDKWithPow(Application application, String str) {
        com.cyberfend.cyfsecurity.CYFMonitor.initializeSDKWithPow(application, str);
    }

    public static void setLogLevel(int i10) {
        com.cyberfend.cyfsecurity.CYFMonitor.setLogLevel(i10);
    }

    public static void setSDKInitCallBack(CYFSDKInitCallback cYFSDKInitCallback) {
        com.cyberfend.cyfsecurity.CYFMonitor.setSDKInitCallBack(cYFSDKInitCallback);
    }

    public static boolean showChallengeAction(Activity activity, String str, int i10, int i11, int i12, ChallengeActionCallback challengeActionCallback) {
        return showChallengeAction(activity, str, activity.getString(i10), activity.getString(i11), activity.getString(i12), challengeActionCallback);
    }

    @Deprecated
    public static synchronized void initialize(Application application, String str) {
        com.cyberfend.cyfsecurity.CYFMonitor.initialize(application, str);
    }

    public static boolean showChallengeAction(Activity activity, String str, String str2, String str3, String str4, ChallengeActionCallback challengeActionCallback) {
        return a.a().a(activity, str2, str3, str4, challengeActionCallback, str);
    }
}
