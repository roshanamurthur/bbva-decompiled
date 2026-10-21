package junit.framework;

/* JADX INFO: loaded from: classes12.dex */
public class ComparisonFailure extends AssertionFailedError {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f79120p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f79121q0;

    public ComparisonFailure(String str, String str2, String str3) {
        super(str);
        this.f79120p0 = str2;
        this.f79121q0 = str3;
    }

    public String getActual() {
        return this.f79121q0;
    }

    public String getExpected() {
        return this.f79120p0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new ComparisonCompactor(20, this.f79120p0, this.f79121q0).compact(super.getMessage());
    }
}
