package pm;

import java.security.cert.CRLException;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends d {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f92713u0;

    public e(JcaJceHelper jcaJceHelper, CertificateList certificateList, String str, byte[] bArr, boolean z10, byte[] bArr2) {
        super(jcaJceHelper, certificateList, str, bArr, z10);
        this.f92713u0 = bArr2;
    }

    @Override // pm.d, java.security.cert.X509CRL
    public final byte[] getEncoded() throws CRLException {
        byte[] bArr = this.f92713u0;
        if (bArr != null) {
            return bArr;
        }
        throw new CRLException();
    }
}
