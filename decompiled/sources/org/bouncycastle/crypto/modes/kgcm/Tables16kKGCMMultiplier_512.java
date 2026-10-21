package org.bouncycastle.crypto.modes.kgcm;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class Tables16kKGCMMultiplier_512 implements KGCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[][] f89177a;

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        long[][] jArr2 = this.f89177a;
        if (jArr2 == null) {
            this.f89177a = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 8);
        } else if (KGCMUtil_512.equal(jArr, jArr2[1])) {
            return;
        }
        KGCMUtil_512.copy(jArr, this.f89177a[1]);
        for (int i10 = 2; i10 < 256; i10 += 2) {
            long[][] jArr3 = this.f89177a;
            KGCMUtil_512.multiplyX(jArr3[i10 >> 1], jArr3[i10]);
            long[][] jArr4 = this.f89177a;
            KGCMUtil_512.add(jArr4[i10], jArr4[1], jArr4[i10 + 1]);
        }
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        long[] jArr2 = new long[8];
        KGCMUtil_512.copy(this.f89177a[((int) (jArr[7] >>> 56)) & 255], jArr2);
        for (int i10 = 62; i10 >= 0; i10--) {
            KGCMUtil_512.multiplyX8(jArr2, jArr2);
            KGCMUtil_512.add(this.f89177a[((int) (jArr[i10 >>> 3] >>> ((i10 & 7) << 3))) & 255], jArr2, jArr2);
        }
        KGCMUtil_512.copy(jArr2, jArr);
    }
}
