package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertId;
import org.bouncycastle.asn1.x509.Extensions;

/* JADX INFO: loaded from: classes12.dex */
public class RevAnnContent extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public PKIStatus f86824p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CertId f86825q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ASN1GeneralizedTime f86826r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ASN1GeneralizedTime f86827s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Extensions f86828t0;

    public static RevAnnContent getInstance(Object obj) {
        if (obj instanceof RevAnnContent) {
            return (RevAnnContent) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        RevAnnContent revAnnContent = new RevAnnContent();
        revAnnContent.f86824p0 = PKIStatus.getInstance(aSN1Sequence.getObjectAt(0));
        revAnnContent.f86825q0 = CertId.getInstance(aSN1Sequence.getObjectAt(1));
        revAnnContent.f86826r0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        revAnnContent.f86827s0 = ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
        if (aSN1Sequence.size() > 4) {
            revAnnContent.f86828t0 = Extensions.getInstance(aSN1Sequence.getObjectAt(4));
        }
        return revAnnContent;
    }

    public ASN1GeneralizedTime getBadSinceDate() {
        return this.f86827s0;
    }

    public CertId getCertId() {
        return this.f86825q0;
    }

    public Extensions getCrlDetails() {
        return this.f86828t0;
    }

    public PKIStatus getStatus() {
        return this.f86824p0;
    }

    public ASN1GeneralizedTime getWillBeRevokedAt() {
        return this.f86826r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.f86824p0);
        aSN1EncodableVector.add(this.f86825q0);
        aSN1EncodableVector.add(this.f86826r0);
        aSN1EncodableVector.add(this.f86827s0);
        Extensions extensions = this.f86828t0;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
