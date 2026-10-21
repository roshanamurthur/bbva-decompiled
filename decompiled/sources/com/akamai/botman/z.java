package com.akamai.botman;

import android.os.SystemClock;
import android.util.Pair;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future<Pair<String, Long>> f26385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f26387f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b4.g> f26383b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f26384c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f26382a = new b();

    public class a implements Callable<Pair<String, Long>> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<String, Long> call() throws Exception {
            return z.this.c();
        }
    }

    public class b implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f26389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26390b = -1;

        public b() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            z zVar = z.this;
            try {
                zVar.f26387f++;
                if (obj == null || zVar.f26383b.size() >= 50 || zVar.f26384c.get()) {
                    return;
                }
                b4.g gVar = (b4.g) obj;
                long j10 = gVar.f24788a;
                long j11 = j10 - this.f26389a;
                String str = gVar.f24789b;
                int i10 = gVar.f24790c;
                b4.g gVar2 = new b4.g(j11, str, i10, gVar.f24791d);
                if (this.f26390b != i10) {
                    zVar.f26386e = 0;
                    this.f26390b = i10;
                }
                int i11 = zVar.f26386e;
                if (i11 < 9) {
                    zVar.f26386e = i11 + 1;
                    zVar.f26383b.add(gVar2);
                }
                this.f26389a = j10;
                if (zVar.f26383b.size() >= 50) {
                    Future<Pair<String, Long>> future = zVar.f26385d;
                    if (future == null || future.isCancelled() || zVar.f26385d.isDone()) {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                        zVar.f26385d = executorServiceNewFixedThreadPool.submit(zVar.new a());
                        executorServiceNewFixedThreadPool.shutdown();
                    }
                }
            } catch (Exception e5) {
                ap.b("TextChangeManager", "Exception in processing text change event", e5);
                b4.f.a(e5);
            }
        }
    }

    public z() {
        a();
    }

    public final void a() {
        this.f26382a.f26389a = SystemClock.uptimeMillis();
        this.f26386e = 0;
        this.f26387f = 0L;
        this.f26383b.clear();
        Future<Pair<String, Long>> future = this.f26385d;
        if (future != null) {
            if (!future.isCancelled() && !this.f26385d.isDone()) {
                this.f26385d.cancel(true);
            }
            this.f26385d = null;
        }
    }

    public final Pair<String, Long> b() throws ExecutionException, InterruptedException {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        try {
            Future<Pair<String, Long>> future2 = this.f26385d;
            if (future2 != null) {
                try {
                    try {
                        pair = future2.get();
                    } catch (InterruptedException e5) {
                        ap.b("TextChangeManager", "Failed to get Text data: " + e5.getMessage(), new Throwable[0]);
                    }
                } catch (ExecutionException e7) {
                    ap.b("TextChangeManager", "Failed to get Text data: " + e7.getMessage(), new Throwable[0]);
                }
            }
            if (pair != null) {
                return pair;
            }
            pair = c();
            if (pair != null || (future = this.f26385d) == null) {
                return pair;
            }
            try {
                return future.get();
            } catch (InterruptedException e10) {
                ap.b("TextChangeManager", "Failed to get Text data: " + e10.getMessage(), new Throwable[0]);
                return pair;
            } catch (ExecutionException e11) {
                ap.b("TextChangeManager", "Failed to get Text data: " + e11.getMessage(), new Throwable[0]);
                return pair;
            }
        } catch (Exception e12) {
            ap.b("TextChangeManager", "Exception in processing text event", e12);
            b4.f.a(e12);
            return pair;
        }
    }

    public final Pair<String, Long> c() throws Exception {
        long j10;
        ArrayList<b4.g> arrayList = this.f26383b;
        String strF = "";
        if (arrayList.size() == 0) {
            return new Pair<>("", 0L);
        }
        AtomicBoolean atomicBoolean = this.f26384c;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return null;
        }
        long j11 = 0;
        for (b4.g gVar : arrayList) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(gVar.f24789b);
            sb2.append(",");
            long j12 = gVar.f24788a;
            sb2.append(Long.valueOf(j12));
            sb2.append(",");
            int i10 = gVar.f24790c;
            sb2.append(i10);
            String string = sb2.toString();
            if (gVar.f24791d) {
                string = androidx.camera.camera2.internal.compat.u.f(string, ",1");
            }
            strF = androidx.camera.camera2.internal.compat.u.f(strF, androidx.camera.camera2.internal.compat.u.f(string, ReplenishLogic.ID_SEPARATOR));
            try {
                j10 = Long.parseLong(gVar.f24789b);
            } catch (NumberFormatException unused) {
                j10 = 0;
            }
            j11 += j12 + j10 + ((long) i10);
            SystemClock.uptimeMillis();
            String str = e.f26325b;
            arrayList.size();
        }
        atomicBoolean.set(false);
        return new Pair<>(strF, Long.valueOf(j11));
    }
}
