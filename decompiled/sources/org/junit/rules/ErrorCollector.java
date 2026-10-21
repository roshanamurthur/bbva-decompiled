package org.junit.rules;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.function.ThrowingRunnable;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.MultipleFailureException;

/* JADX INFO: loaded from: classes13.dex */
public class ErrorCollector extends Verifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f91927a = new ArrayList();

    public class a implements Callable<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f91928p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Object f91929q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Matcher f91930r0;

        public a(String str, Object obj, Matcher matcher) {
            this.f91928p0 = str;
            this.f91929q0 = obj;
            this.f91930r0 = matcher;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            Matcher matcher = this.f91930r0;
            String str = this.f91928p0;
            Object obj = this.f91929q0;
            Assert.assertThat(str, obj, matcher);
            return obj;
        }
    }

    public void addError(Throwable th2) {
        if (th2 == null) {
            throw new NullPointerException("Error cannot be null");
        }
        boolean z10 = th2 instanceof AssumptionViolatedException;
        ArrayList arrayList = this.f91927a;
        if (!z10) {
            arrayList.add(th2);
            return;
        }
        AssertionError assertionError = new AssertionError(th2.getMessage());
        assertionError.initCause(th2);
        arrayList.add(assertionError);
    }

    public <T> T checkSucceeds(Callable<T> callable) {
        try {
            return callable.call();
        } catch (AssumptionViolatedException e5) {
            AssertionError assertionError = new AssertionError("Callable threw AssumptionViolatedException");
            assertionError.initCause(e5);
            addError(assertionError);
            return null;
        } catch (Throwable th2) {
            addError(th2);
            return null;
        }
    }

    public <T> void checkThat(T t10, Matcher<T> matcher) {
        checkThat("", t10, matcher);
    }

    public void checkThrows(Class<? extends Throwable> cls, ThrowingRunnable throwingRunnable) {
        try {
            Assert.assertThrows(cls, throwingRunnable);
        } catch (AssertionError e5) {
            addError(e5);
        }
    }

    @Override // org.junit.rules.Verifier
    public void verify() throws Exception {
        MultipleFailureException.assertEmpty(this.f91927a);
    }

    public <T> void checkThat(String str, T t10, Matcher<T> matcher) {
        checkSucceeds(new a(str, t10, matcher));
    }
}
