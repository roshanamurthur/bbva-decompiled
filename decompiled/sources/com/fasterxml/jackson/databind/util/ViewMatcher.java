package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class ViewMatcher implements Serializable {
    protected static final ViewMatcher EMPTY = new ViewMatcher();

    public static final class a extends ViewMatcher {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<?>[] f43533p0;

        public a(Class<?>[] clsArr) {
            this.f43533p0 = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public final boolean isVisibleForView(Class<?> cls) {
            for (Class<?> cls2 : this.f43533p0) {
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class b extends ViewMatcher {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<?> f43534p0;

        public b(Class<?> cls) {
            this.f43534p0 = cls;
        }

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public final boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this.f43534p0;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        if (clsArr == null) {
            return EMPTY;
        }
        int length = clsArr.length;
        if (length != 0) {
            return length != 1 ? new a(clsArr) : new b(clsArr[0]);
        }
        return EMPTY;
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }
}
