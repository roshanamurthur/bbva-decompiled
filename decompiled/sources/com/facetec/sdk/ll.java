package com.facetec.sdk;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ll {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<kx> f42324c = new LinkedHashSet();

    public final synchronized boolean a(kx kxVar) {
        return this.f42324c.contains(kxVar);
    }

    public final synchronized void c(kx kxVar) {
        this.f42324c.remove(kxVar);
    }

    public final synchronized void e(kx kxVar) {
        this.f42324c.add(kxVar);
    }
}
