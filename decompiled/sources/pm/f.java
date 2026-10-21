package pm;

import java.security.cert.CRLException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.CertificateList;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.IssuingDistributionPoint;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends d {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Object f92714u0;
    public e v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile boolean f92715w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile int f92716x0;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(BCJcaJceHelper bCJcaJceHelper, CertificateList certificateList) throws CRLException {
        Extension extension;
        try {
            String strB = j.b(certificateList.getSignatureAlgorithm());
            try {
                ASN1Encodable parameters = certificateList.getSignatureAlgorithm().getParameters();
                byte[] encoded = parameters == null ? null : parameters.toASN1Primitive().getEncoded(ASN1Encoding.DER);
                try {
                    String id = Extension.issuingDistributionPoint.getId();
                    Extensions extensions = certificateList.getTBSCertList().getExtensions();
                    ASN1OctetString extnValue = (extensions == null || (extension = extensions.getExtension(new ASN1ObjectIdentifier(id))) == null) ? null : extension.getExtnValue();
                    byte[] octets = extnValue != null ? extnValue.getOctets() : null;
                    super(bCJcaJceHelper, certificateList, strB, encoded, octets == null ? false : IssuingDistributionPoint.getInstance(octets).isIndirectCRL());
                    this.f92714u0 = new Object();
                } catch (Exception e5) {
                    a aVar = new a("Exception reading IssuingDistributionPoint");
                    aVar.f92700p0 = e5;
                    throw aVar;
                }
            } catch (Exception e7) {
                throw new CRLException(c2.b.d("CRL contents invalid: ", e7));
            }
        } catch (Exception e10) {
            throw new CRLException(c2.b.d("CRL contents invalid: ", e10));
        }
    }

    public final e c() {
        byte[] encoded;
        e eVar;
        synchronized (this.f92714u0) {
            try {
                e eVar2 = this.v0;
                if (eVar2 != null) {
                    return eVar2;
                }
                try {
                    encoded = getEncoded();
                } catch (CRLException unused) {
                    encoded = null;
                }
                e eVar3 = new e(this.f92708p0, this.f92709q0, this.f92710r0, this.f92711s0, this.f92712t0, encoded);
                synchronized (this.f92714u0) {
                    try {
                        if (this.v0 == null) {
                            this.v0 = eVar3;
                        }
                        eVar = this.v0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return eVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.security.cert.X509CRL
    public final boolean equals(Object obj) {
        DERBitString signature;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f92715w0 && fVar.f92715w0) {
                if (this.f92716x0 != fVar.f92716x0) {
                    return false;
                }
            } else if ((this.v0 == null || fVar.v0 == null) && (signature = this.f92709q0.getSignature()) != null && !signature.equals((ASN1Primitive) fVar.f92709q0.getSignature())) {
                return false;
            }
        }
        return c().equals(obj);
    }

    @Override // java.security.cert.X509CRL
    public final int hashCode() {
        if (!this.f92715w0) {
            this.f92716x0 = c().hashCode();
            this.f92715w0 = true;
        }
        return this.f92716x0;
    }
}
