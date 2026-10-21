package com.facetec.sdk;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public interface nh extends nz, ReadableByteChannel {
    nj a(long j10) throws IOException;

    void b(long j10) throws IOException;

    void b(byte[] bArr) throws IOException;

    String c(long j10) throws IOException;

    boolean c() throws IOException;

    boolean c(nj njVar) throws IOException;

    nb d();

    String e(Charset charset) throws IOException;

    byte f() throws IOException;

    short g() throws IOException;

    int h() throws IOException;

    byte[] h(long j10) throws IOException;

    int i() throws IOException;

    short j() throws IOException;

    void j(long j10) throws IOException;

    String k() throws IOException;

    long n() throws IOException;

    long s() throws IOException;
}
