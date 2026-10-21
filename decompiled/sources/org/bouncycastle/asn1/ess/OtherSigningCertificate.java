package org.bouncycastle.asn1.ess;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes12.dex */
public class OtherSigningCertificate extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87251p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87252q0;

    public OtherSigningCertificate(OtherCertID otherCertID) {
        this.f87251p0 = new DERSequence(otherCertID);
    }

    public static OtherSigningCertificate getInstance(Object obj) {
        if (obj instanceof OtherSigningCertificate) {
            return (OtherSigningCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        OtherSigningCertificate otherSigningCertificate = new OtherSigningCertificate();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        otherSigningCertificate.f87251p0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            otherSigningCertificate.f87252q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return otherSigningCertificate;
    }

    public OtherCertID[] getCerts() {
        ASN1Sequence aSN1Sequence = this.f87251p0;
        OtherCertID[] otherCertIDArr = new OtherCertID[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            otherCertIDArr[i10] = OtherCertID.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return otherCertIDArr;
    }

    public PolicyInformation[] getPolicies() {
        ASN1Sequence aSN1Sequence = this.f87252q0;
        if (aSN1Sequence == null) {
            return null;
        }
        PolicyInformation[] policyInformationArr = new PolicyInformation[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            policyInformationArr[i10] = PolicyInformation.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return policyInformationArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87251p0);
        ASN1Sequence aSN1Sequence = this.f87252q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
