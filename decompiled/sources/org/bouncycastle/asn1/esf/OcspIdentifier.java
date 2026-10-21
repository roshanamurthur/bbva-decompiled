package org.bouncycastle.asn1.esf;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.ocsp.ResponderID;

/* JADX INFO: loaded from: classes12.dex */
public class OcspIdentifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ResponderID f87209p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1GeneralizedTime f87210q0;

    public OcspIdentifier(ResponderID responderID, ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.f87209p0 = responderID;
        this.f87210q0 = aSN1GeneralizedTime;
    }

    public static OcspIdentifier getInstance(Object obj) {
        if (obj instanceof OcspIdentifier) {
            return (OcspIdentifier) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OcspIdentifier ocspIdentifier = new OcspIdentifier();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        ocspIdentifier.f87209p0 = ResponderID.getInstance(aSN1Sequence.getObjectAt(0));
        ocspIdentifier.f87210q0 = (ASN1GeneralizedTime) aSN1Sequence.getObjectAt(1);
        return ocspIdentifier;
    }

    public ResponderID getOcspResponderID() {
        return this.f87209p0;
    }

    public ASN1GeneralizedTime getProducedAt() {
        return this.f87210q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87209p0);
        aSN1EncodableVector.add(this.f87210q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
