package junit.framework;

/* JADX INFO: loaded from: classes12.dex */
public interface TestListener {
    void addError(Test test, Throwable th2);

    void addFailure(Test test, AssertionFailedError assertionFailedError);

    void endTest(Test test);

    void startTest(Test test);
}
