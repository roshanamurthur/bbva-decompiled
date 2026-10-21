package com.esotericsoftware.kryo.serializers;

import android.app.NotificationChannel;
import com.google.firebase.messaging.CommonNotificationBuilder;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import java.nio.file.Path;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g0 {
    public static /* synthetic */ NotificationChannel b(String str) {
        return new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, str, 3);
    }

    public static /* bridge */ /* synthetic */ Path d(Object obj) {
        return (Path) obj;
    }

    public static /* synthetic */ NotificationChannel i(String str) {
        return new NotificationChannel(NotificationManager.DEFAULT_CHANNEL_ID, str, 3);
    }
}
