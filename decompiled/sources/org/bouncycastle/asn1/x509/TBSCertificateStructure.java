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
public class TBSCertificateStructure extends ASN1Object implements X509ObjectIdentifiers, PKCSObjectIdentifiers {
    public final DERBitString E0;
    public final X509Extensions F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Sequence f87708p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Integer f87709q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Integer f87710r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AlgorithmIdentifier f87711s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final X500Name f87712t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Time f87713u0;
    public final Time v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final X500Name f87714w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final SubjectPublicKeyInfo f87715x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final DERBitString f87716y0;

    public TBSCertificateStructure(ASN1Sequence aSN1Sequence) {
        int i10;
        this.f87708p0 = aSN1Sequence;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            this.f87709q0 = ASN1Integer.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i10 = 0;
        } else {
            this.f87709q0 = new ASN1Integer(0L);
            i10 = -1;
        }
        this.f87710r0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10 + 1));
        this.f87711s0 = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i10 + 2));
        this.f87712t0 = X500Name.getInstance(aSN1Sequence.getObjectAt(i10 + 3));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(i10 + 4);
        this.f87713u0 = Time.getInstance(aSN1Sequence2.getObjectAt(0));
        this.v0 = Time.getInstance(aSN1Sequence2.getObjectAt(1));
        this.f87714w0 = X500Name.getInstance(aSN1Sequence.getObjectAt(i10 + 5));
        int i11 = i10 + 6;
        this.f87715x0 = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i11));
        for (int size = (aSN1Sequence.size() - i11) - 1; size > 0; size--) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i11 + size));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 1) {
                this.f87716y0 = DERBitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 2) {
                this.E0 = DERBitString.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 3) {
                this.F0 = X509Extensions.getInstance(aSN1TaggedObject);
            }
        }
    }

    public static TBSCertificateStructure getInstance(Object obj) {
        if (obj instanceof TBSCertificateStructure) {
            return (TBSCertificateStructure) obj;
        }
        if (obj != null) {
            return new TBSCertificateStructure(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Time getEndDate() {
        return this.v0;
    }

    public X509Extensions getExtensions() {
        return this.F0;
    }

    public X500Name getIssuer() {
        return this.f87712t0;
    }

    public DERBitString getIssuerUniqueId() {
        return this.f87716y0;
    }

    public ASN1Integer getSerialNumber() {
        return this.f87710r0;
    }

    public AlgorithmIdentifier getSignature() {
        return this.f87711s0;
    }

    public Time getStartDate() {
        return this.f87713u0;
    }

    public X500Name getSubject() {
        return this.f87714w0;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.f87715x0;
    }

    public DERBitString getSubjectUniqueId() {
        return this.E0;
    }

    public int getVersion() {
        return this.f87709q0.intValueExact() + 1;
    }

    public ASN1Integer getVersionNumber() {
        return this.f87709q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87708p0;
    }

    public static TBSCertificateStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
