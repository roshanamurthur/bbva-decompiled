package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class CRLBag extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87379p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87380q0;

    public CRLBag(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87379p0 = aSN1ObjectIdentifier;
        this.f87380q0 = aSN1Encodable;
    }

    public static CRLBag getInstance(Object obj) {
        if (obj instanceof CRLBag) {
            return (CRLBag) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CRLBag cRLBag = new CRLBag();
        cRLBag.f87379p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        cRLBag.f87380q0 = ((ASN1TaggedObject) aSN1Sequence.getObjectAt(1)).getObject();
        return cRLBag;
    }

    public ASN1ObjectIdentifier getCrlId() {
        return this.f87379p0;
    }

    public ASN1Encodable getCrlValue() {
        return this.f87380q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87379p0);
        aSN1EncodableVector.add(new DERTaggedObject(0, this.f87380q0));
        return new DERSequence(aSN1EncodableVector);
    }
}
