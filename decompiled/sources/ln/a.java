package ln;

import java.util.ArrayList;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.matchers.JUnitMatchers;

/* JADX INFO: compiled from: ExpectedExceptionMatcherBuilder.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f83226a = new ArrayList();

    public final Matcher<Throwable> a() {
        ArrayList arrayList = this.f83226a;
        return JUnitMatchers.isThrowable(arrayList.size() == 1 ? (Matcher) arrayList.get(0) : CoreMatchers.allOf(new ArrayList(arrayList)));
    }
}
