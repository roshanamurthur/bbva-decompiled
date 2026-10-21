package com.facetec.sdk;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class le implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ni f42258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mq f42259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f42262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinkedHashMap<String, a> f42263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f42264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f42265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f42267j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Executor f42268l;
    private final Runnable m;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long[] f42269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final File[] f42270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f42271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final File[] f42272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f42273e;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        d f42274j;
    }

    public final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ le f42275b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42276c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final a f42277e;
    }

    static {
        Pattern.compile("[a-z0-9_-]{1,120}");
    }

    private boolean a() {
        int i10 = this.f42264g;
        return i10 >= 2000 && i10 >= this.f42263f.size();
    }

    private void b() throws IOException {
        while (this.f42260c > this.f42262e) {
            a(this.f42263f.values().iterator().next());
        }
        this.f42267j = false;
    }

    private synchronized void c(d dVar) throws IOException {
        try {
            a aVar = dVar.f42277e;
            if (aVar.f42274j != dVar) {
                throw new IllegalStateException();
            }
            for (int i10 = 0; i10 < this.f42261d; i10++) {
                this.f42259b.d(aVar.f42270b[i10]);
            }
            this.f42264g++;
            aVar.f42274j = null;
            if (aVar.f42273e) {
                aVar.f42273e = true;
                this.f42258a.e("CLEAN").h(32);
                this.f42258a.e(aVar.f42271c);
                ni niVar = this.f42258a;
                for (long j10 : aVar.f42269a) {
                    niVar.h(32).m(j10);
                }
                this.f42258a.h(10);
            } else {
                this.f42263f.remove(aVar.f42271c);
                this.f42258a.e("REMOVE").h(32);
                this.f42258a.e(aVar.f42271c);
                this.f42258a.h(10);
            }
            this.f42258a.flush();
            if (this.f42260c > this.f42262e || a()) {
                this.f42268l.execute(this.m);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void d() {
        if (c()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.f42266i && !this.f42265h) {
                for (a aVar : (a[]) this.f42263f.values().toArray(new a[this.f42263f.size()])) {
                    d dVar = aVar.f42274j;
                    if (dVar != null) {
                        synchronized (dVar.f42275b) {
                            try {
                                if (dVar.f42276c) {
                                    throw new IllegalStateException();
                                }
                                if (dVar.f42277e.f42274j == dVar) {
                                    dVar.f42275b.c(dVar);
                                }
                                dVar.f42276c = true;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                b();
                this.f42258a.close();
                this.f42258a = null;
                this.f42265h = true;
                return;
            }
            this.f42265h = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (this.f42266i) {
            d();
            b();
            this.f42258a.flush();
        }
    }

    private boolean a(a aVar) throws IOException {
        d dVar = aVar.f42274j;
        if (dVar != null && dVar.f42277e.f42274j == dVar) {
            int i10 = 0;
            while (true) {
                le leVar = dVar.f42275b;
                if (i10 >= leVar.f42261d) {
                    break;
                }
                try {
                    leVar.f42259b.d(dVar.f42277e.f42270b[i10]);
                } catch (IOException unused) {
                }
                i10++;
            }
            dVar.f42277e.f42274j = null;
        }
        for (int i11 = 0; i11 < this.f42261d; i11++) {
            this.f42259b.d(aVar.f42272d[i11]);
            long j10 = this.f42260c;
            long[] jArr = aVar.f42269a;
            this.f42260c = j10 - jArr[i11];
            jArr[i11] = 0;
        }
        this.f42264g++;
        this.f42258a.e("REMOVE").h(32).e(aVar.f42271c).h(10);
        this.f42263f.remove(aVar.f42271c);
        if (a()) {
            this.f42268l.execute(this.m);
        }
        return true;
    }

    private synchronized boolean c() {
        return this.f42265h;
    }
}
