package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DLSet;

/* JADX INFO: loaded from: classes12.dex */
public class Attributes extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Set f86841p0;

    public Attributes(ASN1EncodableVector aSN1EncodableVector) {
        this.f86841p0 = new DLSet(aSN1EncodableVector);
    }

    public static Attributes getInstance(Object obj) {
        if (obj instanceof Attributes) {
            return (Attributes) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Set aSN1Set = ASN1Set.getInstance(obj);
        Attributes attributes = new Attributes();
        attributes.f86841p0 = aSN1Set;
        return attributes;
    }

    public Attribute[] getAttributes() {
        ASN1Set aSN1Set = this.f86841p0;
        int size = aSN1Set.size();
        Attribute[] attributeArr = new Attribute[size];
        for (int i10 = 0; i10 != size; i10++) {
            attributeArr[i10] = Attribute.getInstance(aSN1Set.getObjectAt(i10));
        }
        return attributeArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f86841p0;
    }

    public static Attributes getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Set.getInstance(aSN1TaggedObject, z10));
    }
}
