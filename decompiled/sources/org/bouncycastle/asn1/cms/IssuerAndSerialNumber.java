package org.bouncycastle.asn1.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.X509CertificateStructure;
import org.bouncycastle.asn1.x509.X509Name;

/* JADX INFO: loaded from: classes12.dex */
public class IssuerAndSerialNumber extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final X500Name f86909p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f86910q0;

    public IssuerAndSerialNumber(ASN1Sequence aSN1Sequence) {
        this.f86909p0 = X500Name.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86910q0 = (ASN1Integer) aSN1Sequence.getObjectAt(1);
    }

    public static IssuerAndSerialNumber getInstance(Object obj) {
        if (obj instanceof IssuerAndSerialNumber) {
            return (IssuerAndSerialNumber) obj;
        }
        if (obj != null) {
            return new IssuerAndSerialNumber(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X500Name getName() {
        return this.f86909p0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f86910q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86909p0);
        aSN1EncodableVector.add(this.f86910q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public IssuerAndSerialNumber(X500Name x500Name, BigInteger bigInteger) {
        this.f86909p0 = x500Name;
        this.f86910q0 = new ASN1Integer(bigInteger);
    }

    public IssuerAndSerialNumber(Certificate certificate) {
        this.f86909p0 = certificate.getIssuer();
        this.f86910q0 = certificate.getSerialNumber();
    }

    public IssuerAndSerialNumber(X509CertificateStructure x509CertificateStructure) {
        this.f86909p0 = x509CertificateStructure.getIssuer();
        this.f86910q0 = x509CertificateStructure.getSerialNumber();
    }

    public IssuerAndSerialNumber(X509Name x509Name, BigInteger bigInteger) {
        this.f86909p0 = X500Name.getInstance(x509Name);
        this.f86910q0 = new ASN1Integer(bigInteger);
    }

    public IssuerAndSerialNumber(X509Name x509Name, ASN1Integer aSN1Integer) {
        this.f86909p0 = X500Name.getInstance(x509Name);
        this.f86910q0 = aSN1Integer;
    }
}
