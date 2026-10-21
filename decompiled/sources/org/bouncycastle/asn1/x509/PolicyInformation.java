package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PolicyInformation extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87675p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ASN1Sequence f87676q0;

    public PolicyInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f87675p0 = aSN1ObjectIdentifier;
    }

    public static PolicyInformation getInstance(Object obj) {
        if (obj == null || (obj instanceof PolicyInformation)) {
            return (PolicyInformation) obj;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PolicyInformation policyInformation = new PolicyInformation();
        if (aSN1Sequence.size() < 1 || aSN1Sequence.size() > 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        policyInformation.f87675p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            policyInformation.f87676q0 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
        return policyInformation;
    }

    public ASN1ObjectIdentifier getPolicyIdentifier() {
        return this.f87675p0;
    }

    public ASN1Sequence getPolicyQualifiers() {
        return this.f87676q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87675p0);
        ASN1Sequence aSN1Sequence = this.f87676q0;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Policy information: ");
        stringBuffer.append(this.f87675p0);
        ASN1Sequence aSN1Sequence = this.f87676q0;
        if (aSN1Sequence != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            for (int i10 = 0; i10 < aSN1Sequence.size(); i10++) {
                if (stringBuffer2.length() != 0) {
                    stringBuffer2.append(", ");
                }
                stringBuffer2.append(PolicyQualifierInfo.getInstance(aSN1Sequence.getObjectAt(i10)));
            }
            stringBuffer.append(Constant.BRACKET_OPEN);
            stringBuffer.append(stringBuffer2);
            stringBuffer.append(Constant.BRACKET_CLOSE);
        }
        return stringBuffer.toString();
    }

    public PolicyInformation(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Sequence aSN1Sequence) {
        this.f87675p0 = aSN1ObjectIdentifier;
        this.f87676q0 = aSN1Sequence;
    }
}
