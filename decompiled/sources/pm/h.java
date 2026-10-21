package pm;

import java.security.cert.CertificateEncodingException;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends g {
    public final byte[] v0;

    public h(JcaJceHelper jcaJceHelper, Certificate certificate, BasicConstraints basicConstraints, boolean[] zArr, String str, byte[] bArr, byte[] bArr2) {
        super(jcaJceHelper, certificate, basicConstraints, zArr, str, bArr);
        this.v0 = bArr2;
    }

    @Override // pm.g, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        byte[] bArr = this.v0;
        if (bArr != null) {
            return bArr;
        }
        throw new CertificateEncodingException();
    }
}
