package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class TaggedCertificationRequest extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartID f86733p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CertificationRequest f86734q0;

    public TaggedCertificationRequest(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86733p0 = BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86734q0 = CertificationRequest.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static TaggedCertificationRequest getInstance(Object obj) {
        if (obj instanceof TaggedCertificationRequest) {
            return (TaggedCertificationRequest) obj;
        }
        if (obj != null) {
            return new TaggedCertificationRequest(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86733p0);
        aSN1EncodableVector.add(this.f86734q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public TaggedCertificationRequest(BodyPartID bodyPartID, CertificationRequest certificationRequest) {
        this.f86733p0 = bodyPartID;
        this.f86734q0 = certificationRequest;
    }

    public static TaggedCertificationRequest getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
