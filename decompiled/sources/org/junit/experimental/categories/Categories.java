package org.junit.experimental.categories;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* JADX INFO: loaded from: classes13.dex */
public class Categories extends Suite {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f91797g = 0;

    public static class CategoryFilter extends Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f91798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<Class<?>> f91799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f91800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f91801d;

        @Deprecated
        public CategoryFilter(Class<?> cls, Class<?> cls2) {
            this.f91800c = true;
            this.f91801d = true;
            int i10 = Categories.f91797g;
            this.f91798a = cls == null ? Collections.emptySet() : Collections.singleton(cls);
            this.f91799b = cls2 == null ? Collections.emptySet() : Collections.singleton(cls2);
        }

        public static CategoryFilter categoryFilter(boolean z10, Set<Class<?>> set, boolean z11, Set<Class<?>> set2) {
            return new CategoryFilter(z10, set, z11, set2);
        }

        public static CategoryFilter exclude(boolean z10, Class<?>... clsArr) {
            return new CategoryFilter(true, (Class<?>[]) null, z10, clsArr);
        }

        public static CategoryFilter include(boolean z10, Class<?>... clsArr) {
            return new CategoryFilter(z10, clsArr, true, (Class<?>[]) null);
        }

        @Override // org.junit.runner.manipulation.Filter
        public String describe() {
            return toString();
        }

        /* JADX WARN: Code duplicated, block: B:72:0x011e  */
        /* JADX WARN: Code duplicated, block: B:78:0x012a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:70:0x0118->B:79:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        
            if (r4.isEmpty() != false) goto L76;
         */
        @Override // org.junit.runner.manipulation.Filter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean shouldRun(org.junit.runner.Description r9) {
            /*
                Method dump skipped, instruction units count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.junit.experimental.categories.Categories.CategoryFilter.shouldRun(org.junit.runner.Description):boolean");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("categories ");
            Set<Class<?>> set = this.f91798a;
            boolean zIsEmpty = set.isEmpty();
            Object obj = set;
            if (zIsEmpty) {
                obj = "[all]";
            }
            sb2.append(obj);
            Set<Class<?>> set2 = this.f91799b;
            if (!set2.isEmpty()) {
                sb2.append(" - ");
                sb2.append(set2);
            }
            return sb2.toString();
        }

        public static CategoryFilter exclude(Class<?> cls) {
            return exclude(true, cls);
        }

        public static CategoryFilter include(Class<?> cls) {
            return include(true, cls);
        }

        public static CategoryFilter exclude(Class<?>... clsArr) {
            return exclude(true, clsArr);
        }

        public static CategoryFilter include(Class<?>... clsArr) {
            return include(true, clsArr);
        }

        public CategoryFilter(boolean z10, Set<Class<?>> set, boolean z11, Set<Class<?>> set2) {
            this.f91800c = z10;
            this.f91801d = z11;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (set != null) {
                linkedHashSet.addAll(set);
            }
            linkedHashSet.remove(null);
            this.f91798a = linkedHashSet;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            if (set2 != null) {
                linkedHashSet2.addAll(set2);
            }
            linkedHashSet2.remove(null);
            this.f91799b = linkedHashSet2;
        }

        public CategoryFilter(boolean z10, Class<?>[] clsArr, boolean z11, Class<?>[] clsArr2) {
            this.f91800c = z10;
            this.f91801d = z11;
            this.f91798a = Categories.b(clsArr);
            this.f91799b = Categories.b(clsArr2);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ExcludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface IncludeCategory {
        boolean matchAny() default true;

        Class<?>[] value() default {};
    }

    public Categories(Class<?> cls, RunnerBuilder runnerBuilder) throws InitializationError {
        super(cls, runnerBuilder);
        try {
            IncludeCategory includeCategory = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
            Class<?>[] clsArrValue = null;
            Set<Class<?>> setB = b(includeCategory == null ? null : includeCategory.value());
            ExcludeCategory excludeCategory = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
            if (excludeCategory != null) {
                clsArrValue = excludeCategory.value();
            }
            Set<Class<?>> setB2 = b(clsArrValue);
            IncludeCategory includeCategory2 = (IncludeCategory) cls.getAnnotation(IncludeCategory.class);
            boolean z10 = true;
            boolean z11 = includeCategory2 == null || includeCategory2.matchAny();
            ExcludeCategory excludeCategory2 = (ExcludeCategory) cls.getAnnotation(ExcludeCategory.class);
            if (excludeCategory2 != null && !excludeCategory2.matchAny()) {
                z10 = false;
            }
            filter(CategoryFilter.categoryFilter(z11, setB, z10, setB2));
        } catch (NoTestsRemainException e5) {
            throw new InitializationError(e5);
        }
    }

    public static Set<Class<?>> b(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return Collections.emptySet();
        }
        for (Class<?> cls : clsArr) {
            if (cls == null) {
                throw new NullPointerException("has null category");
            }
        }
        return clsArr.length == 1 ? Collections.singleton(clsArr[0]) : new LinkedHashSet(Arrays.asList(clsArr));
    }
}
