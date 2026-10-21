package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public enum MobilePrivacyStatus {
    OPT_IN("optedin"),
    OPT_OUT("optedout"),
    UNKNOWN("optunknown");

    private final String value;

    MobilePrivacyStatus(String str) {
        this.value = str;
    }

    public static MobilePrivacyStatus fromString(String str) {
        for (MobilePrivacyStatus mobilePrivacyStatus : values()) {
            if (mobilePrivacyStatus.value.equalsIgnoreCase(str)) {
                return mobilePrivacyStatus;
            }
        }
        return UNKNOWN;
    }

    public String getValue() {
        return this.value;
    }
}
