package zm;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExtendedDigest f95100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95101b;

    public b(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i10) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("digest == null");
        }
        this.f95100a = a.a(aSN1ObjectIdentifier);
        this.f95101b = i10;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.f95101b * 3) {
            return c(2, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong key length");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f95101b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return c(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] c(int i10, byte[] bArr, byte[] bArr2) {
        long j10 = i10;
        int i11 = this.f95101b;
        byte[] bytesBigEndian = XMSSUtil.toBytesBigEndian(j10, i11);
        int length = bytesBigEndian.length;
        ExtendedDigest extendedDigest = this.f95100a;
        extendedDigest.update(bytesBigEndian, 0, length);
        extendedDigest.update(bArr, 0, bArr.length);
        extendedDigest.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[i11];
        if (extendedDigest instanceof Xof) {
            ((Xof) extendedDigest).doFinal(bArr3, 0, i11);
        } else {
            extendedDigest.doFinal(bArr3, 0);
        }
        return bArr3;
    }
}
