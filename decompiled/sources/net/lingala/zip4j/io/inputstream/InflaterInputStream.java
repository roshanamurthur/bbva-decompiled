package net.lingala.zip4j.io.inputstream;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes12.dex */
public class InflaterInputStream extends c {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Inflater f84941q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f84942r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f84943s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f84944t0;

    public InflaterInputStream(b bVar, int i10) {
        super(bVar);
        this.f84943s0 = new byte[1];
        this.f84941q0 = new Inflater(true);
        this.f84942r0 = new byte[i10];
    }

    @Override // net.lingala.zip4j.io.inputstream.c, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Inflater inflater = this.f84941q0;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    @Override // net.lingala.zip4j.io.inputstream.c
    public void endOfEntryReached(InputStream inputStream) throws IOException {
        Inflater inflater = this.f84941q0;
        if (inflater != null) {
            inflater.end();
            this.f84941q0 = null;
        }
        super.endOfEntryReached(inputStream);
    }

    @Override // net.lingala.zip4j.io.inputstream.c
    public void pushBackInputStreamIfNecessary(PushbackInputStream pushbackInputStream) throws IOException {
        int remaining = this.f84941q0.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(getLastReadRawDataCache(), this.f84944t0 - remaining, remaining);
        }
    }

    @Override // net.lingala.zip4j.io.inputstream.c, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = this.f84943s0;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // net.lingala.zip4j.io.inputstream.c, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.inputstream.c, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        while (true) {
            try {
                int iInflate = this.f84941q0.inflate(bArr, i10, i11);
                if (iInflate != 0) {
                    return iInflate;
                }
                if (!this.f84941q0.finished() && !this.f84941q0.needsDictionary()) {
                    if (this.f84941q0.needsInput()) {
                        byte[] bArr2 = this.f84942r0;
                        int i12 = super.read(bArr2, 0, bArr2.length);
                        this.f84944t0 = i12;
                        if (i12 != -1) {
                            this.f84941q0.setInput(bArr2, 0, i12);
                        } else {
                            throw new EOFException("Unexpected end of input stream");
                        }
                    }
                }
                return -1;
            } catch (DataFormatException e5) {
                throw new IOException(e5);
            }
        }
    }
}
