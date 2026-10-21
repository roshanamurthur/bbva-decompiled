package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.tsp.EvidenceRecord;

/* JADX INFO: loaded from: classes12.dex */
public class Evidence extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TimeStampTokenEvidence f86902p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public EvidenceRecord f86903q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1Sequence f86904r0;

    public Evidence(TimeStampTokenEvidence timeStampTokenEvidence) {
        this.f86902p0 = timeStampTokenEvidence;
    }

    public static Evidence getInstance(Object obj) {
        if (obj == null || (obj instanceof Evidence)) {
            return (Evidence) obj;
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException("unknown object in getInstance");
        }
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(obj);
        Evidence evidence = new Evidence();
        if (aSN1TaggedObject.getTagNo() == 0) {
            evidence.f86902p0 = TimeStampTokenEvidence.getInstance(aSN1TaggedObject, false);
        } else if (aSN1TaggedObject.getTagNo() == 1) {
            evidence.f86903q0 = EvidenceRecord.getInstance(aSN1TaggedObject, false);
        } else {
            if (aSN1TaggedObject.getTagNo() != 2) {
                throw new IllegalArgumentException("unknown tag in Evidence");
            }
            evidence.f86904r0 = ASN1Sequence.getInstance(aSN1TaggedObject, false);
        }
        return evidence;
    }

    public EvidenceRecord getErsEvidence() {
        return this.f86903q0;
    }

    public TimeStampTokenEvidence getTstEvidence() {
        return this.f86902p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        TimeStampTokenEvidence timeStampTokenEvidence = this.f86902p0;
        if (timeStampTokenEvidence != null) {
            return new DERTaggedObject(false, 0, timeStampTokenEvidence);
        }
        EvidenceRecord evidenceRecord = this.f86903q0;
        return evidenceRecord != null ? new DERTaggedObject(false, 1, evidenceRecord) : new DERTaggedObject(false, 2, this.f86904r0);
    }

    public Evidence(EvidenceRecord evidenceRecord) {
        this.f86903q0 = evidenceRecord;
    }

    public static Evidence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(aSN1TaggedObject.getObject());
    }
}
