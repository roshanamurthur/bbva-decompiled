package org.bouncycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes5.dex */
public class Tables64kGCMMultiplier implements GCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f89170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[][][] f89171b;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.f89171b == null) {
            this.f89171b = (long[][][]) Array.newInstance((Class<?>) Long.TYPE, 16, 256, 2);
        } else if (Arrays.areEqual(this.f89170a, bArr)) {
            return;
        }
        this.f89170a = Arrays.clone(bArr);
        for (int i10 = 0; i10 < 16; i10++) {
            long[][][] jArr = this.f89171b;
            long[][] jArr2 = jArr[i10];
            if (i10 == 0) {
                GCMUtil.asLongs(this.f89170a, jArr2[1]);
                long[] jArr3 = jArr2[1];
                GCMUtil.multiplyP7(jArr3, jArr3);
            } else {
                GCMUtil.multiplyP8(jArr[i10 - 1][1], jArr2[1]);
            }
            for (int i11 = 2; i11 < 256; i11 += 2) {
                GCMUtil.divideP(jArr2[i11 >> 1], jArr2[i11]);
                GCMUtil.xor(jArr2[i11], jArr2[1], jArr2[i11 + 1]);
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArr = this.f89171b[15][bArr[15] & 255];
        long j10 = jArr[0];
        long j11 = jArr[1];
        for (int i10 = 14; i10 >= 0; i10--) {
            long[] jArr2 = this.f89171b[i10][bArr[i10] & 255];
            j10 ^= jArr2[0];
            j11 ^= jArr2[1];
        }
        Pack.longToBigEndian(j10, bArr, 0);
        Pack.longToBigEndian(j11, bArr, 8);
    }
}
