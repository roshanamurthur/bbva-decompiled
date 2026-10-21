package org.junit.rules;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class TestWatchman implements MethodRule {

    public class a extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameworkMethod f91951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Statement f91952b;

        public a(FrameworkMethod frameworkMethod, Statement statement) {
            this.f91951a = frameworkMethod;
            this.f91952b = statement;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() throws Throwable {
            TestWatchman testWatchman = TestWatchman.this;
            FrameworkMethod frameworkMethod = this.f91951a;
            testWatchman.starting(frameworkMethod);
            try {
                try {
                    this.f91952b.evaluate();
                    testWatchman.succeeded(frameworkMethod);
                    testWatchman.finished(frameworkMethod);
                } catch (Throwable th2) {
                    testWatchman.finished(frameworkMethod);
                    throw th2;
                }
            } catch (AssumptionViolatedException e5) {
                throw e5;
            } catch (Throwable th3) {
                testWatchman.failed(th3, frameworkMethod);
                throw th3;
            }
        }
    }

    @Override // org.junit.rules.MethodRule
    public Statement apply(Statement statement, FrameworkMethod frameworkMethod, Object obj) {
        return new a(frameworkMethod, statement);
    }

    public void finished(FrameworkMethod frameworkMethod) {
    }

    public void starting(FrameworkMethod frameworkMethod) {
    }

    public void succeeded(FrameworkMethod frameworkMethod) {
    }

    public void failed(Throwable th2, FrameworkMethod frameworkMethod) {
    }
}
