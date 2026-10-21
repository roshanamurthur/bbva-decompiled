package fn;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

/* JADX INFO: compiled from: MaxCore.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f68527a;

    /* JADX INFO: renamed from: fn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MaxCore.java */
    public class C0285a extends Suite {
    }

    public a(ArrayList arrayList) {
        this.f68527a = arrayList;
    }

    @Override // org.junit.runner.Request
    public final Runner getRunner() {
        try {
            return new C0285a(null, this.f68527a);
        } catch (InitializationError e5) {
            return new ErrorReportingRunner((Class<?>) null, e5);
        }
    }
}
