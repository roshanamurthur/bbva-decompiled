package org.bouncycastle.asn1.crmf;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Time;

/* JADX INFO: loaded from: classes12.dex */
public class OptionalValidity extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Time f87042p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Time f87043q0;

    public OptionalValidity(Time time, Time time2) {
        if (time == null && time2 == null) {
            throw new IllegalArgumentException("at least one of notBefore/notAfter must not be null.");
        }
        this.f87042p0 = time;
        this.f87043q0 = time2;
    }

    public static OptionalValidity getInstance(Object obj) {
        if (obj instanceof OptionalValidity) {
            return (OptionalValidity) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OptionalValidity optionalValidity = new OptionalValidity();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            Time time = Time.getInstance(aSN1TaggedObject, true);
            if (tagNo == 0) {
                optionalValidity.f87042p0 = time;
            } else {
                optionalValidity.f87043q0 = time;
            }
        }
        return optionalValidity;
    }

    public Time getNotAfter() {
        return this.f87043q0;
    }

    public Time getNotBefore() {
        return this.f87042p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        Time time = this.f87042p0;
        if (time != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, time));
        }
        Time time2 = this.f87043q0;
        if (time2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, time2));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
