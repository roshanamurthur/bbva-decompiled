package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
abstract class RuleCondition {
    private static final String RULE_CONDITION_DEFINITION_KEY_JSON = "definition";
    private static final String RULE_CONDITION_TYPE_GROUP_JSON = "group";
    private static final String RULE_CONDITION_TYPE_HISTORICAL_JSON = "historical";
    private static final String RULE_CONDITION_TYPE_KEY_JSON = "type";
    private static final String RULE_CONDITION_TYPE_MATCHER_JSON = "matcher";

    public static RuleCondition ruleConditionFromJson(JsonUtilityService.JSONObject jSONObject) throws JsonException, UnsupportedConditionException {
        RuleCondition ruleConditionHistoricalConditionFromJsonObject = null;
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        if (jSONObject.getString("type").equals(RULE_CONDITION_TYPE_GROUP_JSON)) {
            ruleConditionHistoricalConditionFromJsonObject = RuleConditionGroup.ruleConditionGroupFromJson(jSONObject.getJSONObject(RULE_CONDITION_DEFINITION_KEY_JSON));
        } else if (jSONObject.getString("type").equals(RULE_CONDITION_TYPE_MATCHER_JSON)) {
            ruleConditionHistoricalConditionFromJsonObject = RuleConditionMatcher.ruleConditionMatcherFromJson(jSONObject.getJSONObject(RULE_CONDITION_DEFINITION_KEY_JSON));
        } else if (jSONObject.getString("type").equals(RULE_CONDITION_TYPE_HISTORICAL_JSON)) {
            ruleConditionHistoricalConditionFromJsonObject = RuleConditionHistorical.historicalConditionFromJsonObject(jSONObject.getJSONObject(RULE_CONDITION_DEFINITION_KEY_JSON));
        }
        if (ruleConditionHistoricalConditionFromJsonObject != null) {
            return ruleConditionHistoricalConditionFromJsonObject;
        }
        throw new UnsupportedConditionException("Could not create a condition instance!");
    }

    public abstract boolean evaluate(RuleTokenParser ruleTokenParser, Event event);

    public abstract String toString();
}
