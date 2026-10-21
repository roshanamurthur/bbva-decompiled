package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f87155t0 = new byte[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f87156r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f87157s0;

    public e(InputStream inputStream, int i10, int i11) {
        super(inputStream, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f87156r0 = i10;
        this.f87157s0 = i10;
        if (i10 == 0) {
            b();
        }
    }

    public final byte[] e() throws IOException {
        int i10 = this.f87157s0;
        if (i10 == 0) {
            return f87155t0;
        }
        int i11 = this.f87271q0;
        if (i10 >= i11) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.f87157s0 + " >= " + i11);
        }
        byte[] bArr = new byte[i10];
        int fully = i10 - Streams.readFully(this.f87270p0, bArr);
        this.f87157s0 = fully;
        if (fully == 0) {
            b();
            return bArr;
        }
        throw new EOFException("DEF length " + this.f87156r0 + " object truncated by " + this.f87157s0);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f87157s0 == 0) {
            return -1;
        }
        int i10 = this.f87270p0.read();
        if (i10 >= 0) {
            int i11 = this.f87157s0 - 1;
            this.f87157s0 = i11;
            if (i11 == 0) {
                b();
            }
            return i10;
        }
        throw new EOFException("DEF length " + this.f87156r0 + " object truncated by " + this.f87157s0);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f87157s0;
        if (i12 == 0) {
            return -1;
        }
        int i13 = this.f87270p0.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            int i14 = this.f87157s0 - i13;
            this.f87157s0 = i14;
            if (i14 == 0) {
                b();
            }
            return i13;
        }
        throw new EOFException("DEF length " + this.f87156r0 + " object truncated by " + this.f87157s0);
    }
}
