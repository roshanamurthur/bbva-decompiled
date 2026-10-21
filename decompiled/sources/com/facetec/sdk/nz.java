package com.facetec.sdk;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public interface nz extends Closeable {
    ny a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long d(nb nbVar, long j10) throws IOException;
}
