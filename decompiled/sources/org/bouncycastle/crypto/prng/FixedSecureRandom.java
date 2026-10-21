package org.bouncycastle.crypto.prng;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class FixedSecureRandom extends SecureRandom {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f89407p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f89408q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f89409r0;

    public FixedSecureRandom(boolean z10, byte[] bArr) {
        this(z10, new byte[][]{bArr});
    }

    public final int a() {
        int i10 = this.f89408q0;
        this.f89408q0 = i10 + 1;
        return this.f89407p0[i10] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i10) {
        byte[] bArr = new byte[i10];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this.f89408q0 == this.f89407p0.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this.f89407p0, this.f89408q0, bArr, 0, bArr.length);
        this.f89408q0 += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        int iA = (a() << 24) | (a() << 16);
        int i10 = this.f89409r0;
        if (i10 == 2) {
            this.f89409r0 = i10 - 1;
        } else {
            iA |= a() << 8;
        }
        int i11 = this.f89409r0;
        if (i11 != 1) {
            return iA | a();
        }
        this.f89409r0 = i11 - 1;
        return iA;
    }

    @Override // java.util.Random
    public long nextLong() {
        return (((long) a()) << 56) | (((long) a()) << 48) | (((long) a()) << 40) | (((long) a()) << 32) | (((long) a()) << 24) | (((long) a()) << 16) | (((long) a()) << 8) | ((long) a());
    }

    public FixedSecureRandom(boolean z10, byte[][] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != bArr.length; i10++) {
            try {
                byteArrayOutputStream.write(bArr[i10]);
            } catch (IOException unused) {
                throw new IllegalArgumentException("can't save value array.");
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f89407p0 = byteArray;
        if (z10) {
            this.f89409r0 = byteArray.length % 4;
        }
    }

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }
}
