package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class Certificate extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87593p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TBSCertificate f87594q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public AlgorithmIdentifier f87595r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public DERBitString f87596s0;

    public static Certificate getInstance(Object obj) {
        if (obj instanceof Certificate) {
            return (Certificate) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Certificate certificate = new Certificate();
        certificate.f87593p0 = aSN1Sequence;
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        certificate.f87594q0 = TBSCertificate.getInstance(aSN1Sequence.getObjectAt(0));
        certificate.f87595r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        certificate.f87596s0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(2));
        return certificate;
    }

    public Time getEndDate() {
        return this.f87594q0.getEndDate();
    }

    public X500Name getIssuer() {
        return this.f87594q0.getIssuer();
    }

    public ASN1Integer getSerialNumber() {
        return this.f87594q0.getSerialNumber();
    }

    public DERBitString getSignature() {
        return this.f87596s0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f87595r0;
    }

    public Time getStartDate() {
        return this.f87594q0.getStartDate();
    }

    public X500Name getSubject() {
        return this.f87594q0.getSubject();
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.f87594q0.getSubjectPublicKeyInfo();
    }

    public TBSCertificate getTBSCertificate() {
        return this.f87594q0;
    }

    public ASN1Integer getVersion() {
        return this.f87594q0.getVersion();
    }

    public int getVersionNumber() {
        return this.f87594q0.getVersionNumber();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87593p0;
    }

    public static Certificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
