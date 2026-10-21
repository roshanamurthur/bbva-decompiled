package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class OtherMsg extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BodyPartID f86703p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f86704q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Encodable f86705r0;

    public OtherMsg(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86703p0 = BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86704q0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86705r0 = aSN1Sequence.getObjectAt(2);
    }

    public static OtherMsg getInstance(Object obj) {
        if (obj instanceof OtherMsg) {
            return (OtherMsg) obj;
        }
        if (obj != null) {
            return new OtherMsg(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BodyPartID getBodyPartID() {
        return this.f86703p0;
    }

    public ASN1ObjectIdentifier getOtherMsgType() {
        return this.f86704q0;
    }

    public ASN1Encodable getOtherMsgValue() {
        return this.f86705r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86703p0);
        aSN1EncodableVector.add(this.f86704q0);
        aSN1EncodableVector.add(this.f86705r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public OtherMsg(BodyPartID bodyPartID, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f86703p0 = bodyPartID;
        this.f86704q0 = aSN1ObjectIdentifier;
        this.f86705r0 = aSN1Encodable;
    }

    public static OtherMsg getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
