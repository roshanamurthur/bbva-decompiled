package zm;

import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f95108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ASN1ObjectIdentifier f95110f;

    public d(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.f95110f = aSN1ObjectIdentifier;
        ExtendedDigest extendedDigestA = a.a(aSN1ObjectIdentifier);
        int digestSize = XMSSUtil.getDigestSize(extendedDigestA);
        this.f95105a = digestSize;
        this.f95106b = 16;
        int iCeil = (int) Math.ceil(((double) (digestSize * 8)) / ((double) XMSSUtil.log2(16)));
        this.f95108d = iCeil;
        int iFloor = ((int) Math.floor(XMSSUtil.log2(15 * iCeil) / XMSSUtil.log2(16))) + 1;
        this.f95109e = iFloor;
        int i10 = iCeil + iFloor;
        this.f95107c = i10;
        String algorithmName = extendedDigestA.getAlgorithmName();
        if (algorithmName == null) {
            Map<String, c> map = c.f95102c;
            throw new NullPointerException("algorithmName == null");
        }
        if (c.f95102c.get(c.a(digestSize, i10, algorithmName)) != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + extendedDigestA.getAlgorithmName());
    }
}
