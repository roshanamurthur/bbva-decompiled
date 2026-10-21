package com.adobe.marketing.mobile;

import ad.d;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
class Rule {
    protected RuleCondition condition;
    protected List<Event> consequenceEvents;

    public Rule(RuleCondition ruleCondition, List<Event> list) throws IllegalArgumentException {
        if (ruleCondition == null) {
            throw new IllegalArgumentException("Cannot create rule with null condition");
        }
        if (list == null) {
            throw new IllegalArgumentException("Cannot create rule with null consequence events");
        }
        this.condition = ruleCondition;
        this.consequenceEvents = list;
    }

    public boolean evaluateCondition(RuleTokenParser ruleTokenParser, Event event) {
        return this.condition.evaluate(ruleTokenParser, event);
    }

    public List<Event> getConsequenceEvents() {
        return Collections.unmodifiableList(this.consequenceEvents);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n\tCondition: ");
        RuleCondition ruleCondition = this.condition;
        String string = AbstractJsonLexerKt.NULL;
        sb2.append(ruleCondition == null ? AbstractJsonLexerKt.NULL : ruleCondition.toString());
        sb2.append("\n\tConsequences: ");
        List<Event> list = this.consequenceEvents;
        if (list != null) {
            string = list.toString();
        }
        return d.f(sb2, string, "\n}");
    }
}
