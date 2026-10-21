package com.huawei.hms.feature.broadcast;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<g> f50213a = new AtomicReference<>();

    public static g a() {
        return f50213a.get();
    }

    public static void a(g gVar) {
        AtomicReference<g> atomicReference = f50213a;
        while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
        }
    }
}
