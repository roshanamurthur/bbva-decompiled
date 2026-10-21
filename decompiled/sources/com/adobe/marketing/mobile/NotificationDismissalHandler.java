package com.adobe.marketing.mobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationDismissalHandler extends BroadcastReceiver {
    private static final String KEY_ACTION = "action";
    private static final String KEY_BROADLOG_ID = "broadlogId";
    private static final String KEY_DELIVERY_ID = "deliveryId";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Map map;
        if (!intent.hasExtra(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_USER_INFO_KEY) || (map = (Map) intent.getSerializableExtra(com.adobe.marketing.mobile.services.ui.AndroidUIService.NOTIFICATION_USER_INFO_KEY)) == null) {
            return;
        }
        HashMap map2 = new HashMap(3);
        map2.put(KEY_BROADLOG_ID, map.get(KEY_BROADLOG_ID));
        map2.put(KEY_DELIVERY_ID, map.get(KEY_DELIVERY_ID));
        map2.put("action", "2");
        MobileCore.collectMessageInfo(map2);
    }
}
