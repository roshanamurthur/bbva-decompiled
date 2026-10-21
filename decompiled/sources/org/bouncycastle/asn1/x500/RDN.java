package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;

/* JADX INFO: loaded from: classes12.dex */
public class RDN extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Set f87537p0;

    public RDN(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        aSN1EncodableVector.add(aSN1Encodable);
        this.f87537p0 = new DERSet(new DERSequence(aSN1EncodableVector));
    }

    public static RDN getInstance(Object obj) {
        if (obj instanceof RDN) {
            return (RDN) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Set aSN1Set = ASN1Set.getInstance(obj);
        RDN rdn = new RDN();
        rdn.f87537p0 = aSN1Set;
        return rdn;
    }

    public AttributeTypeAndValue getFirst() {
        ASN1Set aSN1Set = this.f87537p0;
        if (aSN1Set.size() == 0) {
            return null;
        }
        return AttributeTypeAndValue.getInstance(aSN1Set.getObjectAt(0));
    }

    public AttributeTypeAndValue[] getTypesAndValues() {
        ASN1Set aSN1Set = this.f87537p0;
        int size = aSN1Set.size();
        AttributeTypeAndValue[] attributeTypeAndValueArr = new AttributeTypeAndValue[size];
        for (int i10 = 0; i10 != size; i10++) {
            attributeTypeAndValueArr[i10] = AttributeTypeAndValue.getInstance(aSN1Set.getObjectAt(i10));
        }
        return attributeTypeAndValueArr;
    }

    public boolean isMultiValued() {
        return this.f87537p0.size() > 1;
    }

    public int size() {
        return this.f87537p0.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87537p0;
    }

    public RDN(AttributeTypeAndValue attributeTypeAndValue) {
        this.f87537p0 = new DERSet(attributeTypeAndValue);
    }

    public RDN(AttributeTypeAndValue[] attributeTypeAndValueArr) {
        this.f87537p0 = new DERSet(attributeTypeAndValueArr);
    }
}
