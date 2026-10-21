package com.huawei.hms.feature.install.featureinfo;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<e> f50403a = new AtomicReference<>();

    public static e a() {
        return f50403a.get();
    }

    public static void a(e eVar) {
        AtomicReference<e> atomicReference = f50403a;
        while (!atomicReference.compareAndSet(null, eVar) && atomicReference.get() == null) {
        }
    }
}
