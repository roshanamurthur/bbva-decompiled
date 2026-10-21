package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import junit.extensions.TestDecorator;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestListener;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.InvalidOrderingException;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Orderable;
import org.junit.runner.manipulation.Orderer;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes13.dex */
public class JUnit38ClassRunner extends Runner implements Filterable, Orderable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Test f91879a;

    public static final class a implements TestListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RunNotifier f91880a;

        public a(RunNotifier runNotifier) {
            this.f91880a = runNotifier;
        }

        public static Description a(Test test) {
            if (test instanceof Describable) {
                return ((Describable) test).getDescription();
            }
            return Description.createTestDescription(test.getClass(), test instanceof TestCase ? ((TestCase) test).getName() : test.toString());
        }

        @Override // junit.framework.TestListener
        public final void addError(Test test, Throwable th2) {
            this.f91880a.fireTestFailure(new Failure(a(test), th2));
        }

        @Override // junit.framework.TestListener
        public final void addFailure(Test test, AssertionFailedError assertionFailedError) {
            addError(test, assertionFailedError);
        }

        @Override // junit.framework.TestListener
        public final void endTest(Test test) {
            this.f91880a.fireTestFinished(a(test));
        }

        @Override // junit.framework.TestListener
        public final void startTest(Test test) {
            this.f91880a.fireTestStarted(a(test));
        }
    }

    public JUnit38ClassRunner(Class<?> cls) {
        this(new TestSuite(cls.asSubclass(TestCase.class)));
    }

    public static Description a(Test test) {
        String name;
        Annotation[] declaredAnnotations;
        if (test instanceof TestCase) {
            TestCase testCase = (TestCase) test;
            Class<?> cls = testCase.getClass();
            String name2 = testCase.getName();
            try {
                declaredAnnotations = testCase.getClass().getMethod(testCase.getName(), new Class[0]).getDeclaredAnnotations();
            } catch (NoSuchMethodException | SecurityException unused) {
                declaredAnnotations = new Annotation[0];
            }
            return Description.createTestDescription(cls, name2, declaredAnnotations);
        }
        if (!(test instanceof TestSuite)) {
            if (test instanceof Describable) {
                return ((Describable) test).getDescription();
            }
            return test instanceof TestDecorator ? a(((TestDecorator) test).getTest()) : Description.createSuiteDescription(test.getClass());
        }
        TestSuite testSuite = (TestSuite) test;
        if (testSuite.getName() == null) {
            int iCountTestCases = testSuite.countTestCases();
            name = String.format("TestSuite with %s tests%s", Integer.valueOf(iCountTestCases), iCountTestCases == 0 ? "" : String.format(" [example: %s]", testSuite.testAt(0)));
        } else {
            name = testSuite.getName();
        }
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(name, new Annotation[0]);
        int iTestCount = testSuite.testCount();
        for (int i10 = 0; i10 < iTestCount; i10++) {
            descriptionCreateSuiteDescription.addChild(a(testSuite.testAt(i10)));
        }
        return descriptionCreateSuiteDescription;
    }

    public TestListener createAdaptingListener(RunNotifier runNotifier) {
        return new a(runNotifier);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        if (this.f91879a instanceof Filterable) {
            ((Filterable) this.f91879a).filter(filter);
            return;
        }
        if (this.f91879a instanceof TestSuite) {
            TestSuite testSuite = (TestSuite) this.f91879a;
            TestSuite testSuite2 = new TestSuite(testSuite.getName());
            int iTestCount = testSuite.testCount();
            for (int i10 = 0; i10 < iTestCount; i10++) {
                Test testTestAt = testSuite.testAt(i10);
                if (filter.shouldRun(a(testTestAt))) {
                    testSuite2.addTest(testTestAt);
                }
            }
            this.f91879a = testSuite2;
            if (testSuite2.testCount() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return a(this.f91879a);
    }

    @Override // org.junit.runner.manipulation.Orderable
    public void order(Orderer orderer) throws InvalidOrderingException {
        if (this.f91879a instanceof Orderable) {
            ((Orderable) this.f91879a).order(orderer);
        }
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        TestResult testResult = new TestResult();
        testResult.addListener(createAdaptingListener(runNotifier));
        this.f91879a.run(testResult);
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (this.f91879a instanceof Sortable) {
            ((Sortable) this.f91879a).sort(sorter);
        }
    }

    public JUnit38ClassRunner(Test test) {
        this.f91879a = test;
    }
}
