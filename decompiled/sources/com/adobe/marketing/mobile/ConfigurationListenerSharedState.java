package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigurationListenerSharedState extends ModuleEventListener<ConfigurationExtension> {
    public ConfigurationListenerSharedState(ConfigurationExtension configurationExtension, EventType eventType, EventSource eventSource) {
        super(configurationExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        EventData data = event.getData();
        if (data == null) {
            return;
        }
        String strOptString = data.optString(EventDataKeys.EVENT_STATE_OWNER, null);
        if (StringUtils.isNullOrEmpty(strOptString)) {
            return;
        }
        if (EventDataKeys.Analytics.MODULE_NAME.equals(strOptString) || (((EventDataKeys.Configuration.MODULE_NAME.equals(strOptString) | EventDataKeys.Identity.MODULE_NAME.equals(strOptString)) | EventDataKeys.Target.MODULE_NAME.equals(strOptString)) | EventDataKeys.Audience.MODULE_NAME.equals(strOptString))) {
            ((ConfigurationExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.ConfigurationListenerSharedState.1
                @Override // java.lang.Runnable
                public void run() {
                    ((ConfigurationExtension) ConfigurationListenerSharedState.this.parentModule).processGetSdkIdsEvent();
                }
            });
        }
    }

    @Override // com.adobe.marketing.mobile.ModuleEventListener, com.adobe.marketing.mobile.EventListener
    public /* bridge */ /* synthetic */ void onUnregistered() {
        super.onUnregistered();
    }
}
