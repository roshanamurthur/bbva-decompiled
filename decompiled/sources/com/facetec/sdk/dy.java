package com.facetec.sdk;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class dy {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f41413j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ex f41405b = ex.f41503a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ek f41407d = ek.DEFAULT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dz f41404a = dw.IDENTITY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Type, eb<?>> f41406c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<el> f41408e = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<el> f41411h = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41409f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f41410g = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f41412i = 2;
    private boolean m = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41414k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41415l = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41417o = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41416n = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41418r = false;

    private static void b(String str, int i10, int i11, List<el> list) {
        du duVar;
        du duVar2;
        du duVar3;
        if (str != null && !"".equals(str.trim())) {
            duVar = new du(Date.class, str);
            duVar2 = new du(Timestamp.class, str);
            duVar3 = new du(java.sql.Date.class, str);
        } else {
            if (i10 == 2 || i11 == 2) {
                return;
            }
            du duVar4 = new du(Date.class, i10, i11);
            du duVar5 = new du(Timestamp.class, i10, i11);
            du duVar6 = new du(java.sql.Date.class, i10, i11);
            duVar = duVar4;
            duVar2 = duVar5;
            duVar3 = duVar6;
        }
        list.add(ft.a(Date.class, duVar));
        list.add(ft.a(Timestamp.class, duVar2));
        list.add(ft.a(java.sql.Date.class, duVar3));
    }

    public final dv a() {
        ArrayList arrayList = new ArrayList(this.f41411h.size() + this.f41408e.size() + 3);
        arrayList.addAll(this.f41408e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f41411h);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        b(this.f41413j, this.f41410g, this.f41412i, arrayList);
        return new dv(this.f41405b, this.f41404a, this.f41406c, this.f41409f, this.m, this.f41416n, this.f41415l, this.f41417o, this.f41418r, this.f41414k, this.f41407d, this.f41413j, this.f41410g, this.f41412i, this.f41408e, this.f41411h, arrayList);
    }

    public final dy d() {
        this.f41415l = false;
        return this;
    }
}
