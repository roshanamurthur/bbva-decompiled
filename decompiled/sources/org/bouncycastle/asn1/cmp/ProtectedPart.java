package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class ProtectedPart extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PKIHeader f86822p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public PKIBody f86823q0;

    public ProtectedPart(PKIHeader pKIHeader, PKIBody pKIBody) {
        this.f86822p0 = pKIHeader;
        this.f86823q0 = pKIBody;
    }

    public static ProtectedPart getInstance(Object obj) {
        if (obj instanceof ProtectedPart) {
            return (ProtectedPart) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        ProtectedPart protectedPart = new ProtectedPart();
        protectedPart.f86822p0 = PKIHeader.getInstance(aSN1Sequence.getObjectAt(0));
        protectedPart.f86823q0 = PKIBody.getInstance(aSN1Sequence.getObjectAt(1));
        return protectedPart;
    }

    public PKIBody getBody() {
        return this.f86823q0;
    }

    public PKIHeader getHeader() {
        return this.f86822p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86822p0);
        aSN1EncodableVector.add(this.f86823q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
