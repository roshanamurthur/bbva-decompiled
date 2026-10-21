package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Verifier implements TestRule {

    public class a extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Statement f91961a;

        public a(Statement statement) {
            this.f91961a = statement;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() throws Throwable {
            this.f91961a.evaluate();
            Verifier.this.verify();
        }
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return new a(statement);
    }

    public void verify() throws Throwable {
    }
}
