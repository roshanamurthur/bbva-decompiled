package com.adobe.marketing.mobile;

import android.content.IntentFilter;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AndroidNotificationHelper {
    private static final String INSTALL_REFERRER_ACTION = "com.android.vending.INSTALL_REFERRER";
    private static final EnumMap<SystemNotificationService.NotificationType, String> androidIntentActionMap = new EnumMap<>(SystemNotificationService.NotificationType.class);

    static {
        initializeAndroidIntentMap();
    }

    public static IntentFilter createIntentFilter(SystemNotificationService.NotificationType notificationType) {
        String intentActionForNotificationType = getIntentActionForNotificationType(notificationType);
        if (intentActionForNotificationType != null) {
            return new IntentFilter(intentActionForNotificationType);
        }
        return null;
    }

    private static String getIntentActionForNotificationType(SystemNotificationService.NotificationType notificationType) {
        return androidIntentActionMap.get(notificationType);
    }

    public static SystemNotificationService.NotificationType getNotificationTypeForAction(String str) {
        Iterator it = androidIntentActionMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != null && ((String) entry.getValue()).equalsIgnoreCase(str)) {
                return (SystemNotificationService.NotificationType) entry.getKey();
            }
        }
        return null;
    }

    private static void initializeAndroidIntentMap() {
        EnumMap<SystemNotificationService.NotificationType, String> enumMap = androidIntentActionMap;
        enumMap.put(SystemNotificationService.NotificationType.CONNECTIVITY_CHANGE, "android.net.conn.CONNECTIVITY_CHANGE");
        enumMap.put(SystemNotificationService.NotificationType.REFERRER_INFO_AVAILABLE, INSTALL_REFERRER_ACTION);
    }
}
