package org.junit;

import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class AssumptionViolatedException extends org.junit.internal.AssumptionViolatedException {
    public <T> AssumptionViolatedException(T t10, Matcher<T> matcher) {
        super((Object) t10, (Matcher<?>) matcher);
    }

    public <T> AssumptionViolatedException(String str, T t10, Matcher<T> matcher) {
        super(str, t10, matcher);
    }

    public AssumptionViolatedException(String str) {
        super(str);
    }

    public AssumptionViolatedException(String str, Throwable th2) {
        super(str, th2);
    }
}
