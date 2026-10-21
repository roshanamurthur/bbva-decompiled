package com.facetec.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class ee extends ec implements Iterable<ec> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ec> f41464a = new ArrayList();

    public final void a(ec ecVar) {
        if (ecVar == null) {
            ecVar = ef.f41465b;
        }
        this.f41464a.add(ecVar);
    }

    @Override // com.facetec.sdk.ec
    public final Number b() {
        if (this.f41464a.size() == 1) {
            return this.f41464a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.ec
    public final long c() {
        if (this.f41464a.size() == 1) {
            return this.f41464a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.ec
    public final String d() {
        if (this.f41464a.size() == 1) {
            return this.f41464a.get(0).d();
        }
        throw new IllegalStateException();
    }

    public final void e(String str) {
        this.f41464a.add(str == null ? ef.f41465b : new ei(str));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ee) && ((ee) obj).f41464a.equals(this.f41464a);
        }
        return true;
    }

    @Override // com.facetec.sdk.ec
    public final boolean f() {
        if (this.f41464a.size() == 1) {
            return this.f41464a.get(0).f();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.f41464a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<ec> iterator() {
        return this.f41464a.iterator();
    }

    @Override // com.facetec.sdk.ec
    public final int e() {
        if (this.f41464a.size() == 1) {
            return this.f41464a.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.ec
    public final double a() {
        if (this.f41464a.size() == 1) {
            return this.f41464a.get(0).a();
        }
        throw new IllegalStateException();
    }
}
