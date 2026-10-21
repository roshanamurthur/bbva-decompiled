package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.RC5Parameters;

/* JADX INFO: loaded from: classes3.dex */
public class RC564Engine implements BlockCipher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88528a = 12;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f88529b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88530c;

    public static long a(int i10, byte[] bArr) {
        long j10 = 0;
        for (int i11 = 7; i11 >= 0; i11--) {
            j10 = (j10 << 8) + ((long) (bArr[i11 + i10] & 255));
        }
        return j10;
    }

    public static long b(long j10, long j11) {
        long j12 = j11 & 63;
        return (j10 >>> ((int) (64 - j12))) | (j10 << ((int) j12));
    }

    public static void c(long j10, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr[i11 + i10] = (byte) j10;
            j10 >>>= 8;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "RC5-64";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        long[] jArr;
        if (!(cipherParameters instanceof RC5Parameters)) {
            throw new IllegalArgumentException(com.google.android.gms.measurement.internal.a.b(cipherParameters, "invalid parameter passed to RC564 init - "));
        }
        RC5Parameters rC5Parameters = (RC5Parameters) cipherParameters;
        this.f88530c = z10;
        this.f88528a = rC5Parameters.getRounds();
        byte[] key = rC5Parameters.getKey();
        int length = (key.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i10 = 0; i10 != key.length; i10++) {
            int i11 = i10 / 8;
            jArr2[i11] = jArr2[i11] + (((long) (key[i10] & 255)) << ((i10 % 8) * 8));
        }
        long[] jArr3 = new long[(this.f88528a + 1) * 2];
        this.f88529b = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i12 = 1;
        while (true) {
            jArr = this.f88529b;
            if (i12 >= jArr.length) {
                break;
            }
            jArr[i12] = jArr[i12 - 1] - 7046029254386353131L;
            i12++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long jB = 0;
        long jB2 = 0;
        int length3 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length2; i14++) {
            long[] jArr4 = this.f88529b;
            jB = b(jArr4[length3] + jB + jB2, 3L);
            jArr4[length3] = jB;
            jB2 = b(jArr2[i13] + jB + jB2, jB2 + jB);
            jArr2[i13] = jB2;
            length3 = (length3 + 1) % this.f88529b.length;
            i13 = (i13 + 1) % length;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (this.f88530c) {
            long jA = a(i10, bArr) + this.f88529b[0];
            long jA2 = a(i10 + 8, bArr) + this.f88529b[1];
            for (int i12 = 1; i12 <= this.f88528a; i12++) {
                int i13 = i12 * 2;
                jA = b(jA ^ jA2, jA2) + this.f88529b[i13];
                jA2 = b(jA2 ^ jA, jA) + this.f88529b[i13 + 1];
            }
            c(jA, bArr2, i11);
            c(jA2, bArr2, i11 + 8);
            return 16;
        }
        long jA3 = a(i10, bArr);
        long jA4 = a(i10 + 8, bArr);
        int i14 = this.f88528a;
        for (int i15 = 1; i14 >= i15; i15 = 1) {
            long[] jArr = this.f88529b;
            int i16 = i14 * 2;
            long j10 = jA4 - jArr[i16 + 1];
            long j11 = jA3 & 63;
            jA4 = ((j10 >>> ((int) j11)) | (j10 << ((int) (64 - j11)))) ^ jA3;
            long j12 = jA3 - jArr[i16];
            long j13 = jA4 & 63;
            jA3 = ((j12 << ((int) (64 - j13))) | (j12 >>> ((int) j13))) ^ jA4;
            i14--;
        }
        c(jA3 - this.f88529b[0], bArr2, i11);
        c(jA4 - this.f88529b[1], bArr2, i11 + 8);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
