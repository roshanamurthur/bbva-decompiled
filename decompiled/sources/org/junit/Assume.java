package org.junit;

import java.util.Arrays;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;

/* JADX INFO: loaded from: classes13.dex */
public class Assume {
    @Deprecated
    public Assume() {
    }

    public static void assumeFalse(boolean z10) {
        assumeThat(Boolean.valueOf(z10), CoreMatchers.is(Boolean.FALSE));
    }

    public static void assumeNoException(Throwable th2) {
        assumeThat(th2, CoreMatchers.nullValue());
    }

    public static void assumeNotNull(Object... objArr) {
        assumeThat(objArr, CoreMatchers.notNullValue());
        assumeThat(Arrays.asList(objArr), CoreMatchers.everyItem(CoreMatchers.notNullValue()));
    }

    public static <T> void assumeThat(T t10, Matcher<T> matcher) {
        if (!matcher.matches(t10)) {
            throw new AssumptionViolatedException(t10, matcher);
        }
    }

    public static void assumeTrue(boolean z10) {
        assumeThat(Boolean.valueOf(z10), CoreMatchers.is(Boolean.TRUE));
    }

    public static void assumeFalse(String str, boolean z10) {
        assumeTrue(str, !z10);
    }

    public static void assumeNoException(String str, Throwable th2) {
        assumeThat(str, th2, CoreMatchers.nullValue());
    }

    public static void assumeTrue(String str, boolean z10) {
        if (!z10) {
            throw new AssumptionViolatedException(str);
        }
    }

    public static <T> void assumeThat(String str, T t10, Matcher<T> matcher) {
        if (!matcher.matches(t10)) {
            throw new AssumptionViolatedException(str, t10, matcher);
        }
    }
}
