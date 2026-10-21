package zm;

import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f95111a;

    public e(d dVar, byte[][] bArr) {
        if (dVar == null) {
            throw new NullPointerException("params == null");
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != dVar.f95107c) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != dVar.f95105a) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f95111a = XMSSUtil.cloneArray(bArr);
    }
}
