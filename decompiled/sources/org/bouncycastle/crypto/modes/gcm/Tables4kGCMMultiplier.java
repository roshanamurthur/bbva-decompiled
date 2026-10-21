package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Tables4kGCMMultiplier implements GCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f89168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[][] f89169b;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f89169b == null) {
            this.f89169b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (Arrays.areEqual(this.f89168a, bArr)) {
            return;
        }
        byte[] bArrClone = Arrays.clone(bArr);
        this.f89168a = bArrClone;
        GCMUtil.asLongs(bArrClone, this.f89169b[1]);
        long[] jArr = this.f89169b[1];
        GCMUtil.multiplyP7(jArr, jArr);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr2 = this.f89169b;
            GCMUtil.divideP(jArr2[i10 >> 1], jArr2[i10]);
            long[][] jArr3 = this.f89169b;
            GCMUtil.xor(jArr3[i10], jArr3[1], jArr3[i10 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.f89169b[bArr[15] & 255];
        long j10 = jArr[0];
        long j11 = jArr[1];
        for (int i10 = 14; i10 >= 0; i10--) {
            long[] jArr2 = this.f89169b[bArr[i10] & 255];
            long j12 = j11 << 56;
            j11 = ((j11 >>> 8) | (j10 << 56)) ^ jArr2[1];
            j10 = (((((j10 >>> 8) ^ jArr2[0]) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2)) ^ (j12 >>> 7);
        }
        Pack.longToBigEndian(j10, bArr, 0);
        Pack.longToBigEndian(j11, bArr, 8);
    }
}
