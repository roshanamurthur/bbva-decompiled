package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public final class f implements Closeable {
    private static final String A = "READ";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f65138o = "journal";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f65139p = "journal.tmp";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f65140q = "journal.bkp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f65141r = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f65142s = "1";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final long f65143t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f65144u = "[a-z0-9_-]{1,120}";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Pattern f65145v = Pattern.compile(f65144u);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final OutputStream f65146w = new a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f65147x = "CLEAN";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f65148y = "DIRTY";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f65149z = "REMOVE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final File f65151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f65152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f65153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f65154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final File f65155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f65156g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Writer f65158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f65159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f65160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f65161l;
    private long m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadPoolExecutor f65150a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LinkedHashMap<String, d> f65157h = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable<Void> f65162n = new b();

    public class b implements Callable<Void> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (f.this) {
                try {
                    f fVar = f.this;
                    if (fVar.f65158i == null) {
                        return null;
                    }
                    fVar.i();
                    if (f.this.e()) {
                        f.this.h();
                        f.this.f65159j = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f65164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean[] f65165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f65166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f65167d;

        public class a extends FilterOutputStream {
            public a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f65166c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f65166c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    c.this.f65166c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    c.this.f65166c = true;
                }
            }
        }

        public c(d dVar) {
            this.f65164a = dVar;
            this.f65165b = dVar.f65172c ? null : new boolean[f.this.f65152c];
        }

        public String a(int i10) throws IOException {
            InputStream inputStreamB = b(i10);
            if (inputStreamB != null) {
                return f.a(inputStreamB);
            }
            return null;
        }

        public InputStream b(int i10) throws IOException {
            synchronized (f.this) {
                d dVar = this.f65164a;
                if (dVar.f65173d != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f65172c) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f65164a.a(i10));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public OutputStream c(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i10 >= 0) {
                f fVar = f.this;
                if (i10 < fVar.f65152c) {
                    synchronized (fVar) {
                        try {
                            d dVar = this.f65164a;
                            if (dVar.f65173d != this) {
                                throw new IllegalStateException();
                            }
                            if (!dVar.f65172c) {
                                this.f65165b[i10] = true;
                            }
                            File fileB = dVar.b(i10);
                            try {
                                fileOutputStream = new FileOutputStream(fileB);
                            } catch (FileNotFoundException unused) {
                                f.this.f65151b.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(fileB);
                                } catch (FileNotFoundException unused2) {
                                    return f.f65146w;
                                }
                            }
                            aVar = new a(fileOutputStream);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return aVar;
                }
            }
            StringBuilder sbC = o1.c("Expected index ", i10, " to be greater than 0 and less than the maximum value count of ");
            sbC.append(f.this.f65152c);
            throw new IllegalArgumentException(sbC.toString());
        }

        public void a() throws IOException {
            f.this.a(this, false);
        }

        public void b() {
            if (this.f65167d) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void a(int i10, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(c(i10), g.f65183c);
                try {
                    outputStreamWriter2.write(str);
                    g.a(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    g.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public void c() throws IOException {
            if (this.f65166c) {
                f.this.a(this, false);
                f.this.d(this.f65164a.f65170a);
            } else {
                f.this.a(this, true);
            }
            this.f65167d = true;
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f65170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long[] f65171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f65172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f65173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f65174e;

        public d(String str) {
            this.f65170a = str;
            this.f65171b = new long[f.this.f65152c];
        }

        public File a(int i10) {
            return new File(f.this.f65151b, this.f65170a + Constant.DOT_STRING + i10);
        }

        public File b(int i10) {
            return new File(f.this.f65151b, this.f65170a + Constant.DOT_STRING + i10 + ".tmp");
        }

        private IOException a(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public void b(String[] strArr) throws IOException {
            if (strArr.length != f.this.f65152c) {
                throw a(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f65171b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw a(strArr);
                }
            }
        }

        public String a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f65171b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    public final class e implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f65176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f65177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InputStream[] f65178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f65179d;

        public e(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f65176a = str;
            this.f65177b = j10;
            this.f65178c = inputStreamArr;
            this.f65179d = jArr;
        }

        public c a() throws IOException {
            return f.this.a(this.f65176a, this.f65177b);
        }

        public long b(int i10) {
            return this.f65179d[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f65178c) {
                g.a((Closeable) inputStream);
            }
        }

        public String getString(int i10) throws IOException {
            return f.a(a(i10));
        }

        public InputStream a(int i10) {
            return this.f65178c[i10];
        }
    }

    private f(File file, int i10, int i11, long j10) {
        this.f65151b = file;
        this.f65156g = i10;
        this.f65153d = new File(file, f65138o);
        this.f65154e = new File(file, f65139p);
        this.f65155f = new File(file, f65140q);
        this.f65152c = i11;
        this.f65160k = j10;
    }

    private void e(String str) {
        if (!f65145v.matcher(str).matches()) {
            throw new IllegalArgumentException(h0.b("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    private void f() throws IOException {
        a(this.f65154e);
        Iterator<d> it = this.f65157h.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f65173d == null) {
                while (i10 < this.f65152c) {
                    this.f65161l += next.f65171b[i10];
                    i10++;
                }
            } else {
                next.f65173d = null;
                while (i10 < this.f65152c) {
                    a(next.a(i10));
                    a(next.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void g() throws IOException {
        k kVar = new k(new FileInputStream(this.f65153d), g.f65181a);
        try {
            String strD = kVar.d();
            String strD2 = kVar.d();
            String strD3 = kVar.d();
            String strD4 = kVar.d();
            String strD5 = kVar.d();
            if (!f65141r.equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f65156g).equals(strD3) || !Integer.toString(this.f65152c).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + Constant.BRACKET_CLOSE);
            }
            int i10 = 0;
            while (true) {
                try {
                    c(kVar.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f65159j = i10 - this.f65157h.size();
                    if (kVar.b()) {
                        h();
                    } else {
                        this.f65158i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f65153d, true), g.f65181a));
                    }
                    g.a(kVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            g.a(kVar);
            throw th2;
        }
    }

    public c a(String str) throws IOException {
        return a(str, -1L);
    }

    public synchronized e b(String str) throws IOException {
        InputStream inputStream;
        a();
        e(str);
        d dVar = this.f65157h.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f65172c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f65152c];
        for (int i10 = 0; i10 < this.f65152c; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(dVar.a(i10));
            } catch (FileNotFoundException unused) {
                for (int i11 = 0; i11 < this.f65152c && (inputStream = inputStreamArr[i11]) != null; i11++) {
                    g.a((Closeable) inputStream);
                }
                return null;
            }
        }
        this.f65159j++;
        this.f65158i.append((CharSequence) ("READ " + str + '\n'));
        if (e()) {
            this.f65150a.submit(this.f65162n);
        }
        return new e(str, dVar.f65174e, inputStreamArr, dVar.f65171b);
    }

    public File c() {
        return this.f65151b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f65158i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f65157h.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f65173d;
                if (cVar != null) {
                    cVar.a();
                }
            }
            i();
            this.f65158i.close();
            this.f65158i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized long d() {
        return this.f65160k;
    }

    public synchronized void flush() throws IOException {
        a();
        i();
        this.f65158i.flush();
    }

    public synchronized void h() throws IOException {
        StringBuilder sb2;
        try {
            Writer writer = this.f65158i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f65154e), g.f65181a));
            try {
                bufferedWriter.write(f65141r);
                bufferedWriter.write(RootService.LINE_BREAK);
                bufferedWriter.write("1");
                bufferedWriter.write(RootService.LINE_BREAK);
                bufferedWriter.write(Integer.toString(this.f65156g));
                bufferedWriter.write(RootService.LINE_BREAK);
                bufferedWriter.write(Integer.toString(this.f65152c));
                bufferedWriter.write(RootService.LINE_BREAK);
                bufferedWriter.write(RootService.LINE_BREAK);
                for (d dVar : this.f65157h.values()) {
                    if (dVar.f65173d != null) {
                        sb2 = new StringBuilder();
                        sb2.append("DIRTY ");
                        sb2.append(dVar.f65170a);
                        sb2.append('\n');
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(dVar.f65170a);
                        sb2.append(dVar.a());
                        sb2.append('\n');
                    }
                    bufferedWriter.write(sb2.toString());
                }
                bufferedWriter.close();
                if (this.f65153d.exists()) {
                    a(this.f65153d, this.f65155f, true);
                }
                a(this.f65154e, this.f65153d, false);
                this.f65155f.delete();
                this.f65158i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f65153d, true), g.f65181a));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public void i() throws IOException {
        while (this.f65161l > this.f65160k) {
            d(this.f65157h.entrySet().iterator().next().getKey());
        }
    }

    public synchronized boolean isClosed() {
        return this.f65158i == null;
    }

    public synchronized long size() {
        return this.f65161l;
    }

    private void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(f65149z)) {
                this.f65157h.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f65157h.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            this.f65157h.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(f65147x)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f65172c = true;
            dVar.f65173d = null;
            dVar.b(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(f65148y)) {
            dVar.f65173d = new c(dVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(A)) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    public synchronized c a(String str, long j10) throws IOException {
        a();
        e(str);
        d dVar = this.f65157h.get(str);
        if (j10 != -1 && (dVar == null || dVar.f65174e != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(str);
            this.f65157h.put(str, dVar);
        } else if (dVar.f65173d != null) {
            return null;
        }
        c cVar = new c(dVar);
        dVar.f65173d = cVar;
        this.f65158i.write("DIRTY " + str + '\n');
        this.f65158i.flush();
        return cVar;
    }

    public void b() throws IOException {
        close();
        g.a(this.f65151b);
    }

    public synchronized boolean d(String str) throws IOException {
        try {
            a();
            e(str);
            d dVar = this.f65157h.get(str);
            if (dVar != null && dVar.f65173d == null) {
                for (int i10 = 0; i10 < this.f65152c; i10++) {
                    File fileA = dVar.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException("failed to delete " + fileA);
                    }
                    long j10 = this.f65161l;
                    long[] jArr = dVar.f65171b;
                    this.f65161l = j10 - jArr[i10];
                    jArr[i10] = 0;
                }
                this.f65159j++;
                this.f65158i.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f65157h.remove(str);
                if (e()) {
                    this.f65150a.submit(this.f65162n);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static f a(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, f65140q);
        if (file2.exists()) {
            File file3 = new File(file, f65138o);
            if (file3.exists()) {
                file2.delete();
            } else {
                a(file2, file3, false);
            }
        }
        f fVar = new f(file, i10, i11, j10);
        if (fVar.f65153d.exists()) {
            try {
                fVar.g();
                fVar.f();
                return fVar;
            } catch (IOException e5) {
                com.salesforce.marketingcloud.g.b("DiskLruCache", e5, "DiskLruCache %s is corrupt, removing.", file);
                fVar.b();
            }
        }
        file.mkdirs();
        f fVar2 = new f(file, i10, i11, j10);
        fVar2.h();
        return fVar2;
    }

    public static String a(InputStream inputStream) throws IOException {
        return g.a((Reader) new InputStreamReader(inputStream, g.f65183c));
    }

    private void a() {
        if (this.f65158i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void a(long j10) {
        this.f65160k = j10;
        this.f65150a.submit(this.f65162n);
    }

    public synchronized void a(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f65164a;
        if (dVar.f65173d != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f65172c) {
            for (int i10 = 0; i10 < this.f65152c; i10++) {
                if (!cVar.f65165b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.b(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f65152c; i11++) {
            File fileB = dVar.b(i11);
            if (!z10) {
                a(fileB);
            } else if (fileB.exists()) {
                File fileA = dVar.a(i11);
                fileB.renameTo(fileA);
                long j10 = dVar.f65171b[i11];
                long length = fileA.length();
                dVar.f65171b[i11] = length;
                this.f65161l = (this.f65161l - j10) + length;
            }
        }
        this.f65159j++;
        dVar.f65173d = null;
        if (dVar.f65172c || z10) {
            dVar.f65172c = true;
            this.f65158i.write("CLEAN " + dVar.f65170a + dVar.a() + '\n');
            if (z10) {
                long j11 = this.m;
                this.m = 1 + j11;
                dVar.f65174e = j11;
            }
        } else {
            this.f65157h.remove(dVar.f65170a);
            this.f65158i.write("REMOVE " + dVar.f65170a + '\n');
        }
        this.f65158i.flush();
        if (this.f65161l > this.f65160k || e()) {
            this.f65150a.submit(this.f65162n);
        }
    }

    private static void a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void a(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public boolean e() {
        int i10 = this.f65159j;
        return i10 >= 2000 && i10 >= this.f65157h.size();
    }

    public class a extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    }
}
