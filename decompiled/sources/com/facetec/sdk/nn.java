package com.facetec.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes9.dex */
public final class nn implements nz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Inflater f42696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nh f42698c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42699e;

    public nn(nh nhVar, Inflater inflater) {
        if (nhVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f42698c = nhVar;
        this.f42696a = inflater;
    }

    private boolean b() throws IOException {
        if (!this.f42696a.needsInput()) {
            return false;
        }
        e();
        if (this.f42696a.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f42698c.c()) {
            return true;
        }
        nt ntVar = this.f42698c.d().f42664a;
        int i10 = ntVar.f42722d;
        int i11 = ntVar.f42719a;
        int i12 = i10 - i11;
        this.f42697b = i12;
        this.f42696a.setInput(ntVar.f42721c, i11, i12);
        return false;
    }

    private void e() throws IOException {
        int i10 = this.f42697b;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f42696a.getRemaining();
        this.f42697b -= remaining;
        this.f42698c.j(remaining);
    }

    @Override // com.facetec.sdk.nz
    public final ny a() {
        return this.f42698c.a();
    }

    @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42699e) {
            return;
        }
        this.f42696a.end();
        this.f42699e = true;
        this.f42698c.close();
    }

    @Override // com.facetec.sdk.nz
    public final long d(nb nbVar, long j10) throws IOException {
        boolean zB;
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
        }
        if (this.f42699e) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zB = b();
            try {
                nt ntVarB = nbVar.b(1);
                int iInflate = this.f42696a.inflate(ntVarB.f42721c, ntVarB.f42722d, (int) Math.min(j10, 8192 - ntVarB.f42722d));
                if (iInflate > 0) {
                    ntVarB.f42722d += iInflate;
                    long j11 = iInflate;
                    nbVar.f42665b += j11;
                    return j11;
                }
                if (!this.f42696a.finished() && !this.f42696a.needsDictionary()) {
                }
                e();
                if (ntVarB.f42719a != ntVarB.f42722d) {
                    return -1L;
                }
                nbVar.f42664a = ntVarB.c();
                nr.e(ntVarB);
                return -1L;
            } catch (DataFormatException e5) {
                throw new IOException(e5);
            }
        } while (!zB);
        throw new EOFException("source exhausted prematurely");
    }
}
