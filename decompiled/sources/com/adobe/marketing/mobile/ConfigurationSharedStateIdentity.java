package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
final class ConfigurationSharedStateIdentity {
    String orgID = null;
    MobilePrivacyStatus privacyStatus = IdentityConstants.Defaults.DEFAULT_MOBILE_PRIVACY;
    String marketingCloudServer = "dpm.demdex.net";

    public boolean canSyncIdentifiersWithCurrentConfiguration() {
        return (StringUtils.isNullOrEmpty(this.orgID) || this.privacyStatus == MobilePrivacyStatus.OPT_OUT) ? false : true;
    }

    public void getConfigurationProperties(EventData eventData) {
        if (eventData == null) {
            Log.debug("IdentityExtension", "getConfigurationProperties : Using default configurations because config state was null.", new Object[0]);
            return;
        }
        this.orgID = eventData.optString(EventDataKeys.Configuration.CONFIG_EXPERIENCE_CLOUD_ORGID_KEY, null);
        String strOptString = eventData.optString("experienceCloud.server", "dpm.demdex.net");
        this.marketingCloudServer = strOptString;
        if (StringUtils.isNullOrEmpty(strOptString)) {
            this.marketingCloudServer = "dpm.demdex.net";
        }
        this.privacyStatus = MobilePrivacyStatus.fromString(eventData.optString(EventDataKeys.Configuration.GLOBAL_CONFIG_PRIVACY, IdentityConstants.Defaults.DEFAULT_MOBILE_PRIVACY.getValue()));
    }
}
