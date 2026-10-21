package org.junit.runner;

import org.junit.internal.Classes;
import org.junit.runner.manipulation.Filter;

/* JADX INFO: compiled from: FilterFactories.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public static Filter a(Request request, String str) throws FilterFactory.FilterNotCreatedException {
        Description description = request.getRunner().getDescription();
        String[] strArrSplit = str.contains("=") ? str.split("=", 2) : new String[]{str, ""};
        try {
            try {
                return ((FilterFactory) Classes.getClass(strArrSplit[0]).asSubclass(FilterFactory.class).getConstructor(new Class[0]).newInstance(new Object[0])).createFilter(new FilterFactoryParams(description, strArrSplit[1]));
            } catch (Exception e5) {
                throw new FilterFactory.FilterNotCreatedException(e5);
            }
        } catch (Exception e7) {
            throw new FilterFactory.FilterNotCreatedException(e7);
        }
    }
}
