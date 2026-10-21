package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.CRLReason;

/* JADX INFO: loaded from: classes12.dex */
public class RevokedInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1GeneralizedTime f87355p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CRLReason f87356q0;

    public RevokedInfo(ASN1GeneralizedTime aSN1GeneralizedTime, CRLReason cRLReason) {
        this.f87355p0 = aSN1GeneralizedTime;
        this.f87356q0 = cRLReason;
    }

    public static RevokedInfo getInstance(Object obj) {
        if (obj instanceof RevokedInfo) {
            return (RevokedInfo) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RevokedInfo revokedInfo = new RevokedInfo();
        revokedInfo.f87355p0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            revokedInfo.f87356q0 = CRLReason.getInstance(ASN1Enumerated.getInstance((ASN1TaggedObject) aSN1Sequence.getObjectAt(1), true));
        }
        return revokedInfo;
    }

    public CRLReason getRevocationReason() {
        return this.f87356q0;
    }

    public ASN1GeneralizedTime getRevocationTime() {
        return this.f87355p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87355p0);
        CRLReason cRLReason = this.f87356q0;
        if (cRLReason != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, cRLReason));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public static RevokedInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
