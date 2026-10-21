package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes12.dex */
public class TimeStampAndCRL extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ContentInfo f86981p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CertificateList f86982q0;

    public TimeStampAndCRL(ContentInfo contentInfo) {
        this.f86981p0 = contentInfo;
    }

    public static TimeStampAndCRL getInstance(Object obj) {
        if (obj instanceof TimeStampAndCRL) {
            return (TimeStampAndCRL) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TimeStampAndCRL timeStampAndCRL = new TimeStampAndCRL();
        timeStampAndCRL.f86981p0 = ContentInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            timeStampAndCRL.f86982q0 = CertificateList.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return timeStampAndCRL;
    }

    public CertificateList getCRL() {
        return this.f86982q0;
    }

    public CertificateList getCertificateList() {
        return this.f86982q0;
    }

    public ContentInfo getTimeStampToken() {
        return this.f86981p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f86981p0);
        CertificateList certificateList = this.f86982q0;
        if (certificateList != null) {
            aSN1EncodableVector.add(certificateList);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
