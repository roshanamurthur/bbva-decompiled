package org.junit.rules;

import java.util.Iterator;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class RunRules extends Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Statement f91937a;

    public RunRules(Statement statement, Iterable<TestRule> iterable, Description description) {
        Iterator<TestRule> it = iterable.iterator();
        while (it.hasNext()) {
            statement = it.next().apply(statement, description);
        }
        this.f91937a = statement;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        this.f91937a.evaluate();
    }
}
