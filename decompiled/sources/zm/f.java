package zm;

import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[][] f95112a;

    public f(d dVar, byte[][] bArr) {
        if (dVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("signature == null");
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            throw new NullPointerException("signature byte array == null");
        }
        if (bArr.length != dVar.f95107c) {
            throw new IllegalArgumentException("wrong signature size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != dVar.f95105a) {
                throw new IllegalArgumentException("wrong signature format");
            }
        }
        this.f95112a = XMSSUtil.cloneArray(bArr);
    }
}
