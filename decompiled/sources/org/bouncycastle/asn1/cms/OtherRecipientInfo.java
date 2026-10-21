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
public class OtherRecipientInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f86940p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f86941q0;

    public OtherRecipientInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86940p0 = aSN1ObjectIdentifier;
        this.f86941q0 = aSN1Encodable;
    }

    public static OtherRecipientInfo getInstance(Object obj) {
        if (obj instanceof OtherRecipientInfo) {
            return (OtherRecipientInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherRecipientInfo otherRecipientInfo = new OtherRecipientInfo();
        otherRecipientInfo.f86940p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        otherRecipientInfo.f86941q0 = aSN1Sequence.getObjectAt(1);
        return otherRecipientInfo;
    }

    public ASN1ObjectIdentifier getType() {
        return this.f86940p0;
    }

    public ASN1Encodable getValue() {
        return this.f86941q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86940p0);
        aSN1EncodableVector.add(this.f86941q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static OtherRecipientInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
