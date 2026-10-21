package com.salesforce.marketingcloud.media;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f64533d = 20971520;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f64534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f64535b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.salesforce.marketingcloud.util.f f64536c;

    public r(File file) {
        this.f64534a = file;
    }

    private void b() throws IOException {
        synchronized (this.f64535b) {
            try {
                if (this.f64536c == null) {
                    this.f64536c = com.salesforce.marketingcloud.util.f.a(this.f64534a, 0, 1, 20971520L);
                    this.f64535b.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static String c(String str) {
        return com.salesforce.marketingcloud.util.l.g(str);
    }

    @Nullable
    @WorkerThread
    public InputStream a(String str) throws IOException {
        InputStream inputStreamA;
        b();
        String strC = c(str);
        synchronized (this.f64535b) {
            try {
                com.salesforce.marketingcloud.util.f.e eVarB = this.f64536c.b(strC);
                inputStreamA = eVarB != null ? eVarB.a(0) : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return inputStreamA;
    }

    @WorkerThread
    public void a() throws IOException {
        b();
        this.f64536c.flush();
    }

    @WorkerThread
    public void b(String str) throws IOException {
        b();
        this.f64536c.d(c(str));
    }

    @WorkerThread
    public void a(String str, InputStream inputStream) throws IOException {
        b();
        String strC = c(str);
        synchronized (this.f64535b) {
            try {
                com.salesforce.marketingcloud.util.f.c cVarA = this.f64536c.a(strC);
                try {
                    com.salesforce.marketingcloud.util.g.a(inputStream, cVarA.c(0));
                    cVarA.c();
                    com.salesforce.marketingcloud.util.g.a((Closeable) inputStream);
                } catch (Throwable th2) {
                    com.salesforce.marketingcloud.util.g.a((Closeable) inputStream);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
