package com.facetec.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f42907c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42909e = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42906b = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ah f42905a = new ah();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ac f42908d = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ad f42912h = ad.INITIALIZED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0579r f42911g = new C0579r();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<C0579r> f42913i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<C0579r> f42914j = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f42910f = -1;
    private int m = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f42915k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f42916l = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42918o = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42917n = 0;

    public v(Context context) {
        this.f42907c = context;
    }

    private synchronized boolean g() {
        return this.f42912h == ad.ENDED;
    }

    private synchronized void h() {
        if (this.f42918o) {
            t.c(this.f42907c, e.F2F_ERROR, "Error 4472");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f42913i.size() > 0) {
            List<C0579r> list = this.f42913i;
            arrayList = new ArrayList(Arrays.asList(list.get(list.size() - 1)));
        }
        arrayList.add(this.f42911g);
        ArrayList<C0579r> arrayList2 = new ArrayList(Arrays.asList(aa.d(arrayList)));
        arrayList2.addAll(this.f42914j);
        ac acVar = new ac(this.f42907c);
        ArrayList arrayList3 = new ArrayList();
        for (C0579r c0579r : arrayList2) {
            u uVar = new u();
            List<List<Integer>> list2 = c0579r.f42788a;
            uVar.f42881e = list2;
            uVar.f42878b = list2.size();
            uVar.f42879c = c0579r.f42793f;
            uVar.f42877a = c0579r.f42797j;
            uVar.f42882j = c0579r.f42795h;
            uVar.f42880d = aa.c(uVar.c().toString());
            arrayList3.add(uVar);
        }
        acVar.f40209e = arrayList3;
        acVar.f40206b = arrayList2.size();
        acVar.f40207c = aa.c(acVar.a().toString());
        int iC = aa.c(acVar.a().toString());
        acVar.f40207c = iC;
        if (iC > 4500) {
            List<u> list3 = acVar.f40209e;
            list3.remove(list3.size() - 1);
            acVar.f40207c = aa.c(acVar.a().toString());
            List<ac.c> listB = acVar.b();
            for (int size = listB.size() - 1; size >= 0 && acVar.f40207c > 4500; size--) {
                acVar.f40209e.remove(listB.get(size).f40215e);
                acVar.f40207c = aa.c(acVar.a().toString());
            }
        }
        this.f42908d = acVar;
        d.e(this.f42907c, acVar);
    }

    public final synchronized C0579r b() {
        return this.f42911g;
    }

    public final synchronized boolean c() {
        return this.f42912h == ad.STARTED;
    }

    public final synchronized void d(boolean z10) {
        try {
            ad adVar = this.f42912h;
            ad adVar2 = ad.STARTED;
            if (adVar != adVar2 && !this.f42918o) {
                this.f42912h = adVar2;
                this.f42915k = false;
                this.f42916l = false;
                this.f42910f++;
                this.f42905a.e(false);
                int i10 = this.f42910f;
                if (i10 != 0) {
                    if (!z10 && i10 > 0 && this.f42911g.f42788a.size() > 0) {
                        this.m = 0;
                        if (this.f42913i.size() == 50) {
                            this.f42913i.remove(0);
                        }
                        this.f42911g.f42790c = new ArrayList();
                        this.f42913i.add(this.f42911g);
                        this.f42911g = new C0579r();
                    }
                    return;
                }
                if (this.f42908d == null) {
                    this.f42908d = d.a(this.f42907c);
                }
                ArrayList arrayList = new ArrayList();
                for (u uVar : this.f42908d.f40209e) {
                    if (uVar.f42881e.size() > 0) {
                        arrayList.add(uVar.f42881e);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ArrayList arrayList3 = new ArrayList();
                    C0579r c0579r = new C0579r();
                    c0579r.f42788a = (List) arrayList.get(i11);
                    for (int i12 = 0; i12 < c0579r.f42788a.size(); i12++) {
                        for (int i13 = 0; i13 < c0579r.f42788a.get(i12).size(); i13++) {
                            z zVar = new z();
                            zVar.f43010e = i12;
                            zVar.f43009d = c0579r.f42788a.get(i12).get(i13).intValue();
                            arrayList3.add(zVar);
                        }
                    }
                    c0579r.f42791d = arrayList3;
                    arrayList2.add(c0579r);
                }
                this.f42914j.addAll(arrayList2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(boolean z10, Runnable runnable) {
        ad adVar = this.f42912h;
        ad adVar2 = ad.ENDED;
        if (adVar != adVar2 && !this.f42918o) {
            this.f42912h = adVar2;
            if (z10) {
                this.f42917n = 0;
            } else {
                int i10 = this.f42917n + 1;
                this.f42917n = i10;
                if (i10 > 3) {
                    this.f42911g = new C0579r();
                    this.f42905a.e(true);
                    return;
                }
            }
            cx.d(new f3(this, runnable, 2));
        }
    }

    private void c(int i10) {
        if (i10 == 0 || (!this.f42915k && this.f42916l)) {
            this.f42915k = true;
            this.f42916l = false;
            while (i10 < this.f42911g.f42791d.size()) {
                if (this.f42911g.f42791d.get(i10).f43006a.length != 0) {
                    this.f42911g.f42791d.get(i10).f43009d = Arrays.hashCode(this.f42911g.f42791d.get(i10).f43006a);
                    this.f42911g.f42791d.get(i10).f43006a = new byte[0];
                    this.m = i10 + 1;
                }
                i10++;
            }
            this.f42915k = false;
        }
    }

    public final synchronized boolean a() {
        return this.f42912h == ad.STARTED && !this.f42918o;
    }

    public final synchronized void a(byte[] bArr) {
        try {
            if (a() && bArr.length != 0) {
                z zVar = new z();
                zVar.f43006a = bArr;
                zVar.f43007b = this.f42911g.f42791d.size();
                zVar.f43010e = this.f42910f;
                this.f42911g.f42791d.add(zVar);
                if (this.f42911g.f42791d.size() % 20 == 0) {
                    this.f42916l = true;
                }
                if (this.f42916l && !this.f42915k) {
                    c(this.m);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized void a(Runnable runnable) {
        try {
            c(0);
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            int i11 = -1;
            while (i10 < this.f42911g.f42791d.size()) {
                z zVar = this.f42911g.f42791d.get(i10);
                if (i11 == -1 || i11 != zVar.f43010e) {
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = zVar.f43010e;
                    int i13 = i10;
                    while (i10 < this.f42911g.f42791d.size() && this.f42911g.f42791d.get(i10).f43010e == i12) {
                        arrayList2.add(Integer.valueOf(this.f42911g.f42791d.get(i10).f43009d));
                        i13 = i10;
                        i10++;
                    }
                    arrayList.add(arrayList2);
                    i11 = i12;
                    i10 = i13;
                }
                i10++;
            }
            this.f42911g.f42788a = arrayList;
            y yVar = new y();
            C0579r c0579r = this.f42911g;
            List<C0579r> list = this.f42913i;
            List<C0579r> list2 = this.f42914j;
            yVar.f42976a = c0579r;
            yVar.f42980e = new ArrayList(list2);
            ArrayList arrayList3 = new ArrayList(list);
            yVar.f42979d = arrayList3;
            arrayList3.add(c0579r);
            yVar.f42978c = y.e(yVar.f42979d);
            ArrayList arrayList4 = new ArrayList(yVar.f42976a.f42788a);
            yVar.f42981f = y.e(list).size();
            yVar.f42984i = yVar.b(arrayList4, 0, x.INTRA_SESSION);
            boolean zB = yVar.b(yVar.f42978c, yVar.f42981f, x.INTRA_FACETEC_SESSION);
            yVar.f42983h = zB;
            C0579r c0579r2 = yVar.f42976a;
            c0579r2.f42793f = yVar.f42984i ? w.DETECTED : w.NOT_DETECTED;
            c0579r2.f42797j = zB ? w.DETECTED : w.NOT_DETECTED;
            ArrayList arrayList5 = new ArrayList();
            yVar.f42977b = arrayList5;
            arrayList5.add(yVar.f42978c);
            for (int i14 = 0; i14 < list2.size(); i14++) {
                yVar.f42977b.add(list2.get(i14).f42788a);
            }
            ArrayList arrayList6 = new ArrayList();
            for (int i15 = 0; i15 < yVar.f42977b.size(); i15++) {
                arrayList6.addAll(yVar.f42977b.get(i15));
            }
            boolean zB2 = yVar.b(arrayList6, yVar.f42978c.size(), x.INTER_FACETEC_SESSION);
            yVar.f42982g = zB2;
            yVar.f42976a.f42795h = zB2 ? w.DETECTED : w.NOT_DETECTED;
            yVar.f42979d = new ArrayList();
            yVar.f42978c = new ArrayList();
            yVar.f42980e = new ArrayList();
            yVar.f42977b = new ArrayList();
            this.f42911g = yVar.f42976a;
            if (runnable != null) {
                runnable.run();
            }
            this.f42905a.e(true);
            h();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        if (g()) {
            ah ahVar = this.f42905a;
            synchronized (ahVar.f40251a) {
                if (ahVar.f40252b) {
                    return;
                }
                try {
                    ahVar.f40251a.wait(5000L);
                    if (!ah.f40250d && !ahVar.f40252b) {
                        throw new AssertionError();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public final synchronized void e() {
        this.f42913i = null;
        this.f42914j = null;
        this.f42908d = null;
        this.f42918o = true;
        this.f42905a.e(true);
    }
}
