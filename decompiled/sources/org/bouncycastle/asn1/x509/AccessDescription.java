package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes12.dex */
public class AccessDescription extends ASN1Object {
    public static final ASN1ObjectIdentifier id_ad_caIssuers = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.2");
    public static final ASN1ObjectIdentifier id_ad_ocsp = new ASN1ObjectIdentifier("1.3.6.1.5.5.7.48.1");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ASN1ObjectIdentifier f87560p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public GeneralName f87561q0;

    public AccessDescription(ASN1ObjectIdentifier aSN1ObjectIdentifier, GeneralName generalName) {
        this.f87560p0 = aSN1ObjectIdentifier;
        this.f87561q0 = generalName;
    }

    public static AccessDescription getInstance(Object obj) {
        if (obj instanceof AccessDescription) {
            return (AccessDescription) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj);
        AccessDescription accessDescription = new AccessDescription();
        accessDescription.f87560p0 = null;
        accessDescription.f87561q0 = null;
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("wrong number of elements in sequence");
        }
        accessDescription.f87560p0 = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        accessDescription.f87561q0 = GeneralName.getInstance(aSN1Sequence.getObjectAt(1));
        return accessDescription;
    }

    public GeneralName getAccessLocation() {
        return this.f87561q0;
    }

    public ASN1ObjectIdentifier getAccessMethod() {
        return this.f87560p0;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f87560p0);
        aSN1EncodableVector.add(this.f87561q0);
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        return "AccessDescription: Oid(" + this.f87560p0.getId() + ")";
    }
}
