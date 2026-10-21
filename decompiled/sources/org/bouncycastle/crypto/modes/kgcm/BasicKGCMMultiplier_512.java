package org.bouncycastle.crypto.modes.kgcm;

/* JADX INFO: loaded from: classes5.dex */
public class BasicKGCMMultiplier_512 implements KGCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f89176a = new long[8];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_512.copy(jArr, this.f89176a);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_512.multiply(jArr, this.f89176a, jArr);
    }
}
