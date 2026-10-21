package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class Attribute extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87568p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Set f87569q0;

    public Attribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Set aSN1Set) {
        this.f87568p0 = aSN1ObjectIdentifier;
        this.f87569q0 = aSN1Set;
    }

    public static Attribute getInstance(Object obj) {
        if (obj instanceof Attribute) {
            return (Attribute) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        Attribute attribute = new Attribute();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        attribute.f87568p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        attribute.f87569q0 = ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
        return attribute;
    }

    public ASN1ObjectIdentifier getAttrType() {
        return new ASN1ObjectIdentifier(this.f87568p0.getId());
    }

    public ASN1Set getAttrValues() {
        return this.f87569q0;
    }

    public ASN1Encodable[] getAttributeValues() {
        return this.f87569q0.toArray();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87568p0);
        aSN1EncodableVector.add(this.f87569q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
