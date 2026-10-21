package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
interface SystemNotificationService {

    public enum NotificationType {
        CONNECTIVITY_CHANGE,
        REFERRER_INFO_AVAILABLE
    }

    boolean registerForNotification(NotificationType notificationType);

    void unregisterForNotification(NotificationType notificationType);
}
