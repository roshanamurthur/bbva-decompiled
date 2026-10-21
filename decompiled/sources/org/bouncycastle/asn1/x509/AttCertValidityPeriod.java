package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AttCertValidityPeriod extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1GeneralizedTime f87566p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1GeneralizedTime f87567q0;

    public AttCertValidityPeriod(ASN1GeneralizedTime aSN1GeneralizedTime, ASN1GeneralizedTime aSN1GeneralizedTime2) {
        this.f87566p0 = aSN1GeneralizedTime;
        this.f87567q0 = aSN1GeneralizedTime2;
    }

    public static AttCertValidityPeriod getInstance(Object obj) {
        if (obj instanceof AttCertValidityPeriod) {
            return (AttCertValidityPeriod) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AttCertValidityPeriod attCertValidityPeriod = new AttCertValidityPeriod();
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        attCertValidityPeriod.f87566p0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(0));
        attCertValidityPeriod.f87567q0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
        return attCertValidityPeriod;
    }

    public ASN1GeneralizedTime getNotAfterTime() {
        return this.f87567q0;
    }

    public ASN1GeneralizedTime getNotBeforeTime() {
        return this.f87566p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87566p0);
        aSN1EncodableVector.add(this.f87567q0);
        return new DERSequence(aSN1EncodableVector);
    }
}
