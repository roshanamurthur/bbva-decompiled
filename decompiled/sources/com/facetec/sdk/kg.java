package com.facetec.sdk;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class kg {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static /* synthetic */ boolean f42023i = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private ExecutorService f42025b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Runnable f42027d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42026c = 64;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42028e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Deque<ks.c> f42024a = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Deque<ks.c> f42029h = new ArrayDeque();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Deque<ks> f42030j = new ArrayDeque();

    private synchronized ExecutorService b() {
        try {
            if (this.f42025b == null) {
                this.f42025b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), kz.b("OkHttp Dispatcher", false));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f42025b;
    }

    private <T> void d(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f42027d;
        }
        if (c() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private synchronized int e() {
        return this.f42029h.size() + this.f42030j.size();
    }

    public final void a(ks.c cVar) {
        d(this.f42029h, cVar);
    }

    public final boolean c() {
        int i10;
        boolean z10;
        if (!f42023i && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<ks.c> it = this.f42024a.iterator();
                while (true) {
                    i10 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    ks.c next = it.next();
                    if (this.f42029h.size() >= this.f42026c) {
                        break;
                    }
                    for (ks.c cVar : this.f42029h) {
                        if (!ks.this.f42167j && cVar.a().equals(next.a())) {
                            i10++;
                        }
                    }
                    if (i10 < this.f42028e) {
                        it.remove();
                        arrayList.add(next);
                        this.f42029h.add(next);
                    }
                }
                z10 = e() > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        while (i10 < size) {
            ks.c cVar2 = (ks.c) arrayList.get(i10);
            ExecutorService executorServiceB = b();
            if (!ks.c.f42169b && Thread.holdsLock(ks.this.f42163c.m())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorServiceB.execute(cVar2);
                } catch (RejectedExecutionException e5) {
                    new InterruptedIOException("executor rejected").initCause(e5);
                    kf unused = ks.this.f42161a;
                    cVar2.f42171e.a();
                    ks.this.f42163c.m().a(cVar2);
                }
                i10++;
            } catch (Throwable th3) {
                ks.this.f42163c.m().a(cVar2);
                throw th3;
            }
        }
        return z10;
    }
}
