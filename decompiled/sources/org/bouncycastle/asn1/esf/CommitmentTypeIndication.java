package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CommitmentTypeIndication extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87195p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87196q0;

    public CommitmentTypeIndication(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87195p0 = aSN1ObjectIdentifier;
    }

    public static CommitmentTypeIndication getInstance(Object obj) {
        if (obj == null || (obj instanceof CommitmentTypeIndication)) {
            return (CommitmentTypeIndication) obj;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CommitmentTypeIndication commitmentTypeIndication = new CommitmentTypeIndication();
        commitmentTypeIndication.f87195p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            commitmentTypeIndication.f87196q0 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        }
        return commitmentTypeIndication;
    }

    public ASN1ObjectIdentifier getCommitmentTypeId() {
        return this.f87195p0;
    }

    public ASN1Sequence getCommitmentTypeQualifier() {
        return this.f87196q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87195p0);
        ASN1Sequence aSN1Sequence = this.f87196q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CommitmentTypeIndication(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Sequence aSN1Sequence) {
        this.f87195p0 = aSN1ObjectIdentifier;
        this.f87196q0 = aSN1Sequence;
    }
}
