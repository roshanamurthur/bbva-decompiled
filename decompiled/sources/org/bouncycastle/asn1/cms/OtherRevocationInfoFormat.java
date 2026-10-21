package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class OtherRevocationInfoFormat extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f86942p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f86943q0;

    public OtherRevocationInfoFormat(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86942p0 = aSN1ObjectIdentifier;
        this.f86943q0 = aSN1Encodable;
    }

    public static OtherRevocationInfoFormat getInstance(Object obj) {
        if (obj instanceof OtherRevocationInfoFormat) {
            return (OtherRevocationInfoFormat) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherRevocationInfoFormat otherRevocationInfoFormat = new OtherRevocationInfoFormat();
        otherRevocationInfoFormat.f86942p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        otherRevocationInfoFormat.f86943q0 = aSN1Sequence.getObjectAt(1);
        return otherRevocationInfoFormat;
    }

    public ASN1Encodable getInfo() {
        return this.f86943q0;
    }

    public ASN1ObjectIdentifier getInfoFormat() {
        return this.f86942p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86942p0);
        aSN1EncodableVector.add(this.f86943q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static OtherRevocationInfoFormat getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
