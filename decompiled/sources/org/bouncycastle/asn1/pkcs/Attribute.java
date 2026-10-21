package org.bouncycastle.asn1.pkcs;

import androidx.emoji2.text.flatbuffer.a;
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
    public final ASN1ObjectIdentifier f87375p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Set f87376q0;

    public Attribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Set aSN1Set) {
        this.f87375p0 = aSN1ObjectIdentifier;
        this.f87376q0 = aSN1Set;
    }

    public static Attribute getInstance(Object obj) {
        if (obj == null || (obj instanceof Attribute)) {
            return (Attribute) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new Attribute((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.c(obj, "unknown object in factory: "));
    }

    public ASN1ObjectIdentifier getAttrType() {
        return this.f87375p0;
    }

    public ASN1Set getAttrValues() {
        return this.f87376q0;
    }

    public ASN1Encodable[] getAttributeValues() {
        return this.f87376q0.toArray();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87375p0);
        aSN1EncodableVector.add(this.f87376q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public Attribute(ASN1Sequence aSN1Sequence) {
        this.f87375p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        this.f87376q0 = (ASN1Set) aSN1Sequence.getObjectAt(1);
    }
}
