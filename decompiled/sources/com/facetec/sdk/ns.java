package com.facetec.sdk;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public interface ns extends Closeable, Flushable {
    ny a();

    void c(nb nbVar, long j10) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;
}
