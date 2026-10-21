package com.adobe.marketing.mobile;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class ListenerRulesEngineResponseContentSignal extends ModuleEventListener<SignalExtension> {
    private static final String LOGTAG = "ListenerRulesEngineResponseContentSignal";

    public ListenerRulesEngineResponseContentSignal(SignalExtension signalExtension, EventType eventType, EventSource eventSource) {
        super(signalExtension, eventType, eventSource);
    }

    @Override // com.adobe.marketing.mobile.EventListener
    public void hear(Event event) {
        EventData data = event == null ? null : event.getData();
        if (data == null) {
            Log.debug(LOGTAG, "%s (Event Data)", "Unexpected Null Value");
            return;
        }
        Map<String, Variant> mapOptVariantMap = data.optVariantMap(EventDataKeys.RuleEngine.CONSEQUENCE_TRIGGERED, null);
        if (mapOptVariantMap == null || mapOptVariantMap.isEmpty()) {
            Log.debug(LOGTAG, "Not a triggered rule. Return.", new Object[0]);
            return;
        }
        String strOptString = Variant.optVariantFromMap(mapOptVariantMap, "type").optString(null);
        if (StringUtils.isNullOrEmpty(strOptString)) {
            Log.debug(LOGTAG, "Triggered rule is not Signal type. Return.", new Object[0]);
            return;
        }
        if (EventDataKeys.RuleEngine.RULES_RESPONSE_CONSEQUENCE_TYPE_POSTBACKS.equals(strOptString) || EventDataKeys.RuleEngine.RULES_RESPONSE_CONSEQUENCE_TYPE_PII.equals(strOptString)) {
            ((SignalExtension) this.parentModule).handleSignalConsequenceEvent(event);
        } else if ("url".equals(strOptString)) {
            ((SignalExtension) this.parentModule).handleOpenURLConsequenceEvent(event);
        } else {
            Log.debug(LOGTAG, "Triggered rule is not a valid Signal type. Cannot handle.", new Object[0]);
        }
    }
}
