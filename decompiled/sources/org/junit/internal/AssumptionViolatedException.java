package org.junit.internal;

import gn.b;
import gn.c;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;
import org.hamcrest.StringDescription;

/* JADX INFO: loaded from: classes13.dex */
public class AssumptionViolatedException extends RuntimeException implements SelfDescribing {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f91842p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f91843q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Object f91844r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Matcher<?> f91845s0;

    @Deprecated
    public AssumptionViolatedException(String str, boolean z10, Object obj, Matcher<?> matcher) {
        this.f91842p0 = str;
        this.f91844r0 = obj;
        this.f91845s0 = matcher;
        this.f91843q0 = z10;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("fAssumption", this.f91842p0);
        putFieldPutFields.put("fValueMatcher", this.f91843q0);
        Matcher<?> bVar = this.f91845s0;
        if (bVar != null && !(bVar instanceof Serializable)) {
            bVar = new b(bVar);
        }
        putFieldPutFields.put("fMatcher", bVar);
        Object cVar = this.f91844r0;
        if (cVar != null && !(cVar instanceof Serializable)) {
            cVar = new c(cVar);
        }
        putFieldPutFields.put("fValue", cVar);
        objectOutputStream.writeFields();
    }

    @Override // org.hamcrest.SelfDescribing
    public void describeTo(Description description) {
        String str = this.f91842p0;
        if (str != null) {
            description.appendText(str);
        }
        if (this.f91843q0) {
            if (str != null) {
                description.appendText(": ");
            }
            description.appendText("got: ");
            description.appendValue(this.f91844r0);
            Matcher<?> matcher = this.f91845s0;
            if (matcher != null) {
                description.appendText(", expected: ");
                description.appendDescriptionOf(matcher);
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return StringDescription.asString(this);
    }

    @Deprecated
    public AssumptionViolatedException(Object obj, Matcher<?> matcher) {
        this(null, true, obj, matcher);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Object obj, Matcher<?> matcher) {
        this(str, true, obj, matcher);
    }

    @Deprecated
    public AssumptionViolatedException(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public AssumptionViolatedException(String str, Throwable th2) {
        this(str, false, null, null);
        initCause(th2);
    }
}
