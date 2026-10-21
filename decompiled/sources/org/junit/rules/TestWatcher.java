package org.junit.rules;

import java.util.ArrayList;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TestWatcher implements TestRule {

    public class a extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Description f91948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Statement f91949b;

        public a(Description description, Statement statement) {
            this.f91948a = description;
            this.f91949b = statement;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() throws Exception {
            ArrayList arrayList = new ArrayList();
            Description description = this.f91948a;
            TestWatcher testWatcher = TestWatcher.this;
            testWatcher.getClass();
            try {
                testWatcher.starting(description);
            } catch (Throwable th2) {
                arrayList.add(th2);
            }
            try {
                try {
                    try {
                        try {
                            this.f91949b.evaluate();
                            try {
                                testWatcher.succeeded(description);
                            } catch (Throwable th3) {
                                arrayList.add(th3);
                            }
                            testWatcher.finished(description);
                        } catch (Throwable th4) {
                            arrayList.add(th4);
                            try {
                                testWatcher.failed(th4, description);
                            } catch (Throwable th5) {
                                arrayList.add(th5);
                            }
                            testWatcher.finished(description);
                        }
                    } catch (AssumptionViolatedException e5) {
                        arrayList.add(e5);
                        try {
                            if (e5 instanceof org.junit.AssumptionViolatedException) {
                                testWatcher.skipped((org.junit.AssumptionViolatedException) e5, description);
                            } else {
                                testWatcher.skipped(e5, description);
                            }
                        } catch (Throwable th6) {
                            arrayList.add(th6);
                        }
                        testWatcher.finished(description);
                    }
                } catch (Throwable th7) {
                    arrayList.add(th7);
                }
                MultipleFailureException.assertEmpty(arrayList);
            } catch (Throwable th8) {
                try {
                    testWatcher.finished(description);
                } catch (Throwable th9) {
                    arrayList.add(th9);
                }
                throw th8;
            }
        }
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return new a(description, statement);
    }

    @Deprecated
    public void skipped(AssumptionViolatedException assumptionViolatedException, Description description) {
    }

    public void skipped(org.junit.AssumptionViolatedException assumptionViolatedException, Description description) {
        skipped((AssumptionViolatedException) assumptionViolatedException, description);
    }

    public void finished(Description description) {
    }

    public void starting(Description description) {
    }

    public void succeeded(Description description) {
    }

    public void failed(Throwable th2, Description description) {
    }
}
