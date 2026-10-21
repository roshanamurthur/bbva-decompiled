package com.adobe.marketing.mobile;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class RuleConditionOrGroup extends RuleConditionGroup {
    public RuleConditionOrGroup(List<RuleCondition> list) {
        this.conditions = list;
    }

    @Override // com.adobe.marketing.mobile.RuleCondition
    public boolean evaluate(RuleTokenParser ruleTokenParser, Event event) {
        List<RuleCondition> list = this.conditions;
        if (list != null && !list.isEmpty()) {
            Iterator<RuleCondition> it = this.conditions.iterator();
            while (it.hasNext()) {
                if (it.next().evaluate(ruleTokenParser, event)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.adobe.marketing.mobile.RuleCondition
    public String toString() {
        List<RuleCondition> list = this.conditions;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("(");
        StringBuilder sb3 = new StringBuilder();
        for (RuleCondition ruleCondition : this.conditions) {
            if (sb3.length() > 0) {
                sb3.append(" OR ");
            }
            sb3.append(ruleCondition.toString());
        }
        sb2.append((CharSequence) sb3);
        sb2.append(")");
        return sb2.toString();
    }
}
