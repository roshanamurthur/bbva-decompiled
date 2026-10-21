package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class PolicyMappings extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1Sequence f87677p0;

    public PolicyMappings(Hashtable hashtable) {
        this.f87677p0 = null;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(hashtable.size());
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            String str2 = (String) hashtable.get(str);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
            aSN1EncodableVector2.add(new ASN1ObjectIdentifier(str));
            aSN1EncodableVector2.add(new ASN1ObjectIdentifier(str2));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        this.f87677p0 = new DERSequence(aSN1EncodableVector);
    }

    public static PolicyMappings getInstance(Object obj) {
        if (obj instanceof PolicyMappings) {
            return (PolicyMappings) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        PolicyMappings policyMappings = new PolicyMappings();
        policyMappings.f87677p0 = aSN1Sequence;
        return policyMappings;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87677p0;
    }

    public PolicyMappings(CertPolicyId certPolicyId, CertPolicyId certPolicyId2) {
        this.f87677p0 = null;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(certPolicyId);
        aSN1EncodableVector.add(certPolicyId2);
        this.f87677p0 = new DERSequence(new DERSequence(aSN1EncodableVector));
    }

    public PolicyMappings(CertPolicyId[] certPolicyIdArr, CertPolicyId[] certPolicyIdArr2) {
        this.f87677p0 = null;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(certPolicyIdArr.length);
        for (int i10 = 0; i10 != certPolicyIdArr.length; i10++) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(2);
            aSN1EncodableVector2.add(certPolicyIdArr[i10]);
            aSN1EncodableVector2.add(certPolicyIdArr2[i10]);
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        this.f87677p0 = new DERSequence(aSN1EncodableVector);
    }
}
