package org.bouncycastle.asn1.x509;

import androidx.databinding.c;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PolicyQualifierInfo extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ASN1ObjectIdentifier f87678p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ASN1Encodable f87679q0;

    public PolicyQualifierInfo(String str) {
        this.f87678p0 = PolicyQualifierId.id_qt_cps;
        this.f87679q0 = new DERIA5String(str);
    }

    public static PolicyQualifierInfo getInstance(Object obj) {
        if (obj instanceof PolicyQualifierInfo) {
            return (PolicyQualifierInfo) obj;
        }
        if (obj != null) {
            return new PolicyQualifierInfo(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ASN1ObjectIdentifier getPolicyQualifierId() {
        return this.f87678p0;
    }

    public ASN1Encodable getQualifier() {
        return this.f87679q0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87678p0);
        aSN1EncodableVector.add(this.f87679q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public PolicyQualifierInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.f87678p0 = aSN1ObjectIdentifier;
        this.f87679q0 = aSN1Encodable;
    }

    public PolicyQualifierInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(c.d(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        this.f87678p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f87679q0 = aSN1Sequence.getObjectAt(1);
    }
}
