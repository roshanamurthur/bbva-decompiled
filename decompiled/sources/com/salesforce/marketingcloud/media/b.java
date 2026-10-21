package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class b implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f64450g = com.salesforce.marketingcloud.g.a("BatchRequestHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f64451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f64452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f64453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f64454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f64455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64456f;

    public interface a {
        void a(boolean z10);
    }

    public b(o oVar, List<String> list) {
        this.f64452b = oVar;
        this.f64453c = list;
        this.f64451a = new AtomicInteger(list.size());
    }

    private void c() {
        a aVar;
        if (this.f64451a.decrementAndGet() > 0 || (aVar = this.f64454d) == null || this.f64455e) {
            return;
        }
        aVar.a(!this.f64456f);
    }

    @Override // com.salesforce.marketingcloud.media.f
    public void a() {
        c();
    }

    public void b() {
        this.f64455e = true;
    }

    public void a(a aVar) {
        this.f64454d = aVar;
        if (this.f64451a.get() == 0) {
            if (aVar != null) {
                aVar.a(true);
            }
        } else {
            Iterator<String> it = this.f64453c.iterator();
            while (it.hasNext()) {
                this.f64452b.b(it.next()).a(s.b.NO_MEMORY_CACHE, s.b.NO_MEMORY_STORE).a(this);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.media.f
    public void a(Exception exc) {
        if (exc instanceof k) {
            com.salesforce.marketingcloud.g.b(f64450g, exc, "Failed to pre-fetch image, but will be ignored since the url cannot be handled.", new Object[0]);
        } else {
            this.f64456f = true;
            com.salesforce.marketingcloud.g.b(f64450g, exc, "Failed to pre-fetch image.", new Object[0]);
        }
        c();
    }
}
