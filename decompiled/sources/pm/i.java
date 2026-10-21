package pm;

import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.util.Date;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;
import okhttp3.tls.internal.der.ObjectIdentifiers;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends g implements PKCS12BagAttributeCarrier {
    public X500Principal E0;
    public long[] F0;
    public volatile boolean G0;
    public volatile int H0;
    public final PKCS12BagAttributeCarrierImpl I0;
    public final Object v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public h f92723w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public X500Principal f92724x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public PublicKey f92725y0;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(BCJcaJceHelper bCJcaJceHelper, Certificate certificate) throws CertificateParsingException {
        boolean[] zArr;
        try {
            ASN1OctetString aSN1OctetStringC = g.c(certificate, ObjectIdentifiers.basicConstraints);
            byte[] octets = aSN1OctetStringC != null ? aSN1OctetStringC.getOctets() : null;
            BasicConstraints basicConstraints = octets == null ? null : BasicConstraints.getInstance(ASN1Primitive.fromByteArray(octets));
            try {
                ASN1OctetString aSN1OctetStringC2 = g.c(certificate, "2.5.29.15");
                byte[] octets2 = aSN1OctetStringC2 != null ? aSN1OctetStringC2.getOctets() : null;
                if (octets2 == null) {
                    zArr = null;
                } else {
                    DERBitString dERBitString = DERBitString.getInstance(ASN1Primitive.fromByteArray(octets2));
                    byte[] bytes = dERBitString.getBytes();
                    int length = (bytes.length * 8) - dERBitString.getPadBits();
                    int i10 = 9;
                    if (length >= 9) {
                        i10 = length;
                    }
                    boolean[] zArr2 = new boolean[i10];
                    for (int i11 = 0; i11 != length; i11++) {
                        zArr2[i11] = (bytes[i11 / 8] & (128 >>> (i11 % 8))) != 0;
                    }
                    zArr = zArr2;
                }
                try {
                    String strB = j.b(certificate.getSignatureAlgorithm());
                    try {
                        ASN1Encodable parameters = certificate.getSignatureAlgorithm().getParameters();
                        super(bCJcaJceHelper, certificate, basicConstraints, zArr, strB, parameters != null ? parameters.toASN1Primitive().getEncoded(ASN1Encoding.DER) : null);
                        this.v0 = new Object();
                        this.I0 = new PKCS12BagAttributeCarrierImpl();
                    } catch (Exception e5) {
                        throw new CertificateParsingException(c2.b.d("cannot construct SigAlgParams: ", e5));
                    }
                } catch (Exception e7) {
                    throw new CertificateParsingException(c2.b.d("cannot construct SigAlgName: ", e7));
                }
            } catch (Exception e10) {
                throw new CertificateParsingException(c2.b.d("cannot construct KeyUsage: ", e10));
            }
        } catch (Exception e11) {
            throw new CertificateParsingException(c2.b.d("cannot construct BasicConstraints: ", e11));
        }
    }

    @Override // pm.g, java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        long[] jArr;
        long[] jArr2;
        long time = date.getTime();
        synchronized (this.v0) {
            try {
                jArr = this.F0;
                if (jArr == null) {
                    long[] jArr3 = {getNotBefore().getTime(), getNotAfter().getTime()};
                    synchronized (this.v0) {
                        try {
                            if (this.F0 == null) {
                                this.F0 = jArr3;
                            }
                            jArr2 = this.F0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    jArr = jArr2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (time > jArr[1]) {
            throw new CertificateExpiredException("certificate expired on " + this.f92718q0.getEndDate().getTime());
        }
        if (time >= jArr[0]) {
            return;
        }
        throw new CertificateNotYetValidException("certificate not valid till " + this.f92718q0.getStartDate().getTime());
    }

    public final h d() {
        byte[] encoded;
        h hVar;
        synchronized (this.v0) {
            try {
                h hVar2 = this.f92723w0;
                if (hVar2 != null) {
                    return hVar2;
                }
                try {
                    encoded = getEncoded();
                } catch (CertificateEncodingException unused) {
                    encoded = null;
                }
                h hVar3 = new h(this.f92717p0, this.f92718q0, this.f92719r0, this.f92720s0, this.f92721t0, this.f92722u0, encoded);
                synchronized (this.v0) {
                    try {
                        if (this.f92723w0 == null) {
                            this.f92723w0 = hVar3;
                        }
                        hVar = this.f92723w0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return hVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        DERBitString signature;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.G0 && iVar.G0) {
                if (this.H0 != iVar.H0) {
                    return false;
                }
            } else if ((this.f92723w0 == null || iVar.f92723w0 == null) && (signature = this.f92718q0.getSignature()) != null && !signature.equals((ASN1Primitive) iVar.f92718q0.getSignature())) {
                return false;
            }
        }
        return d().equals(obj);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public final ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.I0.getBagAttribute(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public final Enumeration getBagAttributeKeys() {
        return this.I0.getBagAttributeKeys();
    }

    @Override // pm.g, java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        X500Principal x500Principal;
        synchronized (this.v0) {
            try {
                X500Principal x500Principal2 = this.f92724x0;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal issuerX500Principal = super.getIssuerX500Principal();
                synchronized (this.v0) {
                    try {
                        if (this.f92724x0 == null) {
                            this.f92724x0 = issuerX500Principal;
                        }
                        x500Principal = this.f92724x0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return x500Principal;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // pm.g, java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        PublicKey publicKey;
        synchronized (this.v0) {
            try {
                PublicKey publicKey2 = this.f92725y0;
                if (publicKey2 != null) {
                    return publicKey2;
                }
                PublicKey publicKey3 = super.getPublicKey();
                if (publicKey3 == null) {
                    return null;
                }
                synchronized (this.v0) {
                    try {
                        if (this.f92725y0 == null) {
                            this.f92725y0 = publicKey3;
                        }
                        publicKey = this.f92725y0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return publicKey;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // pm.g, java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        X500Principal x500Principal;
        synchronized (this.v0) {
            try {
                X500Principal x500Principal2 = this.E0;
                if (x500Principal2 != null) {
                    return x500Principal2;
                }
                X500Principal subjectX500Principal = super.getSubjectX500Principal();
                synchronized (this.v0) {
                    try {
                        if (this.E0 == null) {
                            this.E0 = subjectX500Principal;
                        }
                        x500Principal = this.E0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return x500Principal;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.security.cert.Certificate
    public final int hashCode() {
        if (!this.G0) {
            this.H0 = d().hashCode();
            this.G0 = true;
        }
        return this.H0;
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public final void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.I0.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }
}
