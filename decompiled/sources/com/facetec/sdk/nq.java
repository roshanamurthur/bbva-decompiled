package com.facetec.sdk;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes9.dex */
final class nq implements nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nb f42712b = new nb();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nz f42713d;

    public nq(nz nzVar) {
        if (nzVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f42713d = nzVar;
    }

    @Override // com.facetec.sdk.nh
    public final nj a(long j10) throws IOException {
        b(j10);
        return this.f42712b.a(j10);
    }

    @Override // com.facetec.sdk.nh
    public final void b(long j10) throws IOException {
        if (!d(j10)) {
            throw new EOFException();
        }
    }

    @Override // com.facetec.sdk.nh
    public final boolean c() throws IOException {
        if (this.f42711a) {
            throw new IllegalStateException("closed");
        }
        return this.f42712b.c() && this.f42713d.d(this.f42712b, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1;
    }

    @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f42711a) {
            return;
        }
        this.f42711a = true;
        this.f42713d.close();
        this.f42712b.p();
    }

    @Override // com.facetec.sdk.nh, com.facetec.sdk.ni
    public final nb d() {
        return this.f42712b;
    }

    @Override // com.facetec.sdk.nh
    public final String e(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f42712b.d(this.f42713d);
        return this.f42712b.e(charset);
    }

    @Override // com.facetec.sdk.nh
    public final byte f() throws IOException {
        b(1L);
        return this.f42712b.f();
    }

    @Override // com.facetec.sdk.nh
    public final short g() throws IOException {
        b(2L);
        return this.f42712b.g();
    }

    @Override // com.facetec.sdk.nh
    public final byte[] h(long j10) throws IOException {
        b(j10);
        return this.f42712b.h(j10);
    }

    @Override // com.facetec.sdk.nh
    public final int i() throws IOException {
        b(4L);
        return this.f42712b.i();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f42711a;
    }

    @Override // com.facetec.sdk.nh
    public final short j() throws IOException {
        b(2L);
        return this.f42712b.j();
    }

    @Override // com.facetec.sdk.nh
    public final String k() throws IOException {
        return c(Long.MAX_VALUE);
    }

    @Override // com.facetec.sdk.nh
    public final long n() throws IOException {
        b(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!d(i11)) {
                break;
            }
            byte bE = this.f42712b.e(i10);
            if ((bE < 48 || bE > 57) && ((bE < 97 || bE > 102) && (bE < 65 || bE > 70))) {
                if (i10 != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bE)));
            }
            i10 = i11;
        }
        return this.f42712b.n();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        nb nbVar = this.f42712b;
        if (nbVar.f42665b == 0 && this.f42713d.d(nbVar, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
            return -1;
        }
        return this.f42712b.read(byteBuffer);
    }

    @Override // com.facetec.sdk.nh
    public final long s() throws IOException {
        return c((byte) 0, 0L, Long.MAX_VALUE);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("buffer(");
        sb2.append(this.f42713d);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.facetec.sdk.nh
    public final void b(byte[] bArr) throws Throwable {
        try {
            b(bArr.length);
            this.f42712b.b(bArr);
        } catch (EOFException e5) {
            int i10 = 0;
            while (true) {
                nb nbVar = this.f42712b;
                long j10 = nbVar.f42665b;
                if (j10 <= 0) {
                    throw e5;
                }
                int iD = nbVar.d(bArr, i10, (int) j10);
                if (iD == -1) {
                    throw new AssertionError();
                }
                i10 += iD;
            }
        }
    }

    @Override // com.facetec.sdk.nz
    public final long d(nb nbVar, long j10) throws IOException {
        if (nbVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
        }
        if (this.f42711a) {
            throw new IllegalStateException("closed");
        }
        nb nbVar2 = this.f42712b;
        if (nbVar2.f42665b == 0 && this.f42713d.d(nbVar2, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
            return -1L;
        }
        return this.f42712b.d(nbVar, Math.min(j10, this.f42712b.f42665b));
    }

    @Override // com.facetec.sdk.nz
    public final ny a() {
        return this.f42713d.a();
    }

    @Override // com.facetec.sdk.nh
    public final int h() throws IOException {
        b(4L);
        return this.f42712b.h();
    }

    @Override // com.facetec.sdk.nh
    public final void j(long j10) throws IOException {
        if (this.f42711a) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            nb nbVar = this.f42712b;
            if (nbVar.f42665b == 0 && this.f42713d.d(nbVar, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f42712b.b());
            this.f42712b.j(jMin);
            j10 -= jMin;
        }
    }

    @Override // com.facetec.sdk.nh
    public final String c(long j10) throws IOException {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            long jC = c((byte) 10, 0L, j11);
            if (jC != -1) {
                return this.f42712b.d(jC);
            }
            if (j11 < Long.MAX_VALUE && d(j11) && this.f42712b.e(j11 - 1) == 13 && d(1 + j11) && this.f42712b.e(j11) == 10) {
                return this.f42712b.d(j11);
            }
            nb nbVar = new nb();
            nb nbVar2 = this.f42712b;
            nbVar2.d(nbVar, 0L, Math.min(32L, nbVar2.b()));
            StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
            sb2.append(Math.min(this.f42712b.b(), j10));
            sb2.append(" content=");
            sb2.append(nbVar.o().d());
            sb2.append(Typography.ellipsis);
            throw new EOFException(sb2.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j10)));
    }

    private boolean d(long j10) throws IOException {
        nb nbVar;
        if (j10 >= 0) {
            if (this.f42711a) {
                throw new IllegalStateException("closed");
            }
            do {
                nbVar = this.f42712b;
                if (nbVar.f42665b >= j10) {
                    return true;
                }
            } while (this.f42713d.d(nbVar, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j10)));
    }

    private long c(byte b10, long j10, long j11) throws IOException {
        if (this.f42711a) {
            throw new IllegalStateException("closed");
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j11)));
        }
        while (j10 < j11) {
            long jE = this.f42712b.e(b10, j10, j11);
            if (jE != -1) {
                return jE;
            }
            nb nbVar = this.f42712b;
            long j12 = nbVar.f42665b;
            if (j12 >= j11 || this.f42713d.d(nbVar, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                break;
            }
            j10 = Math.max(j10, j12);
        }
        return -1L;
    }

    @Override // com.facetec.sdk.nh
    public final boolean c(nj njVar) throws IOException {
        return c(njVar, njVar.g());
    }

    private boolean c(nj njVar, int i10) throws IOException {
        if (!this.f42711a) {
            if (i10 < 0 || njVar.g() < i10) {
                return false;
            }
            for (int i11 = 0; i11 < i10; i11++) {
                long j10 = i11;
                if (!d(1 + j10) || this.f42712b.e(j10) != njVar.c(i11)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }
}
