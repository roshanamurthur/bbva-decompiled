package org.hamcrest;

/* JADX INFO: loaded from: classes13.dex */
public class MatcherAssert {
    public static <T> void assertThat(T t10, Matcher<? super T> matcher) {
        assertThat("", t10, matcher);
    }

    public static <T> void assertThat(String str, T t10, Matcher<? super T> matcher) {
        if (matcher.matches(t10)) {
            return;
        }
        StringDescription stringDescription = new StringDescription();
        stringDescription.appendText(str).appendText("\nExpected: ").appendDescriptionOf(matcher).appendText("\n     but: ");
        matcher.describeMismatch(t10, stringDescription);
        throw new AssertionError(stringDescription.toString());
    }

    public static void assertThat(String str, boolean z10) {
        if (!z10) {
            throw new AssertionError(str);
        }
    }
}
