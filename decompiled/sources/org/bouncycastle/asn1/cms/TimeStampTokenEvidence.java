package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class TimeStampTokenEvidence extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TimeStampAndCRL[] f86983p0;

    public TimeStampTokenEvidence(TimeStampAndCRL timeStampAndCRL) {
        this.f86983p0 = new TimeStampAndCRL[]{timeStampAndCRL};
    }

    public static TimeStampTokenEvidence getInstance(Object obj) {
        if (obj instanceof TimeStampTokenEvidence) {
            return (TimeStampTokenEvidence) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TimeStampTokenEvidence timeStampTokenEvidence = new TimeStampTokenEvidence();
        timeStampTokenEvidence.f86983p0 = new TimeStampAndCRL[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i10 = 0;
        while (objects.hasMoreElements()) {
            timeStampTokenEvidence.f86983p0[i10] = TimeStampAndCRL.getInstance(objects.nextElement());
            i10++;
        }
        return timeStampTokenEvidence;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        TimeStampAndCRL[] timeStampAndCRLArr = this.f86983p0;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(timeStampAndCRLArr.length);
        for (int i10 = 0; i10 != timeStampAndCRLArr.length; i10++) {
            aSN1EncodableVector.add(timeStampAndCRLArr[i10]);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public TimeStampAndCRL[] toTimeStampAndCRLArray() {
        TimeStampAndCRL[] timeStampAndCRLArr = this.f86983p0;
        int length = timeStampAndCRLArr.length;
        TimeStampAndCRL[] timeStampAndCRLArr2 = new TimeStampAndCRL[length];
        System.arraycopy(timeStampAndCRLArr, 0, timeStampAndCRLArr2, 0, length);
        return timeStampAndCRLArr2;
    }

    public TimeStampTokenEvidence(TimeStampAndCRL[] timeStampAndCRLArr) {
        int length = timeStampAndCRLArr.length;
        TimeStampAndCRL[] timeStampAndCRLArr2 = new TimeStampAndCRL[length];
        System.arraycopy(timeStampAndCRLArr, 0, timeStampAndCRLArr2, 0, length);
        this.f86983p0 = timeStampAndCRLArr2;
    }

    public static TimeStampTokenEvidence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
