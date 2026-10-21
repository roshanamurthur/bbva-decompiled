package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class PrivateKeyUsagePeriod extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1GeneralizedTime f87680p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1GeneralizedTime f87681q0;

    public static PrivateKeyUsagePeriod getInstance(Object obj) {
        if (obj instanceof PrivateKeyUsagePeriod) {
            return (PrivateKeyUsagePeriod) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PrivateKeyUsagePeriod privateKeyUsagePeriod = new PrivateKeyUsagePeriod();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                privateKeyUsagePeriod.f87680p0 = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            } else if (aSN1TaggedObject.getTagNo() == 1) {
                privateKeyUsagePeriod.f87681q0 = ASN1GeneralizedTime.getInstance(aSN1TaggedObject, false);
            }
        }
        return privateKeyUsagePeriod;
    }

    public ASN1GeneralizedTime getNotAfter() {
        return this.f87681q0;
    }

    public ASN1GeneralizedTime getNotBefore() {
        return this.f87680p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1GeneralizedTime aSN1GeneralizedTime = this.f87680p0;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, aSN1GeneralizedTime));
        }
        ASN1GeneralizedTime aSN1GeneralizedTime2 = this.f87681q0;
        if (aSN1GeneralizedTime2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, aSN1GeneralizedTime2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
