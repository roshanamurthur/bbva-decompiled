package org.bouncycastle.asn1.tsp;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.cms.ContentInfo;

/* JADX INFO: loaded from: classes12.dex */
public class TimeStampResp extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PKIStatusInfo f87514p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ContentInfo f87515q0;

    public TimeStampResp(PKIStatusInfo pKIStatusInfo, ContentInfo contentInfo) {
        this.f87514p0 = pKIStatusInfo;
        this.f87515q0 = contentInfo;
    }

    public static TimeStampResp getInstance(Object obj) {
        if (obj instanceof TimeStampResp) {
            return (TimeStampResp) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TimeStampResp timeStampResp = new TimeStampResp();
        Enumeration objects = aSN1Sequence.getObjects();
        timeStampResp.f87514p0 = PKIStatusInfo.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            timeStampResp.f87515q0 = ContentInfo.getInstance(objects.nextElement());
        }
        return timeStampResp;
    }

    public PKIStatusInfo getStatus() {
        return this.f87514p0;
    }

    public ContentInfo getTimeStampToken() {
        return this.f87515q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87514p0);
        ContentInfo contentInfo = this.f87515q0;
        if (contentInfo != null) {
            aSN1EncodableVector.add(contentInfo);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
