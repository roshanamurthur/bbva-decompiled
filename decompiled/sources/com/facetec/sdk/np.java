package com.facetec.sdk;

import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes9.dex */
public final class np implements nz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f42707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nh f42708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nn f42709d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42706a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f42710e = new CRC32();

    public np(nz nzVar) {
        if (nzVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f42707b = inflater;
        nh nhVarC = no.c(nzVar);
        this.f42708c = nhVarC;
        this.f42709d = new nn(nhVarC, inflater);
    }

    private static void e(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // com.facetec.sdk.nz
    public final ny a() {
        return this.f42708c.a();
    }

    @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42709d.close();
    }

    @Override // com.facetec.sdk.nz
    public final long d(nb nbVar, long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f42706a == 0) {
            this.f42708c.b(10L);
            byte bE = this.f42708c.d().e(3L);
            boolean z10 = ((bE >> 1) & 1) == 1;
            if (z10) {
                a(this.f42708c.d(), 0L, 10L);
            }
            e("ID1ID2", 8075, this.f42708c.j());
            this.f42708c.j(8L);
            if (((bE >> 2) & 1) == 1) {
                this.f42708c.b(2L);
                if (z10) {
                    a(this.f42708c.d(), 0L, 2L);
                }
                long jG = this.f42708c.d().g();
                this.f42708c.b(jG);
                if (z10) {
                    a(this.f42708c.d(), 0L, jG);
                }
                this.f42708c.j(jG);
            }
            if (((bE >> 3) & 1) == 1) {
                long jS = this.f42708c.s();
                if (jS == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    a(this.f42708c.d(), 0L, jS + 1);
                }
                this.f42708c.j(jS + 1);
            }
            if (((bE >> 4) & 1) == 1) {
                long jS2 = this.f42708c.s();
                if (jS2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    a(this.f42708c.d(), 0L, jS2 + 1);
                }
                this.f42708c.j(jS2 + 1);
            }
            if (z10) {
                e("FHCRC", this.f42708c.g(), (short) this.f42710e.getValue());
                this.f42710e.reset();
            }
            this.f42706a = 1;
        }
        if (this.f42706a == 1) {
            long j11 = nbVar.f42665b;
            long jD = this.f42709d.d(nbVar, j10);
            if (jD != -1) {
                a(nbVar, j11, jD);
                return jD;
            }
            this.f42706a = 2;
        }
        if (this.f42706a == 2) {
            e(UUIDPreferences.CRC_KEY, this.f42708c.i(), (int) this.f42710e.getValue());
            e("ISIZE", this.f42708c.i(), (int) this.f42707b.getBytesWritten());
            this.f42706a = 3;
            if (!this.f42708c.c()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    private void a(nb nbVar, long j10, long j11) {
        nt ntVar = nbVar.f42664a;
        while (true) {
            int i10 = ntVar.f42722d;
            int i11 = ntVar.f42719a;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            ntVar = ntVar.f42725g;
        }
        while (j11 > 0) {
            int i12 = (int) (((long) ntVar.f42719a) + j10);
            int iMin = (int) Math.min(ntVar.f42722d - i12, j11);
            this.f42710e.update(ntVar.f42721c, i12, iMin);
            j11 -= (long) iMin;
            ntVar = ntVar.f42725g;
            j10 = 0;
        }
    }
}
