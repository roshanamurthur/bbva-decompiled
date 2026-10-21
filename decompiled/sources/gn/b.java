package gn;

import java.io.Serializable;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;

/* JADX INFO: compiled from: SerializableMatcherDescription.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b<T> extends BaseMatcher<T> implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f68620p0;

    public b(Matcher<T> matcher) {
        this.f68620p0 = StringDescription.asString(matcher);
    }

    @Override // org.hamcrest.SelfDescribing
    public final void describeTo(Description description) {
        description.appendText(this.f68620p0);
    }

    @Override // org.hamcrest.Matcher
    public final boolean matches(Object obj) {
        throw new UnsupportedOperationException("This Matcher implementation only captures the description");
    }
}
