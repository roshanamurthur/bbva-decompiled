package org.bouncycastle.crypto.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.modes.AEADBlockCipher;

/* JADX INFO: loaded from: classes4.dex */
public class CipherOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BufferedBlockCipher f88803p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final StreamCipher f88804q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AEADBlockCipher f88805r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f88806s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f88807t0;

    public CipherOutputStream(OutputStream outputStream, BufferedBlockCipher bufferedBlockCipher) {
        super(outputStream);
        this.f88806s0 = new byte[1];
        this.f88803p0 = bufferedBlockCipher;
    }

    public final void a(int i10, boolean z10) {
        AEADBlockCipher aEADBlockCipher = this.f88805r0;
        BufferedBlockCipher bufferedBlockCipher = this.f88803p0;
        if (z10) {
            if (bufferedBlockCipher != null) {
                i10 = bufferedBlockCipher.getOutputSize(i10);
            } else if (aEADBlockCipher != null) {
                i10 = aEADBlockCipher.getOutputSize(i10);
            }
        } else if (bufferedBlockCipher != null) {
            i10 = bufferedBlockCipher.getUpdateOutputSize(i10);
        } else if (aEADBlockCipher != null) {
            i10 = aEADBlockCipher.getUpdateOutputSize(i10);
        }
        byte[] bArr = this.f88807t0;
        if (bArr == null || bArr.length < i10) {
            this.f88807t0 = new byte[i10];
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IOException cipherIOException;
        IOException iOException;
        a(0, true);
        try {
            BufferedBlockCipher bufferedBlockCipher = this.f88803p0;
            if (bufferedBlockCipher != null) {
                int iDoFinal = bufferedBlockCipher.doFinal(this.f88807t0, 0);
                if (iDoFinal != 0) {
                    ((FilterOutputStream) this).out.write(this.f88807t0, 0, iDoFinal);
                }
            } else {
                AEADBlockCipher aEADBlockCipher = this.f88805r0;
                if (aEADBlockCipher != null) {
                    int iDoFinal2 = aEADBlockCipher.doFinal(this.f88807t0, 0);
                    if (iDoFinal2 != 0) {
                        ((FilterOutputStream) this).out.write(this.f88807t0, 0, iDoFinal2);
                    }
                } else {
                    StreamCipher streamCipher = this.f88804q0;
                    if (streamCipher != null) {
                        streamCipher.reset();
                    }
                }
            }
            iOException = null;
        } catch (InvalidCipherTextException e5) {
            cipherIOException = new InvalidCipherTextIOException("Error finalising cipher data", e5);
            iOException = cipherIOException;
        } catch (Exception e7) {
            cipherIOException = new CipherIOException("Error closing stream: ", e7);
            iOException = cipherIOException;
        }
        try {
            flush();
            ((FilterOutputStream) this).out.close();
        } catch (IOException e10) {
            if (iOException == null) {
                iOException = e10;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte b10 = (byte) i10;
        byte[] bArr = this.f88806s0;
        bArr[0] = b10;
        StreamCipher streamCipher = this.f88804q0;
        if (streamCipher != null) {
            ((FilterOutputStream) this).out.write(streamCipher.returnByte(b10));
        } else {
            write(bArr, 0, 1);
        }
    }

    public CipherOutputStream(OutputStream outputStream, StreamCipher streamCipher) {
        super(outputStream);
        this.f88806s0 = new byte[1];
        this.f88804q0 = streamCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public CipherOutputStream(OutputStream outputStream, AEADBlockCipher aEADBlockCipher) {
        super(outputStream);
        this.f88806s0 = new byte[1];
        this.f88805r0 = aEADBlockCipher;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        a(i11, false);
        BufferedBlockCipher bufferedBlockCipher = this.f88803p0;
        if (bufferedBlockCipher != null) {
            int iProcessBytes = bufferedBlockCipher.processBytes(bArr, i10, i11, this.f88807t0, 0);
            if (iProcessBytes != 0) {
                ((FilterOutputStream) this).out.write(this.f88807t0, 0, iProcessBytes);
                return;
            }
            return;
        }
        AEADBlockCipher aEADBlockCipher = this.f88805r0;
        if (aEADBlockCipher == null) {
            this.f88804q0.processBytes(bArr, i10, i11, this.f88807t0, 0);
            ((FilterOutputStream) this).out.write(this.f88807t0, 0, i11);
        } else {
            int iProcessBytes2 = aEADBlockCipher.processBytes(bArr, i10, i11, this.f88807t0, 0);
            if (iProcessBytes2 != 0) {
                ((FilterOutputStream) this).out.write(this.f88807t0, 0, iProcessBytes2);
            }
        }
    }
}
