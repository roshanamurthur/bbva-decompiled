package com.facetec.sdk;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fk extends ga {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ec f41609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f41610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<ec> f41611e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Writer f41608b = new Writer() { // from class: com.facetec.sdk.fk.2
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ei f41607a = new ei("closed");

    public fk() {
        super(f41608b);
        this.f41611e = new ArrayList();
        this.f41609c = ef.f41465b;
    }

    private void a(ec ecVar) {
        if (this.f41610d != null) {
            if (!ecVar.g() || j()) {
                ((eh) i()).b(this.f41610d, ecVar);
            }
            this.f41610d = null;
            return;
        }
        if (this.f41611e.isEmpty()) {
            this.f41609c = ecVar;
            return;
        }
        ec ecVarI = i();
        if (!(ecVarI instanceof ee)) {
            throw new IllegalStateException();
        }
        ((ee) ecVarI).a(ecVar);
    }

    private ec i() {
        return (ec) androidx.emoji2.text.flatbuffer.a.b(this.f41611e, 1);
    }

    @Override // com.facetec.sdk.ga
    public final ga b() throws IOException {
        if (this.f41611e.isEmpty() || this.f41610d != null) {
            throw new IllegalStateException();
        }
        if (!(i() instanceof eh)) {
            throw new IllegalStateException();
        }
        List<ec> list = this.f41611e;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.facetec.sdk.ga
    public final ga c() throws IOException {
        ee eeVar = new ee();
        a(eeVar);
        this.f41611e.add(eeVar);
        return this;
    }

    @Override // com.facetec.sdk.ga, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f41611e.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f41611e.add(f41607a);
    }

    @Override // com.facetec.sdk.ga
    public final ga d() throws IOException {
        if (this.f41611e.isEmpty() || this.f41610d != null) {
            throw new IllegalStateException();
        }
        if (!(i() instanceof ee)) {
            throw new IllegalStateException();
        }
        List<ec> list = this.f41611e;
        list.remove(list.size() - 1);
        return this;
    }

    public final ec e() {
        if (this.f41611e.isEmpty()) {
            return this.f41609c;
        }
        StringBuilder sb2 = new StringBuilder("Expected one JSON element but was ");
        sb2.append(this.f41611e);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.facetec.sdk.ga
    public final ga g() throws IOException {
        a(ef.f41465b);
        return this;
    }

    @Override // com.facetec.sdk.ga
    public final ga c(String str) throws IOException {
        if (!this.f41611e.isEmpty() && this.f41610d == null) {
            if (i() instanceof eh) {
                this.f41610d = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // com.facetec.sdk.ga
    public final ga e(String str) throws IOException {
        if (str == null) {
            return g();
        }
        a(new ei(str));
        return this;
    }

    @Override // com.facetec.sdk.ga
    public final ga b(Boolean bool) throws IOException {
        if (bool == null) {
            return g();
        }
        a(new ei(bool));
        return this;
    }

    @Override // com.facetec.sdk.ga
    public final ga b(long j10) throws IOException {
        a(new ei(Long.valueOf(j10)));
        return this;
    }

    @Override // com.facetec.sdk.ga
    public final ga a() throws IOException {
        eh ehVar = new eh();
        a(ehVar);
        this.f41611e.add(ehVar);
        return this;
    }

    @Override // com.facetec.sdk.ga
    public final ga a(boolean z10) throws IOException {
        a(new ei(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.facetec.sdk.ga
    public final ga a(Number number) throws IOException {
        if (number == null) {
            return g();
        }
        if (!h()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        a(new ei(number));
        return this;
    }

    @Override // com.facetec.sdk.ga, java.io.Flushable
    public final void flush() throws IOException {
    }
}
