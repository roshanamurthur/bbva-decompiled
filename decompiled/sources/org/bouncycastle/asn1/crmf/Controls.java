package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class Controls extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87029p0;

    public Controls(AttributeTypeAndValue attributeTypeAndValue) {
        this.f87029p0 = new DERSequence(attributeTypeAndValue);
    }

    public static Controls getInstance(Object obj) {
        if (obj instanceof Controls) {
            return (Controls) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Controls controls = new Controls();
        controls.f87029p0 = aSN1Sequence;
        return controls;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87029p0;
    }

    public AttributeTypeAndValue[] toAttributeTypeAndValueArray() {
        ASN1Sequence aSN1Sequence = this.f87029p0;
        int size = aSN1Sequence.size();
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[size];
        for (int i10 = 0; i10 != size; i10++) {
            attributeTypeAndValueArr[i10] = AttributeTypeAndValue.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return attributeTypeAndValueArr;
    }

    public Controls(AttributeTypeAndValue[] attributeTypeAndValueArr) {
        this.f87029p0 = new DERSequence(attributeTypeAndValueArr);
    }
}
