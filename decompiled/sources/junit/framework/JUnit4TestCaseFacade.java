package junit.framework;

import org.junit.runner.Describable;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes12.dex */
public class JUnit4TestCaseFacade implements Test, Describable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Description f79128a;

    public JUnit4TestCaseFacade(Description description) {
        this.f79128a = description;
    }

    @Override // junit.framework.Test
    public int countTestCases() {
        return 1;
    }

    @Override // org.junit.runner.Describable
    public Description getDescription() {
        return this.f79128a;
    }

    @Override // junit.framework.Test
    public void run(TestResult testResult) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    public String toString() {
        return getDescription().toString();
    }
}
