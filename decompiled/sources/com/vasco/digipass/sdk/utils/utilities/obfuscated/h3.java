package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
class h3 extends n3 {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f66064r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f66065s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f66066t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f66067u0;

    public h3(InputStream inputStream, int i10) throws IOException {
        super(inputStream, i10);
        this.f66066t0 = false;
        this.f66067u0 = true;
        this.f66064r0 = inputStream.read();
        int i11 = inputStream.read();
        this.f66065s0 = i11;
        if (i11 < 0) {
            throw new EOFException();
        }
        b();
    }

    public void b(boolean z10) {
        this.f66067u0 = z10;
        b();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f66067u0 || i11 < 3) {
            return super.read(bArr, i10, i11);
        }
        if (this.f66066t0) {
            return -1;
        }
        int i12 = this.f66212p0.read(bArr, i10 + 2, i11 - 2);
        if (i12 < 0) {
            throw new EOFException();
        }
        bArr[i10] = (byte) this.f66064r0;
        bArr[i10 + 1] = (byte) this.f66065s0;
        this.f66064r0 = this.f66212p0.read();
        int i13 = this.f66212p0.read();
        this.f66065s0 = i13;
        if (i13 >= 0) {
            return i12 + 2;
        }
        throw new EOFException();
    }

    private boolean b() {
        if (!this.f66066t0 && this.f66067u0 && this.f66064r0 == 0 && this.f66065s0 == 0) {
            this.f66066t0 = true;
            a(true);
        }
        return this.f66066t0;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (b()) {
            return -1;
        }
        int i10 = this.f66212p0.read();
        if (i10 >= 0) {
            int i11 = this.f66064r0;
            this.f66064r0 = this.f66065s0;
            this.f66065s0 = i10;
            return i11;
        }
        throw new EOFException();
    }
}
