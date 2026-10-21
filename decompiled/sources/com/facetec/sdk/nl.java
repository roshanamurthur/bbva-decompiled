package com.facetec.sdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
final class nl implements ni {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nb f42692b = new nb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42693c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ns f42694e;

    public nl(ns nsVar) {
        if (nsVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f42694e = nsVar;
    }

    @Override // com.facetec.sdk.ni
    public final ni a(byte[] bArr) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.a(bArr);
        return t();
    }

    @Override // com.facetec.sdk.ns
    public final void c(nb nbVar, long j10) throws Throwable {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.c(nbVar, j10);
        t();
    }

    @Override // com.facetec.sdk.ns, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.f42693c) {
            return;
        }
        nb nbVar = this.f42692b;
        long j10 = nbVar.f42665b;
        if (j10 > 0) {
            this.f42694e.c(nbVar, j10);
        }
        th = null;
        try {
            this.f42694e.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f42693c = true;
        if (th != null) {
            nv.b(th);
        }
    }

    @Override // com.facetec.sdk.ni
    public final nb d() {
        return this.f42692b;
    }

    @Override // com.facetec.sdk.ni
    public final ni e(String str) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.e(str);
        return t();
    }

    @Override // com.facetec.sdk.ni
    public final ni f(long j10) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.f(j10);
        return t();
    }

    @Override // com.facetec.sdk.ni, com.facetec.sdk.ns, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        nb nbVar = this.f42692b;
        long j10 = nbVar.f42665b;
        if (j10 > 0) {
            this.f42694e.c(nbVar, j10);
        }
        this.f42694e.flush();
    }

    @Override // com.facetec.sdk.ni
    public final ni h(int i10) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.h(i10);
        return t();
    }

    @Override // com.facetec.sdk.ni
    public final ni i(int i10) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.i(i10);
        return t();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f42693c;
    }

    @Override // com.facetec.sdk.ni
    public final ni j(int i10) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.j(i10);
        return t();
    }

    @Override // com.facetec.sdk.ni
    public final ni m(long j10) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        this.f42692b.m(j10);
        return t();
    }

    @Override // com.facetec.sdk.ni
    public final ni t() throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        long jE = this.f42692b.e();
        if (jE > 0) {
            this.f42694e.c(this.f42692b, jE);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("buffer(");
        sb2.append(this.f42694e);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (this.f42693c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f42692b.write(byteBuffer);
        t();
        return iWrite;
    }

    @Override // com.facetec.sdk.ns
    public final ny a() {
        return this.f42694e.a();
    }

    @Override // com.facetec.sdk.ni
    public final ni c(byte[] bArr, int i10, int i11) throws Throwable {
        if (!this.f42693c) {
            this.f42692b.c(bArr, i10, i11);
            return t();
        }
        throw new IllegalStateException("closed");
    }
}
