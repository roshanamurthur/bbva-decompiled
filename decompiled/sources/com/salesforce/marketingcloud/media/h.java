package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@VisibleForTesting(otherwise = 3)
public class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int f64472h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int f64473i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int f64474j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final int f64475k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int f64476l = 5;
    static final int m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f64477n = com.salesforce.marketingcloud.g.a("Dispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map<String, n> f64478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f64479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f64480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ExecutorService f64481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Handler f64482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Handler f64483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final c f64484g;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f64485a;

        public a(Looper looper, h hVar) {
            super(looper);
            this.f64485a = hVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f64485a.d((com.salesforce.marketingcloud.media.a) message.obj);
                    break;
                case 2:
                    this.f64485a.d((n) message.obj);
                    break;
                case 3:
                    this.f64485a.e((n) message.obj);
                    break;
                case 4:
                    this.f64485a.b((d) message.obj);
                    break;
                case 5:
                    this.f64485a.b((e) message.obj);
                    break;
                case 6:
                    this.f64485a.c((com.salesforce.marketingcloud.media.a) message.obj);
                    break;
            }
        }
    }

    public static class b extends HandlerThread {
        public b() {
            super("mcsdk_image_thread", 10);
        }
    }

    public h(Context context, ExecutorService executorService, Handler handler, c cVar) {
        b bVar = new b();
        this.f64479b = bVar;
        bVar.start();
        this.f64480c = context;
        this.f64481d = executorService;
        this.f64478a = new LinkedHashMap();
        this.f64482e = new a(bVar.getLooper(), this);
        this.f64483f = handler;
        this.f64484g = cVar;
    }

    public void a(com.salesforce.marketingcloud.media.a aVar) {
        Handler handler = this.f64482e;
        handler.sendMessage(handler.obtainMessage(6, aVar));
    }

    public void b(com.salesforce.marketingcloud.media.a aVar) {
        Handler handler = this.f64482e;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public void c(com.salesforce.marketingcloud.media.a aVar) {
        String strC = aVar.c();
        n nVar = this.f64478a.get(strC);
        if (nVar != null) {
            nVar.b(aVar);
            if (nVar.a()) {
                this.f64478a.remove(strC);
            }
        }
    }

    public void d(com.salesforce.marketingcloud.media.a aVar) {
        n nVar = this.f64478a.get(aVar.c());
        if (nVar != null) {
            nVar.a(aVar);
        } else {
            if (this.f64481d.isShutdown()) {
                com.salesforce.marketingcloud.g.a(f64477n, "ExecutorService is shutdown.  Ignoring request.", new Object[0]);
                return;
            }
            n nVarA = n.a(aVar.b(), this, this.f64484g, aVar);
            nVarA.f64506j = this.f64481d.submit(nVarA);
            this.f64478a.put(aVar.c(), nVarA);
        }
    }

    public void e(n nVar) {
        this.f64478a.remove(nVar.h());
        a(nVar);
    }

    public void a(d dVar) {
        Handler handler = this.f64482e;
        handler.sendMessage(handler.obtainMessage(4, dVar));
    }

    public void b(d dVar) {
        if (this.f64481d.isShutdown()) {
            com.salesforce.marketingcloud.g.a(f64477n, "ExecutorService is shutdown.  Ignoring request.", new Object[0]);
        } else {
            this.f64481d.submit(new e(this, dVar));
        }
    }

    public void c(n nVar) {
        Handler handler = this.f64482e;
        handler.sendMessage(handler.obtainMessage(3, nVar));
    }

    public void d(n nVar) {
        if (s.b.b(nVar.f64502f.f64540d)) {
            u.b bVar = nVar.f64505i;
            if (bVar.d()) {
                this.f64484g.a(nVar.h(), bVar.a());
            }
        }
        this.f64478a.remove(nVar.h());
        a(nVar);
    }

    public void a(e eVar) {
        Handler handler = this.f64482e;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }

    public void b(e eVar) {
        Handler handler = this.f64483f;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }

    private void a(n nVar) {
        if (nVar.j()) {
            return;
        }
        u.b bVarI = nVar.i();
        if (bVarI != null && bVarI.d()) {
            bVarI.a().prepareToDraw();
        }
        Handler handler = this.f64483f;
        handler.sendMessage(handler.obtainMessage(2, nVar));
    }

    public void b(n nVar) {
        Handler handler = this.f64482e;
        handler.sendMessage(handler.obtainMessage(2, nVar));
    }
}
