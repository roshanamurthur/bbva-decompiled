package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class BasicGCMExponentiator implements GCMExponentiator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f89165a;

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j10, byte[] bArr) {
        long[] jArrOneAsLongs = GCMUtil.oneAsLongs();
        if (j10 > 0) {
            long[] jArrClone = Arrays.clone(this.f89165a);
            do {
                if ((1 & j10) != 0) {
                    GCMUtil.multiply(jArrOneAsLongs, jArrClone);
                }
                GCMUtil.square(jArrClone, jArrClone);
                j10 >>>= 1;
            } while (j10 > 0);
        }
        GCMUtil.asBytes(jArrOneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        this.f89165a = GCMUtil.asLongs(bArr);
    }
}
