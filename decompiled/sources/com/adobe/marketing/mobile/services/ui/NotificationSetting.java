package com.adobe.marketing.mobile.services.ui;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationSetting {
    private String content;
    private String deeplink;
    private int delaySeconds;
    private long fireDate;
    private String identifier;
    private String sound;
    private String title;
    private Map<String, Object> userInfo;

    private NotificationSetting() {
    }

    public static NotificationSetting build(String str, String str2, long j10, int i10, String str3, Map<String, Object> map, String str4, String str5) {
        NotificationSetting notificationSetting = new NotificationSetting();
        notificationSetting.identifier = str;
        notificationSetting.content = str2;
        notificationSetting.fireDate = j10;
        notificationSetting.delaySeconds = i10;
        notificationSetting.deeplink = str3;
        notificationSetting.userInfo = map;
        notificationSetting.sound = str4;
        notificationSetting.title = str5;
        return notificationSetting;
    }

    public String getContent() {
        return this.content;
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    public int getDelaySeconds() {
        return this.delaySeconds;
    }

    public long getFireDate() {
        return this.fireDate;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getSound() {
        return this.sound;
    }

    public String getTitle() {
        return this.title;
    }

    public Map<String, Object> getUserInfo() {
        return this.userInfo;
    }
}
