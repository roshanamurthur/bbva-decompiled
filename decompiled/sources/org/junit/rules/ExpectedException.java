package org.junit.rules;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.junit.Assert;
import org.junit.internal.matchers.ThrowableCauseMatcher;
import org.junit.internal.matchers.ThrowableMessageMatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes13.dex */
public class ExpectedException implements TestRule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f91931a = new ln.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f91932b = "Expected test to throw %s";

    public class a extends Statement {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Statement f91933a;

        public a(Statement statement) {
            this.f91933a = statement;
        }

        @Override // org.junit.runners.model.Statement
        public final void evaluate() throws Throwable {
            ExpectedException expectedException = ExpectedException.this;
            try {
                this.f91933a.evaluate();
                if (expectedException.isAnyExceptionExpected()) {
                    Assert.fail(String.format(expectedException.f91932b, StringDescription.toString(expectedException.f91931a.a())));
                }
            } catch (Throwable th2) {
                if (!expectedException.isAnyExceptionExpected()) {
                    throw th2;
                }
                Assert.assertThat(th2, expectedException.f91931a.a());
            }
        }
    }

    @Deprecated
    public static ExpectedException none() {
        return new ExpectedException();
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement statement, Description description) {
        return new a(statement);
    }

    public void expect(Matcher<?> matcher) {
        this.f91931a.f83226a.add(matcher);
    }

    public void expectCause(Matcher<?> matcher) {
        expect(ThrowableCauseMatcher.hasCause(matcher));
    }

    public void expectMessage(String str) {
        expectMessage(CoreMatchers.containsString(str));
    }

    public final boolean isAnyExceptionExpected() {
        return !this.f91931a.f83226a.isEmpty();
    }

    public ExpectedException reportMissingExceptionWithMessage(String str) {
        this.f91932b = str;
        return this;
    }

    public void expectMessage(Matcher<String> matcher) {
        expect(ThrowableMessageMatcher.hasMessage(matcher));
    }

    public void expect(Class<? extends Throwable> cls) {
        expect(CoreMatchers.instanceOf(cls));
    }

    @Deprecated
    public ExpectedException handleAssertionErrors() {
        return this;
    }

    @Deprecated
    public ExpectedException handleAssumptionViolatedExceptions() {
        return this;
    }
}
