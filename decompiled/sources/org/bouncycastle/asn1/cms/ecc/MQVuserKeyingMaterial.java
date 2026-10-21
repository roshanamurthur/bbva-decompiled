package org.bouncycastle.asn1.cms.ecc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;

/* JADX INFO: loaded from: classes12.dex */
public class MQVuserKeyingMaterial extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OriginatorPublicKey f86997p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1OctetString f86998q0;

    public MQVuserKeyingMaterial(OriginatorPublicKey originatorPublicKey, ASN1OctetString aSN1OctetString) {
        if (originatorPublicKey == null) {
            throw new IllegalArgumentException("Ephemeral public key cannot be null");
        }
        this.f86997p0 = originatorPublicKey;
        this.f86998q0 = aSN1OctetString;
    }

    public static MQVuserKeyingMaterial getInstance(Object obj) {
        if (obj instanceof MQVuserKeyingMaterial) {
            return (MQVuserKeyingMaterial) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        MQVuserKeyingMaterial mQVuserKeyingMaterial = new MQVuserKeyingMaterial();
        if (aSN1Sequence.size() != 1 && aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("Sequence has incorrect number of elements");
        }
        mQVuserKeyingMaterial.f86997p0 = OriginatorPublicKey.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            mQVuserKeyingMaterial.f86998q0 = ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true);
        }
        return mQVuserKeyingMaterial;
    }

    public ASN1OctetString getAddedukm() {
        return this.f86998q0;
    }

    public OriginatorPublicKey getEphemeralPublicKey() {
        return this.f86997p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86997p0);
        ASN1OctetString aSN1OctetString = this.f86998q0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1OctetString));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static MQVuserKeyingMaterial getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
