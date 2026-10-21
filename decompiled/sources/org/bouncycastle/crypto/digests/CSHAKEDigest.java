package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class CSHAKEDigest extends SHAKEDigest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f88017c = new byte[100];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f88018b;

    public CSHAKEDigest(int i10, byte[] bArr, byte[] bArr2) {
        super(i10);
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            this.f88018b = null;
        } else {
            this.f88018b = Arrays.concatenate(e(this.rate / 8), (bArr == null || bArr.length == 0) ? e(0L) : Arrays.concatenate(e(((long) bArr.length) * 8), bArr), (bArr2 == null || bArr2.length == 0) ? e(0L) : Arrays.concatenate(e(((long) bArr2.length) * 8), bArr2));
            d();
        }
    }

    public static byte[] e(long j10) {
        long j11 = j10;
        byte b10 = 1;
        while (true) {
            j11 >>= 8;
            if (j11 == 0) {
                break;
            }
            b10 = (byte) (b10 + 1);
        }
        byte[] bArr = new byte[b10 + 1];
        bArr[0] = b10;
        for (int i10 = 1; i10 <= b10; i10++) {
            bArr[i10] = (byte) (j10 >> ((b10 - i10) * 8));
        }
        return bArr;
    }

    public final void d() {
        int i10 = this.rate / 8;
        byte[] bArr = this.f88018b;
        absorb(bArr, 0, bArr.length);
        int length = i10 - (bArr.length % i10);
        while (true) {
            byte[] bArr2 = f88017c;
            if (length <= 100) {
                absorb(bArr2, 0, length);
                return;
            } else {
                absorb(bArr2, 0, 100);
                length -= 100;
            }
        }
    }

    @Override // org.bouncycastle.crypto.digests.SHAKEDigest, org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i10, int i11) {
        if (this.f88018b == null) {
            return super.doOutput(bArr, i10, i11);
        }
        if (!this.squeezing) {
            absorbBits(0, 2);
        }
        squeeze(bArr, i10, ((long) i11) * 8);
        return i11;
    }

    @Override // org.bouncycastle.crypto.digests.KeccakDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        if (this.f88018b != null) {
            d();
        }
    }
}
