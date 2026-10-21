package org.bouncycastle.asn1.ess;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.PolicyInformation;

/* JADX INFO: loaded from: classes12.dex */
public class SigningCertificateV2 extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87255p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87256q0;

    public SigningCertificateV2(ESSCertIDv2 eSSCertIDv2) {
        this.f87255p0 = new DERSequence(eSSCertIDv2);
    }

    public static SigningCertificateV2 getInstance(Object obj) {
        if (obj == null || (obj instanceof SigningCertificateV2)) {
            return (SigningCertificateV2) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            return null;
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) obj;
        SigningCertificateV2 signingCertificateV2 = new SigningCertificateV2();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        signingCertificateV2.f87255p0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            signingCertificateV2.f87256q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return signingCertificateV2;
    }

    public ESSCertIDv2[] getCerts() {
        ASN1Sequence aSN1Sequence = this.f87255p0;
        ESSCertIDv2[] eSSCertIDv2Arr = new ESSCertIDv2[aSN1Sequence.size()];
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            eSSCertIDv2Arr[i10] = ESSCertIDv2.getInstance(aSN1Sequence.getObjectAt(i10));
        }
        return eSSCertIDv2Arr;
    }

    public PolicyInformation[] getPolicies() {
        ASN1Sequence aSN1Sequence = this.f87256q0;
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
        aSN1EncodableVector.add(this.f87255p0);
        ASN1Sequence aSN1Sequence = this.f87256q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SigningCertificateV2(ESSCertIDv2[] eSSCertIDv2Arr) {
        this.f87255p0 = new DERSequence(eSSCertIDv2Arr);
    }

    public SigningCertificateV2(ESSCertIDv2[] eSSCertIDv2Arr, PolicyInformation[] policyInformationArr) {
        this.f87255p0 = new DERSequence(eSSCertIDv2Arr);
        if (policyInformationArr != null) {
            this.f87256q0 = new DERSequence(policyInformationArr);
        }
    }
}
