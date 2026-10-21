package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class CommitmentTypeQualifier extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87197p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Encodable f87198q0;

    public CommitmentTypeQualifier(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, null);
    }

    public static CommitmentTypeQualifier getInstance(Object obj) {
        if (obj instanceof CommitmentTypeQualifier) {
            return (CommitmentTypeQualifier) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        CommitmentTypeQualifier commitmentTypeQualifier = new CommitmentTypeQualifier();
        commitmentTypeQualifier.f87197p0 = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            commitmentTypeQualifier.f87198q0 = aSN1Sequence.getObjectAt(1);
        }
        return commitmentTypeQualifier;
    }

    public ASN1ObjectIdentifier getCommitmentTypeIdentifier() {
        return this.f87197p0;
    }

    public ASN1Encodable getQualifier() {
        return this.f87198q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87197p0);
        ASN1Encodable aSN1Encodable = this.f87198q0;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(aSN1Encodable);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CommitmentTypeQualifier(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87197p0 = aSN1ObjectIdentifier;
        this.f87198q0 = aSN1Encodable;
    }
}
