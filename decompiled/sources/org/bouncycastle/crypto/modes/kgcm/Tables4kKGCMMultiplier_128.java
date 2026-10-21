package org.bouncycastle.crypto.modes.kgcm;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class Tables4kKGCMMultiplier_128 implements KGCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[][] f89178a;

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        long[][] jArr2 = this.f89178a;
        if (jArr2 == null) {
            this.f89178a = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (KGCMUtil_128.equal(jArr, jArr2[1])) {
            return;
        }
        KGCMUtil_128.copy(jArr, this.f89178a[1]);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr3 = this.f89178a;
            KGCMUtil_128.multiplyX(jArr3[i10 >> 1], jArr3[i10]);
            long[][] jArr4 = this.f89178a;
            KGCMUtil_128.add(jArr4[i10], jArr4[1], jArr4[i10 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        long[] jArr2 = new long[2];
        KGCMUtil_128.copy(this.f89178a[((int) (jArr[1] >>> 56)) & 255], jArr2);
        for (int i10 = 14; i10 >= 0; i10--) {
            KGCMUtil_128.multiplyX8(jArr2, jArr2);
            KGCMUtil_128.add(this.f89178a[((int) (jArr[i10 >>> 3] >>> ((i10 & 7) << 3))) & 255], jArr2, jArr2);
        }
        KGCMUtil_128.copy(jArr2, jArr);
    }
}
