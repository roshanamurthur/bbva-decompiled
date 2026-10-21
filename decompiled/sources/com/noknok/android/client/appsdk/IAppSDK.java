package com.noknok.android.client.appsdk;

import android.app.Activity;
import android.content.Context;
import com.noknok.android.client.utils.ActivityProxy;

/* JADX INFO: loaded from: classes11.dex */
public interface IAppSDK {

    public enum ClientLocation {
        REMOTE_CLIENT,
        LOCAL_CLIENT
    }

    public static class InitNotCalledException extends RuntimeException {
    }

    @Deprecated
    void autoSetSignature(Activity activity, String str);

    @Deprecated
    void autoSetSignature(Activity activity, String str, String str2);

    @Deprecated
    void autoSetSignature(Activity activity, String str, String str2, String[] strArr);

    void autoSetSignature(ActivityProxy activityProxy, String str);

    void autoSetSignature(ActivityProxy activityProxy, String str, String str2);

    void autoSetSignature(ActivityProxy activityProxy, String str, String str2, String[] strArr);

    void cancel();

    @Deprecated
    ResultType checkAuthPossible(Activity activity, String str);

    @Deprecated
    ResultType checkAuthPossible(Activity activity, String str, String str2);

    ResultType checkAuthPossible(ActivityProxy activityProxy, String str);

    ResultType checkAuthPossible(ActivityProxy activityProxy, String str, String str2);

    ProtocolType getProtocolType();

    @Deprecated
    boolean hasPlatformAuthenticator(Activity activity);

    boolean hasPlatformAuthenticator(ActivityProxy activityProxy);

    ResultType init(Context context);

    FidoOut process(FidoIn fidoIn);
}
