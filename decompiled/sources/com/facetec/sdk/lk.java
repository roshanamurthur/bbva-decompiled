package com.facetec.sdk;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final jr f42314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final kf f42315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final jw f42316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ll f42317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<Proxy> f42318e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f42320g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<InetSocketAddress> f42321j = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List<kx> f42319f = new ArrayList();

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f42322c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<kx> f42323d;

        public c(List<kx> list) {
            this.f42323d = list;
        }

        public final boolean e() {
            return this.f42322c < this.f42323d.size();
        }
    }

    public lk(jr jrVar, ll llVar, jw jwVar, kf kfVar) {
        List<Proxy> listB;
        this.f42318e = Collections.emptyList();
        this.f42314a = jrVar;
        this.f42317d = llVar;
        this.f42316c = jwVar;
        this.f42315b = kfVar;
        kk kkVarE = jrVar.e();
        Proxy proxy = jrVar.f41900b;
        if (proxy != null) {
            listB = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = jrVar.a().select(kkVarE.d());
            listB = (listSelect == null || listSelect.isEmpty()) ? kz.b(Proxy.NO_PROXY) : kz.d(listSelect);
        }
        this.f42318e = listB;
        this.f42320g = 0;
    }

    public final boolean b() {
        return c() || !this.f42319f.isEmpty();
    }

    public final boolean c() {
        return this.f42320g < this.f42318e.size();
    }
}
