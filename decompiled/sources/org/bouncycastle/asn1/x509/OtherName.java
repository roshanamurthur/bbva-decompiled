package org.bouncycastle.asn1.x509;

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
public class OtherName extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87659p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Encodable f87660q0;

    public OtherName(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87659p0 = aSN1ObjectIdentifier;
        this.f87660q0 = aSN1Encodable;
    }

    public static OtherName getInstance(Object obj) {
        if (obj instanceof OtherName) {
            return (OtherName) obj;
        }
        if (obj != null) {
            return new OtherName(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getTypeID() {
        return this.f87659p0;
    }

    public ASN1Encodable getValue() {
        return this.f87660q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87659p0);
        aSN1EncodableVector.add(new DERTaggedObject(true, 0, this.f87660q0));
        return new DERSequence(aSN1EncodableVector);
    }

    public OtherName(ASN1Sequence aSN1Sequence) {
        this.f87659p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f87660q0 = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject();
    }
}
