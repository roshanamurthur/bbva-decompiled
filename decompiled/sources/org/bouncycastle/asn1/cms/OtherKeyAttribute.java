package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class OtherKeyAttribute extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f86938p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f86939q0;

    public OtherKeyAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86938p0 = aSN1ObjectIdentifier;
        this.f86939q0 = aSN1Encodable;
    }

    public static OtherKeyAttribute getInstance(Object obj) {
        if (obj instanceof OtherKeyAttribute) {
            return (OtherKeyAttribute) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherKeyAttribute otherKeyAttribute = new OtherKeyAttribute();
        otherKeyAttribute.f86938p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        otherKeyAttribute.f86939q0 = aSN1Sequence.getObjectAt(1);
        return otherKeyAttribute;
    }

    public ASN1Encodable getKeyAttr() {
        return this.f86939q0;
    }

    public ASN1ObjectIdentifier getKeyAttrId() {
        return this.f86938p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86938p0);
        aSN1EncodableVector.add(this.f86939q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
