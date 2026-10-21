package com.adobe.marketing.mobile.services.ui;

/* JADX INFO: loaded from: classes2.dex */
public class AlertSetting {
    private String message;
    private String negativeButtonText;
    private String positiveButtonText;
    private String title;

    private AlertSetting() {
    }

    public static AlertSetting build(String str, String str2, String str3, String str4) {
        AlertSetting alertSetting = new AlertSetting();
        alertSetting.title = str;
        alertSetting.message = str2;
        alertSetting.positiveButtonText = str3;
        alertSetting.negativeButtonText = str4;
        return alertSetting;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNegativeButtonText() {
        return this.negativeButtonText;
    }

    public String getPositiveButtonText() {
        return this.positiveButtonText;
    }

    public String getTitle() {
        return this.title;
    }
}
