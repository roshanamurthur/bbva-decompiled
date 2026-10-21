package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes12.dex */
public class CertPolicyId extends ASN1Object {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87592p0;

    public static CertPolicyId getInstance(Object obj) {
        if (obj instanceof CertPolicyId) {
            return (CertPolicyId) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(obj);
        CertPolicyId certPolicyId = new CertPolicyId();
        certPolicyId.f87592p0 = aSN1ObjectIdentifier;
        return certPolicyId;
    }

    public String getId() {
        return this.f87592p0.getId();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f87592p0;
    }
}
