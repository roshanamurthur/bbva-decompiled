package junit.framework;

/* JADX INFO: loaded from: classes12.dex */
public class AssertionFailedError extends AssertionError {
    public AssertionFailedError() {
    }

    public AssertionFailedError(String str) {
        super(str == null ? "" : str);
    }
}
