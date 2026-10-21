package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AttributeTypeAndValue extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87534p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87535q0;

    public AttributeTypeAndValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87534p0 = aSN1ObjectIdentifier;
        this.f87535q0 = aSN1Encodable;
    }

    public static AttributeTypeAndValue getInstance(Object obj) {
        if (obj instanceof AttributeTypeAndValue) {
            return (AttributeTypeAndValue) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("null value in getInstance()");
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AttributeTypeAndValue attributeTypeAndValue = new AttributeTypeAndValue();
        attributeTypeAndValue.f87534p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        attributeTypeAndValue.f87535q0 = aSN1Sequence.getObjectAt(1);
        return attributeTypeAndValue;
    }

    public ASN1ObjectIdentifier getType() {
        return this.f87534p0;
    }

    public ASN1Encodable getValue() {
        return this.f87535q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87534p0);
        aSN1EncodableVector.add(this.f87535q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
