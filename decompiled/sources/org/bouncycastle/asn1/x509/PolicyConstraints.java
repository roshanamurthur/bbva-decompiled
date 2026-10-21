package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes12.dex */
public class PolicyConstraints extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BigInteger f87673p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public BigInteger f87674q0;

    public PolicyConstraints(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f87673p0 = bigInteger;
        this.f87674q0 = bigInteger2;
    }

    public static PolicyConstraints fromExtensions(Extensions extensions) {
        return getInstance(Extensions.getExtensionParsedValue(extensions, Extension.policyConstraints));
    }

    public static PolicyConstraints getInstance(Object obj) {
        if (obj instanceof PolicyConstraints) {
            return (PolicyConstraints) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PolicyConstraints policyConstraints = new PolicyConstraints();
        for (int i10 = 0; i10 != aSN1Sequence.size(); i10++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i10));
            if (aSN1TaggedObject.getTagNo() == 0) {
                policyConstraints.f87673p0 = ASN1Integer.getInstance(aSN1TaggedObject, false).getValue();
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    throw new IllegalArgumentException("Unknown tag encountered.");
                }
                policyConstraints.f87674q0 = ASN1Integer.getInstance(aSN1TaggedObject, false).getValue();
            }
        }
        return policyConstraints;
    }

    public BigInteger getInhibitPolicyMapping() {
        return this.f87674q0;
    }

    public BigInteger getRequireExplicitPolicyMapping() {
        return this.f87673p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        BigInteger bigInteger = this.f87673p0;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, new ASN1Integer(bigInteger)));
        }
        BigInteger bigInteger2 = this.f87674q0;
        if (bigInteger2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, new ASN1Integer(bigInteger2)));
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
