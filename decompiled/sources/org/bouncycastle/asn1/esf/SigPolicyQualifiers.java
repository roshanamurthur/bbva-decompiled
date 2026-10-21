package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class SigPolicyQualifiers extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87230p0;

    public SigPolicyQualifiers(SigPolicyQualifierInfo[] sigPolicyQualifierInfoArr) {
        this.f87230p0 = new DERSequence(sigPolicyQualifierInfoArr);
    }

    public static SigPolicyQualifiers getInstance(Object obj) {
        if (obj instanceof SigPolicyQualifiers) {
            return (SigPolicyQualifiers) obj;
        }
        if (!(obj instanceof ASN1Sequence)) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        SigPolicyQualifiers sigPolicyQualifiers = new SigPolicyQualifiers();
        sigPolicyQualifiers.f87230p0 = aSN1Sequence;
        return sigPolicyQualifiers;
    }

    public SigPolicyQualifierInfo getInfoAt(int i10) {
        return SigPolicyQualifierInfo.getInstance(this.f87230p0.getObjectAt(i10));
    }

    public int size() {
        return this.f87230p0.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87230p0;
    }
}
