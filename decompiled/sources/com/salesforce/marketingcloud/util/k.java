package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import androidx.camera.camera2.internal.h0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public class k implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f65187f = 13;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f65188g = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f65189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Charset f65190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f65191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f65193e;

    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                    i10 = i11;
                }
            }
            return new String(((ByteArrayOutputStream) this).buf, 0, i10, k.this.f65190b);
        }
    }

    public k(InputStream inputStream) {
        this(inputStream, 8192);
    }

    private void a() throws IOException {
        InputStream inputStream = this.f65189a;
        byte[] bArr = this.f65191c;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f65192d = 0;
        this.f65193e = i10;
    }

    public boolean b() {
        return this.f65193e == -1;
    }

    public int c() throws IOException {
        String strD = d();
        try {
            return Integer.parseInt(strD);
        } catch (NumberFormatException unused) {
            throw new IOException(h0.b("expected an int but was \"", strD, "\""));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f65189a) {
            try {
                if (this.f65191c != null) {
                    this.f65191c = null;
                    this.f65189a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String d() throws IOException {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f65189a) {
            try {
                if (this.f65191c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f65192d >= this.f65193e) {
                    a();
                }
                for (int i12 = this.f65192d; i12 != this.f65193e; i12++) {
                    byte[] bArr2 = this.f65191c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f65192d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f65190b);
                        this.f65192d = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f65193e - this.f65192d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f65191c;
                    int i14 = this.f65192d;
                    aVar.write(bArr3, i14, this.f65193e - i14);
                    this.f65193e = -1;
                    a();
                    i10 = this.f65192d;
                    while (i10 != this.f65193e) {
                        bArr = this.f65191c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f65192d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f65192d = i10 + 1;
                return aVar.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k(InputStream inputStream, int i10) {
        this(inputStream, i10, g.f65181a);
    }

    public k(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null) {
            throw new NullPointerException("in == null");
        }
        if (charset == null) {
            throw new NullPointerException("charset == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(g.f65181a) && !charset.equals(g.f65183c) && !charset.equals(g.f65182b)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f65189a = inputStream;
        this.f65190b = charset;
        this.f65191c = new byte[i10];
    }

    public k(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }
}
