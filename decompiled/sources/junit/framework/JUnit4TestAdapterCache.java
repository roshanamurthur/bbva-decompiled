package junit.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;

/* JADX INFO: loaded from: classes12.dex */
public class JUnit4TestAdapterCache extends HashMap<Description, Test> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final JUnit4TestAdapterCache f79125p0 = new JUnit4TestAdapterCache();

    public class a extends RunListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TestResult f79126a;

        public a(TestResult testResult) {
            this.f79126a = testResult;
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testFailure(Failure failure) throws Exception {
            this.f79126a.addError(JUnit4TestAdapterCache.this.asTest(failure.getDescription()), failure.getException());
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testFinished(Description description) throws Exception {
            this.f79126a.endTest(JUnit4TestAdapterCache.this.asTest(description));
        }

        @Override // org.junit.runner.notification.RunListener
        public final void testStarted(Description description) throws Exception {
            this.f79126a.startTest(JUnit4TestAdapterCache.this.asTest(description));
        }
    }

    public static JUnit4TestAdapterCache getDefault() {
        return f79125p0;
    }

    public final Test a(Description description) {
        if (description.isTest()) {
            return new JUnit4TestCaseFacade(description);
        }
        TestSuite testSuite = new TestSuite(description.getDisplayName());
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            testSuite.addTest(asTest(it.next()));
        }
        return testSuite;
    }

    public Test asTest(Description description) {
        if (description.isSuite()) {
            return a(description);
        }
        if (!containsKey(description)) {
            put(description, a(description));
        }
        return get(description);
    }

    public List<Test> asTestList(Description description) {
        if (description.isTest()) {
            return Arrays.asList(asTest(description));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it = description.getChildren().iterator();
        while (it.hasNext()) {
            arrayList.add(asTest(it.next()));
        }
        return arrayList;
    }

    public RunNotifier getNotifier(TestResult testResult, JUnit4TestAdapter jUnit4TestAdapter) {
        RunNotifier runNotifier = new RunNotifier();
        runNotifier.addListener(new a(testResult));
        return runNotifier;
    }
}
