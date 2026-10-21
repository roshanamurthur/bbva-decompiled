package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
class k2 extends n3 {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final byte[] f66165t0 = new byte[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final int f66166r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f66167s0;

    public k2(InputStream inputStream, int i10) {
        super(inputStream, i10);
        if (i10 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f66166r0 = i10;
        this.f66167s0 = i10;
        if (i10 == 0) {
            a(true);
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.n3
    public int a() {
        return this.f66167s0;
    }

    public byte[] b() throws IOException {
        int i10 = this.f66167s0;
        if (i10 == 0) {
            return f66165t0;
        }
        byte[] bArr = new byte[i10];
        int iA = i10 - j5.a(this.f66212p0, bArr);
        this.f66167s0 = iA;
        if (iA == 0) {
            a(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f66166r0 + " object truncated by " + this.f66167s0);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f66167s0 == 0) {
            return -1;
        }
        int i10 = this.f66212p0.read();
        if (i10 >= 0) {
            int i11 = this.f66167s0 - 1;
            this.f66167s0 = i11;
            if (i11 == 0) {
                a(true);
            }
            return i10;
        }
        throw new EOFException("DEF length " + this.f66166r0 + " object truncated by " + this.f66167s0);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f66167s0;
        if (i12 == 0) {
            return -1;
        }
        int i13 = this.f66212p0.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            int i14 = this.f66167s0 - i13;
            this.f66167s0 = i14;
            if (i14 == 0) {
                a(true);
            }
            return i13;
        }
        throw new EOFException("DEF length " + this.f66166r0 + " object truncated by " + this.f66167s0);
    }
}
