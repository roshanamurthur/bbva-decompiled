package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERIA5String;

/* JADX INFO: loaded from: classes12.dex */
public class TimeStampedData extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Integer f86984p0 = new ASN1Integer(1);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public DERIA5String f86985q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public MetaData f86986r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1OctetString f86987s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Evidence f86988t0;

    public TimeStampedData(DERIA5String dERIA5String, MetaData metaData, ASN1OctetString aSN1OctetString, Evidence evidence) {
        this.f86985q0 = dERIA5String;
        this.f86986r0 = metaData;
        this.f86987s0 = aSN1OctetString;
        this.f86988t0 = evidence;
    }

    public static TimeStampedData getInstance(Object obj) {
        if (obj == null || (obj instanceof TimeStampedData)) {
            return (TimeStampedData) obj;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.f86984p0 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        int i10 = 1;
        if (aSN1Sequence.getObjectAt(1) instanceof DERIA5String) {
            timeStampedData.f86985q0 = DERIA5String.getInstance(aSN1Sequence.getObjectAt(1));
            i10 = 2;
        }
        if ((aSN1Sequence.getObjectAt(i10) instanceof MetaData) || (aSN1Sequence.getObjectAt(i10) instanceof ASN1Sequence)) {
            timeStampedData.f86986r0 = MetaData.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
        if (aSN1Sequence.getObjectAt(i10) instanceof ASN1OctetString) {
            timeStampedData.f86987s0 = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10));
            i10++;
        }
        timeStampedData.f86988t0 = Evidence.getInstance(aSN1Sequence.getObjectAt(i10));
        return timeStampedData;
    }

    public ASN1OctetString getContent() {
        return this.f86987s0;
    }

    public DERIA5String getDataUri() {
        return this.f86985q0;
    }

    public MetaData getMetaData() {
        return this.f86986r0;
    }

    public Evidence getTemporalEvidence() {
        return this.f86988t0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f86984p0);
        DERIA5String dERIA5String = this.f86985q0;
        if (dERIA5String != null) {
            aSN1EncodableVector.add(dERIA5String);
        }
        MetaData metaData = this.f86986r0;
        if (metaData != null) {
            aSN1EncodableVector.add(metaData);
        }
        ASN1OctetString aSN1OctetString = this.f86987s0;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        aSN1EncodableVector.add(this.f86988t0);
        return new BERSequence(aSN1EncodableVector);
    }
}
