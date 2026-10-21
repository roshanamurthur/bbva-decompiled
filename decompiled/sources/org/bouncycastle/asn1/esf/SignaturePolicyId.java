package org.bouncycastle.asn1.esf;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class SignaturePolicyId extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87231p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public OtherHashAlgAndValue f87232q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SigPolicyQualifiers f87233r0;

    public SignaturePolicyId(ASN1ObjectIdentifier aSN1ObjectIdentifier, OtherHashAlgAndValue otherHashAlgAndValue) {
        this(aSN1ObjectIdentifier, otherHashAlgAndValue, null);
    }

    public static SignaturePolicyId getInstance(Object obj) {
        if (obj instanceof SignaturePolicyId) {
            return (SignaturePolicyId) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SignaturePolicyId signaturePolicyId = new SignaturePolicyId();
        if (aSN1Sequence.size() != 2 && aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        signaturePolicyId.f87231p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        signaturePolicyId.f87232q0 = OtherHashAlgAndValue.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() == 3) {
            signaturePolicyId.f87233r0 = SigPolicyQualifiers.getInstance(aSN1Sequence.getObjectAt(2));
        }
        return signaturePolicyId;
    }

    public OtherHashAlgAndValue getSigPolicyHash() {
        return this.f87232q0;
    }

    public ASN1ObjectIdentifier getSigPolicyId() {
        return new ASN1ObjectIdentifier(this.f87231p0.getId());
    }

    public SigPolicyQualifiers getSigPolicyQualifiers() {
        return this.f87233r0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f87231p0);
        aSN1EncodableVector.add(this.f87232q0);
        SigPolicyQualifiers sigPolicyQualifiers = this.f87233r0;
        if (sigPolicyQualifiers != null) {
            aSN1EncodableVector.add(sigPolicyQualifiers);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SignaturePolicyId(ASN1ObjectIdentifier aSN1ObjectIdentifier, OtherHashAlgAndValue otherHashAlgAndValue, SigPolicyQualifiers sigPolicyQualifiers) {
        this.f87231p0 = aSN1ObjectIdentifier;
        this.f87232q0 = otherHashAlgAndValue;
        this.f87233r0 = sigPolicyQualifiers;
    }
}
