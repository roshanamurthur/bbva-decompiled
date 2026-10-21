package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class SigPolicyQualifierInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87228p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87229q0;

    public SigPolicyQualifierInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87228p0 = aSN1ObjectIdentifier;
        this.f87229q0 = aSN1Encodable;
    }

    public static SigPolicyQualifierInfo getInstance(Object obj) {
        if (obj instanceof SigPolicyQualifierInfo) {
            return (SigPolicyQualifierInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SigPolicyQualifierInfo sigPolicyQualifierInfo = new SigPolicyQualifierInfo();
        sigPolicyQualifierInfo.f87228p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        sigPolicyQualifierInfo.f87229q0 = aSN1Sequence.getObjectAt(1);
        return sigPolicyQualifierInfo;
    }

    public ASN1ObjectIdentifier getSigPolicyQualifierId() {
        return new ASN1ObjectIdentifier(this.f87228p0.getId());
    }

    public ASN1Encodable getSigQualifier() {
        return this.f87229q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87228p0);
        aSN1EncodableVector.add(this.f87229q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
