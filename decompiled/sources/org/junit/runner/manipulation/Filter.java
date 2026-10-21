package org.junit.runner.manipulation;

import java.util.Iterator;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Filter {
    public static final Filter ALL = new a();

    public static class b extends Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Description f91992a;

        public b(Description description) {
            this.f91992a = description;
        }

        @Override // org.junit.runner.manipulation.Filter
        public final String describe() {
            return String.format("Method %s", this.f91992a.getDisplayName());
        }

        @Override // org.junit.runner.manipulation.Filter
        public final boolean shouldRun(Description description) {
            if (description.isTest()) {
                return this.f91992a.equals(description);
            }
            Iterator<Description> it = description.getChildren().iterator();
            while (it.hasNext()) {
                if (shouldRun(it.next())) {
                    return true;
                }
            }
            return false;
        }
    }

    public class c extends Filter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Filter f91994b;

        public c(Filter filter) {
            this.f91994b = filter;
        }

        @Override // org.junit.runner.manipulation.Filter
        public final String describe() {
            return Filter.this.describe() + " and " + this.f91994b.describe();
        }

        @Override // org.junit.runner.manipulation.Filter
        public final boolean shouldRun(Description description) {
            return Filter.this.shouldRun(description) && this.f91994b.shouldRun(description);
        }
    }

    public static Filter matchMethodDescription(Description description) {
        return new b(description);
    }

    public void apply(Object obj) throws NoTestsRemainException {
        if (obj instanceof Filterable) {
            ((Filterable) obj).filter(this);
        }
    }

    public abstract String describe();

    public Filter intersect(Filter filter) {
        return (filter == this || filter == ALL) ? this : new c(filter);
    }

    public abstract boolean shouldRun(Description description);

    public static class a extends Filter {
        @Override // org.junit.runner.manipulation.Filter
        public final String describe() {
            return "all tests";
        }

        @Override // org.junit.runner.manipulation.Filter
        public final boolean shouldRun(Description description) {
            return true;
        }

        @Override // org.junit.runner.manipulation.Filter
        public final void apply(Object obj) throws NoTestsRemainException {
        }

        @Override // org.junit.runner.manipulation.Filter
        public final Filter intersect(Filter filter) {
            return filter;
        }
    }
}
