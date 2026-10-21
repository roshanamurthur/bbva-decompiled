package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class RuleConditionGroup extends RuleCondition {
    private static final String RULE_CONDITIONS_JSON_KEY = "conditions";
    private static final String RULE_CONDITION_JSON_DEFINITION_LOGIC = "logic";
    private static final String RULE_CONDITION_JSON_DEFINITION_LOGIC_AND = "and";
    private static final String RULE_CONDITION_JSON_DEFINITION_LOGIC_OR = "or";
    List<RuleCondition> conditions;

    public static RuleConditionGroup ruleConditionGroupFromJson(JsonUtilityService.JSONObject jSONObject) throws JsonException, UnsupportedConditionException {
        String string;
        RuleConditionGroup ruleConditionOrGroup = null;
        if (jSONObject == null || (string = jSONObject.getString(RULE_CONDITION_JSON_DEFINITION_LOGIC)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JsonUtilityService.JSONArray jSONArray = jSONObject.getJSONArray(RULE_CONDITIONS_JSON_KEY);
        if (jSONArray == null) {
            return null;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JsonUtilityService.JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (jSONObject2 != null) {
                arrayList.add(RuleCondition.ruleConditionFromJson(jSONObject2));
            }
        }
        if (string.equals(RULE_CONDITION_JSON_DEFINITION_LOGIC_AND)) {
            ruleConditionOrGroup = new RuleConditionAndGroup(arrayList);
        } else if (string.equals(RULE_CONDITION_JSON_DEFINITION_LOGIC_OR)) {
            ruleConditionOrGroup = new RuleConditionOrGroup(arrayList);
        }
        if (ruleConditionOrGroup != null) {
            return ruleConditionOrGroup;
        }
        throw new UnsupportedConditionException("Could not create an instance of a condition group!");
    }
}
