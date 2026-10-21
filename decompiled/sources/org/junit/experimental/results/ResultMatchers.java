package org.junit.experimental.results;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

/* JADX INFO: loaded from: classes13.dex */
public class ResultMatchers {

    public static class a extends TypeSafeMatcher<PrintableResult> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f91812r0;

        public a(int i10) {
            this.f91812r0 = i10;
        }

        @Override // org.hamcrest.SelfDescribing
        public final void describeTo(Description description) {
            description.appendText("has " + this.f91812r0 + " failures");
        }

        @Override // org.hamcrest.TypeSafeMatcher
        public final boolean matchesSafely(PrintableResult printableResult) {
            return printableResult.failureCount() == this.f91812r0;
        }
    }

    public static class b extends BaseMatcher<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f91813p0;

        public b(String str) {
            this.f91813p0 = str;
        }

        @Override // org.hamcrest.SelfDescribing
        public final void describeTo(Description description) {
            description.appendText("has single failure containing " + this.f91813p0);
        }

        @Override // org.hamcrest.Matcher
        public final boolean matches(Object obj) {
            return obj.toString().contains(this.f91813p0) && ResultMatchers.failureCountIs(1).matches(obj);
        }
    }

    public static class c extends TypeSafeMatcher<PrintableResult> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Matcher f91814r0;

        public c(Matcher matcher) {
            this.f91814r0 = matcher;
        }

        @Override // org.hamcrest.SelfDescribing
        public final void describeTo(Description description) {
            description.appendText("has failure with exception matching ");
            this.f91814r0.describeTo(description);
        }

        @Override // org.hamcrest.TypeSafeMatcher
        public final boolean matchesSafely(PrintableResult printableResult) {
            PrintableResult printableResult2 = printableResult;
            if (printableResult2.failureCount() == 1) {
                return this.f91814r0.matches(printableResult2.failures().get(0).getException());
            }
            return false;
        }
    }

    public static class d extends TypeSafeMatcher<PrintableResult> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f91815r0;

        public d(String str) {
            this.f91815r0 = str;
        }

        @Override // org.hamcrest.SelfDescribing
        public final void describeTo(Description description) {
            description.appendText("has failure containing " + this.f91815r0);
        }

        @Override // org.hamcrest.TypeSafeMatcher
        public final boolean matchesSafely(PrintableResult printableResult) {
            PrintableResult printableResult2 = printableResult;
            return printableResult2.failureCount() > 0 && printableResult2.toString().contains(this.f91815r0);
        }
    }

    @Deprecated
    public ResultMatchers() {
    }

    public static Matcher<PrintableResult> failureCountIs(int i10) {
        return new a(i10);
    }

    public static Matcher<PrintableResult> hasFailureContaining(String str) {
        return new d(str);
    }

    public static Matcher<Object> hasSingleFailureContaining(String str) {
        return new b(str);
    }

    public static Matcher<PrintableResult> hasSingleFailureMatching(Matcher<Throwable> matcher) {
        return new c(matcher);
    }

    public static Matcher<PrintableResult> isSuccessful() {
        return failureCountIs(0);
    }
}
