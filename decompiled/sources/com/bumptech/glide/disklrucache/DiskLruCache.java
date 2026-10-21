package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class DiskLruCache implements Closeable {
    public int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final File f38066p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final File f38067q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final File f38068r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final File f38069s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f38070t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f38071u0;
    public final int v0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public BufferedWriter f38073x0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f38072w0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final LinkedHashMap<String, c> f38074y0 = new LinkedHashMap<>(0, 0.75f, true);
    public long F0 = 0;
    public final ThreadPoolExecutor G0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final a H0 = new a();

    public final class Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f38075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f38076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38077c;

        public Editor(c cVar) {
            this.f38075a = cVar;
            this.f38076b = cVar.f38089e ? null : new boolean[DiskLruCache.this.v0];
        }

        public void abort() throws IOException {
            DiskLruCache.b(DiskLruCache.this, this, false);
        }

        public void abortUnlessCommitted() {
            if (this.f38077c) {
                return;
            }
            try {
                abort();
            } catch (IOException unused) {
            }
        }

        public void commit() throws IOException {
            DiskLruCache.b(DiskLruCache.this, this, true);
            this.f38077c = true;
        }

        public File getFile(int i10) throws IOException {
            File file;
            synchronized (DiskLruCache.this) {
                try {
                    c cVar = this.f38075a;
                    if (cVar.f38090f != this) {
                        throw new IllegalStateException();
                    }
                    if (!cVar.f38089e) {
                        this.f38076b[i10] = true;
                    }
                    file = cVar.f38088d[i10];
                    DiskLruCache.this.f38066p0.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return file;
        }

        public String getString(int i10) throws IOException {
            FileInputStream fileInputStream;
            synchronized (DiskLruCache.this) {
                c cVar = this.f38075a;
                if (cVar.f38090f != this) {
                    throw new IllegalStateException();
                }
                if (cVar.f38089e) {
                    try {
                        fileInputStream = new FileInputStream(this.f38075a.f38087c[i10]);
                    } catch (FileNotFoundException unused) {
                        fileInputStream = null;
                    }
                }
                fileInputStream = null;
            }
            if (fileInputStream != null) {
                return DiskLruCache.a(fileInputStream);
            }
            return null;
        }

        public void set(int i10, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(getFile(i10)), qc.b.f92813b);
                try {
                    outputStreamWriter2.write(str);
                    try {
                        outputStreamWriter2.close();
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    Charset charset = qc.b.f92812a;
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (RuntimeException e7) {
                            throw e7;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final class Value {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f38080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f38081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f38082d;

        public Value(String str, long j10, File[] fileArr, long[] jArr) {
            this.f38079a = str;
            this.f38080b = j10;
            this.f38082d = fileArr;
            this.f38081c = jArr;
        }

        public Editor edit() throws IOException {
            return DiskLruCache.this.e(this.f38080b, this.f38079a);
        }

        public File getFile(int i10) {
            return this.f38082d[i10];
        }

        public long getLength(int i10) {
            return this.f38081c[i10];
        }

        public String getString(int i10) throws IOException {
            return DiskLruCache.a(new FileInputStream(this.f38082d[i10]));
        }
    }

    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (DiskLruCache.this) {
                try {
                    DiskLruCache diskLruCache = DiskLruCache.this;
                    if (diskLruCache.f38073x0 == null) {
                        return null;
                    }
                    diskLruCache.u();
                    if (DiskLruCache.this.l()) {
                        DiskLruCache.this.q();
                        DiskLruCache.this.E0 = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f38086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File[] f38087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f38088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f38089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Editor f38090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f38091g;

        public c(String str) {
            this.f38085a = str;
            int i10 = DiskLruCache.this.v0;
            this.f38086b = new long[i10];
            this.f38087c = new File[i10];
            this.f38088d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < DiskLruCache.this.v0; i11++) {
                sb2.append(i11);
                File[] fileArr = this.f38087c;
                String string = sb2.toString();
                File file = DiskLruCache.this.f38066p0;
                fileArr[i11] = new File(file, string);
                sb2.append(".tmp");
                this.f38088d[i11] = new File(file, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f38086b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    public DiskLruCache(File file, int i10, int i11, long j10) {
        this.f38066p0 = file;
        this.f38070t0 = i10;
        this.f38067q0 = new File(file, "journal");
        this.f38068r0 = new File(file, "journal.tmp");
        this.f38069s0 = new File(file, "journal.bkp");
        this.v0 = i11;
        this.f38071u0 = j10;
    }

    public static String a(FileInputStream fileInputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, qc.b.f92813b);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i10);
            }
        } finally {
            inputStreamReader.close();
        }
    }

    public static void b(DiskLruCache diskLruCache, Editor editor, boolean z10) throws IOException {
        synchronized (diskLruCache) {
            c cVar = editor.f38075a;
            if (cVar.f38090f != editor) {
                throw new IllegalStateException();
            }
            if (z10 && !cVar.f38089e) {
                for (int i10 = 0; i10 < diskLruCache.v0; i10++) {
                    if (!editor.f38076b[i10]) {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!cVar.f38088d[i10].exists()) {
                        editor.abort();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < diskLruCache.v0; i11++) {
                File file = cVar.f38088d[i11];
                if (!z10) {
                    d(file);
                } else if (file.exists()) {
                    File file2 = cVar.f38087c[i11];
                    file.renameTo(file2);
                    long j10 = cVar.f38086b[i11];
                    long length = file2.length();
                    cVar.f38086b[i11] = length;
                    diskLruCache.f38072w0 = (diskLruCache.f38072w0 - j10) + length;
                }
            }
            diskLruCache.E0++;
            cVar.f38090f = null;
            if (cVar.f38089e || z10) {
                cVar.f38089e = true;
                diskLruCache.f38073x0.append((CharSequence) "CLEAN");
                diskLruCache.f38073x0.append(' ');
                diskLruCache.f38073x0.append((CharSequence) cVar.f38085a);
                diskLruCache.f38073x0.append((CharSequence) cVar.a());
                diskLruCache.f38073x0.append('\n');
                if (z10) {
                    long j11 = diskLruCache.F0;
                    diskLruCache.F0 = 1 + j11;
                    cVar.f38091g = j11;
                }
            } else {
                diskLruCache.f38074y0.remove(cVar.f38085a);
                diskLruCache.f38073x0.append((CharSequence) "REMOVE");
                diskLruCache.f38073x0.append(' ');
                diskLruCache.f38073x0.append((CharSequence) cVar.f38085a);
                diskLruCache.f38073x0.append('\n');
            }
            f(diskLruCache.f38073x0);
            if (diskLruCache.f38072w0 > diskLruCache.f38071u0 || diskLruCache.l()) {
                diskLruCache.G0.submit(diskLruCache.H0);
            }
        }
    }

    @TargetApi(26)
    public static void c(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void f(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static DiskLruCache open(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                r(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, i10, i11, j10);
        if (diskLruCache.f38067q0.exists()) {
            try {
                diskLruCache.o();
                diskLruCache.m();
                return diskLruCache;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                diskLruCache.delete();
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, i10, i11, j10);
        diskLruCache2.q();
        return diskLruCache2;
    }

    public static void r(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f38073x0 == null) {
                return;
            }
            Iterator it = new ArrayList(this.f38074y0.values()).iterator();
            while (it.hasNext()) {
                Editor editor = ((c) it.next()).f38090f;
                if (editor != null) {
                    editor.abort();
                }
            }
            u();
            c(this.f38073x0);
            this.f38073x0 = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void delete() throws IOException {
        close();
        qc.b.a(this.f38066p0);
    }

    public final synchronized Editor e(long j10, String str) throws IOException {
        try {
            if (this.f38073x0 == null) {
                throw new IllegalStateException("cache is closed");
            }
            c cVar = this.f38074y0.get(str);
            if (j10 != -1 && (cVar == null || cVar.f38091g != j10)) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.f38074y0.put(str, cVar);
            } else if (cVar.f38090f != null) {
                return null;
            }
            Editor editor = new Editor(cVar);
            cVar.f38090f = editor;
            this.f38073x0.append((CharSequence) "DIRTY");
            this.f38073x0.append(' ');
            this.f38073x0.append((CharSequence) str);
            this.f38073x0.append('\n');
            f(this.f38073x0);
            return editor;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Editor edit(String str) throws IOException {
        return e(-1L, str);
    }

    public synchronized void flush() throws IOException {
        if (this.f38073x0 == null) {
            throw new IllegalStateException("cache is closed");
        }
        u();
        f(this.f38073x0);
    }

    public synchronized Value get(String str) throws IOException {
        if (this.f38073x0 == null) {
            throw new IllegalStateException("cache is closed");
        }
        c cVar = this.f38074y0.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f38089e) {
            return null;
        }
        for (File file : cVar.f38087c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.E0++;
        this.f38073x0.append((CharSequence) "READ");
        this.f38073x0.append(' ');
        this.f38073x0.append((CharSequence) str);
        this.f38073x0.append('\n');
        if (l()) {
            this.G0.submit(this.H0);
        }
        return new Value(str, cVar.f38091g, cVar.f38087c, cVar.f38086b);
    }

    public File getDirectory() {
        return this.f38066p0;
    }

    public synchronized long getMaxSize() {
        return this.f38071u0;
    }

    public synchronized boolean isClosed() {
        return this.f38073x0 == null;
    }

    public final boolean l() {
        int i10 = this.E0;
        return i10 >= 2000 && i10 >= this.f38074y0.size();
    }

    public final void m() throws IOException {
        d(this.f38068r0);
        Iterator<c> it = this.f38074y0.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            Editor editor = next.f38090f;
            int i10 = this.v0;
            int i11 = 0;
            if (editor == null) {
                while (i11 < i10) {
                    this.f38072w0 += next.f38086b[i11];
                    i11++;
                }
            } else {
                next.f38090f = null;
                while (i11 < i10) {
                    d(next.f38087c[i11]);
                    d(next.f38088d[i11]);
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void o() throws IOException {
        File file = this.f38067q0;
        qc.a aVar = new qc.a(new FileInputStream(file), qc.b.f92812a);
        try {
            String strB = aVar.b();
            String strB2 = aVar.b();
            String strB3 = aVar.b();
            String strB4 = aVar.b();
            String strB5 = aVar.b();
            if (!"libcore.io.DiskLruCache".equals(strB) || !"1".equals(strB2) || !Integer.toString(this.f38070t0).equals(strB3) || !Integer.toString(this.v0).equals(strB4) || !"".equals(strB5)) {
                throw new IOException("unexpected journal header: [" + strB + ", " + strB2 + ", " + strB4 + ", " + strB5 + Constant.BRACKET_CLOSE);
            }
            int i10 = 0;
            while (true) {
                try {
                    p(aVar.b());
                    i10++;
                } catch (EOFException unused) {
                    this.E0 = i10 - this.f38074y0.size();
                    if (aVar.f92810t0 == -1) {
                        q();
                    } else {
                        this.f38073x0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), qc.b.f92812a));
                    }
                    try {
                        aVar.close();
                        return;
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void p(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        LinkedHashMap<String, c> linkedHashMap = this.f38074y0;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        c cVar = linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f38090f = new Editor(cVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        cVar.f38089e = true;
        cVar.f38090f = null;
        if (strArrSplit.length != DiskLruCache.this.v0) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                cVar.f38086b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void q() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.f38073x0;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f38068r0), qc.b.f92812a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write(RootService.LINE_BREAK);
                bufferedWriter2.write("1");
                bufferedWriter2.write(RootService.LINE_BREAK);
                bufferedWriter2.write(Integer.toString(this.f38070t0));
                bufferedWriter2.write(RootService.LINE_BREAK);
                bufferedWriter2.write(Integer.toString(this.v0));
                bufferedWriter2.write(RootService.LINE_BREAK);
                bufferedWriter2.write(RootService.LINE_BREAK);
                for (c cVar : this.f38074y0.values()) {
                    if (cVar.f38090f != null) {
                        bufferedWriter2.write("DIRTY " + cVar.f38085a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + cVar.f38085a + cVar.a() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.f38067q0.exists()) {
                    r(this.f38067q0, this.f38069s0, true);
                }
                r(this.f38068r0, this.f38067q0, false);
                this.f38069s0.delete();
                this.f38073x0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f38067q0, true), qc.b.f92812a));
            } catch (Throwable th2) {
                c(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized boolean remove(String str) throws IOException {
        try {
            if (this.f38073x0 == null) {
                throw new IllegalStateException("cache is closed");
            }
            c cVar = this.f38074y0.get(str);
            if (cVar != null && cVar.f38090f == null) {
                for (int i10 = 0; i10 < this.v0; i10++) {
                    File file = cVar.f38087c[i10];
                    if (file.exists() && !file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                    long j10 = this.f38072w0;
                    long[] jArr = cVar.f38086b;
                    this.f38072w0 = j10 - jArr[i10];
                    jArr[i10] = 0;
                }
                this.E0++;
                this.f38073x0.append((CharSequence) "REMOVE");
                this.f38073x0.append(' ');
                this.f38073x0.append((CharSequence) str);
                this.f38073x0.append('\n');
                this.f38074y0.remove(str);
                if (l()) {
                    this.G0.submit(this.H0);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setMaxSize(long j10) {
        this.f38071u0 = j10;
        this.G0.submit(this.H0);
    }

    public synchronized long size() {
        return this.f38072w0;
    }

    public final void u() throws IOException {
        while (this.f38072w0 > this.f38071u0) {
            remove(this.f38074y0.entrySet().iterator().next().getKey());
        }
    }
}
