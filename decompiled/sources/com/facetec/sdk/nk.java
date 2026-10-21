package com.facetec.sdk;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nk implements ns {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ns f42691d;

    public nk(ns nsVar) {
        if (nsVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f42691d = nsVar;
    }

    @Override // com.facetec.sdk.ns
    public final ny a() {
        return this.f42691d.a();
    }

    @Override // com.facetec.sdk.ns
    public void c(nb nbVar, long j10) throws IOException {
        this.f42691d.c(nbVar, j10);
    }

    @Override // com.facetec.sdk.ns, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42691d.close();
    }

    @Override // com.facetec.sdk.ns, java.io.Flushable
    public void flush() throws IOException {
        this.f42691d.flush();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        sb2.append(this.f42691d.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
