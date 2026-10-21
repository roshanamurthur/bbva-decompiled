package com.adobe.marketing.mobile.services.ui;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface UIService {
    FloatingButton createFloatingButton(FloatingButtonListener floatingButtonListener);

    @Deprecated
    FullscreenMessage createFullscreenMessage(String str, FullscreenMessageDelegate fullscreenMessageDelegate, boolean z10, MessageSettings messageSettings);

    FullscreenMessage createFullscreenMessage(String str, MessageSettings messageSettings);

    FullscreenMessage createFullscreenMessage(String str, MessageSettings messageSettings, Map<String, String> map);

    void showAlert(AlertSetting alertSetting, AlertListener alertListener);

    void showLocalNotification(NotificationSetting notificationSetting);

    boolean showUrl(String str);
}
