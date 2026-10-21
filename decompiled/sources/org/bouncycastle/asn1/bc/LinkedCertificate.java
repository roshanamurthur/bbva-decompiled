package org.bouncycastle.asn1.bc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;

/* JADX INFO: loaded from: classes12.dex */
public class LinkedCertificate extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DigestInfo f86604p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GeneralName f86605q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final X500Name f86606r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final GeneralNames f86607s0;

    public LinkedCertificate(ASN1Sequence aSN1Sequence) {
        this.f86604p0 = DigestInfo.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86605q0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            for (int i10 = 2; i10 != aSN1Sequence.size(); i10++) {
                ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.f86606r0 = X500Name.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 1) {
                        throw new IllegalArgumentException("unknown tag in tagged field");
                    }
                    this.f86607s0 = GeneralNames.getInstance(aSN1TaggedObject, false);
                }
            }
        }
    }

    public static LinkedCertificate getInstance(Object obj) {
        if (obj instanceof LinkedCertificate) {
            return (LinkedCertificate) obj;
        }
        if (obj != null) {
            return new LinkedCertificate(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GeneralNames getCACerts() {
        return this.f86607s0;
    }

    public X500Name getCertIssuer() {
        return this.f86606r0;
    }

    public GeneralName getCertLocation() {
        return this.f86605q0;
    }

    public DigestInfo getDigest() {
        return this.f86604p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.f86604p0);
        aSN1EncodableVector.add(this.f86605q0);
        X500Name x500Name = this.f86606r0;
        if (x500Name != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, x500Name));
        }
        GeneralNames generalNames = this.f86607s0;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, generalNames));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public LinkedCertificate(DigestInfo digestInfo, GeneralName generalName) {
        this(digestInfo, generalName, null, null);
    }

    public LinkedCertificate(DigestInfo digestInfo, GeneralName generalName, X500Name x500Name, GeneralNames generalNames) {
        this.f86604p0 = digestInfo;
        this.f86605q0 = generalName;
        this.f86606r0 = x500Name;
        this.f86607s0 = generalNames;
    }
}
