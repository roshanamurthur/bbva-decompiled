package junit.runner;

/* JADX INFO: loaded from: classes12.dex */
public interface TestRunListener {
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_FAILURE = 2;

    void testEnded(String str);

    void testFailed(int i10, String str, String str2);

    void testRunEnded(long j10);

    void testRunStarted(String str, int i10);

    void testRunStopped(long j10);

    void testStarted(String str);
}
