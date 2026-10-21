package com.adobe.marketing.mobile;

/* JADX INFO: loaded from: classes2.dex */
class RuleConditionMatcher extends RuleCondition {
    Matcher matcher;

    public RuleConditionMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    public static RuleConditionMatcher ruleConditionMatcherFromJson(JsonUtilityService.JSONObject jSONObject) throws UnsupportedConditionException {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        Matcher matcherMatcherWithJsonObject = Matcher.matcherWithJsonObject(jSONObject);
        if (matcherMatcherWithJsonObject != null) {
            return new RuleConditionMatcher(matcherMatcherWithJsonObject);
        }
        throw new UnsupportedConditionException("Could not create instance of a matcher!");
    }

    @Override // com.adobe.marketing.mobile.RuleCondition
    public boolean evaluate(RuleTokenParser ruleTokenParser, Event event) {
        Matcher matcher;
        if (ruleTokenParser == null || event == null || (matcher = this.matcher) == null) {
            return false;
        }
        return this.matcher.matches(ruleTokenParser.expandKey(matcher.key, event));
    }

    @Override // com.adobe.marketing.mobile.RuleCondition
    public String toString() {
        Matcher matcher = this.matcher;
        return matcher == null ? "" : matcher.toString();
    }
}
