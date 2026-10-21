package com.facetec.sdk;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class ju implements Closeable, Flushable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private le f41910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final lh f41911c;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41910b.close();
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.f41910b.flush();
    }
}
