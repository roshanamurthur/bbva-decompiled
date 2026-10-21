package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.MCService;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.util.l;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MCFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64777a = g.a("MCFirebaseMessagingService");

    private static MarketingCloudSdk a() {
        if (l.a(1000L, 50L) && MarketingCloudSdk.getInstance() != null) {
            return MarketingCloudSdk.getInstance();
        }
        g.e(f64777a, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
        return null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        g.d(f64777a, "onMessageReceived()", new Object[0]);
        a(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        a(this);
    }

    @VisibleForTesting
    public static void a(@NonNull Context context) {
        MarketingCloudSdk marketingCloudSdkA = a();
        if (marketingCloudSdkA == null) {
            g.e(f64777a, "Marketing Cloud SDK init failed.  Unable to update push token.", new Object[0]);
            return;
        }
        String strSenderId = marketingCloudSdkA.getMarketingCloudConfig().senderId();
        if (strSenderId != null) {
            MCService.b(context, strSenderId);
        } else {
            g.a(f64777a, "Received new token intent but senderId was not set.", new Object[0]);
        }
    }

    @VisibleForTesting
    public static void a(@Nullable RemoteMessage remoteMessage) {
        if (remoteMessage == null) {
            g.e(f64777a, "RemoteMessage was null.", new Object[0]);
            return;
        }
        String str = (remoteMessage.getData() == null || !remoteMessage.getData().containsKey(NotificationMessage.NOTIF_KEY_ID)) ? "Unknown Message" : remoteMessage.getData().get(NotificationMessage.NOTIF_KEY_ID);
        String str2 = f64777a;
        g.d(str2, "onMessageReceived() for MessageID: '%s'", str);
        MarketingCloudSdk marketingCloudSdkA = a();
        if (marketingCloudSdkA == null) {
            g.e(str2, "Marketing Cloud SDK init failed.  Push message ignored.", new Object[0]);
        } else {
            marketingCloudSdkA.getPushMessageManager().handleMessage(remoteMessage);
        }
    }
}
