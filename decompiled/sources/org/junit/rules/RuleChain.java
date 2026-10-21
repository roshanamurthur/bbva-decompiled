package org.junit.rules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class RuleChain implements TestRule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RuleChain f91935b = new RuleChain(Collections.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<TestRule> f91936a;

    public RuleChain(List<TestRule> list) {
        this.f91936a = list;
    }

    public static RuleChain emptyRuleChain() {
        return f91935b;
    }

    public static RuleChain outerRule(TestRule testRule) {
        return emptyRuleChain().around(testRule);
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return new RunRules(statement, this.f91936a, description);
    }

    public RuleChain around(TestRule testRule) {
        if (testRule == null) {
            throw new NullPointerException("The enclosed rule must not be null");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(testRule);
        arrayList.addAll(this.f91936a);
        return new RuleChain(arrayList);
    }
}
