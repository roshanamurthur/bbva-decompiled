package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends i {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f87260r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f87261s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f87262t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f87263u0;

    public f(InputStream inputStream, int i10) throws IOException {
        super(inputStream, i10);
        this.f87262t0 = false;
        this.f87263u0 = true;
        this.f87260r0 = inputStream.read();
        int i11 = inputStream.read();
        this.f87261s0 = i11;
        if (i11 < 0) {
            throw new EOFException();
        }
        e();
    }

    public final boolean e() {
        if (!this.f87262t0 && this.f87263u0 && this.f87260r0 == 0 && this.f87261s0 == 0) {
            this.f87262t0 = true;
            b();
        }
        return this.f87262t0;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (e()) {
            return -1;
        }
        int i10 = this.f87270p0.read();
        if (i10 < 0) {
            throw new EOFException();
        }
        int i11 = this.f87260r0;
        this.f87260r0 = this.f87261s0;
        this.f87261s0 = i10;
        return i11;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f87263u0 || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f87262t0) {
            return -1;
        }
        InputStream inputStream = this.f87270p0;
        int i12 = inputStream.read(bArr, i10 + 2, i11 - 2);
        if (i12 < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this.f87260r0;
        bArr[i10 + 1] = (byte) this.f87261s0;
        this.f87260r0 = inputStream.read();
        int i13 = inputStream.read();
        this.f87261s0 = i13;
        if (i13 >= 0) {
            return i12 + 2;
        }
        throw new EOFException();
    }
}
