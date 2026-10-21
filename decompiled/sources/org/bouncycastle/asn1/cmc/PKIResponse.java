package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PKIResponse extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1Sequence f86713p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Sequence f86714q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ASN1Sequence f86715r0;

    public PKIResponse(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("incorrect sequence size");
        }
        this.f86713p0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        this.f86714q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        this.f86715r0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(2));
    }

    public static PKIResponse getInstance(Object obj) {
        if (obj instanceof PKIResponse) {
            return (PKIResponse) obj;
        }
        if (obj != null) {
            return new PKIResponse(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1Sequence getCmsSequence() {
        return this.f86714q0;
    }

    public ASN1Sequence getControlSequence() {
        return this.f86713p0;
    }

    public ASN1Sequence getOtherMsgSequence() {
        return this.f86715r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f86713p0);
        aSN1EncodableVector.add(this.f86714q0);
        aSN1EncodableVector.add(this.f86715r0);
        return new DERSequence(aSN1EncodableVector);
    }

    public static PKIResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
