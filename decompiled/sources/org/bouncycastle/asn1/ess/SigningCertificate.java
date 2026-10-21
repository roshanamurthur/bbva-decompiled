package org.bouncycastle.asn1.ess;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes12.dex */
public class SigningCertificate extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87253p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87254q0;

    public SigningCertificate(ESSCertID eSSCertID) {
        this.f87253p0 = new DERSequence(eSSCertID);
    }

    public static SigningCertificate getInstance(Object obj) {
        if (obj instanceof SigningCertificate) {
            return (SigningCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SigningCertificate signingCertificate = new SigningCertificate();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        signingCertificate.f87253p0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            signingCertificate.f87254q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return signingCertificate;
    }

    public ESSCertID[] getCerts() {
        ASN1Sequence aSN1Sequence = this.f87253p0;
        ESSCertID[] eSSCertIDArr = new ESSCertID[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            eSSCertIDArr[i10] = ESSCertID.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return eSSCertIDArr;
    }

    public PolicyInformation[] getPolicies() {
        ASN1Sequence aSN1Sequence = this.f87254q0;
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
        aSN1EncodableVector.add(this.f87253p0);
        ASN1Sequence aSN1Sequence = this.f87254q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
