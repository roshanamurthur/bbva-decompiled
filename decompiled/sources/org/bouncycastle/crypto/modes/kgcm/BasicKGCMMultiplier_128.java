package org.bouncycastle.crypto.modes.kgcm;

/* JADX INFO: loaded from: classes5.dex */
public class BasicKGCMMultiplier_128 implements KGCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f89174a = new long[2];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_128.copy(jArr, this.f89174a);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_128.multiply(jArr, this.f89174a, jArr);
    }
}
