package org.bouncycastle.crypto.modes.kgcm;

/* JADX INFO: loaded from: classes5.dex */
public class BasicKGCMMultiplier_256 implements KGCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f89175a = new long[4];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_256.copy(jArr, this.f89175a);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_256.multiply(jArr, this.f89175a, jArr);
    }
}
