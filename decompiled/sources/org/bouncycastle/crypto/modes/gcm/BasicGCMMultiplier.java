package org.bouncycastle.crypto.modes.gcm;

/* JADX INFO: loaded from: classes5.dex */
public class BasicGCMMultiplier implements GCMMultiplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f89166a;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        this.f89166a = GCMUtil.asLongs(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        long[] jArrAsLongs = GCMUtil.asLongs(bArr);
        GCMUtil.multiply(jArrAsLongs, this.f89166a);
        GCMUtil.asBytes(jArrAsLongs, bArr);
    }
}
