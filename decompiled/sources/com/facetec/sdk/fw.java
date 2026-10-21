package com.facetec.sdk;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fw {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final fw f41706d;

    static {
        f41706d = ew.c() < 9 ? new fu() : new gc();
    }

    public static fw e() {
        return f41706d;
    }

    public abstract void e(AccessibleObject accessibleObject);
}
