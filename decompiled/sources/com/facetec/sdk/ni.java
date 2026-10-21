package com.facetec.sdk;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes9.dex */
public interface ni extends ns, WritableByteChannel {
    ni a(byte[] bArr) throws IOException;

    ni c(byte[] bArr, int i10, int i11) throws IOException;

    nb d();

    ni e(String str) throws IOException;

    ni f(long j10) throws IOException;

    @Override // com.facetec.sdk.ns, java.io.Flushable
    void flush() throws IOException;

    ni h(int i10) throws IOException;

    ni i(int i10) throws IOException;

    ni j(int i10) throws IOException;

    ni m(long j10) throws IOException;

    ni t() throws IOException;
}
