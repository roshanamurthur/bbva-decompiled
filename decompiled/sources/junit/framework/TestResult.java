package junit.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TestResult {
    protected List<TestFailure> fFailures = new ArrayList();
    protected List<TestFailure> fErrors = new ArrayList();
    protected List<TestListener> fListeners = new ArrayList();
    protected int fRunTests = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f79130a = false;

    public class a implements Protectable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TestCase f79131a;

        public a(TestCase testCase) {
            this.f79131a = testCase;
        }

        @Override // junit.framework.Protectable
        public final void protect() throws Throwable {
            this.f79131a.runBare();
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.fListeners);
        return arrayList;
    }

    public synchronized void addError(Test test, Throwable th2) {
        this.fErrors.add(new TestFailure(test, th2));
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((TestListener) it.next()).addError(test, th2);
        }
    }

    public synchronized void addFailure(Test test, AssertionFailedError assertionFailedError) {
        this.fFailures.add(new TestFailure(test, assertionFailedError));
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((TestListener) it.next()).addFailure(test, assertionFailedError);
        }
    }

    public synchronized void addListener(TestListener testListener) {
        this.fListeners.add(testListener);
    }

    public void endTest(Test test) {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((TestListener) it.next()).endTest(test);
        }
    }

    public synchronized int errorCount() {
        return this.fErrors.size();
    }

    public synchronized Enumeration<TestFailure> errors() {
        return Collections.enumeration(this.fErrors);
    }

    public synchronized int failureCount() {
        return this.fFailures.size();
    }

    public synchronized Enumeration<TestFailure> failures() {
        return Collections.enumeration(this.fFailures);
    }

    public synchronized void removeListener(TestListener testListener) {
        this.fListeners.remove(testListener);
    }

    public void run(TestCase testCase) {
        startTest(testCase);
        runProtected(testCase, new a(testCase));
        endTest(testCase);
    }

    public synchronized int runCount() {
        return this.fRunTests;
    }

    public void runProtected(Test test, Protectable protectable) {
        try {
            protectable.protect();
        } catch (ThreadDeath e5) {
            throw e5;
        } catch (AssertionFailedError e7) {
            addFailure(test, e7);
        } catch (Throwable th2) {
            addError(test, th2);
        }
    }

    public synchronized boolean shouldStop() {
        return this.f79130a;
    }

    public void startTest(Test test) {
        int iCountTestCases = test.countTestCases();
        synchronized (this) {
            this.fRunTests += iCountTestCases;
        }
        Iterator it = a().iterator();
        while (it.hasNext()) {
            ((TestListener) it.next()).startTest(test);
        }
    }

    public synchronized void stop() {
        this.f79130a = true;
    }

    public synchronized boolean wasSuccessful() {
        return failureCount() == 0 && errorCount() == 0;
    }
}
