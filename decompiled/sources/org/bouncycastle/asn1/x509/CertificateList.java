package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes12.dex */
public class CertificateList extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TBSCertList f87597p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AlgorithmIdentifier f87598q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DERBitString f87599r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f87600s0 = false;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f87601t0;

    public CertificateList(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("sequence wrong size for CertificateList");
        }
        this.f87597p0 = TBSCertList.getInstance(aSN1Sequence.getObjectAt(0));
        this.f87598q0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f87599r0 = DERBitString.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static CertificateList getInstance(Object obj) {
        if (obj instanceof CertificateList) {
            return (CertificateList) obj;
        }
        if (obj != null) {
            return new CertificateList(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X500Name getIssuer() {
        return this.f87597p0.getIssuer();
    }

    public Time getNextUpdate() {
        return this.f87597p0.getNextUpdate();
    }

    public Enumeration getRevokedCertificateEnumeration() {
        return this.f87597p0.getRevokedCertificateEnumeration();
    }

    public TBSCertList.CRLEntry[] getRevokedCertificates() {
        return this.f87597p0.getRevokedCertificates();
    }

    public DERBitString getSignature() {
        return this.f87599r0;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return this.f87598q0;
    }

    public TBSCertList getTBSCertList() {
        return this.f87597p0;
    }

    public Time getThisUpdate() {
        return this.f87597p0.getThisUpdate();
    }

    public int getVersionNumber() {
        return this.f87597p0.getVersionNumber();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (!this.f87600s0) {
            this.f87601t0 = super.hashCode();
            this.f87600s0 = true;
        }
        return this.f87601t0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87597p0);
        aSN1EncodableVector.add(this.f87598q0);
        aSN1EncodableVector.add(this.f87599r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static CertificateList getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
