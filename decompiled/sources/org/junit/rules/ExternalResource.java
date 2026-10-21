package org.junit.rules;

import ln.b;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ExternalResource implements TestRule {
    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return new b(this, statement);
    }

    public void after() {
    }

    public void before() throws Throwable {
    }
}
