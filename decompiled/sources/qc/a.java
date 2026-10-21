package qc;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final InputStream f92806p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Charset f92807q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f92808r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f92809s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f92810t0;

    /* JADX INFO: renamed from: qc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StrictLineReader.java */
    public class C0482a extends ByteArrayOutputStream {
        public C0482a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, a.this.f92807q0.name());
            } catch (UnsupportedEncodingException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    public a(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(b.f92812a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f92806p0 = fileInputStream;
        this.f92807q0 = charset;
        this.f92808r0 = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String b() throws IOException {
        int i10;
        synchronized (this.f92806p0) {
            try {
                byte[] bArr = this.f92808r0;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f92809s0 >= this.f92810t0) {
                    int i11 = this.f92806p0.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f92809s0 = 0;
                    this.f92810t0 = i11;
                }
                for (int i12 = this.f92809s0; i12 != this.f92810t0; i12++) {
                    byte[] bArr2 = this.f92808r0;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f92809s0;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        String str = new String(bArr2, i13, i10 - i13, this.f92807q0.name());
                        this.f92809s0 = i12 + 1;
                        return str;
                    }
                }
                C0482a c0482a = new C0482a((this.f92810t0 - this.f92809s0) + 80);
                while (true) {
                    byte[] bArr3 = this.f92808r0;
                    int i14 = this.f92809s0;
                    c0482a.write(bArr3, i14, this.f92810t0 - i14);
                    this.f92810t0 = -1;
                    byte[] bArr4 = this.f92808r0;
                    int i15 = this.f92806p0.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f92809s0 = 0;
                    this.f92810t0 = i15;
                    for (int i16 = 0; i16 != this.f92810t0; i16++) {
                        byte[] bArr5 = this.f92808r0;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f92809s0;
                            if (i16 != i17) {
                                c0482a.write(bArr5, i17, i16 - i17);
                            }
                            this.f92809s0 = i16 + 1;
                            return c0482a.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f92806p0) {
            try {
                if (this.f92808r0 != null) {
                    this.f92808r0 = null;
                    this.f92806p0.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
