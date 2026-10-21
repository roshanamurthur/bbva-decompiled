package org.bouncycastle.crypto.modes.kgcm;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class Tables8kKGCMMultiplier_256 implements KGCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[][] f89179a;

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        long[][] jArr2 = this.f89179a;
        if (jArr2 == null) {
            this.f89179a = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 4);
        } else if (KGCMUtil_256.equal(jArr, jArr2[1])) {
            return;
        }
        KGCMUtil_256.copy(jArr, this.f89179a[1]);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr3 = this.f89179a;
            KGCMUtil_256.multiplyX(jArr3[i10 >> 1], jArr3[i10]);
            long[][] jArr4 = this.f89179a;
            KGCMUtil_256.add(jArr4[i10], jArr4[1], jArr4[i10 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        long[] jArr2 = new long[4];
        KGCMUtil_256.copy(this.f89179a[((int) (jArr[3] >>> 56)) & 255], jArr2);
        for (int i10 = 30; i10 >= 0; i10--) {
            KGCMUtil_256.multiplyX8(jArr2, jArr2);
            KGCMUtil_256.add(this.f89179a[((int) (jArr[i10 >>> 3] >>> ((i10 & 7) << 3))) & 255], jArr2, jArr2);
        }
        KGCMUtil_256.copy(jArr2, jArr);
    }
}
