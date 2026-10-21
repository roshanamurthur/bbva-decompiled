package com.adobe.marketing.mobile;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class RuleConsequence {
    private static final String LOG_TAG = "RuleConsequence";
    private String consequenceType;
    private Map<String, Variant> detail;
    private String id;

    public static RuleConsequence consequenceFromJson(JsonUtilityService.JSONObject jSONObject, JsonUtilityService jsonUtilityService) {
        if (jSONObject != null && jSONObject.length() != 0) {
            RuleConsequence ruleConsequence = new RuleConsequence();
            String strOptString = jSONObject.optString("id", null);
            ruleConsequence.id = strOptString;
            if (StringUtils.isNullOrEmpty(strOptString)) {
                Log.warning(LOG_TAG, "Unable to find field \"id\" in rules consequence.  This a required field.", new Object[0]);
                return null;
            }
            String strOptString2 = jSONObject.optString("type", null);
            ruleConsequence.consequenceType = strOptString2;
            if (StringUtils.isNullOrEmpty(strOptString2)) {
                Log.warning(LOG_TAG, "Unable to find field \"type\" in rules consequence.  This a required field.", new Object[0]);
                return null;
            }
            JsonUtilityService.JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("detail");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() != 0) {
                try {
                    ruleConsequence.detail = Variant.fromTypedObject(jSONObjectOptJSONObject, new JsonObjectVariantSerializer(jsonUtilityService)).getVariantMap();
                    return ruleConsequence;
                } catch (VariantException unused) {
                    Log.warning(LOG_TAG, "Unable to convert detail json to a variant.", new Object[0]);
                    return null;
                }
            }
            Log.warning(LOG_TAG, "Unable to find field \"detail\" in rules consequence.  This a required field.", new Object[0]);
        }
        return null;
    }

    public EventData generateEventData() {
        EventData eventData = new EventData();
        HashMap map = new HashMap();
        map.put("id", Variant.fromString(this.id));
        map.put("type", Variant.fromString(this.consequenceType));
        map.put("detail", Variant.fromVariantMap(this.detail));
        eventData.putVariantMap(EventDataKeys.RuleEngine.CONSEQUENCE_TRIGGERED, map);
        return eventData;
    }
}
