package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class AnalyticsListenerRulesEngineResponseContent extends ModuleEventListener<AnalyticsExtension> {
    private static final String LOG_TAG = "AnalyticsListenerRulesEngineResponseContent";

    public AnalyticsListenerRulesEngineResponseContent(AnalyticsExtension analyticsExtension, EventType eventType, EventSource eventSource) {
        super(analyticsExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(final Event event) {
        EventData data = event == null ? null : event.getData();
        if (data == null) {
            Log.warning(LOG_TAG, "hear - Ignoring Rules Engine Track response content event as event data is null.  ", new Object[0]);
            return;
        }
        Map<String, Variant> mapOptVariantMap = data.optVariantMap(EventDataKeys.RuleEngine.CONSEQUENCE_TRIGGERED, null);
        if (mapOptVariantMap == null || mapOptVariantMap.isEmpty()) {
            Log.warning(LOG_TAG, "hear - Not a triggered rule. Return.", new Object[0]);
            return;
        }
        String strOptString = Variant.optVariantFromMap(mapOptVariantMap, "type").optString(null);
        if (StringUtils.isNullOrEmpty(strOptString)) {
            Log.warning(LOG_TAG, "hear - Triggered rule is not Analytics type. Ignoring Rules Engine Track response content event.", new Object[0]);
        } else if (!"an".equals(strOptString)) {
            Log.debug(LOG_TAG, "hear - Triggered rule is not a valid Analytics type. Cannot handle.", new Object[0]);
        } else {
            Log.trace(LOG_TAG, "hear - Submitting Rules Engine Track response content event for processing.", new Object[0]);
            ((AnalyticsExtension) this.parentModule).getExecutor().execute(new Runnable() { // from class: com.adobe.marketing.mobile.AnalyticsListenerRulesEngineResponseContent.1
                @Override // java.lang.Runnable
                public void run() {
                    ((AnalyticsExtension) AnalyticsListenerRulesEngineResponseContent.this.parentModule).handleAnalyticsConsequenceEvent(event);
                }
            });
        }
    }
}
