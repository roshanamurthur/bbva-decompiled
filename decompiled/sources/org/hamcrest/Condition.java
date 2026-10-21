package org.hamcrest;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Condition<T> {
    public static final b<Object> NOT_MATCHED = new b<>();

    public interface Step<I, O> {
        Condition<O> apply(I i10, Description description);
    }

    public static final class a<T> extends Condition<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f91755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Description f91756b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Description description) {
            this.f91755a = obj;
            this.f91756b = description;
        }

        @Override // org.hamcrest.Condition
        public final <U> Condition<U> and(Step<? super T, U> step) {
            return step.apply(this.f91755a, this.f91756b);
        }

        @Override // org.hamcrest.Condition
        public final boolean matching(Matcher<T> matcher, String str) {
            T t10 = this.f91755a;
            if (matcher.matches(t10)) {
                return true;
            }
            Description description = this.f91756b;
            description.appendText(str);
            matcher.describeMismatch(t10, description);
            return false;
        }
    }

    public static final class b<T> extends Condition<T> {
        @Override // org.hamcrest.Condition
        public final <U> Condition<U> and(Step<? super T, U> step) {
            return Condition.notMatched();
        }

        @Override // org.hamcrest.Condition
        public final boolean matching(Matcher<T> matcher, String str) {
            return false;
        }
    }

    public static <T> Condition<T> matched(T t10, Description description) {
        return new a(t10, description);
    }

    public static <T> Condition<T> notMatched() {
        return NOT_MATCHED;
    }

    public abstract <U> Condition<U> and(Step<? super T, U> step);

    public final boolean matching(Matcher<T> matcher) {
        return matching(matcher, "");
    }

    public abstract boolean matching(Matcher<T> matcher, String str);

    public final <U> Condition<U> then(Step<? super T, U> step) {
        return and(step);
    }
}
