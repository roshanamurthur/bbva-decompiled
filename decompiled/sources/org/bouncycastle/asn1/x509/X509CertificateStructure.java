package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class X509CertificateStructure extends ASN1Object implements X509ObjectIdentifiers, PKCSObjectIdentifiers {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Sequence f87764p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TBSCertificateStructure f87765q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AlgorithmIdentifier f87766r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final DERBitString f87767s0;

    public X509CertificateStructure(ASN1Sequence aSN1Sequence) {
        this.f87764p0 = aSN1Sequence;
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.f87765q0 = TBSCertificateStructure.getInstance(aSN1Sequence.getObjectAt(0));
        this.f87766r0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f87767s0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static X509CertificateStructure getInstance(Object obj) {
        if (obj instanceof X509CertificateStructure) {
            return (X509CertificateStructure) obj;
        }
        if (obj != null) {
            return new X509CertificateStructure(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Time getEndDate() {
        return this.f87765q0.getEndDate();
    }

    public X500Name getIssuer() {
        return this.f87765q0.getIssuer();
    }

    public ASN1Integer getSerialNumber() {
        return this.f87765q0.getSerialNumber();
    }

    public DERBitString getSignature() {
        return this.f87767s0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f87766r0;
    }

    public Time getStartDate() {
        return this.f87765q0.getStartDate();
    }

    public X500Name getSubject() {
        return this.f87765q0.getSubject();
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.f87765q0.getSubjectPublicKeyInfo();
    }

    public TBSCertificateStructure getTBSCertificate() {
        return this.f87765q0;
    }

    public int getVersion() {
        return this.f87765q0.getVersion();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87764p0;
    }

    public static X509CertificateStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
