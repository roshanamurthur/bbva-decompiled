package org.junit.experimental.categories;

import java.util.HashSet;
import java.util.List;
import org.junit.runner.FilterFactory;
import org.junit.runner.FilterFactoryParams;
import org.junit.runner.manipulation.Filter;

/* JADX INFO: loaded from: classes13.dex */
public final class ExcludeCategories extends en.a {

    public static class a extends Categories.CategoryFilter {
        @Override // org.junit.experimental.categories.Categories.CategoryFilter, org.junit.runner.manipulation.Filter
        public final String describe() {
            return "excludes " + super.describe();
        }
    }

    @Override // en.a, org.junit.runner.FilterFactory
    public /* bridge */ /* synthetic */ Filter createFilter(FilterFactoryParams filterFactoryParams) throws FilterFactory.FilterNotCreatedException {
        return super.createFilter(filterFactoryParams);
    }

    @Override // en.a
    public Filter createFilter(List<Class<?>> list) {
        return new a(true, null, true, new HashSet(list));
    }
}
