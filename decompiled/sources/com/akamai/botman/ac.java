package com.akamai.botman;

import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
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
public final class ac implements Observer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26262c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future<Pair<String, Long>> f26266g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f26268i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26260a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f26263d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26264e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<ai> f26265f = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f26267h = new AtomicBoolean(false);

    public class a implements Callable<Pair<String, Long>> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<String, Long> call() throws Exception {
            return ac.this.b();
        }
    }

    public final Pair<String, Long> a() throws Throwable {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        Future<Pair<String, Long>> future2 = this.f26266g;
        if (future2 != null) {
            try {
                pair = future2.get();
            } catch (InterruptedException e5) {
                ap.b("TouchManager", "Failed to get touch data: " + e5.getMessage(), new Throwable[0]);
            } catch (ExecutionException e7) {
                ap.b("TouchManager", "Failed to get touch data: " + e7.getMessage(), new Throwable[0]);
            }
        }
        if (pair != null) {
            return pair;
        }
        Pair<String, Long> pairB = b();
        if (pairB != null || (future = this.f26266g) == null) {
            return pairB;
        }
        try {
            return future.get();
        } catch (InterruptedException e10) {
            ap.b("TouchManager", "Failed to get touch data: " + e10.getMessage(), new Throwable[0]);
            return pairB;
        } catch (ExecutionException e11) {
            ap.b("TouchManager", "Failed to get touch data: " + e11.getMessage(), new Throwable[0]);
            return pairB;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    public final Pair<String, Long> b() throws Throwable {
        ?? r3;
        ArrayList<ai> arrayList = this.f26265f;
        if (arrayList.size() == 0) {
            return new Pair<>("", 0L);
        }
        ?? r4 = this.f26267h;
        boolean z10 = false;
        ?? CompareAndSet = r4.compareAndSet(false, true);
        if (CompareAndSet == 0) {
            return null;
        }
        try {
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    for (ai aiVar : arrayList) {
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = aiVar.f26304a;
                        long j10 = aiVar.f26307d;
                        sb2.append(i10);
                        sb2.append(",");
                        sb2.append(j10);
                        sb2.append(",0,0,");
                        sb2.append(aiVar.f26305b);
                        sb2.append(",1,");
                        sb2.append(aiVar.f26306c);
                        sb2.append(",-1;");
                        this.f26264e += sb2.toString();
                        try {
                            this.f26268i = j10 + ((long) aiVar.f26304a) + this.f26268i;
                        } catch (Throwable th2) {
                            th = th2;
                            r3 = 0;
                            r4.set(r3);
                            throw th;
                        }
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    ap.a("TouchManager", "Touch Event Count: " + arrayList.size() + " (move: " + this.f26261b + ", updown: " + this.f26262c + ")", new Throwable[0]);
                    CompareAndSet = "Touch SDCalc-Time: ";
                    z10 = false;
                    ap.a("TouchManager", "Touch SDCalc-Time: " + jUptimeMillis2 + "ms", new Throwable[0]);
                    Pair<String, Long> pair = new Pair<>(this.f26264e, Long.valueOf(this.f26268i));
                    r4.set(false);
                    return pair;
                } catch (Throwable th3) {
                    th = th3;
                    r3 = z10;
                    r4.set(r3);
                    throw th;
                }
            } catch (Exception e5) {
                Throwable[] thArr = new Throwable[1];
                CompareAndSet = 0;
                thArr[0] = e5;
                ap.b("TouchManager", "Exception in getting touch events", thArr);
                b4.f.a(e5);
                r4.set(false);
                return new Pair<>("", 0L);
            }
        } catch (Throwable th4) {
            th = th4;
            r3 = CompareAndSet;
            r4.set(r3);
            throw th;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        int i10;
        Future<Pair<String, Long>> future;
        if (obj != null) {
            int i11 = 1;
            try {
                if (this.f26267h.get()) {
                    return;
                }
                this.f26263d++;
                try {
                    b4.b bVar = (b4.b) obj;
                    int i12 = bVar.f24780c;
                    MotionEvent motionEvent = bVar.f24778a;
                    int pointerCount = motionEvent.getPointerCount();
                    if (i12 != 1 || this.f26261b >= 50) {
                        if (i12 == 1 || this.f26262c >= 50) {
                            return;
                        }
                    }
                    ArrayList<ai> arrayList = this.f26265f;
                    if (i12 == 1) {
                        int i13 = 0;
                        while (i13 < pointerCount) {
                            if (this.f26261b < 50) {
                                arrayList.add(new ai(bVar.f24779b, motionEvent.getEventTime() - this.f26260a, bVar.f24780c, pointerCount, motionEvent.getToolType(i13)));
                                this.f26261b++;
                            }
                            i13++;
                            i11 = 1;
                        }
                    }
                    if (i12 != i11) {
                        arrayList.add(new ai(bVar.f24779b, motionEvent.getEventTime() - this.f26260a, bVar.f24780c, pointerCount, motionEvent.getToolType(motionEvent.getActionIndex())));
                        this.f26262c++;
                    }
                    if (this.f26261b >= 50 && this.f26262c >= 50 && ((future = this.f26266g) == null || future.isCancelled() || this.f26266g.isDone())) {
                        i10 = 1;
                        try {
                            ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                            this.f26266g = executorServiceNewFixedThreadPool.submit(new a());
                            executorServiceNewFixedThreadPool.shutdown();
                        } catch (Exception e5) {
                            e = e5;
                        }
                    }
                    this.f26260a = motionEvent.getEventTime();
                    return;
                } catch (Exception e7) {
                    e = e7;
                    i10 = 1;
                }
            } catch (Exception e10) {
                e = e10;
                i10 = i11;
            }
            Throwable[] thArr = new Throwable[i10];
            thArr[0] = e;
            ap.b("TouchManager", "Exception in processing touch event", thArr);
            b4.f.a(e);
        }
    }
}
