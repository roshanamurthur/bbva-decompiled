package com.salesforce.marketingcloud.messages.push;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PushMessageManager {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final String f64778d = g.a("PushMessageManager");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64779e = "com.salesforce.marketingcloud.messages.push.TOKEN_REFRESHED";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64780f = "com.salesforce.marketingcloud.push.TOKEN_REFRESH_SUCCESSFUL";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64781g = "com.salesforce.marketingcloud.push.TOKEN_SENDER_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64782h = "com.salesforce.marketingcloud.notifications.PUSH_ENABLED";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String f64783i = "com.salesforce.marketingcloud.push.TOKEN";

    @MCKeep
    public interface PushTokenRefreshListener {
        void onTokenRefreshed(@Nullable String str);
    }

    @MCKeep
    public interface SilentPushListener {
        void silentPushReceived(@NonNull Map<String, String> map);
    }

    @MCKeep
    public static boolean isMarketingCloudPush(@NonNull RemoteMessage remoteMessage) {
        return remoteMessage != null && isMarketingCloudPush(remoteMessage.getData());
    }

    @MCKeep
    public abstract void disablePush();

    @MCKeep
    public abstract void enablePush();

    @NonNull
    @MCKeep
    public abstract JSONObject getPushDebugInfo();

    @Nullable
    @MCKeep
    public abstract String getPushToken();

    @MCKeep
    public abstract boolean handleMessage(@NonNull RemoteMessage remoteMessage);

    @MCKeep
    public abstract boolean handleMessage(@NonNull Map<String, String> map);

    @MCKeep
    public abstract boolean isPushEnabled();

    @MCKeep
    public abstract void registerSilentPushListener(@NonNull SilentPushListener silentPushListener);

    @MCKeep
    public abstract void registerTokenRefreshListener(@NonNull PushTokenRefreshListener pushTokenRefreshListener);

    @MCKeep
    public abstract void setPushToken(@NonNull String str);

    @MCKeep
    public abstract void unregisterSilentPushListener(@NonNull SilentPushListener silentPushListener);

    @MCKeep
    public abstract void unregisterTokenRefreshListener(@NonNull PushTokenRefreshListener pushTokenRefreshListener);

    @MCKeep
    public static boolean isMarketingCloudPush(@NonNull Map<String, String> map) {
        return map != null && "SFMC".equalsIgnoreCase(map.get(NotificationMessage.NOTIF_KEY_SID));
    }
}
